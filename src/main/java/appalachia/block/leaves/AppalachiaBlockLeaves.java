package appalachia.block.leaves;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.block.BlockManager;
import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import appalachia.util.LeavesConnectionChecker;
import appalachia.util.PlayerUtil;
import com.google.common.collect.Lists;
import static appalachia.api.AppalachiaAPI.rand;

public class AppalachiaBlockLeaves extends BlockLeaves implements IAppalachiaBlock {

    private String slug;
    protected boolean decayTest = false;

    public static final PropertyBool TRANSLUCENT = PropertyBool.create("translucent");

    public AppalachiaBlockLeaves(String unlocalizedName) {

        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.setDefaultState(
            blockState.getBaseState()
                .withProperty(DECAYABLE, false)
                .withProperty(CHECK_DECAY, true)
                .withProperty(TRANSLUCENT, true)
        );
        this.leavesFancy = true;
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
    }

    protected boolean evergreen() {
        return false;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

    @Override
    public boolean isPassable(IBlockAccess world, BlockPos pos) {

        return true;
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        if (PlayerUtil.isCreativeMode(entityIn)) {
            return;
        }

        entityIn.motionX *= 0.75D;
        entityIn.motionY *= 0.75D;
        entityIn.motionZ *= 0.75D;
        entityIn.fallDistance = 0f;
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (!worldIn.isRemote) {
            if (state.getValue(DECAYABLE)) {

                LeavesConnectionChecker checker = new LeavesConnectionChecker(worldIn, pos);

                if (!checker.isConnected()) {

                    if (decayTest) {
                        worldIn.setBlockState(pos, state.withProperty(CHECK_DECAY, false), 4);
                        worldIn.setBlockState(pos, Blocks.GLOWSTONE.getDefaultState(), 2);
                    }
                    else {
                        this.destroy(worldIn, pos);
                    }
                }
            }
        }
        else {
            super.updateTick(worldIn, pos, state, rand);
        }
    }

    @Override
    public void beginLeavesDecay(IBlockState state, World world, BlockPos pos) {

        super.beginLeavesDecay(state, world, pos);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{DECAYABLE, CHECK_DECAY, TRANSLUCENT});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState()
            .withProperty(TRANSLUCENT, (meta & 2) != 0)
            .withProperty(DECAYABLE, (meta & 4) != 0)
            .withProperty(CHECK_DECAY, (meta & 8) != 0);
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        int meta = 0;

        if (state.getValue(TRANSLUCENT)) {
            meta |= 2;
        }

        if (state.getValue(DECAYABLE)) {
            meta |= 4;
        }

        if (state.getValue(CHECK_DECAY)) {
            meta |= 8;
        }

        return meta;
    }

    @Override
    public EnumType getWoodType(int meta) {

        return null;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(Blocks.LEAVES);
    }

    protected void destroy(World worldIn, BlockPos pos)
    {
        this.dropBlockAsItem(worldIn, pos, worldIn.getBlockState(pos), 0);
        worldIn.setBlockToAir(pos);
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {

        return item != null;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {

        return Lists.newArrayList(new ItemStack(this));
    }

    @SideOnly(Side.CLIENT)
    public static class ColourHandler implements IBlockColor {

        public ColourHandler() {

        }

        @Override
        public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
        {
            if (worldIn != null && pos != null) {

                if (!(((AppalachiaBlockLeaves)state.getBlock()).evergreen())) {
                    return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
                }
                else {
                    return 4028928;
                }
            }
            else {
                return 4028928;
            }
        }
    }

    public static Block getRandomLeaves() {

        return (AppalachiaBlockLeaves)BlockManager.appalachiaLeaves.get(rand.nextInt(BlockManager.appalachiaLeaves.size()));
    }

    /**
     * Location aware and overrideable version of the lightOpacity array,
     * return the number to subtract from the light value when it passes through this block.
     * <p>
     * This is not guaranteed to have the tile entity in place before this is called, so it is
     * Recommended that you have your tile entity call relight after being placed if you
     * rely on it for light info.
     *
     * @param state The Block state
     * @param world The current world
     * @param pos   Block position in world
     * @return The amount of light to block, 0 for air, 255 for fully opaque.
     */
    @Override
    public int getLightOpacity(IBlockState state, IBlockAccess world, BlockPos pos) {

        if(state.getPropertyKeys().contains(TRANSLUCENT)) {

            boolean translucent = state.getValue(TRANSLUCENT);

            if (translucent) {
                return 0;
            }
            else {
                return super.getLightOpacity(state, world, pos);
            }
        }
        else {
            return super.getLightOpacity(state, world, pos);
        }
    }
}
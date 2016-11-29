package appalachia.block.leaves;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaAPI;
import appalachia.block.BlockManager;
import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import com.google.common.collect.Lists;

public class AppalachiaBlockLeaves extends BlockLeaves implements IAppalachiaBlock {

    private String slug;

    public AppalachiaBlockLeaves(String unlocalizedName) {

        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.setDefaultState(blockState.getBaseState().withProperty(DECAYABLE, Boolean.valueOf(true)).withProperty(CHECK_DECAY, Boolean.valueOf(true)));
        this.leavesFancy = true;
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
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
        entityIn.motionX *= 0.5D;
        entityIn.motionY *= 0.5D;
        entityIn.motionZ *= 0.5D;
        entityIn.fallDistance = 0f;
    }

    @Override
    public void beginLeavesDecay(IBlockState state, World world, BlockPos pos) {

        super.beginLeavesDecay(state, world, pos);
    }

    @Override
    protected BlockStateContainer createBlockState() {

        return new BlockStateContainer(this, new IProperty[]{DECAYABLE, CHECK_DECAY});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {

        return getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        int meta = 0;

        if (!state.getValue(DECAYABLE).booleanValue()) {
            meta |= 4;
        }

        if (state.getValue(CHECK_DECAY).booleanValue()) {
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

    @Override
    public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tile, ItemStack stack) {

        if (!world.isRemote && stack != null && stack.getItem() == Items.SHEARS) {
            player.addStat(StatList.getBlockStats(this));
        }
        else {
            super.harvestBlock(world, player, pos, state, tile, stack);
        }
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
                return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
            }
            else {
                return 4028928;
            }
        }
    }

    public static Block getRandomLeaves() {

        return (AppalachiaBlockLeaves)BlockManager.appalachiaLeaves.get(AppalachiaAPI.rand.nextInt(BlockManager.appalachiaLeaves.size()));
    }
}
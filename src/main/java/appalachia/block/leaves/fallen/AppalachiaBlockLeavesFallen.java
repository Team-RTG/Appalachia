package appalachia.block.leaves.fallen;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaAPI;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.api.util.Simplex;
import appalachia.block.BlockManager;
import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import com.google.common.collect.Lists;

public class AppalachiaBlockLeavesFallen extends Block implements IAppalachiaBlock, IShearable, IAppalachiaBlockLeavesFallen {
    //public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);

    public static final AxisAlignedBB[] FALLEN_AABB = new AxisAlignedBB[]
        {
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D),
            new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)
        };

    private String slug;

    public AppalachiaBlockLeavesFallen(String unlocalizedName) {

        super(Material.LEAVES);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(0.1F);
        this.setLightOpacity(1);
        this.setSoundType(SoundType.PLANT);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.setDefaultState(blockState.getBaseState().withProperty(LAYERS, Integer.valueOf(1)));
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
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.925D;
        entityIn.motionY *= 0.925D;
        entityIn.motionZ *= 0.925D;
    }

    @Override
    protected BlockStateContainer createBlockState() {

        return new BlockStateContainer(this, new IProperty[]{LAYERS});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {

        if (meta >= 8) {
            return getDefaultState().withProperty(LAYERS, Integer.valueOf((meta - 8 & 7) + 1));
        }

        return getDefaultState().withProperty(LAYERS, Integer.valueOf((meta & 7) + 1));
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        int meta = state.getValue(LAYERS).intValue() - 1;

        return meta;
    }

    @Override
    public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tile, ItemStack stack) {

        super.harvestBlock(world, player, pos, state, tile, stack);

        world.setBlockToAir(pos);
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {

        return item != null;
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {

        return Lists.newArrayList(new ItemStack(this, world.getBlockState(pos).getValue(LAYERS).intValue()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getBlockLayer() {

        return BlockRenderLayer.CUTOUT_MIPPED;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        return FALLEN_AABB[state.getValue(LAYERS).intValue()];
    }

    @Override
    public boolean isFullyOpaque(IBlockState state) {

        return state.getValue(LAYERS).intValue() == 7;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess source, BlockPos pos, EnumFacing side) {

        if (side == EnumFacing.UP) {
            return true;
        }
        else {
            IBlockState blockState = source.getBlockState(pos.offset(side));

            return blockState.getBlock() == this && blockState.getValue(LAYERS).intValue() >= state.getValue(LAYERS).intValue() || super.shouldSideBeRendered(state, source, pos, side);
        }
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {

        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {

        return false;
    }

    @Override
    public boolean isVisuallyOpaque() {

        return false;
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos) {

        float hardness = super.getBlockHardness(state, world, pos);

        if (!state.getProperties().containsKey(LAYERS)) {
            return hardness;
        }

        int layers = state.getValue(LAYERS).intValue();

        if (layers >= 6) {
            return hardness * 2.0F;
        }

        if (layers >= 3) {
            return hardness * 1.5F;
        }

        return hardness;
    }

    @Override
    public boolean isReplaceable(IBlockAccess source, BlockPos pos) {

        return source.getBlockState(pos).getValue(LAYERS).intValue() == 1;
    }

    @Override
    public boolean isPassable(IBlockAccess world, BlockPos pos) {

        //return world.getBlockState(pos).getValue(LAYERS).intValue() < 5;
        return true;
    }

    @Override
    public int quantityDropped(Random random) {

        return 0;
    }

    @Override
    public boolean canPlaceBlockAt(World world, BlockPos pos) {

        IBlockState state = world.getBlockState(pos.down());
        Block block = state.getBlock();

        return block != this && block.isLeaves(state, world, pos.down()) && state.isFullCube() || block == this && state.getValue(LAYERS).intValue() == 8 || state.isOpaqueCube() && state.getMaterial().blocksMovement();
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block) {

        checkAndDropBlock(world, pos, state);
    }

    private boolean checkAndDropBlock(World world, BlockPos pos, IBlockState state) {

        if (!canPlaceBlockAt(world, pos)) {
            world.setBlockToAir(pos);

            return false;
        }

        return true;
    }

    @SideOnly(Side.CLIENT)
    public static class ColourHandler implements IBlockColor {

        private static final int leafColours[] = {
            10094865, 10359311, 10623757, 10953739, 11218185, 11482888,
            11812870, 12077316, 12341762, 12672001, 12279809, 12280577,
            11563010, 11171075, 10844675, 10452483, 10125572, 9733124,
            9406213
        };

        private Simplex simplex = new Simplex(17781);

        public ColourHandler() {

        }

        @Override
        public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
        {
            //return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);

            if (worldIn != null && pos != null) {

                int noise = (int) (simplex.noise(pos.getX()/5, pos.getZ()/5)*9+9);

                return leafColours[noise];
            }
            else {

                return 16750848;
            }
        }
    }

    public static Block getRandomFallenLeaves() {

        return (AppalachiaBlockLeavesFallen)BlockManager.appalachiaLeavesFallen.get(AppalachiaAPI.rand.nextInt(BlockManager.appalachiaLeavesFallen.size()));
    }
}
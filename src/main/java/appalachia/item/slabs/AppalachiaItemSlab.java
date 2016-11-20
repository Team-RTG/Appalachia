package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.AppalachiaBlockPlanks;

public class AppalachiaItemSlab extends ItemBlock {

    protected IBlockState fullBlock;

    public AppalachiaItemSlab(Block block) {

        super(block);
        this.fullBlock = AppalachiaBlocks.planks_red_oak_01.getDefaultState();
    }

    public AppalachiaItemSlab(Block block, IBlockState fullBlock) {

        this(block);
        this.fullBlock = fullBlock;
    }

    protected IBlockState getFullBlock() {

        return this.fullBlock.withProperty(AppalachiaBlockPlanks.DOUBLE, Boolean.valueOf(true));
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (stack.stackSize > 0 && player.canPlayerEdit(pos.offset(side), side, stack)) {
            IBlockState state = world.getBlockState(pos);

            if (state.getBlock() == block) {
                BlockSlab.EnumBlockHalf half = state.getValue(BlockSlab.HALF);

                if (side == EnumFacing.UP && half == BlockSlab.EnumBlockHalf.BOTTOM || side == EnumFacing.DOWN && half == BlockSlab.EnumBlockHalf.TOP) {
                    IBlockState blockstate = getFullBlock();
                    AxisAlignedBB box = blockstate.getSelectedBoundingBox(world, pos);

                    if (box != Block.NULL_AABB && world.checkNoEntityCollision(box.offset(pos)) && world.setBlockState(pos, blockstate, 11)) {
                        SoundType sound = blockstate.getBlock().getSoundType();

                        world.playSound(player, pos, sound.getPlaceSound(), SoundCategory.BLOCKS, (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F);

                        --stack.stackSize;
                    }

                    return EnumActionResult.SUCCESS;
                }
            }

            return tryPlace(player, stack, world, pos.offset(side)) ? EnumActionResult.SUCCESS : super.onItemUse(stack, player, world, pos, hand, side, hitX, hitY, hitZ);
        }

        return EnumActionResult.FAIL;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {

        BlockPos blockpos = pos;
        IBlockState state = world.getBlockState(pos);

        if (state.getBlock() == block) {
            boolean flag = state.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.TOP;

            if (side == EnumFacing.UP && !flag || side == EnumFacing.DOWN && flag) {
                return true;
            }
        }

        pos = pos.offset(side);
        state = world.getBlockState(pos);

        return state.getBlock() == block || super.canPlaceBlockOnSide(world, blockpos, side, player, stack);
    }

    protected boolean tryPlace(EntityPlayer player, ItemStack stack, World world, BlockPos pos) {

        if (world.getBlockState(pos).getBlock() == block) {
            IBlockState state = getFullBlock();
            AxisAlignedBB box = state.getSelectedBoundingBox(world, pos);

            if (box != Block.NULL_AABB && world.checkNoEntityCollision(box.offset(pos)) && world.setBlockState(pos, state, 11)) {
                SoundType sound = state.getBlock().getSoundType();

                world.playSound(player, pos, sound.getPlaceSound(), SoundCategory.BLOCKS, (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F);

                --stack.stackSize;
            }

            return true;
        }

        return false;
    }
}
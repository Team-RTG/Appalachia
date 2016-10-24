package appalachia.item.leaves.fallen;

import net.minecraft.block.Block;
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

import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;

public class AppalachiaItemLeavesFallen extends ItemBlock {

    public AppalachiaItemLeavesFallen(Block block) {

        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if (stack.stackSize != 0 && player.canPlayerEdit(pos, facing, stack)) {
            IBlockState state = world.getBlockState(pos);
            Block block = state.getBlock();
            BlockPos blockpos = pos;

            if ((facing != EnumFacing.UP || block != this.block) && !block.isReplaceable(world, pos)) {
                blockpos = pos.offset(facing);
                state = world.getBlockState(blockpos);
                block = state.getBlock();
            }

            if (block == this.block) {
                int i = state.getValue(((AppalachiaBlockLeavesFallen)this.block).LAYERS).intValue();

                if (i <= 7) {
                    IBlockState blockState = state.withProperty(((AppalachiaBlockLeavesFallen)this.block).LAYERS, Integer.valueOf(i + 1));
                    AxisAlignedBB box = blockState.getSelectedBoundingBox(world, blockpos);

                    if (box != Block.NULL_AABB && world.checkNoEntityCollision(box.offset(blockpos)) && world.setBlockState(blockpos, blockState, 10)) {
                        SoundType sound = this.block.getSoundType();

                        world.playSound(player, blockpos, sound.getPlaceSound(), SoundCategory.BLOCKS, (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F);

                        --stack.stackSize;

                        return EnumActionResult.SUCCESS;
                    }
                }
            }

            return super.onItemUse(stack, player, world, blockpos, hand, facing, hitX, hitY, hitZ);
        }
        else {
            return EnumActionResult.FAIL;
        }
    }

    @Override
    public int getMetadata(int damage) {

        return damage;
    }

    @Override
    public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {

        IBlockState state = world.getBlockState(pos);

        return state.getBlock() != block || state.getValue(((AppalachiaBlockLeavesFallen)this.block).LAYERS).intValue() > 7 ? super.canPlaceBlockOnSide(world, pos, side, player, stack) : true;
    }
}
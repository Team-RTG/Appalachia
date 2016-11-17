package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackCherry01;

public class ItemSlabBlackCherry01 extends AppalachiaItemSlab {

    public ItemSlabBlackCherry01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_cherry_01.getDefaultState().withProperty(BlockPlanksBlackCherry01.DOUBLE, Boolean.valueOf(true));
    }
}
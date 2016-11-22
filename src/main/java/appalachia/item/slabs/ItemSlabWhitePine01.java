package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksWhitePine01;

public class ItemSlabWhitePine01 extends AppalachiaItemSlab {

    public ItemSlabWhitePine01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_white_pine_01.getDefaultState().withProperty(BlockPlanksWhitePine01.DOUBLE, Boolean.valueOf(true));
    }
}
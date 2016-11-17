package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRedElm01;

public class ItemSlabRedElm01 extends AppalachiaItemSlab {

    public ItemSlabRedElm01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_red_elm_01.getDefaultState().withProperty(BlockPlanksRedElm01.DOUBLE, Boolean.valueOf(true));
    }
}
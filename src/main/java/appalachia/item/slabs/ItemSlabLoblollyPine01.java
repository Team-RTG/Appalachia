package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksLoblollyPine01;

public class ItemSlabLoblollyPine01 extends AppalachiaItemSlab {

    public ItemSlabLoblollyPine01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_loblolly_pine_01.getDefaultState().withProperty(BlockPlanksLoblollyPine01.DOUBLE, Boolean.valueOf(true));
    }
}
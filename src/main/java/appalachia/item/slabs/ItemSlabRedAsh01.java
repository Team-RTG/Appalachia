package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRedAsh01;

public class ItemSlabRedAsh01 extends AppalachiaItemSlab {

    public ItemSlabRedAsh01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_red_ash_01.getDefaultState().withProperty(BlockPlanksRedAsh01.DOUBLE, Boolean.valueOf(true));
    }
}
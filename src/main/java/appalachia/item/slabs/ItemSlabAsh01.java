package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAsh01;

public class ItemSlabAsh01 extends AppalachiaItemSlab {

    public ItemSlabAsh01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_ash_01.getDefaultState().withProperty(BlockPlanksAsh01.DOUBLE, Boolean.valueOf(true));
    }
}
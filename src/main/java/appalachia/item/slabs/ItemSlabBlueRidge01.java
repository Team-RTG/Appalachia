package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlueRidge01;

public class ItemSlabBlueRidge01 extends AppalachiaItemSlab {

    public ItemSlabBlueRidge01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_blueridge_01.getDefaultState().withProperty(BlockPlanksBlueRidge01.DOUBLE, Boolean.valueOf(true));
    }
}
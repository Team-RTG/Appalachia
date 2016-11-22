package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackLocust01;

public class ItemSlabBlackLocust01 extends AppalachiaItemSlab {

    public ItemSlabBlackLocust01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_locust_01.getDefaultState().withProperty(BlockPlanksBlackLocust01.DOUBLE, Boolean.valueOf(true));
    }
}
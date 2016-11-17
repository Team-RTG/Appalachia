package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackOak01;

public class ItemSlabBlackOak01 extends AppalachiaItemSlab {

    public ItemSlabBlackOak01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_oak_01.getDefaultState().withProperty(BlockPlanksBlackOak01.DOUBLE, Boolean.valueOf(true));
    }
}
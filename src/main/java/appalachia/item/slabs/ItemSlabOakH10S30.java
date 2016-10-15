package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S30;

public class ItemSlabOakH10S30 extends AppalachiaItemSlab {

    public ItemSlabOakH10S30(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_30.getDefaultState().withProperty(BlockPlanksOakH10S30.DOUBLE, Boolean.valueOf(true));
    }
}
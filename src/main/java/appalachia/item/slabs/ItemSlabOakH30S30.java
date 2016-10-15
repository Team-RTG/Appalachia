package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S30;

public class ItemSlabOakH30S30 extends AppalachiaItemSlab {

    public ItemSlabOakH30S30(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_30.getDefaultState().withProperty(BlockPlanksOakH30S30.DOUBLE, Boolean.valueOf(true));
    }
}
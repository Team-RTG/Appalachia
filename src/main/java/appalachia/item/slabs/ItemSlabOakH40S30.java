package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S30;

public class ItemSlabOakH40S30 extends AppalachiaItemSlab {

    public ItemSlabOakH40S30(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_30.getDefaultState().withProperty(BlockPlanksOakH40S30.DOUBLE, Boolean.valueOf(true));
    }
}
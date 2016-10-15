package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S50;

public class ItemSlabOakH40S50 extends AppalachiaItemSlab {

    public ItemSlabOakH40S50(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_50.getDefaultState().withProperty(BlockPlanksOakH40S50.DOUBLE, Boolean.valueOf(true));
    }
}
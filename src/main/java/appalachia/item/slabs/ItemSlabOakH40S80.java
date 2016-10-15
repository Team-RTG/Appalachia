package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S80;

public class ItemSlabOakH40S80 extends AppalachiaItemSlab {

    public ItemSlabOakH40S80(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_80.getDefaultState().withProperty(BlockPlanksOakH40S80.DOUBLE, Boolean.valueOf(true));
    }
}
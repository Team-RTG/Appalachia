package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S90;

public class ItemSlabOakH40S90 extends AppalachiaItemSlab {

    public ItemSlabOakH40S90(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_90.getDefaultState().withProperty(BlockPlanksOakH40S90.DOUBLE, Boolean.valueOf(true));
    }
}
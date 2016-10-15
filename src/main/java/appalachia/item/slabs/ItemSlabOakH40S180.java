package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S180;

public class ItemSlabOakH40S180 extends AppalachiaItemSlab {

    public ItemSlabOakH40S180(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_180.getDefaultState().withProperty(BlockPlanksOakH40S180.DOUBLE, Boolean.valueOf(true));
    }
}
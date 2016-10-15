package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S120;

public class ItemSlabOakH40S120 extends AppalachiaItemSlab {

    public ItemSlabOakH40S120(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_120.getDefaultState().withProperty(BlockPlanksOakH40S120.DOUBLE, Boolean.valueOf(true));
    }
}
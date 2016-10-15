package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S20;

public class ItemSlabOakH40S20 extends AppalachiaItemSlab {

    public ItemSlabOakH40S20(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_20.getDefaultState().withProperty(BlockPlanksOakH40S20.DOUBLE, Boolean.valueOf(true));
    }
}
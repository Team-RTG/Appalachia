package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S130;

public class ItemSlabOakH40S130 extends AppalachiaItemSlab {

    public ItemSlabOakH40S130(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_130.getDefaultState().withProperty(BlockPlanksOakH40S130.DOUBLE, Boolean.valueOf(true));
    }
}
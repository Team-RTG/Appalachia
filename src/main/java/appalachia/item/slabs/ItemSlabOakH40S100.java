package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S100;

public class ItemSlabOakH40S100 extends AppalachiaItemSlab {

    public ItemSlabOakH40S100(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_100.getDefaultState().withProperty(BlockPlanksOakH40S100.DOUBLE, Boolean.valueOf(true));
    }
}
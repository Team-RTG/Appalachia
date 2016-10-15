package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S0;

public class ItemSlabOakH40S0 extends AppalachiaItemSlab {

    public ItemSlabOakH40S0(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_0.getDefaultState().withProperty(BlockPlanksOakH40S0.DOUBLE, Boolean.valueOf(true));
    }
}
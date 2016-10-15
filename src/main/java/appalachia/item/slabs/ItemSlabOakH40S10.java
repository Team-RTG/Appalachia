package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S10;

public class ItemSlabOakH40S10 extends AppalachiaItemSlab {

    public ItemSlabOakH40S10(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_10.getDefaultState().withProperty(BlockPlanksOakH40S10.DOUBLE, Boolean.valueOf(true));
    }
}
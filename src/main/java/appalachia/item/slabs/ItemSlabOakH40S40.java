package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S40;

public class ItemSlabOakH40S40 extends AppalachiaItemSlab {

    public ItemSlabOakH40S40(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_40.getDefaultState().withProperty(BlockPlanksOakH40S40.DOUBLE, Boolean.valueOf(true));
    }
}
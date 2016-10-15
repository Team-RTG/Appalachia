package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S60;

public class ItemSlabOakH40S60 extends AppalachiaItemSlab {

    public ItemSlabOakH40S60(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_60.getDefaultState().withProperty(BlockPlanksOakH40S60.DOUBLE, Boolean.valueOf(true));
    }
}
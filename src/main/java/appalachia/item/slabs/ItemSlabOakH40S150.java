package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S150;

public class ItemSlabOakH40S150 extends AppalachiaItemSlab {

    public ItemSlabOakH40S150(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_150.getDefaultState().withProperty(BlockPlanksOakH40S150.DOUBLE, Boolean.valueOf(true));
    }
}
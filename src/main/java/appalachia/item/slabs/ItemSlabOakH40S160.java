package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S160;

public class ItemSlabOakH40S160 extends AppalachiaItemSlab {

    public ItemSlabOakH40S160(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_160.getDefaultState().withProperty(BlockPlanksOakH40S160.DOUBLE, Boolean.valueOf(true));
    }
}
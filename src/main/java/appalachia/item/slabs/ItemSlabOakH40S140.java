package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S140;

public class ItemSlabOakH40S140 extends AppalachiaItemSlab {

    public ItemSlabOakH40S140(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_140.getDefaultState().withProperty(BlockPlanksOakH40S140.DOUBLE, Boolean.valueOf(true));
    }
}
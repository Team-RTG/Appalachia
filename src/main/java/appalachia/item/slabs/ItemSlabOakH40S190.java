package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S190;

public class ItemSlabOakH40S190 extends AppalachiaItemSlab {

    public ItemSlabOakH40S190(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_190.getDefaultState().withProperty(BlockPlanksOakH40S190.DOUBLE, Boolean.valueOf(true));
    }
}
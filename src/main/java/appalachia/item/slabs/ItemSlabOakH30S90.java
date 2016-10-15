package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S90;

public class ItemSlabOakH30S90 extends AppalachiaItemSlab {

    public ItemSlabOakH30S90(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_90.getDefaultState().withProperty(BlockPlanksOakH30S90.DOUBLE, Boolean.valueOf(true));
    }
}
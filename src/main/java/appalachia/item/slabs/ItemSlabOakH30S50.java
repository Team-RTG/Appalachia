package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S50;

public class ItemSlabOakH30S50 extends AppalachiaItemSlab {

    public ItemSlabOakH30S50(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_50.getDefaultState().withProperty(BlockPlanksOakH30S50.DOUBLE, Boolean.valueOf(true));
    }
}
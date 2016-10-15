package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S20;

public class ItemSlabOakH30S20 extends AppalachiaItemSlab {

    public ItemSlabOakH30S20(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_20.getDefaultState().withProperty(BlockPlanksOakH30S20.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S80;

public class ItemSlabOakH30S80 extends AppalachiaItemSlab {

    public ItemSlabOakH30S80(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_80.getDefaultState().withProperty(BlockPlanksOakH30S80.DOUBLE, Boolean.valueOf(true));
    }
}
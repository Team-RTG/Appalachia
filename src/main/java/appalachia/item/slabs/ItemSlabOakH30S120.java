package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S120;

public class ItemSlabOakH30S120 extends AppalachiaItemSlab {

    public ItemSlabOakH30S120(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_120.getDefaultState().withProperty(BlockPlanksOakH30S120.DOUBLE, Boolean.valueOf(true));
    }
}
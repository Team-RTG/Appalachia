package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S240;

public class ItemSlabOakH30S240 extends AppalachiaItemSlab {

    public ItemSlabOakH30S240(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_240.getDefaultState().withProperty(BlockPlanksOakH30S240.DOUBLE, Boolean.valueOf(true));
    }
}
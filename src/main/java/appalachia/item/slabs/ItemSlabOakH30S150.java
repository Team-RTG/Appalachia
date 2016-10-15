package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S150;

public class ItemSlabOakH30S150 extends AppalachiaItemSlab {

    public ItemSlabOakH30S150(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_150.getDefaultState().withProperty(BlockPlanksOakH30S150.DOUBLE, Boolean.valueOf(true));
    }
}
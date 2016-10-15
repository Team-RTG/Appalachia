package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S230;

public class ItemSlabOakH30S230 extends AppalachiaItemSlab {

    public ItemSlabOakH30S230(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_230.getDefaultState().withProperty(BlockPlanksOakH30S230.DOUBLE, Boolean.valueOf(true));
    }
}
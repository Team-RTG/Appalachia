package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S250;

public class ItemSlabOakH30S250 extends AppalachiaItemSlab {

    public ItemSlabOakH30S250(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_250.getDefaultState().withProperty(BlockPlanksOakH30S250.DOUBLE, Boolean.valueOf(true));
    }
}
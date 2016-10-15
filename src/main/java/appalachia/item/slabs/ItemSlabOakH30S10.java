package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S10;

public class ItemSlabOakH30S10 extends AppalachiaItemSlab {

    public ItemSlabOakH30S10(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_10.getDefaultState().withProperty(BlockPlanksOakH30S10.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S50;

public class ItemSlabOakH20S50 extends AppalachiaItemSlab {

    public ItemSlabOakH20S50(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_50.getDefaultState().withProperty(BlockPlanksOakH20S50.DOUBLE, Boolean.valueOf(true));
    }
}
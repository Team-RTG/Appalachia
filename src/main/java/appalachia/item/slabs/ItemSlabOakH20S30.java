package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S30;

public class ItemSlabOakH20S30 extends AppalachiaItemSlab {

    public ItemSlabOakH20S30(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_30.getDefaultState().withProperty(BlockPlanksOakH20S30.DOUBLE, Boolean.valueOf(true));
    }
}
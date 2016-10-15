package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S80;

public class ItemSlabOakH20S80 extends AppalachiaItemSlab {

    public ItemSlabOakH20S80(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_80.getDefaultState().withProperty(BlockPlanksOakH20S80.DOUBLE, Boolean.valueOf(true));
    }
}
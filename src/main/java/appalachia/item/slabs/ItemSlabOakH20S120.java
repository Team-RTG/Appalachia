package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S120;

public class ItemSlabOakH20S120 extends AppalachiaItemSlab {

    public ItemSlabOakH20S120(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_120.getDefaultState().withProperty(BlockPlanksOakH20S120.DOUBLE, Boolean.valueOf(true));
    }
}
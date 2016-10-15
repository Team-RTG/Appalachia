package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S100;

public class ItemSlabOakH20S100 extends AppalachiaItemSlab {

    public ItemSlabOakH20S100(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_100.getDefaultState().withProperty(BlockPlanksOakH20S100.DOUBLE, Boolean.valueOf(true));
    }
}
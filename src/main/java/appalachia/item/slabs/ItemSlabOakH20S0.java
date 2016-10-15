package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S0;

public class ItemSlabOakH20S0 extends AppalachiaItemSlab {

    public ItemSlabOakH20S0(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_0.getDefaultState().withProperty(BlockPlanksOakH20S0.DOUBLE, Boolean.valueOf(true));
    }
}
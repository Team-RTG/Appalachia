package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S90;

public class ItemSlabOakH20S90 extends AppalachiaItemSlab {

    public ItemSlabOakH20S90(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_90.getDefaultState().withProperty(BlockPlanksOakH20S90.DOUBLE, Boolean.valueOf(true));
    }
}
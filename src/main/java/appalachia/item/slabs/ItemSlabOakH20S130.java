package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S130;

public class ItemSlabOakH20S130 extends AppalachiaItemSlab {

    public ItemSlabOakH20S130(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_130.getDefaultState().withProperty(BlockPlanksOakH20S130.DOUBLE, Boolean.valueOf(true));
    }
}
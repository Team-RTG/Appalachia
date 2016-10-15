package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S180;

public class ItemSlabOakH20S180 extends AppalachiaItemSlab {

    public ItemSlabOakH20S180(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_180.getDefaultState().withProperty(BlockPlanksOakH20S180.DOUBLE, Boolean.valueOf(true));
    }
}
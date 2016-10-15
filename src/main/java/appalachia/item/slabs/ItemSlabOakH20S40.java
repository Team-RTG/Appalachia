package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S40;

public class ItemSlabOakH20S40 extends AppalachiaItemSlab {

    public ItemSlabOakH20S40(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_40.getDefaultState().withProperty(BlockPlanksOakH20S40.DOUBLE, Boolean.valueOf(true));
    }
}
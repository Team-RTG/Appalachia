package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S60;

public class ItemSlabOakH20S60 extends AppalachiaItemSlab {

    public ItemSlabOakH20S60(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_60.getDefaultState().withProperty(BlockPlanksOakH20S60.DOUBLE, Boolean.valueOf(true));
    }
}
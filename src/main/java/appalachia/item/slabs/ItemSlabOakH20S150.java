package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S150;

public class ItemSlabOakH20S150 extends AppalachiaItemSlab {

    public ItemSlabOakH20S150(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_150.getDefaultState().withProperty(BlockPlanksOakH20S150.DOUBLE, Boolean.valueOf(true));
    }
}
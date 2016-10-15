package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S140;

public class ItemSlabOakH20S140 extends AppalachiaItemSlab {

    public ItemSlabOakH20S140(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_140.getDefaultState().withProperty(BlockPlanksOakH20S140.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S190;

public class ItemSlabOakH20S190 extends AppalachiaItemSlab {

    public ItemSlabOakH20S190(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_190.getDefaultState().withProperty(BlockPlanksOakH20S190.DOUBLE, Boolean.valueOf(true));
    }
}
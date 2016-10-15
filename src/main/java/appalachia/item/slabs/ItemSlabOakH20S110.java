package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S110;

public class ItemSlabOakH20S110 extends AppalachiaItemSlab {

    public ItemSlabOakH20S110(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_110.getDefaultState().withProperty(BlockPlanksOakH20S110.DOUBLE, Boolean.valueOf(true));
    }
}
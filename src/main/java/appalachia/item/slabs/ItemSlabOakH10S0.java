package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S0;

public class ItemSlabOakH10S0 extends AppalachiaItemSlab {

    public ItemSlabOakH10S0(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_0.getDefaultState().withProperty(BlockPlanksOakH10S0.DOUBLE, Boolean.valueOf(true));
    }
}
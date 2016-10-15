package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S100;

public class ItemSlabOakH10S100 extends AppalachiaItemSlab {

    public ItemSlabOakH10S100(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_100.getDefaultState().withProperty(BlockPlanksOakH10S100.DOUBLE, Boolean.valueOf(true));
    }
}
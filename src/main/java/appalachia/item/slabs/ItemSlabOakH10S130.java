package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S130;

public class ItemSlabOakH10S130 extends AppalachiaItemSlab {

    public ItemSlabOakH10S130(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_130.getDefaultState().withProperty(BlockPlanksOakH10S130.DOUBLE, Boolean.valueOf(true));
    }
}
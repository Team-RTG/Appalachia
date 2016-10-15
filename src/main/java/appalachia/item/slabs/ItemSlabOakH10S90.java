package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S90;

public class ItemSlabOakH10S90 extends AppalachiaItemSlab {

    public ItemSlabOakH10S90(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_90.getDefaultState().withProperty(BlockPlanksOakH10S90.DOUBLE, Boolean.valueOf(true));
    }
}
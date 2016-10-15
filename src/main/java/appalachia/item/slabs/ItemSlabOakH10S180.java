package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S180;

public class ItemSlabOakH10S180 extends AppalachiaItemSlab {

    public ItemSlabOakH10S180(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_180.getDefaultState().withProperty(BlockPlanksOakH10S180.DOUBLE, Boolean.valueOf(true));
    }
}
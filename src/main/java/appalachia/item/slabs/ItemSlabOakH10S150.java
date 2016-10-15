package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S150;

public class ItemSlabOakH10S150 extends AppalachiaItemSlab {

    public ItemSlabOakH10S150(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_150.getDefaultState().withProperty(BlockPlanksOakH10S150.DOUBLE, Boolean.valueOf(true));
    }
}
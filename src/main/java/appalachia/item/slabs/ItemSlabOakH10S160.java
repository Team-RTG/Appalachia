package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S160;

public class ItemSlabOakH10S160 extends AppalachiaItemSlab {

    public ItemSlabOakH10S160(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_160.getDefaultState().withProperty(BlockPlanksOakH10S160.DOUBLE, Boolean.valueOf(true));
    }
}
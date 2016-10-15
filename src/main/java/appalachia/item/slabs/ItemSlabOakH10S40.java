package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S40;

public class ItemSlabOakH10S40 extends AppalachiaItemSlab {

    public ItemSlabOakH10S40(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_40.getDefaultState().withProperty(BlockPlanksOakH10S40.DOUBLE, Boolean.valueOf(true));
    }
}
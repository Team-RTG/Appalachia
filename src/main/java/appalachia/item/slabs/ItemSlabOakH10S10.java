package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S10;

public class ItemSlabOakH10S10 extends AppalachiaItemSlab {

    public ItemSlabOakH10S10(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_10.getDefaultState().withProperty(BlockPlanksOakH10S10.DOUBLE, Boolean.valueOf(true));
    }
}
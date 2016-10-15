package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S60;

public class ItemSlabOakH10S60 extends AppalachiaItemSlab {

    public ItemSlabOakH10S60(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_60.getDefaultState().withProperty(BlockPlanksOakH10S60.DOUBLE, Boolean.valueOf(true));
    }
}
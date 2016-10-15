package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S110;

public class ItemSlabOakH10S110 extends AppalachiaItemSlab {

    public ItemSlabOakH10S110(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_110.getDefaultState().withProperty(BlockPlanksOakH10S110.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBuckeye01;

public class ItemSlabBuckeye01 extends AppalachiaItemSlab {

    public ItemSlabBuckeye01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_buckeye_01.getDefaultState().withProperty(BlockPlanksBuckeye01.DOUBLE, Boolean.valueOf(true));
    }
}
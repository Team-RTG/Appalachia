package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksSycamore01;

public class ItemSlabSycamore01 extends AppalachiaItemSlab {

    public ItemSlabSycamore01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_sycamore_01.getDefaultState().withProperty(BlockPlanksSycamore01.DOUBLE, Boolean.valueOf(true));
    }
}
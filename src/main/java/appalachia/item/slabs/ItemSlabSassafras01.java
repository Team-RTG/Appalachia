package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksSassafras01;

public class ItemSlabSassafras01 extends AppalachiaItemSlab {

    public ItemSlabSassafras01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_sassafras_01.getDefaultState().withProperty(BlockPlanksSassafras01.DOUBLE, Boolean.valueOf(true));
    }
}
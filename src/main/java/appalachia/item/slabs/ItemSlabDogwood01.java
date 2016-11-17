package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksDogwood01;

public class ItemSlabDogwood01 extends AppalachiaItemSlab {

    public ItemSlabDogwood01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_dogwood_01.getDefaultState().withProperty(BlockPlanksDogwood01.DOUBLE, Boolean.valueOf(true));
    }
}
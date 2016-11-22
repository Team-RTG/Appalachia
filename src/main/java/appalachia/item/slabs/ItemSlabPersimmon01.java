package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksPersimmon01;

public class ItemSlabPersimmon01 extends AppalachiaItemSlab {

    public ItemSlabPersimmon01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_persimmon_01.getDefaultState().withProperty(BlockPlanksPersimmon01.DOUBLE, Boolean.valueOf(true));
    }
}
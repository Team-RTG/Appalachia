package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksPignutHickory01;

public class ItemSlabPignutHickory01 extends AppalachiaItemSlab {

    public ItemSlabPignutHickory01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_pignut_hickory_01.getDefaultState().withProperty(BlockPlanksPignutHickory01.DOUBLE, Boolean.valueOf(true));
    }
}
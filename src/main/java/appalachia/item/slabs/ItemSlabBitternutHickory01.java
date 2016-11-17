package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBitternutHickory01;

public class ItemSlabBitternutHickory01 extends AppalachiaItemSlab {

    public ItemSlabBitternutHickory01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_bitternut_hickory_01.getDefaultState().withProperty(BlockPlanksBitternutHickory01.DOUBLE, Boolean.valueOf(true));
    }
}
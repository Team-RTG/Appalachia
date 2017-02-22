package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksTamarack01;

public class ItemSlabTamarack01 extends AppalachiaItemSlab {

    public ItemSlabTamarack01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_tamarack_01.getDefaultState().withProperty(BlockPlanksTamarack01.DOUBLE, Boolean.valueOf(true));
    }
}
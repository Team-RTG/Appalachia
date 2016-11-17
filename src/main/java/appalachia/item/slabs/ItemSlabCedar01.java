package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksCedar01;

public class ItemSlabCedar01 extends AppalachiaItemSlab {

    public ItemSlabCedar01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_cedar_01.getDefaultState().withProperty(BlockPlanksCedar01.DOUBLE, Boolean.valueOf(true));
    }
}
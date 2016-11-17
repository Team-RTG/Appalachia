package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksTulipPoplar01;

public class ItemSlabTulipPoplar01 extends AppalachiaItemSlab {

    public ItemSlabTulipPoplar01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_tulip_poplar_01.getDefaultState().withProperty(BlockPlanksTulipPoplar01.DOUBLE, Boolean.valueOf(true));
    }
}
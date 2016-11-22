package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksSugarMaple01;

public class ItemSlabSugarMaple01 extends AppalachiaItemSlab {

    public ItemSlabSugarMaple01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_sugar_maple_01.getDefaultState().withProperty(BlockPlanksSugarMaple01.DOUBLE, Boolean.valueOf(true));
    }
}
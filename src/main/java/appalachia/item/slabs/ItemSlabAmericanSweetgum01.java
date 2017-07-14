package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAmericanSweetgum01;

public class ItemSlabAmericanSweetgum01 extends AppalachiaItemSlab {

    public ItemSlabAmericanSweetgum01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_american_sweetgum_01.getDefaultState().withProperty(BlockPlanksAmericanSweetgum01.DOUBLE, Boolean.valueOf(true));
    }
}
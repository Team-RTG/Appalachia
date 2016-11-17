package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAmericanElm01;

public class ItemSlabAmericanElm01 extends AppalachiaItemSlab {

    public ItemSlabAmericanElm01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_american_elm_01.getDefaultState().withProperty(BlockPlanksAmericanElm01.DOUBLE, Boolean.valueOf(true));
    }
}
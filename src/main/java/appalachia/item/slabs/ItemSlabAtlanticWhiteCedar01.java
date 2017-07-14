package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAtlanticWhiteCedar01;

public class ItemSlabAtlanticWhiteCedar01 extends AppalachiaItemSlab {

    public ItemSlabAtlanticWhiteCedar01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_atlantic_white_cedar_01.getDefaultState().withProperty(BlockPlanksAtlanticWhiteCedar01.DOUBLE, Boolean.valueOf(true));
    }
}
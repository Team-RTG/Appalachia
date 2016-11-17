package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksYellowBirch01;

public class ItemSlabYellowBirch01 extends AppalachiaItemSlab {

    public ItemSlabYellowBirch01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_yellow_birch_01.getDefaultState().withProperty(BlockPlanksYellowBirch01.DOUBLE, Boolean.valueOf(true));
    }
}
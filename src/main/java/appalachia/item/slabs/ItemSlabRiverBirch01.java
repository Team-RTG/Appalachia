package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRiverBirch01;

public class ItemSlabRiverBirch01 extends AppalachiaItemSlab {

    public ItemSlabRiverBirch01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_river_birch_01.getDefaultState().withProperty(BlockPlanksRiverBirch01.DOUBLE, Boolean.valueOf(true));
    }
}
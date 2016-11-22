package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlueBeech01;

public class ItemSlabBlueBeech01 extends AppalachiaItemSlab {

    public ItemSlabBlueBeech01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_blue_beech_01.getDefaultState().withProperty(BlockPlanksBlueBeech01.DOUBLE, Boolean.valueOf(true));
    }
}
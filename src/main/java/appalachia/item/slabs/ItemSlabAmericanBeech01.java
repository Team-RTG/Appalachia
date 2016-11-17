package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAmericanBeech01;

public class ItemSlabAmericanBeech01 extends AppalachiaItemSlab {

    public ItemSlabAmericanBeech01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_american_beech_01.getDefaultState().withProperty(BlockPlanksAmericanBeech01.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAmericanBasswood01;

public class ItemSlabAmericanBasswood01 extends AppalachiaItemSlab {

    public ItemSlabAmericanBasswood01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_american_basswood_01.getDefaultState().withProperty(BlockPlanksAmericanBasswood01.DOUBLE, Boolean.valueOf(true));
    }
}
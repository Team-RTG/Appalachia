package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackSpruce01;

public class ItemSlabBlackSpruce01 extends AppalachiaItemSlab {

    public ItemSlabBlackSpruce01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_spruce_01.getDefaultState().withProperty(BlockPlanksBlackSpruce01.DOUBLE, Boolean.valueOf(true));
    }
}
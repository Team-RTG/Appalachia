package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRedSpruce01;

public class ItemSlabRedSpruce01 extends AppalachiaItemSlab {

    public ItemSlabRedSpruce01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_red_spruce_01.getDefaultState().withProperty(BlockPlanksRedSpruce01.DOUBLE, Boolean.valueOf(true));
    }
}
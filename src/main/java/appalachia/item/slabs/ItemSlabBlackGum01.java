package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackGum01;

public class ItemSlabBlackGum01 extends AppalachiaItemSlab {

    public ItemSlabBlackGum01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_gum_01.getDefaultState().withProperty(BlockPlanksBlackGum01.DOUBLE, Boolean.valueOf(true));
    }
}
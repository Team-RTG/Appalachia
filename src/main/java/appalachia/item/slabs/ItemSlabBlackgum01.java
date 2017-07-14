package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackgum01;

public class ItemSlabBlackgum01 extends AppalachiaItemSlab {

    public ItemSlabBlackgum01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_blackgum_01.getDefaultState().withProperty(BlockPlanksBlackgum01.DOUBLE, Boolean.valueOf(true));
    }
}
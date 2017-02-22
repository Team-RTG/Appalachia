package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksHophornbeam01;

public class ItemSlabHophornbeam01 extends AppalachiaItemSlab {

    public ItemSlabHophornbeam01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_hophornbeam_01.getDefaultState().withProperty(BlockPlanksHophornbeam01.DOUBLE, Boolean.valueOf(true));
    }
}
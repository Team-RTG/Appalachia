package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlueRidge03;

public class ItemSlabBlueRidge03 extends AppalachiaItemSlab {

    public ItemSlabBlueRidge03(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_blueridge_03.getDefaultState().withProperty(BlockPlanksBlueRidge03.DOUBLE, Boolean.valueOf(true));
    }
}
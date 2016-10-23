package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlueRidge02;

public class ItemSlabBlueRidge02 extends AppalachiaItemSlab {

    public ItemSlabBlueRidge02(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_blueridge_02.getDefaultState().withProperty(BlockPlanksBlueRidge02.DOUBLE, Boolean.valueOf(true));
    }
}
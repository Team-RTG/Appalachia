package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksHackberry01;

public class ItemSlabHackberry01 extends AppalachiaItemSlab {

    public ItemSlabHackberry01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_hackberry_01.getDefaultState().withProperty(BlockPlanksHackberry01.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRedOak01;

public class ItemSlabRedOak01 extends AppalachiaItemSlab {

    public ItemSlabRedOak01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_red_oak_01.getDefaultState().withProperty(BlockPlanksRedOak01.DOUBLE, Boolean.valueOf(true));
    }
}
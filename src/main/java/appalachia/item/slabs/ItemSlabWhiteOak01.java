package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksWhiteOak01;

public class ItemSlabWhiteOak01 extends AppalachiaItemSlab {

    public ItemSlabWhiteOak01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_white_oak_01.getDefaultState().withProperty(BlockPlanksWhiteOak01.DOUBLE, Boolean.valueOf(true));
    }
}
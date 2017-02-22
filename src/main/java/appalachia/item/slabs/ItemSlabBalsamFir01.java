package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBalsamFir01;

public class ItemSlabBalsamFir01 extends AppalachiaItemSlab {

    public ItemSlabBalsamFir01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_balsam_fir_01.getDefaultState().withProperty(BlockPlanksBalsamFir01.DOUBLE, Boolean.valueOf(true));
    }
}
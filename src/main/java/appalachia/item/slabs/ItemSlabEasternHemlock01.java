package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksEasternHemlock01;

public class ItemSlabEasternHemlock01 extends AppalachiaItemSlab {

    public ItemSlabEasternHemlock01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_eastern_hemlock_01.getDefaultState().withProperty(BlockPlanksEasternHemlock01.DOUBLE, Boolean.valueOf(true));
    }
}
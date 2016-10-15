package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S110;

public class ItemSlabOakH30S110 extends AppalachiaItemSlab {

    public ItemSlabOakH30S110(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_110.getDefaultState().withProperty(BlockPlanksOakH30S110.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S190;

public class ItemSlabOakH30S190 extends AppalachiaItemSlab {

    public ItemSlabOakH30S190(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_190.getDefaultState().withProperty(BlockPlanksOakH30S190.DOUBLE, Boolean.valueOf(true));
    }
}
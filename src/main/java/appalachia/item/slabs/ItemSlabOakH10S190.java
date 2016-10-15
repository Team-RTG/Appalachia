package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S190;

public class ItemSlabOakH10S190 extends AppalachiaItemSlab {

    public ItemSlabOakH10S190(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_190.getDefaultState().withProperty(BlockPlanksOakH10S190.DOUBLE, Boolean.valueOf(true));
    }
}
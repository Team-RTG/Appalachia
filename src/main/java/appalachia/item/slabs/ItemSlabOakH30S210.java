package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S210;

public class ItemSlabOakH30S210 extends AppalachiaItemSlab {

    public ItemSlabOakH30S210(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_210.getDefaultState().withProperty(BlockPlanksOakH30S210.DOUBLE, Boolean.valueOf(true));
    }
}
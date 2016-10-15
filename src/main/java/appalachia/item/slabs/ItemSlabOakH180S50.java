package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S50;

public class ItemSlabOakH180S50 extends AppalachiaItemSlab {

    public ItemSlabOakH180S50(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_50.getDefaultState().withProperty(BlockPlanksOakH180S50.DOUBLE, Boolean.valueOf(true));
    }
}
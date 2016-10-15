package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S100;

public class ItemSlabOakH180S100 extends AppalachiaItemSlab {

    public ItemSlabOakH180S100(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_100.getDefaultState().withProperty(BlockPlanksOakH180S100.DOUBLE, Boolean.valueOf(true));
    }
}
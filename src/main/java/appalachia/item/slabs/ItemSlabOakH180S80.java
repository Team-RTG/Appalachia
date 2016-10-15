package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S80;

public class ItemSlabOakH180S80 extends AppalachiaItemSlab {

    public ItemSlabOakH180S80(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_80.getDefaultState().withProperty(BlockPlanksOakH180S80.DOUBLE, Boolean.valueOf(true));
    }
}
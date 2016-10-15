package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S90;

public class ItemSlabOakH180S90 extends AppalachiaItemSlab {

    public ItemSlabOakH180S90(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_90.getDefaultState().withProperty(BlockPlanksOakH180S90.DOUBLE, Boolean.valueOf(true));
    }
}
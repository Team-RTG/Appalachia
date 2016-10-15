package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S40;

public class ItemSlabOakH180S40 extends AppalachiaItemSlab {

    public ItemSlabOakH180S40(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_40.getDefaultState().withProperty(BlockPlanksOakH180S40.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S10;

public class ItemSlabOakH180S10 extends AppalachiaItemSlab {

    public ItemSlabOakH180S10(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_10.getDefaultState().withProperty(BlockPlanksOakH180S10.DOUBLE, Boolean.valueOf(true));
    }
}
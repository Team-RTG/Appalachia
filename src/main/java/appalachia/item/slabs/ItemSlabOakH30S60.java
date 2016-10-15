package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S60;

public class ItemSlabOakH30S60 extends AppalachiaItemSlab {

    public ItemSlabOakH30S60(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_60.getDefaultState().withProperty(BlockPlanksOakH30S60.DOUBLE, Boolean.valueOf(true));
    }
}
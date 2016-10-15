package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S200;

public class ItemSlabOakH30S200 extends AppalachiaItemSlab {

    public ItemSlabOakH30S200(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_200.getDefaultState().withProperty(BlockPlanksOakH30S200.DOUBLE, Boolean.valueOf(true));
    }
}
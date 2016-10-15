package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S220;

public class ItemSlabOakH30S220 extends AppalachiaItemSlab {

    public ItemSlabOakH30S220(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_220.getDefaultState().withProperty(BlockPlanksOakH30S220.DOUBLE, Boolean.valueOf(true));
    }
}
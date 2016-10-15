package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S200;

public class ItemSlabOakH10S200 extends AppalachiaItemSlab {

    public ItemSlabOakH10S200(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_200.getDefaultState().withProperty(BlockPlanksOakH10S200.DOUBLE, Boolean.valueOf(true));
    }
}
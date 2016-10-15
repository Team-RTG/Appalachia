package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S200;

public class ItemSlabOakH40S200 extends AppalachiaItemSlab {

    public ItemSlabOakH40S200(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_200.getDefaultState().withProperty(BlockPlanksOakH40S200.DOUBLE, Boolean.valueOf(true));
    }
}
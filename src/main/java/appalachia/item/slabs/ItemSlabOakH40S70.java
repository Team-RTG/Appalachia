package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S70;

public class ItemSlabOakH40S70 extends AppalachiaItemSlab {

    public ItemSlabOakH40S70(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_70.getDefaultState().withProperty(BlockPlanksOakH40S70.DOUBLE, Boolean.valueOf(true));
    }
}
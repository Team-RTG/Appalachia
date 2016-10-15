package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S70;

public class ItemSlabOakH20S70 extends AppalachiaItemSlab {

    public ItemSlabOakH20S70(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_70.getDefaultState().withProperty(BlockPlanksOakH20S70.DOUBLE, Boolean.valueOf(true));
    }
}
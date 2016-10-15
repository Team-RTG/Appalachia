package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S70;

public class ItemSlabOakH180S70 extends AppalachiaItemSlab {

    public ItemSlabOakH180S70(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_70.getDefaultState().withProperty(BlockPlanksOakH180S70.DOUBLE, Boolean.valueOf(true));
    }
}
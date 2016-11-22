package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBoxElder01;

public class ItemSlabBoxElder01 extends AppalachiaItemSlab {

    public ItemSlabBoxElder01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_box_elder_01.getDefaultState().withProperty(BlockPlanksBoxElder01.DOUBLE, Boolean.valueOf(true));
    }
}
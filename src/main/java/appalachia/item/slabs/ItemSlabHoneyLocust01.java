package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksHoneyLocust01;

public class ItemSlabHoneyLocust01 extends AppalachiaItemSlab {

    public ItemSlabHoneyLocust01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_honey_locust_01.getDefaultState().withProperty(BlockPlanksHoneyLocust01.DOUBLE, Boolean.valueOf(true));
    }
}
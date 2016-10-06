package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAutumnCoffee;

public class ItemSlabAutumnCoffee extends AppalachiaItemSlab {

    public ItemSlabAutumnCoffee(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_autumn_coffee.getDefaultState().withProperty(BlockPlanksAutumnCoffee.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksWhiteOak01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksWhiteOak01() {

        super("planks.white_oak.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_white_oak_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
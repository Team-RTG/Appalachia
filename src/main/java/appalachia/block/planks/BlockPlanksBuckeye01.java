package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksBuckeye01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksBuckeye01() {

        super("planks.buckeye.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_buckeye_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
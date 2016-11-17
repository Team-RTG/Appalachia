package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksDogwood01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksDogwood01() {

        super("planks.dogwood.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_dogwood_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
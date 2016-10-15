package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksOakH10S60 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksOakH10S60() {

        super("planks.oak.10.60");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_oak_10_60 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
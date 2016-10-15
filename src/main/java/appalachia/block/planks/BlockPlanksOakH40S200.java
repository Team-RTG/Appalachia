package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksOakH40S200 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksOakH40S200() {

        super("planks.oak.40.200");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_oak_40_200 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
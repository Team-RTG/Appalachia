package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksBlackWalnut01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksBlackWalnut01() {

        super("planks.black_walnut.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_black_walnut_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
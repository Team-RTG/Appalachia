package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksBlueRidge03 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksBlueRidge03() {

        super("planks.blueridge.03");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_blueridge_03 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
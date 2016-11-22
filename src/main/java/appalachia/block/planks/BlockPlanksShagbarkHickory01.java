package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksShagbarkHickory01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksShagbarkHickory01() {

        super("planks.shagbark_hickory.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_shagbark_hickory_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
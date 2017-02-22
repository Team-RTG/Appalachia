package appalachia.block.leaves;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockLeavesAtlanticWhiteCedar01 extends AppalachiaBlockLeaves implements IAppalachiaBlock {

    public BlockLeavesAtlanticWhiteCedar01() {

        super("leaves.atlantic_white_cedar.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(AppalachiaBlocks.sapling_atlantic_white_cedar_01);
    }
}
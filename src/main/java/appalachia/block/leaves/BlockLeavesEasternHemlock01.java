package appalachia.block.leaves;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockLeavesEasternHemlock01 extends AppalachiaBlockLeaves implements IAppalachiaBlock {

    public BlockLeavesEasternHemlock01() {

        super("leaves.eastern_hemlock.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    protected boolean evergreen() {
        return true;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(AppalachiaBlocks.sapling_eastern_hemlock_01);
    }
}
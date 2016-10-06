package appalachia.block.stairs;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockStairsAutumnBrown extends AppalachiaBlockStairs implements IAppalachiaBlock {

    public BlockStairsAutumnBrown() {

        super("stairs.autumn.brown", AppalachiaBlocks.planks_autumn_brown.getDefaultState());
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
package appalachia.block.stairs;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockStairsAutumnCharcoal extends AppalachiaBlockStairs implements IAppalachiaBlock {

    public BlockStairsAutumnCharcoal() {

        super("stairs.autumn.charcoal", AppalachiaBlocks.planks_autumn_charcoal.getDefaultState());
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}
package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlackSpruce;

public class BlockSaplingBlackSpruce01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlackSpruce01() {

        super("sapling.black_spruce.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlackSpruce();
    }
}
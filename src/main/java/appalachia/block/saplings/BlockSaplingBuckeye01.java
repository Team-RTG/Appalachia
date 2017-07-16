package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBuckeye;

public class BlockSaplingBuckeye01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBuckeye01() {

        super("sapling.buckeye.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBuckeye();
    }
}
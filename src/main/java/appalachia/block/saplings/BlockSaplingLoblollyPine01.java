package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeLoblollyPine;

public class BlockSaplingLoblollyPine01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingLoblollyPine01() {

        super("sapling.loblolly_pine.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeLoblollyPine();
    }
}
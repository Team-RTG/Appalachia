package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBitternutHickory;

public class BlockSaplingBitternutHickory01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBitternutHickory01() {

        super("sapling.bitternut_hickory.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBitternutHickory();
    }
}
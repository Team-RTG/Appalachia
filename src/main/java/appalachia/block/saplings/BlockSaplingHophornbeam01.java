package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHophornbeam;

public class BlockSaplingHophornbeam01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingHophornbeam01() {

        super("sapling.hophornbeam.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeHophornbeam();
    }
}
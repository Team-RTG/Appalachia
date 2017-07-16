package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeWhitePine;

public class BlockSaplingWhitePine01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingWhitePine01() {

        super("sapling.white_pine.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeWhitePine();
    }
}
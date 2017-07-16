package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeWhiteWalnut;

public class BlockSaplingWhiteWalnut01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingWhiteWalnut01() {

        super("sapling.white_walnut.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeWhiteWalnut();
    }
}
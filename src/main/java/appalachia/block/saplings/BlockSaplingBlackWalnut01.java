package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlackWalnut;

public class BlockSaplingBlackWalnut01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlackWalnut01() {

        super("sapling.black_walnut.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlackWalnut();
    }
}
package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAtlanticWhiteCedar;

public class BlockSaplingAtlanticWhiteCedar01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAtlanticWhiteCedar01() {

        super("sapling.atlantic_white_cedar.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAtlanticWhiteCedar();
    }
}
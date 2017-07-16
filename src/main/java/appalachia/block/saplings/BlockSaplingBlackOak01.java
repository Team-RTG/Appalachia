package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlackOak;

public class BlockSaplingBlackOak01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlackOak01() {

        super("sapling.black_oak.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlackOak();
    }
}
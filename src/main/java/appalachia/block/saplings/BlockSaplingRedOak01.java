package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedOak;

public class BlockSaplingRedOak01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedOak01() {

        super("sapling.red_oak.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeRedOak();
    }
}
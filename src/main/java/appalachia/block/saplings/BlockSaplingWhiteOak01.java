package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeWhiteOak;

public class BlockSaplingWhiteOak01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingWhiteOak01() {

        super("sapling.white_oak.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeWhiteOak();
    }
}
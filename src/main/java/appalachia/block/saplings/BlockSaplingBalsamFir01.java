package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBalsamFir;

public class BlockSaplingBalsamFir01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBalsamFir01() {

        super("sapling.balsam_fir.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBalsamFir();
    }
}
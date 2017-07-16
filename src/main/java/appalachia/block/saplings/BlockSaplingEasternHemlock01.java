package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeEasternHemlock;

public class BlockSaplingEasternHemlock01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingEasternHemlock01() {

        super("sapling.eastern_hemlock.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeEasternHemlock();
    }
}
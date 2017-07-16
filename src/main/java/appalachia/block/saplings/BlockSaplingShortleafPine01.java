package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeShortleafPine;

public class BlockSaplingShortleafPine01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingShortleafPine01() {

        super("sapling.shortleaf_pine.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeShortleafPine();
    }
}
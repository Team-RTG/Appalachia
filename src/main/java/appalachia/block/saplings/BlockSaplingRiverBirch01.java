package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRiverBirch;

public class BlockSaplingRiverBirch01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRiverBirch01() {

        super("sapling.river_birch.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeRiverBirch();
    }
}
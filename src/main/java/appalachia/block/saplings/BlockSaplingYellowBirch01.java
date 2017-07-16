package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeYellowBirch;

public class BlockSaplingYellowBirch01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingYellowBirch01() {

        super("sapling.yellow_birch.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeYellowBirch();
    }
}
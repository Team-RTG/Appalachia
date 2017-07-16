package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHackberry;

public class BlockSaplingHackberry01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingHackberry01() {

        super("sapling.hackberry.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeHackberry();
    }
}
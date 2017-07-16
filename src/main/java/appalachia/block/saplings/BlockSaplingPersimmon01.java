package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreePersimmon;

public class BlockSaplingPersimmon01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingPersimmon01() {

        super("sapling.persimmon.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreePersimmon();
    }
}
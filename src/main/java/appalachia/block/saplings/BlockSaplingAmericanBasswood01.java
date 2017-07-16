package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanBasswood;

public class BlockSaplingAmericanBasswood01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanBasswood01() {

        super("sapling.american_basswood.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAmericanBasswood();
    }
}
package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanSweetgum;

public class BlockSaplingAmericanSweetgum01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanSweetgum01() {

        super("sapling.american_sweetgum.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAmericanSweetgum();
    }
}
package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanElm;

public class BlockSaplingAmericanElm01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanElm01() {

        super("sapling.american_elm.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAmericanElm();
    }
}
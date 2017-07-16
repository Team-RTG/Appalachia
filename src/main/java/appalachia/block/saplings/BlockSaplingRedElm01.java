package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedElm;

public class BlockSaplingRedElm01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedElm01() {

        super("sapling.red_elm.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeRedElm();
    }
}
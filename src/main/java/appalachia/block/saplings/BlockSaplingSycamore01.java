package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeSycamore;

public class BlockSaplingSycamore01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingSycamore01() {

        super("sapling.sycamore.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeSycamore();
    }
}
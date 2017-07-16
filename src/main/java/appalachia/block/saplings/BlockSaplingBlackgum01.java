package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlackgum;

public class BlockSaplingBlackgum01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlackgum01() {

        super("sapling.blackgum.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlackgum();
    }
}
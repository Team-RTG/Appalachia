package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeTamarack;

public class BlockSaplingTamarack01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingTamarack01() {

        super("sapling.tamarack.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeTamarack();
    }
}
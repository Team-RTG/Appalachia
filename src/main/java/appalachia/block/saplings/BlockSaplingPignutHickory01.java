package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreePignutHickory;

public class BlockSaplingPignutHickory01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingPignutHickory01() {

        super("sapling.pignut_hickory.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreePignutHickory();
    }
}
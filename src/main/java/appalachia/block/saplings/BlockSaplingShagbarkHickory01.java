package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeShagbarkHickory;

public class BlockSaplingShagbarkHickory01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingShagbarkHickory01() {

        super("sapling.shagbark_hickory.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeShagbarkHickory();
    }
}
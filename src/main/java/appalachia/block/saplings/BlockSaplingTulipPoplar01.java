package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeTulipPoplar;

public class BlockSaplingTulipPoplar01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingTulipPoplar01() {

        super("sapling.tulip_poplar.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeTulipPoplar();
    }
}
package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeFloweringDogwood;

public class BlockSaplingFloweringDogwood01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingFloweringDogwood01() {

        super("sapling.flowering_dogwood.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeFloweringDogwood();
    }
}
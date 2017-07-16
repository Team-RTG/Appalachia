package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHoneyLocust;

public class BlockSaplingHoneyLocust01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingHoneyLocust01() {

        super("sapling.honey_locust.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeHoneyLocust();
    }
}
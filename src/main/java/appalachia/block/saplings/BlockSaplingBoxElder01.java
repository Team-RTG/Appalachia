package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBoxElder;

public class BlockSaplingBoxElder01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBoxElder01() {

        super("sapling.box_elder.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBoxElder();
    }
}
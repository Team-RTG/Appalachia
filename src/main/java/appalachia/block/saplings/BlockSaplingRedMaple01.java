package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedMaple;

public class BlockSaplingRedMaple01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedMaple01() {

        super("sapling.red_maple.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeRedMaple();
    }
}
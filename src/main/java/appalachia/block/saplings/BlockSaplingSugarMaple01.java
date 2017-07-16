package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeSugarMaple;

public class BlockSaplingSugarMaple01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingSugarMaple01() {

        super("sapling.sugar_maple.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeSugarMaple();
    }
}
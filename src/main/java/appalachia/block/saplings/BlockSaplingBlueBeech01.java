package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlueBeech;

public class BlockSaplingBlueBeech01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlueBeech01() {

        super("sapling.blue_beech.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlueBeech();
    }
}
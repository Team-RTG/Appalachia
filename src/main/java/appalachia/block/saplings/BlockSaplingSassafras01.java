package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeSassafras;

public class BlockSaplingSassafras01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingSassafras01() {

        super("sapling.sassafras.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeSassafras();
    }
}
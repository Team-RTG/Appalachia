package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedSpruce;

public class BlockSaplingRedSpruce01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedSpruce01() {

        super("sapling.red_spruce.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeRedSpruce();
    }
}
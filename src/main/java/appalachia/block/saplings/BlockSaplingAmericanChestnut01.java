package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanChestnut;

public class BlockSaplingAmericanChestnut01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanChestnut01() {

        super("sapling.american_chestnut.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAmericanChestnut();
    }
}
package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBitternutHickory;
import scala.actors.threadpool.Arrays;

public class BlockSaplingBitternutHickory01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBitternutHickory01() {

        super("sapling.bitternut_hickory.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeBitternutHickory()
        }));
    }
}
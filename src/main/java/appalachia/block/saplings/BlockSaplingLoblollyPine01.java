package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeLoblollyPine;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeLoblollyPineSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingLoblollyPine01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingLoblollyPine01() {

        super("sapling.loblolly_pine.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeLoblollyPine(),
            new TreeLoblollyPineSmall()
        }));
    }
}
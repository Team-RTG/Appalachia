package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHackberry;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHackberrySmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingHackberry01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingHackberry01() {

        super("sapling.hackberry.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeHackberry(),
            new TreeHackberrySmall()
        }));
    }
}
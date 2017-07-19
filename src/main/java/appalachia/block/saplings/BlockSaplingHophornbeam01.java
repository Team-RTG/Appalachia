package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHophornbeam;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeHophornbeamSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingHophornbeam01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingHophornbeam01() {

        super("sapling.hophornbeam.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeHophornbeam(),
            new TreeHophornbeamSmall()
        }));
    }
}
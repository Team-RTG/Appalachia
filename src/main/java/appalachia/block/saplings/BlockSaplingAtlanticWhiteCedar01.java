package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAtlanticWhiteCedar;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAtlanticWhiteCedarSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingAtlanticWhiteCedar01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAtlanticWhiteCedar01() {

        super("sapling.atlantic_white_cedar.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeAtlanticWhiteCedar(),
            new TreeAtlanticWhiteCedarSmall()
        }));
    }
}
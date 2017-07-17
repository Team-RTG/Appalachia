package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedOak;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedOakSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingRedOak01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedOak01() {

        super("sapling.red_oak.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeRedOak(),
            new TreeRedOakSmall()
        }));
    }
}
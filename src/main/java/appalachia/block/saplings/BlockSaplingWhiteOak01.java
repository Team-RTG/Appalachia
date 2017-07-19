package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeWhiteOak;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeWhiteOakSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingWhiteOak01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingWhiteOak01() {

        super("sapling.white_oak.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeWhiteOak(),
            new TreeWhiteOakSmall()
        }));
    }
}
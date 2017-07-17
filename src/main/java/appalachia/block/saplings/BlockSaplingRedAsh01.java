package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedAsh;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeRedAshSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingRedAsh01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingRedAsh01() {

        super("sapling.red_ash.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeRedAsh(),
            new TreeRedAshSmall()
        }));
    }
}
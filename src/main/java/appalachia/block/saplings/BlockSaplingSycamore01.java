package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeSycamore;
import scala.actors.threadpool.Arrays;

public class BlockSaplingSycamore01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingSycamore01() {

        super("sapling.sycamore.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeSycamore()
        }));
    }
}
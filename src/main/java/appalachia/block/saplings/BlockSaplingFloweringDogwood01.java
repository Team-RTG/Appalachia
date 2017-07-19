package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeFloweringDogwood;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeFloweringDogwoodSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingFloweringDogwood01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingFloweringDogwood01() {

        super("sapling.flowering_dogwood.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeFloweringDogwood(),
            new TreeFloweringDogwoodSmall()
        }));
    }
}
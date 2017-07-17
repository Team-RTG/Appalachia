package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlueBeech;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlueBeechSmall;
import scala.actors.threadpool.Arrays;

public class BlockSaplingBlueBeech01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlueBeech01() {

        super("sapling.blue_beech.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeBlueBeech(),
            new TreeBlueBeechSmall()
        }));
    }
}
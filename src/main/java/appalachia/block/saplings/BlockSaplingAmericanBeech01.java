package appalachia.block.saplings;

import java.util.ArrayList;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanBeech;
import scala.actors.threadpool.Arrays;

public class BlockSaplingAmericanBeech01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanBeech01() {

        super("sapling.american_beech.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public ArrayList<AppalachiaTree> getTrees() {
        return new ArrayList<AppalachiaTree>(Arrays.asList(new AppalachiaTree[] {
            new TreeAmericanBeech()
        }));
    }
}
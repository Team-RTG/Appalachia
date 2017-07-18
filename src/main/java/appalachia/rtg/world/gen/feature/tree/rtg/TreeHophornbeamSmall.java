package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.util.TreeLayer;

/**
 * Ostrya Virginiana (Hophornbeam)
 * <p>
 * This tree was designed by Lentebriesje and released as part of the 'Custom Tree Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/native-trees-of-europe-template-repository-1779952/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeHophornbeamSmall extends TreeHophornbeam {

    public TreeHophornbeamSmall() {
        super();

        this.firstBlockOffsetX = 5;
        this.firstBlockOffsetZ = 4;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);
        this.buildTree(world, pos.getX(), pos.getY() - this.rootDepth(), pos.getZ(), this.logBlock, this.leavesBlock);
        this.generateTreeFromLayers(this.logBlock, this.leavesBlock);
        return true;
    }

    @Override
    public int rootDepth() {
        return 0;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    @Override
    protected void buildTree(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y - 1;

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, y+0, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, y+1, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, y+2, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, y+2, z+1),
                new BlockPos(x+4, y+2, z+2),
                new BlockPos(x+5, y+2, z+2),
                new BlockPos(x+4, y+2, z+3),
                new BlockPos(x+6, y+2, z+3),
                new BlockPos(x+4, y+2, z+4),
                new BlockPos(x+5, y+2, z+5),
                new BlockPos(x+1, y+2, z+6),
                new BlockPos(x+3, y+2, z+6),
                new BlockPos(x+4, y+2, z+6),
                new BlockPos(x+6, y+2, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, y+3, z+3),
                new BlockPos(x+4, y+3, z+5)
            )
            .setLeaves(
                new BlockPos(x+5, y+3, z+0),
                new BlockPos(x+5, y+3, z+1),
                new BlockPos(x+3, y+3, z+2),
                new BlockPos(x+7, y+3, z+2),
                new BlockPos(x+3, y+3, z+3),
                new BlockPos(x+4, y+3, z+3),
                new BlockPos(x+6, y+3, z+3),
                new BlockPos(x+1, y+3, z+4),
                new BlockPos(x+2, y+3, z+4),
                new BlockPos(x+4, y+3, z+4),
                new BlockPos(x+6, y+3, z+4),
                new BlockPos(x+3, y+3, z+5),
                new BlockPos(x+3, y+3, z+7),
                new BlockPos(x+4, y+3, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, y+4, z+3),
                new BlockPos(x+3, y+4, z+6)
            )
            .setLeaves(
                new BlockPos(x+5, y+4, z+0),
                new BlockPos(x+4, y+4, z+1),
                new BlockPos(x+6, y+4, z+1),
                new BlockPos(x+7, y+4, z+1),
                new BlockPos(x+4, y+4, z+2),
                new BlockPos(x+2, y+4, z+3),
                new BlockPos(x+3, y+4, z+3),
                new BlockPos(x+4, y+4, z+3),
                new BlockPos(x+8, y+4, z+3),
                new BlockPos(x+3, y+4, z+4),
                new BlockPos(x+5, y+4, z+4),
                new BlockPos(x+8, y+4, z+4),
                new BlockPos(x+0, y+4, z+5),
                new BlockPos(x+2, y+4, z+5),
                new BlockPos(x+3, y+4, z+5),
                new BlockPos(x+4, y+4, z+5),
                new BlockPos(x+5, y+4, z+5),
                new BlockPos(x+6, y+4, z+5),
                new BlockPos(x+0, y+4, z+6),
                new BlockPos(x+1, y+4, z+6),
                new BlockPos(x+4, y+4, z+6),
                new BlockPos(x+5, y+4, z+6),
                new BlockPos(x+6, y+4, z+6),
                new BlockPos(x+5, y+4, z+7),
                new BlockPos(x+6, y+4, z+7),
                new BlockPos(x+3, y+4, z+8),
                new BlockPos(x+5, y+4, z+8)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+5, y+5, z+1),
                new BlockPos(x+2, y+5, z+3),
                new BlockPos(x+1, y+5, z+4),
                new BlockPos(x+7, y+5, z+4),
                new BlockPos(x+2, y+5, z+5),
                new BlockPos(x+2, y+5, z+6),
                new BlockPos(x+3, y+5, z+6),
                new BlockPos(x+4, y+5, z+6),
                new BlockPos(x+2, y+5, z+7),
                new BlockPos(x+5, y+5, z+7),
                new BlockPos(x+6, y+5, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+4, y+6, z+2),
                new BlockPos(x+5, y+6, z+2),
                new BlockPos(x+4, y+6, z+3),
                new BlockPos(x+5, y+6, z+3),
                new BlockPos(x+1, y+6, z+4),
                new BlockPos(x+2, y+6, z+4),
                new BlockPos(x+3, y+6, z+4),
                new BlockPos(x+2, y+6, z+5),
                new BlockPos(x+3, y+6, z+5),
                new BlockPos(x+7, y+6, z+5),
                new BlockPos(x+3, y+6, z+6),
                new BlockPos(x+4, y+6, z+6),
                new BlockPos(x+3, y+6, z+8)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+5, y+7, z+2),
                new BlockPos(x+4, y+7, z+3),
                new BlockPos(x+4, y+7, z+4),
                new BlockPos(x+5, y+7, z+4),
                new BlockPos(x+3, y+7, z+5),
                new BlockPos(x+5, y+7, z+5),
                new BlockPos(x+2, y+7, z+6)
            )
        );
    }
}

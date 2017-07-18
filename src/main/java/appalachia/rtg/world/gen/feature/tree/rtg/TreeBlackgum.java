package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;
import appalachia.util.TreeLayer;

/**
 * Nyssa Sylvatica (Blackgum)
 * <p>
 * This tree was designed by Monsterfish and released as part of the 'Conquered' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/conquered_-tree-and-rocks-bo2schematics-for-terraformers/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeBlackgum extends AppalachiaTree {

    public TreeBlackgum() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_blackgum_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_blackgum_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_blackgum_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_blackgum_01.getDefaultState());

        this.firstBlockOffsetX = 7;
        this.firstBlockOffsetZ = 3;
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
        return 1;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    protected void buildTree(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y - 1;

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+7, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+6, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+6, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+6, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+6, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+6, currentY, z+6)
            )
            .setLeaves(
                new BlockPos(x+8, currentY, z+4),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+9, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+4, currentY, z+9),
                new BlockPos(x+5, currentY, z+9)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+6, currentY, z+5)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+1),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+9, currentY, z+3),
                new BlockPos(x+10, currentY, z+3),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+8, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+10, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+8, currentY, z+5),
                new BlockPos(x+9, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+1, currentY, z+7),
                new BlockPos(x+8, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+11, currentY, z+7),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+6, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+10, currentY, z+8),
                new BlockPos(x+3, currentY, z+9),
                new BlockPos(x+6, currentY, z+9),
                new BlockPos(x+8, currentY, z+9),
                new BlockPos(x+10, currentY, z+9),
                new BlockPos(x+5, currentY, z+10),
                new BlockPos(x+6, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+6, currentY, z+6)
            )
            .setLeaves(
                new BlockPos(x+3, currentY, z+1),
                new BlockPos(x+4, currentY, z+1),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+9, currentY, z+2),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+9, currentY, z+3),
                new BlockPos(x+10, currentY, z+3),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+10, currentY, z+4),
                new BlockPos(x+0, currentY, z+5),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+9, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+8, currentY, z+6),
                new BlockPos(x+9, currentY, z+6),
                new BlockPos(x+10, currentY, z+6),
                new BlockPos(x+1, currentY, z+7),
                new BlockPos(x+2, currentY, z+7),
                new BlockPos(x+6, currentY, z+7),
                new BlockPos(x+8, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+10, currentY, z+7),
                new BlockPos(x+3, currentY, z+8),
                new BlockPos(x+4, currentY, z+8),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+6, currentY, z+8),
                new BlockPos(x+7, currentY, z+8),
                new BlockPos(x+8, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+10, currentY, z+8),
                new BlockPos(x+11, currentY, z+8),
                new BlockPos(x+2, currentY, z+9),
                new BlockPos(x+3, currentY, z+9),
                new BlockPos(x+4, currentY, z+9),
                new BlockPos(x+6, currentY, z+9),
                new BlockPos(x+8, currentY, z+9),
                new BlockPos(x+9, currentY, z+9),
                new BlockPos(x+4, currentY, z+10),
                new BlockPos(x+5, currentY, z+10),
                new BlockPos(x+9, currentY, z+10),
                new BlockPos(x+10, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+6, currentY, z+7)
            )
            .setLeaves(
                new BlockPos(x+6, currentY, z+0),
                new BlockPos(x+7, currentY, z+1),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+7, currentY, z+2),
                new BlockPos(x+8, currentY, z+2),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+9, currentY, z+3),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+10, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+8, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+0, currentY, z+6),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+8, currentY, z+6),
                new BlockPos(x+9, currentY, z+6),
                new BlockPos(x+11, currentY, z+6),
                new BlockPos(x+0, currentY, z+7),
                new BlockPos(x+1, currentY, z+7),
                new BlockPos(x+5, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+1, currentY, z+8),
                new BlockPos(x+2, currentY, z+8),
                new BlockPos(x+4, currentY, z+8),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+6, currentY, z+8),
                new BlockPos(x+8, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+3, currentY, z+9),
                new BlockPos(x+5, currentY, z+9),
                new BlockPos(x+3, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+8, currentY, z+4),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+6, currentY, z+7)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+0),
                new BlockPos(x+3, currentY, z+1),
                new BlockPos(x+5, currentY, z+1),
                new BlockPos(x+7, currentY, z+1),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+8, currentY, z+5),
                new BlockPos(x+9, currentY, z+5),
                new BlockPos(x+0, currentY, z+6),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+1, currentY, z+7),
                new BlockPos(x+2, currentY, z+7),
                new BlockPos(x+7, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+10, currentY, z+7),
                new BlockPos(x+0, currentY, z+8),
                new BlockPos(x+7, currentY, z+8),
                new BlockPos(x+1, currentY, z+9),
                new BlockPos(x+7, currentY, z+9)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+5)
            )
            .setLeaves(
                new BlockPos(x+4, currentY, z+1),
                new BlockPos(x+6, currentY, z+1),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+7, currentY, z+2),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+10, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+8, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+10, currentY, z+6),
                new BlockPos(x+2, currentY, z+7),
                new BlockPos(x+3, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+1, currentY, z+8),
                new BlockPos(x+3, currentY, z+8),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+6, currentY, z+8),
                new BlockPos(x+7, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+10, currentY, z+8),
                new BlockPos(x+1, currentY, z+9),
                new BlockPos(x+2, currentY, z+9),
                new BlockPos(x+4, currentY, z+9),
                new BlockPos(x+6, currentY, z+9),
                new BlockPos(x+7, currentY, z+9),
                new BlockPos(x+9, currentY, z+9),
                new BlockPos(x+2, currentY, z+10),
                new BlockPos(x+8, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+5, currentY, z+1),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+8, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+9, currentY, z+3),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+8, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+10, currentY, z+5),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+5, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+9, currentY, z+6),
                new BlockPos(x+2, currentY, z+7),
                new BlockPos(x+4, currentY, z+7),
                new BlockPos(x+5, currentY, z+7),
                new BlockPos(x+8, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+10, currentY, z+7),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+7, currentY, z+8),
                new BlockPos(x+8, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+11, currentY, z+8),
                new BlockPos(x+5, currentY, z+9),
                new BlockPos(x+7, currentY, z+9),
                new BlockPos(x+8, currentY, z+9),
                new BlockPos(x+9, currentY, z+9),
                new BlockPos(x+10, currentY, z+9),
                new BlockPos(x+7, currentY, z+10),
                new BlockPos(x+8, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+9, currentY, z+4),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+8, currentY, z+5),
                new BlockPos(x+9, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+5, currentY, z+6),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+8, currentY, z+6),
                new BlockPos(x+9, currentY, z+6),
                new BlockPos(x+3, currentY, z+7),
                new BlockPos(x+4, currentY, z+7),
                new BlockPos(x+5, currentY, z+7),
                new BlockPos(x+8, currentY, z+7),
                new BlockPos(x+10, currentY, z+7),
                new BlockPos(x+11, currentY, z+7),
                new BlockPos(x+4, currentY, z+8),
                new BlockPos(x+5, currentY, z+8),
                new BlockPos(x+8, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+10, currentY, z+8),
                new BlockPos(x+3, currentY, z+9),
                new BlockPos(x+7, currentY, z+9),
                new BlockPos(x+9, currentY, z+9),
                new BlockPos(x+9, currentY, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+7, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+5, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+2, currentY, z+7),
                new BlockPos(x+3, currentY, z+7),
                new BlockPos(x+7, currentY, z+7),
                new BlockPos(x+9, currentY, z+7),
                new BlockPos(x+3, currentY, z+8),
                new BlockPos(x+6, currentY, z+8),
                new BlockPos(x+9, currentY, z+8),
                new BlockPos(x+4, currentY, z+9),
                new BlockPos(x+8, currentY, z+9),
                new BlockPos(x+10, currentY, z+9)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+4, currentY, z+7),
                new BlockPos(x+5, currentY, z+7),
                new BlockPos(x+6, currentY, z+7),
                new BlockPos(x+5, currentY, z+8)
            )
        );
    }
}

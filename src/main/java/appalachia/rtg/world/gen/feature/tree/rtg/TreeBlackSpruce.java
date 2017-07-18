package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;
import appalachia.util.TreeLayer;

/**
 * Picea Mariana (Black Spruce)
 * <p>
 * This tree was designed by MrWizz and released as part of the 'Natural Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/tree-pack-repository-bundle---build-your-own-trees-optimized-map/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeBlackSpruce extends AppalachiaTree {

    public TreeBlackSpruce() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_black_spruce_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_black_spruce_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_black_spruce_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_black_spruce_01.getDefaultState());

        this.firstBlockOffsetX = 3;
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

    protected void buildTree(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y - 1;

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+4, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+4, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+4, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+3, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+6, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+7, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+1, currentY, z+1),
                new BlockPos(x+2, currentY, z+1),
                new BlockPos(x+3, currentY, z+1),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+6, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+5, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+1, currentY, z+0),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+4, currentY, z+1),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+7, currentY, z+2),
                new BlockPos(x+8, currentY, z+2),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+2, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+3, currentY, z+1),
                new BlockPos(x+4, currentY, z+1),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+4, currentY, z+6),
                new BlockPos(x+4, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+3, currentY, z+0),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+0, currentY, z+4),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+1, currentY, z+5),
                new BlockPos(x+2, currentY, z+5),
                new BlockPos(x+0, currentY, z+6),
                new BlockPos(x+1, currentY, z+6),
                new BlockPos(x+4, currentY, z+7),
                new BlockPos(x+5, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+1),
                new BlockPos(x+0, currentY, z+2),
                new BlockPos(x+1, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+5, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+6, currentY, z+1),
                new BlockPos(x+0, currentY, z+2),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+3, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+6, currentY, z+0),
                new BlockPos(x+2, currentY, z+1),
                new BlockPos(x+6, currentY, z+1),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+7, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+2, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+7, currentY, z+0),
                new BlockPos(x+2, currentY, z+1),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+8, currentY, z+3),
                new BlockPos(x+1, currentY, z+4),
                new BlockPos(x+2, currentY, z+4),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+5, currentY, z+6),
                new BlockPos(x+1, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+1),
                new BlockPos(x+5, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+0, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+5, currentY, z+6),
                new BlockPos(x+6, currentY, z+6),
                new BlockPos(x+3, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+0),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+6, currentY, z+7),
                new BlockPos(x+3, currentY, z+8)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+5, currentY, z+0),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+3, currentY, z+2),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+5, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+2, currentY, z+0),
                new BlockPos(x+2, currentY, z+1),
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+7, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+6, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+1, currentY, z+1),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+7, currentY, z+6),
                new BlockPos(x+2, currentY, z+7)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+5, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+7, currentY, z+2),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+3, currentY, z+5),
                new BlockPos(x+4, currentY, z+5),
                new BlockPos(x+3, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+7, currentY, z+1),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+3, currentY, z+3),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+6, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+3, currentY, z+6),
                new BlockPos(x+6, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+4, currentY, z+4)
            )
            .setLeaves(
                new BlockPos(x+2, currentY, z+2),
                new BlockPos(x+6, currentY, z+2),
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+2, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+5, currentY, z+4),
                new BlockPos(x+5, currentY, z+5),
                new BlockPos(x+2, currentY, z+6),
                new BlockPos(x+7, currentY, z+6)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+1, currentY, z+3),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+5, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+3, currentY, z+4),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+4, currentY, z+2),
                new BlockPos(x+4, currentY, z+3),
                new BlockPos(x+6, currentY, z+3),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+4, currentY, z+1),
                new BlockPos(x+4, currentY, z+4),
                new BlockPos(x+5, currentY, z+5)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+4, currentY, z+4)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+4, currentY, z+4)
            )
        );
    }
}

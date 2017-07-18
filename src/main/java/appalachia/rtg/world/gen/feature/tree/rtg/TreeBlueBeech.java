package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;
import appalachia.util.TreeLayer;

/**
 * Carpinus Caroliniana (Blue Beech)
 * <p>
 * This tree was designed by Lentebriesje and released as part of the 'Custom Tree Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/native-trees-of-europe-template-repository-1779952/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeBlueBeech extends AppalachiaTree {

    public TreeBlueBeech() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_blue_beech_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_blue_beech_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_blue_beech_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_blue_beech_01.getDefaultState());

        this.firstBlockOffsetX = 11;
        this.firstBlockOffsetZ = 7;
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
                new BlockPos(x+12, y+0, z+8),
                new BlockPos(x+11, y+0, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+1, z+7),
                new BlockPos(x+10, y+1, z+8),
                new BlockPos(x+12, y+1, z+8),
                new BlockPos(x+11, y+1, z+9),
                new BlockPos(x+13, y+1, z+9),
                new BlockPos(x+11, y+1, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+2, z+7),
                new BlockPos(x+12, y+2, z+7),
                new BlockPos(x+10, y+2, z+8),
                new BlockPos(x+11, y+2, z+8),
                new BlockPos(x+12, y+2, z+8),
                new BlockPos(x+11, y+2, z+9),
                new BlockPos(x+12, y+2, z+9),
                new BlockPos(x+13, y+2, z+9),
                new BlockPos(x+11, y+2, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+12, y+3, z+7),
                new BlockPos(x+10, y+3, z+8),
                new BlockPos(x+11, y+3, z+8),
                new BlockPos(x+12, y+3, z+8),
                new BlockPos(x+11, y+3, z+9),
                new BlockPos(x+12, y+3, z+9),
                new BlockPos(x+13, y+3, z+9),
                new BlockPos(x+11, y+3, z+10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+4, z+8),
                new BlockPos(x+12, y+4, z+8),
                new BlockPos(x+11, y+4, z+9),
                new BlockPos(x+12, y+4, z+9)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+5, z+8),
                new BlockPos(x+12, y+5, z+8),
                new BlockPos(x+11, y+5, z+9),
                new BlockPos(x+12, y+5, z+9)
            )
            .setLeaves(
                new BlockPos(x+15, y+5, z+1),
                new BlockPos(x+15, y+5, z+3),
                new BlockPos(x+14, y+5, z+5),
                new BlockPos(x+16, y+5, z+5),
                new BlockPos(x+18, y+5, z+6),
                new BlockPos(x+5, y+5, z+7),
                new BlockPos(x+5, y+5, z+9),
                new BlockPos(x+13, y+5, z+9),
                new BlockPos(x+4, y+5, z+10),
                new BlockPos(x+4, y+5, z+11),
                new BlockPos(x+9, y+5, z+12),
                new BlockPos(x+12, y+5, z+12),
                new BlockPos(x+14, y+5, z+13),
                new BlockPos(x+15, y+5, z+13),
                new BlockPos(x+13, y+5, z+14),
                new BlockPos(x+14, y+5, z+14),
                new BlockPos(x+15, y+5, z+14),
                new BlockPos(x+11, y+5, z+17)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+6, z+8),
                new BlockPos(x+12, y+6, z+8),
                new BlockPos(x+11, y+6, z+9),
                new BlockPos(x+12, y+6, z+9)
            )
            .setLeaves(
                new BlockPos(x+17, y+6, z+1),
                new BlockPos(x+15, y+6, z+2),
                new BlockPos(x+18, y+6, z+3),
                new BlockPos(x+11, y+6, z+4),
                new BlockPos(x+13, y+6, z+4),
                new BlockPos(x+15, y+6, z+4),
                new BlockPos(x+12, y+6, z+5),
                new BlockPos(x+15, y+6, z+5),
                new BlockPos(x+18, y+6, z+5),
                new BlockPos(x+15, y+6, z+7),
                new BlockPos(x+5, y+6, z+8),
                new BlockPos(x+14, y+6, z+8),
                new BlockPos(x+14, y+6, z+10),
                new BlockPos(x+16, y+6, z+10),
                new BlockPos(x+5, y+6, z+11),
                new BlockPos(x+7, y+6, z+11),
                new BlockPos(x+9, y+6, z+11),
                new BlockPos(x+16, y+6, z+14),
                new BlockPos(x+7, y+6, z+15),
                new BlockPos(x+10, y+6, z+15),
                new BlockPos(x+11, y+6, z+15),
                new BlockPos(x+10, y+6, z+16),
                new BlockPos(x+11, y+6, z+16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+17, y+7, z+3),
                new BlockPos(x+16, y+7, z+4),
                new BlockPos(x+11, y+7, z+8),
                new BlockPos(x+12, y+7, z+8),
                new BlockPos(x+11, y+7, z+9),
                new BlockPos(x+11, y+7, z+10),
                new BlockPos(x+11, y+7, z+14),
                new BlockPos(x+11, y+7, z+15)
            )
            .setLeaves(
                new BlockPos(x+15, y+7, z+0),
                new BlockPos(x+15, y+7, z+1),
                new BlockPos(x+13, y+7, z+3),
                new BlockPos(x+14, y+7, z+5),
                new BlockPos(x+4, y+7, z+6),
                new BlockPos(x+6, y+7, z+6),
                new BlockPos(x+8, y+7, z+6),
                new BlockPos(x+18, y+7, z+6),
                new BlockPos(x+3, y+7, z+7),
                new BlockPos(x+19, y+7, z+7),
                new BlockPos(x+5, y+7, z+8),
                new BlockPos(x+7, y+7, z+8),
                new BlockPos(x+8, y+7, z+8),
                new BlockPos(x+6, y+7, z+9),
                new BlockPos(x+9, y+7, z+9),
                new BlockPos(x+13, y+7, z+9),
                new BlockPos(x+4, y+7, z+10),
                new BlockPos(x+8, y+7, z+10),
                new BlockPos(x+9, y+7, z+10),
                new BlockPos(x+10, y+7, z+10),
                new BlockPos(x+15, y+7, z+10),
                new BlockPos(x+1, y+7, z+11),
                new BlockPos(x+16, y+7, z+11),
                new BlockPos(x+4, y+7, z+12),
                new BlockPos(x+6, y+7, z+12),
                new BlockPos(x+7, y+7, z+12),
                new BlockPos(x+15, y+7, z+12),
                new BlockPos(x+7, y+7, z+13),
                new BlockPos(x+8, y+7, z+13),
                new BlockPos(x+9, y+7, z+13),
                new BlockPos(x+14, y+7, z+13),
                new BlockPos(x+16, y+7, z+13),
                new BlockPos(x+7, y+7, z+14),
                new BlockPos(x+13, y+7, z+14),
                new BlockPos(x+13, y+7, z+15),
                new BlockPos(x+14, y+7, z+17)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+6, y+8, z+4),
                new BlockPos(x+15, y+8, z+5),
                new BlockPos(x+14, y+8, z+6),
                new BlockPos(x+13, y+8, z+7),
                new BlockPos(x+10, y+8, z+8),
                new BlockPos(x+11, y+8, z+8),
                new BlockPos(x+11, y+8, z+9),
                new BlockPos(x+11, y+8, z+11),
                new BlockPos(x+11, y+8, z+12),
                new BlockPos(x+11, y+8, z+13)
            )
            .setLeaves(
                new BlockPos(x+14, y+8, z+0),
                new BlockPos(x+12, y+8, z+1),
                new BlockPos(x+13, y+8, z+1),
                new BlockPos(x+14, y+8, z+1),
                new BlockPos(x+13, y+8, z+2),
                new BlockPos(x+18, y+8, z+2),
                new BlockPos(x+10, y+8, z+3),
                new BlockPos(x+13, y+8, z+4),
                new BlockPos(x+19, y+8, z+4),
                new BlockPos(x+3, y+8, z+5),
                new BlockPos(x+7, y+8, z+5),
                new BlockPos(x+17, y+8, z+5),
                new BlockPos(x+18, y+8, z+5),
                new BlockPos(x+8, y+8, z+6),
                new BlockPos(x+10, y+8, z+6),
                new BlockPos(x+11, y+8, z+6),
                new BlockPos(x+15, y+8, z+6),
                new BlockPos(x+5, y+8, z+7),
                new BlockPos(x+12, y+8, z+7),
                new BlockPos(x+16, y+8, z+8),
                new BlockPos(x+15, y+8, z+9),
                new BlockPos(x+17, y+8, z+9),
                new BlockPos(x+0, y+8, z+10),
                new BlockPos(x+3, y+8, z+10),
                new BlockPos(x+10, y+8, z+10),
                new BlockPos(x+15, y+8, z+10),
                new BlockPos(x+5, y+8, z+11),
                new BlockPos(x+10, y+8, z+11),
                new BlockPos(x+6, y+8, z+12),
                new BlockPos(x+7, y+8, z+12),
                new BlockPos(x+14, y+8, z+12),
                new BlockPos(x+16, y+8, z+12),
                new BlockPos(x+3, y+8, z+13),
                new BlockPos(x+7, y+8, z+13),
                new BlockPos(x+10, y+8, z+13),
                new BlockPos(x+4, y+8, z+14),
                new BlockPos(x+8, y+8, z+14),
                new BlockPos(x+11, y+8, z+14),
                new BlockPos(x+16, y+8, z+14),
                new BlockPos(x+7, y+8, z+15),
                new BlockPos(x+10, y+8, z+15),
                new BlockPos(x+13, y+8, z+15),
                new BlockPos(x+14, y+8, z+15),
                new BlockPos(x+8, y+8, z+16),
                new BlockPos(x+10, y+8, z+16),
                new BlockPos(x+11, y+8, z+16),
                new BlockPos(x+12, y+8, z+16),
                new BlockPos(x+9, y+8, z+17),
                new BlockPos(x+10, y+8, z+17),
                new BlockPos(x+13, y+8, z+17),
                new BlockPos(x+10, y+8, z+18),
                new BlockPos(x+12, y+8, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+7, y+9, z+5),
                new BlockPos(x+8, y+9, z+6),
                new BlockPos(x+9, y+9, z+7),
                new BlockPos(x+11, y+9, z+8),
                new BlockPos(x+11, y+9, z+9),
                new BlockPos(x+4, y+9, z+11)
            )
            .setLeaves(
                new BlockPos(x+14, y+9, z+0),
                new BlockPos(x+14, y+9, z+2),
                new BlockPos(x+15, y+9, z+3),
                new BlockPos(x+11, y+9, z+4),
                new BlockPos(x+12, y+9, z+4),
                new BlockPos(x+16, y+9, z+4),
                new BlockPos(x+8, y+9, z+5),
                new BlockPos(x+13, y+9, z+5),
                new BlockPos(x+13, y+9, z+6),
                new BlockPos(x+4, y+9, z+7),
                new BlockPos(x+16, y+9, z+7),
                new BlockPos(x+17, y+9, z+7),
                new BlockPos(x+3, y+9, z+8),
                new BlockPos(x+5, y+9, z+8),
                new BlockPos(x+12, y+9, z+8),
                new BlockPos(x+16, y+9, z+8),
                new BlockPos(x+7, y+9, z+9),
                new BlockPos(x+8, y+9, z+9),
                new BlockPos(x+9, y+9, z+9),
                new BlockPos(x+10, y+9, z+9),
                new BlockPos(x+13, y+9, z+9),
                new BlockPos(x+2, y+9, z+10),
                new BlockPos(x+14, y+9, z+10),
                new BlockPos(x+0, y+9, z+11),
                new BlockPos(x+6, y+9, z+11),
                new BlockPos(x+7, y+9, z+11),
                new BlockPos(x+14, y+9, z+11),
                new BlockPos(x+5, y+9, z+12),
                new BlockPos(x+6, y+9, z+12),
                new BlockPos(x+9, y+9, z+12),
                new BlockPos(x+11, y+9, z+12),
                new BlockPos(x+2, y+9, z+13),
                new BlockPos(x+5, y+9, z+13),
                new BlockPos(x+12, y+9, z+13),
                new BlockPos(x+13, y+9, z+13),
                new BlockPos(x+7, y+9, z+14),
                new BlockPos(x+15, y+9, z+14),
                new BlockPos(x+11, y+9, z+15),
                new BlockPos(x+13, y+9, z+15),
                new BlockPos(x+10, y+9, z+16),
                new BlockPos(x+15, y+9, z+16),
                new BlockPos(x+10, y+9, z+17),
                new BlockPos(x+12, y+9, z+17),
                new BlockPos(x+13, y+9, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+10, z+8),
                new BlockPos(x+4, y+10, z+9),
                new BlockPos(x+5, y+10, z+9),
                new BlockPos(x+6, y+10, z+9),
                new BlockPos(x+10, y+10, z+9),
                new BlockPos(x+11, y+10, z+9),
                new BlockPos(x+6, y+10, z+10),
                new BlockPos(x+5, y+10, z+11)
            )
            .setLeaves(
                new BlockPos(x+14, y+10, z+0),
                new BlockPos(x+18, y+10, z+1),
                new BlockPos(x+15, y+10, z+2),
                new BlockPos(x+16, y+10, z+2),
                new BlockPos(x+18, y+10, z+2),
                new BlockPos(x+17, y+10, z+3),
                new BlockPos(x+4, y+10, z+4),
                new BlockPos(x+8, y+10, z+4),
                new BlockPos(x+15, y+10, z+4),
                new BlockPos(x+3, y+10, z+5),
                new BlockPos(x+5, y+10, z+5),
                new BlockPos(x+6, y+10, z+5),
                new BlockPos(x+10, y+10, z+5),
                new BlockPos(x+14, y+10, z+5),
                new BlockPos(x+20, y+10, z+5),
                new BlockPos(x+2, y+10, z+6),
                new BlockPos(x+4, y+10, z+6),
                new BlockPos(x+10, y+10, z+6),
                new BlockPos(x+20, y+10, z+6),
                new BlockPos(x+0, y+10, z+7),
                new BlockPos(x+8, y+10, z+7),
                new BlockPos(x+9, y+10, z+7),
                new BlockPos(x+1, y+10, z+8),
                new BlockPos(x+3, y+10, z+8),
                new BlockPos(x+5, y+10, z+8),
                new BlockPos(x+10, y+10, z+8),
                new BlockPos(x+15, y+10, z+8),
                new BlockPos(x+1, y+10, z+9),
                new BlockPos(x+7, y+10, z+9),
                new BlockPos(x+17, y+10, z+9),
                new BlockPos(x+18, y+10, z+9),
                new BlockPos(x+1, y+10, z+10),
                new BlockPos(x+2, y+10, z+10),
                new BlockPos(x+9, y+10, z+10),
                new BlockPos(x+10, y+10, z+10),
                new BlockPos(x+10, y+10, z+11),
                new BlockPos(x+5, y+10, z+13),
                new BlockPos(x+6, y+10, z+13),
                new BlockPos(x+7, y+10, z+13),
                new BlockPos(x+8, y+10, z+13),
                new BlockPos(x+11, y+10, z+13),
                new BlockPos(x+5, y+10, z+14),
                new BlockPos(x+6, y+10, z+14),
                new BlockPos(x+7, y+10, z+14),
                new BlockPos(x+8, y+10, z+14),
                new BlockPos(x+16, y+10, z+14),
                new BlockPos(x+7, y+10, z+15),
                new BlockPos(x+11, y+10, z+15),
                new BlockPos(x+14, y+10, z+15),
                new BlockPos(x+14, y+10, z+16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+7, y+11, z+9),
                new BlockPos(x+8, y+11, z+9),
                new BlockPos(x+9, y+11, z+9),
                new BlockPos(x+11, y+11, z+9),
                new BlockPos(x+12, y+11, z+9),
                new BlockPos(x+16, y+11, z+9),
                new BlockPos(x+17, y+11, z+9)
            )
            .setLeaves(
                new BlockPos(x+15, y+11, z+2),
                new BlockPos(x+16, y+11, z+3),
                new BlockPos(x+18, y+11, z+3),
                new BlockPos(x+5, y+11, z+4),
                new BlockPos(x+7, y+11, z+4),
                new BlockPos(x+10, y+11, z+4),
                new BlockPos(x+15, y+11, z+4),
                new BlockPos(x+19, y+11, z+4),
                new BlockPos(x+5, y+11, z+5),
                new BlockPos(x+6, y+11, z+5),
                new BlockPos(x+10, y+11, z+5),
                new BlockPos(x+11, y+11, z+5),
                new BlockPos(x+15, y+11, z+5),
                new BlockPos(x+16, y+11, z+5),
                new BlockPos(x+8, y+11, z+6),
                new BlockPos(x+11, y+11, z+6),
                new BlockPos(x+15, y+11, z+6),
                new BlockPos(x+4, y+11, z+7),
                new BlockPos(x+5, y+11, z+7),
                new BlockPos(x+11, y+11, z+7),
                new BlockPos(x+17, y+11, z+7),
                new BlockPos(x+7, y+11, z+8),
                new BlockPos(x+2, y+11, z+10),
                new BlockPos(x+10, y+11, z+10),
                new BlockPos(x+1, y+11, z+11),
                new BlockPos(x+2, y+11, z+11),
                new BlockPos(x+5, y+11, z+11),
                new BlockPos(x+6, y+11, z+11),
                new BlockPos(x+7, y+11, z+11),
                new BlockPos(x+9, y+11, z+11),
                new BlockPos(x+11, y+11, z+11),
                new BlockPos(x+12, y+11, z+11),
                new BlockPos(x+8, y+11, z+13),
                new BlockPos(x+10, y+11, z+13),
                new BlockPos(x+11, y+11, z+13),
                new BlockPos(x+13, y+11, z+13),
                new BlockPos(x+14, y+11, z+13),
                new BlockPos(x+5, y+11, z+14),
                new BlockPos(x+14, y+11, z+14),
                new BlockPos(x+15, y+11, z+14),
                new BlockPos(x+12, y+11, z+15),
                new BlockPos(x+16, y+11, z+15),
                new BlockPos(x+13, y+11, z+16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+11, y+12, z+9),
                new BlockPos(x+13, y+12, z+9),
                new BlockPos(x+14, y+12, z+9),
                new BlockPos(x+15, y+12, z+9)
            )
            .setLeaves(
                new BlockPos(x+7, y+12, z+2),
                new BlockPos(x+7, y+12, z+3),
                new BlockPos(x+9, y+12, z+3),
                new BlockPos(x+14, y+12, z+3),
                new BlockPos(x+7, y+12, z+5),
                new BlockPos(x+18, y+12, z+5),
                new BlockPos(x+6, y+12, z+6),
                new BlockPos(x+9, y+12, z+6),
                new BlockPos(x+10, y+12, z+6),
                new BlockPos(x+2, y+12, z+7),
                new BlockPos(x+0, y+12, z+8),
                new BlockPos(x+1, y+12, z+8),
                new BlockPos(x+7, y+12, z+8),
                new BlockPos(x+9, y+12, z+8),
                new BlockPos(x+2, y+12, z+9),
                new BlockPos(x+5, y+12, z+9),
                new BlockPos(x+6, y+12, z+9),
                new BlockPos(x+15, y+12, z+11),
                new BlockPos(x+9, y+12, z+12),
                new BlockPos(x+11, y+12, z+12),
                new BlockPos(x+17, y+12, z+13),
                new BlockPos(x+5, y+12, z+14),
                new BlockPos(x+6, y+12, z+14),
                new BlockPos(x+12, y+12, z+14),
                new BlockPos(x+15, y+12, z+14),
                new BlockPos(x+15, y+12, z+16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+10, y+13, z+8),
                new BlockPos(x+11, y+13, z+9)
            )
            .setLeaves(
                new BlockPos(x+11, y+13, z+2),
                new BlockPos(x+11, y+13, z+3),
                new BlockPos(x+3, y+13, z+5),
                new BlockPos(x+5, y+13, z+5),
                new BlockPos(x+14, y+13, z+5),
                new BlockPos(x+8, y+13, z+6),
                new BlockPos(x+9, y+13, z+6),
                new BlockPos(x+10, y+13, z+6),
                new BlockPos(x+12, y+13, z+6),
                new BlockPos(x+17, y+13, z+6),
                new BlockPos(x+5, y+13, z+7),
                new BlockPos(x+12, y+13, z+7),
                new BlockPos(x+16, y+13, z+7),
                new BlockPos(x+7, y+13, z+9),
                new BlockPos(x+8, y+13, z+10),
                new BlockPos(x+5, y+13, z+11),
                new BlockPos(x+6, y+13, z+11),
                new BlockPos(x+12, y+13, z+11),
                new BlockPos(x+5, y+13, z+12),
                new BlockPos(x+8, y+13, z+12),
                new BlockPos(x+13, y+13, z+12),
                new BlockPos(x+4, y+13, z+13),
                new BlockPos(x+11, y+13, z+13),
                new BlockPos(x+12, y+13, z+13),
                new BlockPos(x+13, y+13, z+13),
                new BlockPos(x+14, y+13, z+13),
                new BlockPos(x+11, y+13, z+14),
                new BlockPos(x+12, y+13, z+14),
                new BlockPos(x+16, y+13, z+14),
                new BlockPos(x+10, y+13, z+15),
                new BlockPos(x+14, y+13, z+15),
                new BlockPos(x+11, y+13, z+16),
                new BlockPos(x+17, y+13, z+16),
                new BlockPos(x+12, y+13, z+17),
                new BlockPos(x+15, y+13, z+17),
                new BlockPos(x+15, y+13, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+8, y+14, z+4),
                new BlockPos(x+5, y+14, z+5),
                new BlockPos(x+6, y+14, z+5),
                new BlockPos(x+8, y+14, z+5),
                new BlockPos(x+9, y+14, z+7),
                new BlockPos(x+11, y+14, z+9),
                new BlockPos(x+12, y+14, z+10)
            )
            .setLeaves(
                new BlockPos(x+9, y+14, z+2),
                new BlockPos(x+11, y+14, z+2),
                new BlockPos(x+8, y+14, z+3),
                new BlockPos(x+4, y+14, z+4),
                new BlockPos(x+9, y+14, z+4),
                new BlockPos(x+4, y+14, z+5),
                new BlockPos(x+12, y+14, z+5),
                new BlockPos(x+5, y+14, z+6),
                new BlockPos(x+7, y+14, z+6),
                new BlockPos(x+8, y+14, z+6),
                new BlockPos(x+12, y+14, z+7),
                new BlockPos(x+10, y+14, z+8),
                new BlockPos(x+5, y+14, z+9),
                new BlockPos(x+10, y+14, z+9),
                new BlockPos(x+14, y+14, z+9),
                new BlockPos(x+4, y+14, z+10),
                new BlockPos(x+8, y+14, z+10),
                new BlockPos(x+14, y+14, z+10),
                new BlockPos(x+2, y+14, z+11),
                new BlockPos(x+3, y+14, z+11),
                new BlockPos(x+12, y+14, z+11),
                new BlockPos(x+19, y+14, z+13),
                new BlockPos(x+14, y+14, z+14),
                new BlockPos(x+14, y+14, z+15),
                new BlockPos(x+10, y+14, z+16),
                new BlockPos(x+12, y+14, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+7, y+15, z+5),
                new BlockPos(x+8, y+15, z+6),
                new BlockPos(x+11, y+15, z+8),
                new BlockPos(x+11, y+15, z+9),
                new BlockPos(x+12, y+15, z+11)
            )
            .setLeaves(
                new BlockPos(x+10, y+15, z+2),
                new BlockPos(x+7, y+15, z+3),
                new BlockPos(x+6, y+15, z+4),
                new BlockPos(x+8, y+15, z+4),
                new BlockPos(x+5, y+15, z+5),
                new BlockPos(x+13, y+15, z+5),
                new BlockPos(x+4, y+15, z+6),
                new BlockPos(x+6, y+15, z+6),
                new BlockPos(x+9, y+15, z+6),
                new BlockPos(x+10, y+15, z+6),
                new BlockPos(x+5, y+15, z+7),
                new BlockPos(x+7, y+15, z+7),
                new BlockPos(x+8, y+15, z+7),
                new BlockPos(x+7, y+15, z+8),
                new BlockPos(x+6, y+15, z+9),
                new BlockPos(x+10, y+15, z+9),
                new BlockPos(x+5, y+15, z+10),
                new BlockPos(x+8, y+15, z+10),
                new BlockPos(x+9, y+15, z+10),
                new BlockPos(x+10, y+15, z+10),
                new BlockPos(x+11, y+15, z+10),
                new BlockPos(x+17, y+15, z+11),
                new BlockPos(x+13, y+15, z+12),
                new BlockPos(x+17, y+15, z+12),
                new BlockPos(x+11, y+15, z+13),
                new BlockPos(x+14, y+15, z+14),
                new BlockPos(x+14, y+15, z+15),
                new BlockPos(x+16, y+15, z+15),
                new BlockPos(x+10, y+15, z+16),
                new BlockPos(x+13, y+15, z+19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+12, y+16, z+7),
                new BlockPos(x+11, y+16, z+9),
                new BlockPos(x+13, y+16, z+12),
                new BlockPos(x+13, y+16, z+13),
                new BlockPos(x+14, y+16, z+14)
            )
            .setLeaves(
                new BlockPos(x+4, y+16, z+3),
                new BlockPos(x+6, y+16, z+3),
                new BlockPos(x+4, y+16, z+4),
                new BlockPos(x+3, y+16, z+6),
                new BlockPos(x+6, y+16, z+6),
                new BlockPos(x+8, y+16, z+7),
                new BlockPos(x+9, y+16, z+7),
                new BlockPos(x+6, y+16, z+8),
                new BlockPos(x+7, y+16, z+8),
                new BlockPos(x+13, y+16, z+8),
                new BlockPos(x+8, y+16, z+9),
                new BlockPos(x+9, y+16, z+9),
                new BlockPos(x+12, y+16, z+10),
                new BlockPos(x+15, y+16, z+10),
                new BlockPos(x+12, y+16, z+11),
                new BlockPos(x+13, y+16, z+11),
                new BlockPos(x+14, y+16, z+11),
                new BlockPos(x+16, y+16, z+11),
                new BlockPos(x+11, y+16, z+12),
                new BlockPos(x+12, y+16, z+12),
                new BlockPos(x+12, y+16, z+13),
                new BlockPos(x+14, y+16, z+13),
                new BlockPos(x+15, y+16, z+13),
                new BlockPos(x+19, y+16, z+13),
                new BlockPos(x+9, y+16, z+14),
                new BlockPos(x+10, y+16, z+14),
                new BlockPos(x+13, y+16, z+14),
                new BlockPos(x+17, y+16, z+14),
                new BlockPos(x+18, y+16, z+14),
                new BlockPos(x+10, y+16, z+15),
                new BlockPos(x+12, y+16, z+15),
                new BlockPos(x+13, y+16, z+15),
                new BlockPos(x+17, y+16, z+15),
                new BlockPos(x+19, y+16, z+15),
                new BlockPos(x+13, y+16, z+16),
                new BlockPos(x+14, y+16, z+16),
                new BlockPos(x+10, y+16, z+17),
                new BlockPos(x+12, y+16, z+17),
                new BlockPos(x+15, y+16, z+17),
                new BlockPos(x+16, y+16, z+17),
                new BlockPos(x+17, y+16, z+17),
                new BlockPos(x+16, y+16, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+13, y+17, z+5),
                new BlockPos(x+12, y+17, z+6),
                new BlockPos(x+10, y+17, z+8),
                new BlockPos(x+12, y+17, z+9),
                new BlockPos(x+10, y+17, z+10)
            )
            .setLeaves(
                new BlockPos(x+6, y+17, z+2),
                new BlockPos(x+10, y+17, z+2),
                new BlockPos(x+10, y+17, z+3),
                new BlockPos(x+6, y+17, z+4),
                new BlockPos(x+11, y+17, z+4),
                new BlockPos(x+8, y+17, z+5),
                new BlockPos(x+15, y+17, z+5),
                new BlockPos(x+4, y+17, z+6),
                new BlockPos(x+5, y+17, z+6),
                new BlockPos(x+7, y+17, z+6),
                new BlockPos(x+8, y+17, z+6),
                new BlockPos(x+10, y+17, z+6),
                new BlockPos(x+9, y+17, z+7),
                new BlockPos(x+11, y+17, z+7),
                new BlockPos(x+5, y+17, z+8),
                new BlockPos(x+11, y+17, z+8),
                new BlockPos(x+16, y+17, z+8),
                new BlockPos(x+8, y+17, z+9),
                new BlockPos(x+10, y+17, z+9),
                new BlockPos(x+16, y+17, z+9),
                new BlockPos(x+11, y+17, z+10),
                new BlockPos(x+14, y+17, z+10),
                new BlockPos(x+17, y+17, z+10),
                new BlockPos(x+12, y+17, z+11),
                new BlockPos(x+15, y+17, z+11),
                new BlockPos(x+10, y+17, z+12),
                new BlockPos(x+11, y+17, z+12),
                new BlockPos(x+12, y+17, z+12),
                new BlockPos(x+16, y+17, z+12),
                new BlockPos(x+10, y+17, z+14),
                new BlockPos(x+12, y+17, z+14),
                new BlockPos(x+15, y+17, z+14),
                new BlockPos(x+15, y+17, z+16),
                new BlockPos(x+10, y+17, z+17),
                new BlockPos(x+12, y+17, z+17),
                new BlockPos(x+13, y+17, z+17),
                new BlockPos(x+16, y+17, z+17),
                new BlockPos(x+12, y+17, z+18),
                new BlockPos(x+14, y+17, z+18),
                new BlockPos(x+14, y+17, z+19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+10, y+18, z+8),
                new BlockPos(x+12, y+18, z+9),
                new BlockPos(x+10, y+18, z+10)
            )
            .setLeaves(
                new BlockPos(x+9, y+18, z+2),
                new BlockPos(x+8, y+18, z+3),
                new BlockPos(x+7, y+18, z+4),
                new BlockPos(x+11, y+18, z+4),
                new BlockPos(x+12, y+18, z+4),
                new BlockPos(x+14, y+18, z+4),
                new BlockPos(x+8, y+18, z+5),
                new BlockPos(x+9, y+18, z+5),
                new BlockPos(x+6, y+18, z+6),
                new BlockPos(x+11, y+18, z+6),
                new BlockPos(x+7, y+18, z+7),
                new BlockPos(x+11, y+18, z+7),
                new BlockPos(x+12, y+18, z+7),
                new BlockPos(x+13, y+18, z+7),
                new BlockPos(x+4, y+18, z+8),
                new BlockPos(x+5, y+18, z+8),
                new BlockPos(x+6, y+18, z+8),
                new BlockPos(x+8, y+18, z+8),
                new BlockPos(x+13, y+18, z+8),
                new BlockPos(x+14, y+18, z+8),
                new BlockPos(x+8, y+18, z+9),
                new BlockPos(x+13, y+18, z+9),
                new BlockPos(x+14, y+18, z+9),
                new BlockPos(x+8, y+18, z+10),
                new BlockPos(x+12, y+18, z+10),
                new BlockPos(x+15, y+18, z+10),
                new BlockPos(x+6, y+18, z+11),
                new BlockPos(x+8, y+18, z+11),
                new BlockPos(x+13, y+18, z+11),
                new BlockPos(x+17, y+18, z+11),
                new BlockPos(x+13, y+18, z+12),
                new BlockPos(x+14, y+18, z+12),
                new BlockPos(x+15, y+18, z+12),
                new BlockPos(x+16, y+18, z+12),
                new BlockPos(x+9, y+18, z+13),
                new BlockPos(x+10, y+18, z+13),
                new BlockPos(x+11, y+18, z+13),
                new BlockPos(x+14, y+18, z+13),
                new BlockPos(x+17, y+18, z+14),
                new BlockPos(x+17, y+18, z+16),
                new BlockPos(x+18, y+18, z+16),
                new BlockPos(x+13, y+18, z+18),
                new BlockPos(x+14, y+18, z+18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+9, y+19, z+8),
                new BlockPos(x+12, y+19, z+9),
                new BlockPos(x+10, y+19, z+11)
            )
            .setLeaves(
                new BlockPos(x+8, y+19, z+3),
                new BlockPos(x+8, y+19, z+4),
                new BlockPos(x+9, y+19, z+4),
                new BlockPos(x+8, y+19, z+5),
                new BlockPos(x+8, y+19, z+6),
                new BlockPos(x+9, y+19, z+6),
                new BlockPos(x+10, y+19, z+6),
                new BlockPos(x+13, y+19, z+6),
                new BlockPos(x+16, y+19, z+6),
                new BlockPos(x+5, y+19, z+7),
                new BlockPos(x+8, y+19, z+7),
                new BlockPos(x+9, y+19, z+7),
                new BlockPos(x+13, y+19, z+7),
                new BlockPos(x+15, y+19, z+7),
                new BlockPos(x+17, y+19, z+7),
                new BlockPos(x+8, y+19, z+8),
                new BlockPos(x+12, y+19, z+8),
                new BlockPos(x+5, y+19, z+9),
                new BlockPos(x+7, y+19, z+9),
                new BlockPos(x+8, y+19, z+9),
                new BlockPos(x+13, y+19, z+9),
                new BlockPos(x+15, y+19, z+9),
                new BlockPos(x+16, y+19, z+9),
                new BlockPos(x+17, y+19, z+9),
                new BlockPos(x+8, y+19, z+10),
                new BlockPos(x+11, y+19, z+10),
                new BlockPos(x+14, y+19, z+10),
                new BlockPos(x+16, y+19, z+10),
                new BlockPos(x+17, y+19, z+10),
                new BlockPos(x+8, y+19, z+11),
                new BlockPos(x+12, y+19, z+11),
                new BlockPos(x+14, y+19, z+11),
                new BlockPos(x+17, y+19, z+11),
                new BlockPos(x+9, y+19, z+12),
                new BlockPos(x+10, y+19, z+12),
                new BlockPos(x+15, y+19, z+12),
                new BlockPos(x+16, y+19, z+12),
                new BlockPos(x+9, y+19, z+13),
                new BlockPos(x+12, y+19, z+13),
                new BlockPos(x+13, y+19, z+13),
                new BlockPos(x+16, y+19, z+13),
                new BlockPos(x+10, y+19, z+14),
                new BlockPos(x+11, y+19, z+14),
                new BlockPos(x+12, y+19, z+14),
                new BlockPos(x+16, y+19, z+14),
                new BlockPos(x+11, y+19, z+15),
                new BlockPos(x+18, y+19, z+15),
                new BlockPos(x+13, y+19, z+16),
                new BlockPos(x+16, y+19, z+16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+8, y+20, z+8),
                new BlockPos(x+13, y+20, z+10),
                new BlockPos(x+9, y+20, z+11)
            )
            .setLeaves(
                new BlockPos(x+9, y+20, z+3),
                new BlockPos(x+5, y+20, z+4),
                new BlockPos(x+8, y+20, z+4),
                new BlockPos(x+11, y+20, z+4),
                new BlockPos(x+5, y+20, z+5),
                new BlockPos(x+10, y+20, z+5),
                new BlockPos(x+12, y+20, z+6),
                new BlockPos(x+5, y+20, z+7),
                new BlockPos(x+6, y+20, z+7),
                new BlockPos(x+9, y+20, z+7),
                new BlockPos(x+14, y+20, z+7),
                new BlockPos(x+16, y+20, z+7),
                new BlockPos(x+17, y+20, z+7),
                new BlockPos(x+7, y+20, z+8),
                new BlockPos(x+12, y+20, z+8),
                new BlockPos(x+14, y+20, z+8),
                new BlockPos(x+15, y+20, z+8),
                new BlockPos(x+3, y+20, z+9),
                new BlockPos(x+8, y+20, z+9),
                new BlockPos(x+13, y+20, z+9),
                new BlockPos(x+17, y+20, z+9),
                new BlockPos(x+7, y+20, z+10),
                new BlockPos(x+8, y+20, z+10),
                new BlockPos(x+9, y+20, z+10),
                new BlockPos(x+17, y+20, z+10),
                new BlockPos(x+8, y+20, z+11),
                new BlockPos(x+17, y+20, z+11),
                new BlockPos(x+5, y+20, z+12),
                new BlockPos(x+9, y+20, z+12),
                new BlockPos(x+15, y+20, z+12),
                new BlockPos(x+7, y+20, z+13),
                new BlockPos(x+8, y+20, z+13),
                new BlockPos(x+16, y+20, z+13),
                new BlockPos(x+10, y+20, z+14),
                new BlockPos(x+12, y+20, z+14),
                new BlockPos(x+13, y+20, z+14),
                new BlockPos(x+14, y+20, z+14),
                new BlockPos(x+12, y+20, z+16),
                new BlockPos(x+12, y+20, z+17)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+8, y+21, z+8),
                new BlockPos(x+13, y+21, z+10),
                new BlockPos(x+9, y+21, z+12)
            )
            .setLeaves(
                new BlockPos(x+6, y+21, z+3),
                new BlockPos(x+8, y+21, z+3),
                new BlockPos(x+6, y+21, z+4),
                new BlockPos(x+7, y+21, z+4),
                new BlockPos(x+10, y+21, z+4),
                new BlockPos(x+13, y+21, z+4),
                new BlockPos(x+4, y+21, z+5),
                new BlockPos(x+7, y+21, z+5),
                new BlockPos(x+9, y+21, z+5),
                new BlockPos(x+10, y+21, z+5),
                new BlockPos(x+12, y+21, z+5),
                new BlockPos(x+13, y+21, z+5),
                new BlockPos(x+12, y+21, z+6),
                new BlockPos(x+15, y+21, z+6),
                new BlockPos(x+8, y+21, z+7),
                new BlockPos(x+13, y+21, z+7),
                new BlockPos(x+16, y+21, z+7),
                new BlockPos(x+9, y+21, z+8),
                new BlockPos(x+11, y+21, z+8),
                new BlockPos(x+12, y+21, z+8),
                new BlockPos(x+13, y+21, z+8),
                new BlockPos(x+15, y+21, z+8),
                new BlockPos(x+17, y+21, z+8),
                new BlockPos(x+3, y+21, z+9),
                new BlockPos(x+6, y+21, z+9),
                new BlockPos(x+7, y+21, z+9),
                new BlockPos(x+8, y+21, z+9),
                new BlockPos(x+9, y+21, z+9),
                new BlockPos(x+12, y+21, z+9),
                new BlockPos(x+13, y+21, z+9),
                new BlockPos(x+14, y+21, z+9),
                new BlockPos(x+18, y+21, z+9),
                new BlockPos(x+5, y+21, z+10),
                new BlockPos(x+6, y+21, z+10),
                new BlockPos(x+8, y+21, z+10),
                new BlockPos(x+10, y+21, z+10),
                new BlockPos(x+15, y+21, z+10),
                new BlockPos(x+16, y+21, z+10),
                new BlockPos(x+18, y+21, z+10),
                new BlockPos(x+5, y+21, z+11),
                new BlockPos(x+8, y+21, z+11),
                new BlockPos(x+12, y+21, z+11),
                new BlockPos(x+14, y+21, z+11),
                new BlockPos(x+15, y+21, z+11),
                new BlockPos(x+8, y+21, z+12),
                new BlockPos(x+12, y+21, z+12),
                new BlockPos(x+14, y+21, z+12),
                new BlockPos(x+15, y+21, z+12),
                new BlockPos(x+7, y+21, z+13),
                new BlockPos(x+8, y+21, z+13),
                new BlockPos(x+10, y+21, z+13),
                new BlockPos(x+12, y+21, z+13),
                new BlockPos(x+14, y+21, z+13),
                new BlockPos(x+15, y+21, z+13),
                new BlockPos(x+17, y+21, z+13),
                new BlockPos(x+12, y+21, z+14),
                new BlockPos(x+14, y+21, z+14)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x+13, y+22, z+10),
                new BlockPos(x+9, y+22, z+12)
            )
            .setLeaves(
                new BlockPos(x+8, y+22, z+4),
                new BlockPos(x+9, y+22, z+4),
                new BlockPos(x+10, y+22, z+4),
                new BlockPos(x+6, y+22, z+5),
                new BlockPos(x+7, y+22, z+5),
                new BlockPos(x+11, y+22, z+5),
                new BlockPos(x+14, y+22, z+5),
                new BlockPos(x+3, y+22, z+6),
                new BlockPos(x+12, y+22, z+6),
                new BlockPos(x+11, y+22, z+7),
                new BlockPos(x+15, y+22, z+7),
                new BlockPos(x+4, y+22, z+8),
                new BlockPos(x+7, y+22, z+8),
                new BlockPos(x+8, y+22, z+8),
                new BlockPos(x+12, y+22, z+8),
                new BlockPos(x+13, y+22, z+8),
                new BlockPos(x+16, y+22, z+8),
                new BlockPos(x+3, y+22, z+9),
                new BlockPos(x+7, y+22, z+9),
                new BlockPos(x+9, y+22, z+9),
                new BlockPos(x+11, y+22, z+9),
                new BlockPos(x+14, y+22, z+9),
                new BlockPos(x+15, y+22, z+9),
                new BlockPos(x+18, y+22, z+9),
                new BlockPos(x+3, y+22, z+10),
                new BlockPos(x+7, y+22, z+10),
                new BlockPos(x+8, y+22, z+10),
                new BlockPos(x+15, y+22, z+10),
                new BlockPos(x+16, y+22, z+10),
                new BlockPos(x+5, y+22, z+11),
                new BlockPos(x+10, y+22, z+11),
                new BlockPos(x+16, y+22, z+11),
                new BlockPos(x+17, y+22, z+11),
                new BlockPos(x+13, y+22, z+12),
                new BlockPos(x+14, y+22, z+12),
                new BlockPos(x+10, y+22, z+13),
                new BlockPos(x+13, y+22, z+13),
                new BlockPos(x+14, y+22, z+13)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+8, y+23, z+3),
                new BlockPos(x+8, y+23, z+5),
                new BlockPos(x+13, y+23, z+5),
                new BlockPos(x+12, y+23, z+6),
                new BlockPos(x+14, y+23, z+6),
                new BlockPos(x+16, y+23, z+6),
                new BlockPos(x+10, y+23, z+8),
                new BlockPos(x+11, y+23, z+8),
                new BlockPos(x+13, y+23, z+8),
                new BlockPos(x+9, y+23, z+9),
                new BlockPos(x+10, y+23, z+9),
                new BlockPos(x+13, y+23, z+9),
                new BlockPos(x+4, y+23, z+10),
                new BlockPos(x+6, y+23, z+10),
                new BlockPos(x+8, y+23, z+10),
                new BlockPos(x+9, y+23, z+10),
                new BlockPos(x+10, y+23, z+10),
                new BlockPos(x+15, y+23, z+10),
                new BlockPos(x+4, y+23, z+11),
                new BlockPos(x+10, y+23, z+11),
                new BlockPos(x+11, y+23, z+11),
                new BlockPos(x+12, y+23, z+11),
                new BlockPos(x+11, y+23, z+12),
                new BlockPos(x+12, y+23, z+12),
                new BlockPos(x+18, y+23, z+12),
                new BlockPos(x+11, y+23, z+14),
                new BlockPos(x+13, y+23, z+15)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+7, y+24, z+4),
                new BlockPos(x+8, y+24, z+4),
                new BlockPos(x+8, y+24, z+6),
                new BlockPos(x+10, y+24, z+6),
                new BlockPos(x+6, y+24, z+7),
                new BlockPos(x+10, y+24, z+7),
                new BlockPos(x+11, y+24, z+7),
                new BlockPos(x+13, y+24, z+7),
                new BlockPos(x+6, y+24, z+8),
                new BlockPos(x+13, y+24, z+8),
                new BlockPos(x+12, y+24, z+10),
                new BlockPos(x+13, y+24, z+10),
                new BlockPos(x+10, y+24, z+11),
                new BlockPos(x+13, y+24, z+11),
                new BlockPos(x+14, y+24, z+11),
                new BlockPos(x+16, y+24, z+11),
                new BlockPos(x+10, y+24, z+13),
                new BlockPos(x+13, y+24, z+15),
                new BlockPos(x+14, y+24, z+15)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+8, y+25, z+5),
                new BlockPos(x+10, y+25, z+5),
                new BlockPos(x+13, y+25, z+6),
                new BlockPos(x+9, y+25, z+7),
                new BlockPos(x+14, y+25, z+7),
                new BlockPos(x+9, y+25, z+8),
                new BlockPos(x+8, y+25, z+9),
                new BlockPos(x+6, y+25, z+10),
                new BlockPos(x+9, y+25, z+10),
                new BlockPos(x+12, y+25, z+10),
                new BlockPos(x+15, y+25, z+10),
                new BlockPos(x+17, y+25, z+10),
                new BlockPos(x+9, y+25, z+11),
                new BlockPos(x+10, y+25, z+11),
                new BlockPos(x+13, y+25, z+11),
                new BlockPos(x+15, y+25, z+11),
                new BlockPos(x+13, y+25, z+12),
                new BlockPos(x+16, y+25, z+12)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+9, y+26, z+7),
                new BlockPos(x+6, y+26, z+8),
                new BlockPos(x+7, y+26, z+8),
                new BlockPos(x+9, y+26, z+8),
                new BlockPos(x+10, y+26, z+8),
                new BlockPos(x+15, y+26, z+8),
                new BlockPos(x+16, y+26, z+8),
                new BlockPos(x+7, y+26, z+10),
                new BlockPos(x+10, y+26, z+10),
                new BlockPos(x+13, y+26, z+10),
                new BlockPos(x+15, y+26, z+13)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x+14, y+27, z+11)
            )
        );
    }
}

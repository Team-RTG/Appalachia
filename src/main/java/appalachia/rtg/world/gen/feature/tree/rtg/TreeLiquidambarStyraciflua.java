package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

/**
 * Liquidambar Styraciflua (American Sweetgum)
 * <p>
 * This tree was designed by Lentebriesje and released as part of the 'Custom Tree Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/native-trees-of-europe-template-repository-1779952/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeLiquidambarStyraciflua extends AppalachiaTree {

    World world;
    Random rand;

    public TreeLiquidambarStyraciflua() {

        super();
        this.setLogBlock(AppalachiaBlocks.log_american_sweetgum_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_american_sweetgum_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_american_sweetgum_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_american_sweetgum_01.getDefaultState());

        this.trunkSize = 3;
        this.validGroundBlocks = new ArrayList<IBlockState>(Arrays.asList(Blocks.GRASS.getDefaultState(), Blocks.DIRT.getDefaultState()));
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        if (rand.nextInt(3) != 0) {
            return false;
        }

        this.world = world;
        this.rand = rand;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>() {

        };
        groundPos.add(new BlockPos(x + 5, y, z + 4));

        for (int i = 0; i < groundPos.size(); i++) {
            if (!isValidGroundBlock(world, rand, groundPos.get(i), 1)) {
                return false;
            }
        }

        IBlockState leaves = this.leavesBlock.withProperty(BlockLeaves.CHECK_DECAY, false);
        //IBlockState leaves = this.leavesBlock.withProperty(BlockLeaves.DECAYABLE, false);
        int currentY = y;

        this.spawn(world, x, currentY, z, this.logBlock, leaves);

        return true;
    }

    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        for (int t = 0; t < this.trunkSize; t++) {

            this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
            currentY++;
        }

        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 6, 4, 4);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 4, 4, 4);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 5, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 6), leaves);
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 8, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 1, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 5, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 7), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 7, 4, 4);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 8), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 2, currentY, z + 1), leaves);
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 1, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 3), leaves);
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 3, 4, 4);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 3, 4, 4);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 1, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 6), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 6, 4, 4);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 7), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 7, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 8), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 8, 12, 12);
        currentY++;

        this.setBlockState(new BlockPos(x + 5, currentY, z + 0), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 2), leaves);
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 2, 4, 4);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 10, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 10, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 9), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 5, currentY, z + 2, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 10, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 8), leaves);
        this.setBlockMetadataWithNotify(x + 4, currentY, z + 8, 4, 4);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 5, currentY, z + 8, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 8, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 9), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 9), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 9), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 9), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 5, currentY, z + 0), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 0), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 0, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 0, currentY, z + 4, 4, 4);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 1, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 8), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 5, currentY, z + 0), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 2, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 0, currentY, z + 4), leaves);
        this.setBlockMetadataWithNotify(x + 0, currentY, z + 4, 4, 4);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 1, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 2, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 5, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 8), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 9), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 9), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 9, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 10, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 4, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 3, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 1), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 4, currentY, z + 3, 12, 12);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 4, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 3, currentY, z + 6, 12, 12);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 8), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 1, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 8, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 9, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 7, currentY, z + 4, 12, 12);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 4, currentY, z + 5, 12, 12);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 3, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 3, 8, 8);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockMetadataWithNotify(x + 6, currentY, z + 3, 4, 4);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 8, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 2, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 6), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 4), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 6, currentY, z + 2), leaves);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 6, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 7, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 3, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 3), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), log);
        this.setBlockState(new BlockPos(x + 6, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 4, currentY, z + 5), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x + 4, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 4), leaves);
        this.setBlockState(new BlockPos(x + 5, currentY, z + 5), leaves);
        currentY++;
    }

    protected void setBlockState(BlockPos pos, IBlockState state) {

        this.setBlockAndNotifyAdequately(this.world, pos, state);
    }

    private void setBlockMetadataWithNotify(int x, int y, int z, int meta1, int meta2) {

    }
}

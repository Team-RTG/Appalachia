package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

/**
 * Sassafras Albidum (Sassafras)
 * <p>
 * This tree was designed by MrWizz and released as part of the 'Natural Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/tree-pack-repository-bundle---build-your-own-trees-optimized-map/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeSassafras extends AppalachiaTree {

    public TreeSassafras() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_sassafras_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_sassafras_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_sassafras_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_sassafras_01.getDefaultState());

        this.firstBlockOffsetX = 9;
        this.firstBlockOffsetZ = 5;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>(){};

        groundPos.add(new BlockPos(x+9, y, z+5));
        groundPos.add(new BlockPos(x+11, y, z+5));
        groundPos.add(new BlockPos(x+7, y, z+6));
        groundPos.add(new BlockPos(x+8, y, z+6));
        groundPos.add(new BlockPos(x+9, y, z+6));
        groundPos.add(new BlockPos(x+10, y, z+6));
        groundPos.add(new BlockPos(x+9, y, z+7));
        groundPos.add(new BlockPos(x+10, y, z+7));
        groundPos.add(new BlockPos(x+8, y, z+8));
        groundPos.add(new BlockPos(x+10, y, z+8));
        groundPos.add(new BlockPos(x+11, y, z+8));

        for (int i = 0; i < groundPos.size(); i++) {
            if (!isValidGroundBlock(world, rand, groundPos.get(i), 1)) {
                return false;
            }
        }

        this.spawn(world, x, y - this.rootDepth(), z, this.logBlock, this.leavesBlock);

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

    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        this.setBlockState(new BlockPos(x+8, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+6, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+7, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+6, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+8, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+12, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+9), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        currentY++;
        
        this.setBlockState(new BlockPos(x+9, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+7, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+8, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+11, currentY, z+8), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        currentY++;


        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        currentY++;

        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));

        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        currentY++;



        this.setBlockState(new BlockPos(x+9, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));

        this.setBlockState(new BlockPos(x+8, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        currentY++;







        this.setBlockState(new BlockPos(x+8, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+7, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));

        this.setBlockState(new BlockPos(x+8, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);
        currentY++;









        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockState(new BlockPos(x+8, currentY, z+6), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));

        this.setBlockState(new BlockPos(x+8, currentY, z+7), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));

        this.setBlockState(new BlockPos(x+8, currentY, z+8), leaves);
        currentY++;






        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);



        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), log);

        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);
        currentY++;





        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);


        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);




        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), log);

        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log);


        this.setBlockState(new BlockPos(x+8, currentY, z+8), log);

        this.setBlockState(new BlockPos(x+8, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+10), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        currentY++;





        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);


        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+2), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+11, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+5), log);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+10, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), log);


        this.setBlockState(new BlockPos(x+8, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), log);


        this.setBlockState(new BlockPos(x+4, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+14), leaves);
        currentY++;




        this.setBlockState(new BlockPos(x+3, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), log);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+1), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), log);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);


        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+11, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+9, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);


        this.setBlockState(new BlockPos(x+9, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+5), log);
        this.setBlockState(new BlockPos(x+12, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+11, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);

        this.setBlockState(new BlockPos(x+4, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+14), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+14), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+15), leaves);
        currentY++;




        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);

        this.setBlockState(new BlockPos(x+12, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);



        this.setBlockState(new BlockPos(x+11, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+3), log);
        this.setBlockState(new BlockPos(x+13, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+10, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+4), log);
        this.setBlockState(new BlockPos(x+12, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+4), leaves);


        this.setBlockState(new BlockPos(x+9, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+6), leaves);


        this.setBlockState(new BlockPos(x+7, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+10), leaves);


        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+15), leaves);
        currentY++;



        this.setBlockState(new BlockPos(x+11, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+2), leaves);



        this.setBlockState(new BlockPos(x+10, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+3), log);
        this.setBlockState(new BlockPos(x+14, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+10, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+14, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);


        this.setBlockState(new BlockPos(x+10, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+10, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+10), leaves);




        this.setBlockState(new BlockPos(x+4, currentY, z+12), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+16), leaves);
        currentY++;





        this.setBlockState(new BlockPos(x+11, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);


        this.setBlockState(new BlockPos(x+11, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+10, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+11, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+10), leaves);



        this.setBlockState(new BlockPos(x+4, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+11), leaves);


        this.setBlockState(new BlockPos(x+4, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+6, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+16), leaves);
        currentY++;





        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);


        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+8, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+5), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+1, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+4, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+12, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), log);
        this.setBlockState(new BlockPos(x+11, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+10), log);
        this.setBlockState(new BlockPos(x+13, currentY, z+10), log);
        this.setBlockState(new BlockPos(x+14, currentY, z+10), leaves);



        this.setBlockState(new BlockPos(x+3, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+11), leaves);

        this.setBlockState(new BlockPos(x+13, currentY, z+11), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);

        this.setBlockState(new BlockPos(x+4, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+14), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+16), leaves);
        currentY++;


        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);


        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), log);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+2, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+10), leaves);


        this.setBlockState(new BlockPos(x+3, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);

        this.setBlockState(new BlockPos(x+4, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+15), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+15), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+16), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+16), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+16), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+2), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+3), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), log);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+6), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+1, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);

        this.setBlockState(new BlockPos(x+0, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+7, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+9, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+12, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+13, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+13), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+13), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+14), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+14), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+15), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+15), leaves);

        this.setBlockState(new BlockPos(x+7, currentY, z+16), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+16), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);

        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);

        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);


        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+7), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+8), leaves);

        this.setBlockState(new BlockPos(x+5, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+9), log);
        this.setBlockState(new BlockPos(x+10, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+11, currentY, z+10), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+11), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+11), leaves);

        this.setBlockState(new BlockPos(x+9, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+10, currentY, z+12), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+13), leaves);


        this.setBlockState(new BlockPos(x+8, currentY, z+15), leaves);
        currentY++;


        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+7), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+8), leaves);
        this.setBlockState(new BlockPos(x+8, currentY, z+9), leaves);
        this.setBlockState(new BlockPos(x+9, currentY, z+9), leaves);
        currentY++;
    }
}

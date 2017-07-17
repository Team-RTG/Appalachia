package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

/**
 * Betula Alleghaniensis (Yellow Birch)
 * <p>
 * This tree was designed by Eremilion and released as part of the 'Realistic Trees & Many Other Things' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/realistictreesandmanyotherthingsworkinprogress/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeYellowBirch extends AppalachiaTree {

    public TreeYellowBirch() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_yellow_birch_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_yellow_birch_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_yellow_birch_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_yellow_birch_01.getDefaultState());

        this.firstBlockOffsetX = 4;
        this.firstBlockOffsetZ = 3;
    }

    public TreeYellowBirch(boolean shortVersion) {
        this();
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>(){};

        groundPos.add(new BlockPos(x+4, y, z+3));
        groundPos.add(new BlockPos(x+5, y, z+3));
        groundPos.add(new BlockPos(x+4, y, z+4));

        for (int i = 0; i < groundPos.size(); i++) {
            if (!isValidGroundBlock(world, rand, groundPos.get(i), 1)) {
                return false;
            }
        }

        this.spawn(world, x, y, z, this.logBlock, this.leavesBlock);

        return true;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        currentY++;
        
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 6, 6);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 6, 6);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 6, 6);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 6, 6);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+0, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+0, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+1), log);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 6, 6);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+0, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+0, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+0, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 6, 6);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 10, 10);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 6, 6);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 6, 6);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 6, 6);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 6, 6);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 14, 14);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 14, 14);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 14, 14);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 14, 14);
        currentY++;
    }
}

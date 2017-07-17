package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

/**
 * Larix Laricina (Tamarack)
 * <p>
 * This tree was designed by Eremilion and released as part of the 'Realistic Trees & Many Other Things' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/realistictreesandmanyotherthingsworkinprogress/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeTamarack extends AppalachiaTree {

    public TreeTamarack() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_tamarack_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_tamarack_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_tamarack_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_tamarack_01.getDefaultState());

        this.firstBlockOffsetX = 4;
        this.firstBlockOffsetZ = 4;
    }

    public TreeTamarack(boolean shortVersion) {
        this();
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>(){};

        groundPos.add(new BlockPos(x+4, y, z+4));
        groundPos.add(new BlockPos(x+5, y, z+4));
        groundPos.add(new BlockPos(x+4, y, z+5));

        for (int i = 0; i < groundPos.size(); i++) {
            if (!isValidGroundBlock(world, rand, groundPos.get(i), 1)) {
                return false;
            }
        }

        IBlockState leaves = this.leavesBlock.withProperty(BlockLeaves.CHECK_DECAY, false);
        //IBlockState leaves = this.leavesBlock.withProperty(BlockLeaves.DECAYABLE, false);

        this.spawn(world, x, y, z, this.logBlock, leaves);

        return true;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        this.setBlockState(new BlockPos(x+4, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        currentY++;
        
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+4), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE));
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+0, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+8, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+8, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+8, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+8, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+0, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+0, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), log);
        this.setBlockMetadataWithNotify(x+7, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+8, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+8, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+7, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+7, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+7, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+8), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+8, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+0, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+0, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+0, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+0, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+7, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+7, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+8), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+8, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+1, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+2, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), log);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+7, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+7, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+6, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+7, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+7, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+1, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+6, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+7), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+7, 5, 5);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+5, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+6, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+2, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 5, 5);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+4, 5, 5);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+5, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 13, 13);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+5, 13, 13);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 13, 13);
        currentY++;
    }
}

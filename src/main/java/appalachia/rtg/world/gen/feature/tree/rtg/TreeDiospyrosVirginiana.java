package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

/**
 * Diospyros Virginiana (Persimmon)
 * <p>
 * This tree was designed by MrWizz and released as part of the 'Natural Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/tree-pack-repository-bundle---build-your-own-trees-optimized-map/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeDiospyrosVirginiana extends AppalachiaTree {

    World world;
    Random rand;

    public TreeDiospyrosVirginiana() {
        super();
        this.setLogBlock(AppalachiaBlocks.log_persimmon_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_persimmon_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_persimmon_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_persimmon_01.getDefaultState());
    }

    public TreeDiospyrosVirginiana(boolean shortVersion) {
        this();
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        this.crownSize = this.getSizeFromMinMax(rand, this.minCrownSize, this.maxCrownSize);
        this.trunkSize = this.getSizeFromMinMax(rand, this.minTrunkSize, this.maxTrunkSize);

        this.world = world;
        this.rand = rand;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>(){};

        groundPos.add(new BlockPos(x+4, y, z+3));

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

    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        currentY++;
        
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, currentY, z+4, 2, 2);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+0, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+3), log);
        this.setBlockMetadataWithNotify(x+4, currentY, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+4, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+7, currentY, z+5, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+7), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+0, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+0, 2, 2);
        this.setBlockState(new BlockPos(x+1, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+0, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+0, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+3, currentY, z+0), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+0, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+1, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, currentY, z+4, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+5, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+6), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+6), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+2, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+0), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+6, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+6, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+7, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+1, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+5), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+1), leaves);
        this.setBlockState(new BlockPos(x+2, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+3, currentY, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+2, 2, 2);
        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, currentY, z+3, 2, 2);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+6, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+4), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+5), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+2), leaves);
        this.setBlockState(new BlockPos(x+3, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, currentY, z+3), leaves);
        this.setBlockState(new BlockPos(x+4, currentY, z+4), leaves);
        currentY++;

        this.setBlockState(new BlockPos(x+4, currentY, z+3), leaves);
        currentY++;
    }

    protected void setBlockState(BlockPos pos, IBlockState state) {

        this.setBlockAndNotifyAdequately(this.world, pos, state);
    }

    private void setBlockMetadataWithNotify(int x, int y, int z, int meta1, int meta2) {

    }
}

package appalachia.api.world.gen.feature.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;

import rtg.world.gen.feature.tree.rtg.TreeRTG;

public class AppalachiaTree extends TreeRTG {

    public IBlockState logBlock;
    public IBlockState leavesBlock;
    public IBlockState fallenLeavesBlock;
    public IBlockState saplingBlock;
    public int trunkSize;
    public int crownSize;
    public int minTrunkSize;
    public int maxTrunkSize;
    public int minCrownSize;
    public int maxCrownSize;
    public boolean noLeaves;
    public boolean generateFromSapling;
    public ArrayList<IBlockState> validGroundBlocks;

    public AppalachiaTree(boolean notify) {
        super(notify);
    }

    public AppalachiaTree() {

        this(false);

        this.logBlock = Blocks.LOG.getDefaultState();
        this.leavesBlock = Blocks.LEAVES.getDefaultState();
        this.fallenLeavesBlock = AppalachiaBlocks.leaves_autumn_red_fallen.getDefaultState();
        this.saplingBlock = AppalachiaBlocks.sapling_quercus_robur.getDefaultState();

        this.minTrunkSize = -1;
        this.maxTrunkSize = -1;
        this.trunkSize = 2;
        this.minCrownSize = -1;
        this.maxCrownSize = -1;
        this.crownSize = 4;

        this.noLeaves = false;
        this.generateFromSapling = false;

        this.validGroundBlocks = new ArrayList<IBlockState>(Arrays.asList(
            Blocks.GRASS.getDefaultState(),
            Blocks.DIRT.getDefaultState(),
            Blocks.DIRT.getStateFromMeta(1),
            Blocks.DIRT.getStateFromMeta(2)
        ));
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        return false;
    }

    @Override
    protected void setBlockAndNotifyAdequately(World worldIn, BlockPos pos, IBlockState state) {

        if (this.generateFromSapling) {
            worldIn.setBlockState(pos, state, 3);
        }
        else {
            worldIn.setBlockState(pos, state, 2);
        }
    }

    protected boolean isValidGroundBlock(World world, Random rand, BlockPos pos, int depth) {

        for (int d = 1; d <= depth; d++) {
            IBlockState g = world.getBlockState(new BlockPos(pos.getX(), pos.getY() - d, pos.getZ()));

            for (int i = 0; i < this.validGroundBlocks.size(); i++) {
                if (g == this.validGroundBlocks.get(i)) {
                    return true;
                }
            }
        }

        return false;
    }

    protected boolean isValidGroundBlock(World world, Random rand, BlockPos pos) {

        return this.isValidGroundBlock(world, rand, pos, 1);
    }

    protected int getSizeFromMinMax(Random rand, int min, int max) {
        return min + rand.nextInt(max - min + 1);
    }
}

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
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.util.TreeLayer;

import rtg.api.world.gen.feature.tree.rtg.TreeRTG;


public abstract class AppalachiaTree extends TreeRTG implements IAppalachiaTree {

    public IBlockState fallenLeavesBlock;
    public boolean generateFromSapling;

    protected World world;
    protected Random rand;
    protected int groundY;
    protected int opaqueLeavesMinY;
    protected int opaqueLeavesMaxY;
    protected int opaqueLeavesChance;

    protected int genX;
    protected int genY;
    protected int genZ;

    protected int firstBlockOffsetX;
    protected int firstBlockOffsetZ;
    protected ArrayList<TreeLayer> treeLayers = new ArrayList<TreeLayer>(){};

    public AppalachiaTree(boolean notify) {
        super(notify);
    }

    public AppalachiaTree() {

        this(false);

        this.setLogBlock(Blocks.LOG.getDefaultState());
        this.setLeavesBlock(Blocks.LEAVES.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_red_oak_01_fallen.getDefaultState());
        this.setSaplingBlock(Blocks.SAPLING.getDefaultState());

        this.minTrunkSize = -1;
        this.maxTrunkSize = -1;
        this.trunkSize = 2;
        this.minCrownSize = -1;
        this.maxCrownSize = -1;
        this.crownSize = 4;

        this.noLeaves = false;
        this.generateFromSapling = false;

        this.firstBlockOffsetX = 0;
        this.firstBlockOffsetZ = 0;

        this.validGroundBlocks = new ArrayList<IBlockState>(Arrays.asList(
            Blocks.GRASS.getDefaultState(),
            Blocks.DIRT.getDefaultState(),
            Blocks.DIRT.getStateFromMeta(1),
            Blocks.DIRT.getStateFromMeta(2)
        ));
    }

    protected void init(World world, Random rand, BlockPos pos) {
        this.world = world;
        this.rand = rand;
        this.crownSize = this.getSizeFromMinMax(rand, this.minCrownSize, this.maxCrownSize);
        this.trunkSize = this.getSizeFromMinMax(rand, this.minTrunkSize, this.maxTrunkSize);
        this.groundY = pos.getY();
        this.opaqueLeavesMinY = this.groundY + 5;
        this.opaqueLeavesMaxY = this.groundY + 8;
        this.genX = pos.getX();
        this.genY = pos.getY();
        this.genZ = pos.getZ();

        this.logBlock = this.logBlock.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.NONE);
        this.leavesBlock = this.leavesBlock.withProperty(BlockLeaves.CHECK_DECAY, false);
        //this.leavesBlock = this.leavesBlock.withProperty(BlockLeaves.DECAYABLE, false);
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

    public IBlockState getFallenLeavesBlock() {

        return fallenLeavesBlock;
    }

    public AppalachiaTree setFallenLeavesBlock(IBlockState fallenLeavesBlock) {

        this.fallenLeavesBlock = fallenLeavesBlock;
        return this;
    }

    protected void setBlockState(BlockPos pos, IBlockState state) {

        if (state.getBlock() instanceof AppalachiaBlockLeaves) {

            int y = pos.getY();

            if (y >= this.opaqueLeavesMinY && y <= this.opaqueLeavesMaxY) {
                if (rand.nextInt(this.opaqueLeavesChance()) == 0) {
                    state = state.withProperty(AppalachiaBlockLeaves.TRANSLUCENT, false);
                }
            }
        }

        BlockPos offetPos = new BlockPos(pos.getX() - firstBlockOffsetX, pos.getY(), pos.getZ() - firstBlockOffsetZ);

        this.setBlockAndNotifyAdequately(this.world, offetPos, state);
    }

    protected AppalachiaTree addTreeLayer(TreeLayer treeLayer) {
        this.treeLayers.add(treeLayer);
        return this;
    }
}

package appalachia.world.gen.feature.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class AppalachiaTree extends WorldGenAbstractTree {

    public IBlockState logBlock;
    public IBlockState leavesBlock;
    public IBlockState saplingBlock;
    public int minTrunkSize;
    public int maxTrunkSize;
    public int trunkSize;
    public int minCrownSize;
    public int maxCrownSize;
    public int crownSize;
    public boolean noLeaves;
    public ArrayList<IBlockState> validGroundBlocks;

    public AppalachiaTree() {

        this(false);
    }

    public AppalachiaTree(boolean notify) {

        super(notify);

        this.logBlock = Blocks.LOG.getDefaultState();
        this.leavesBlock = Blocks.LEAVES.getDefaultState();
        this.saplingBlock = Blocks.SAPLING.getDefaultState();
        this.minTrunkSize = -1;
        this.maxTrunkSize = -1;
        this.trunkSize = 2;
        this.minCrownSize = -1;
        this.maxCrownSize = -1;
        this.crownSize = 4;
        this.noLeaves = false;

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
}

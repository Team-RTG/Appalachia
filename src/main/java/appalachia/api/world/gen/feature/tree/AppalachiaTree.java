package appalachia.api.world.gen.feature.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;

public class AppalachiaTree extends WorldGenAbstractTree {

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

    public AppalachiaTree() {

        this(false);
    }

    public AppalachiaTree(boolean notify) {

        super(notify);

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
    protected void setBlockAndNotifyAdequately(World worldIn, BlockPos pos, IBlockState state)
    {
        if (this.generateFromSapling)
        {
            worldIn.setBlockState(pos, state, 3);
        }
        else
        {
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

    protected boolean isValidGroundBlock(World world, Random rand, BlockPos pos)
    {
        return this.isValidGroundBlock(world, rand, pos, 1);
    }

    protected void setFallenLeaves(World world, Random random, BlockPos pos, int treeHeight)
    {
        int leavesHeight = 12;

        if (treeHeight - leavesHeight >= leavesHeight - 3)
        {
            leavesHeight += 2;
        }

        BlockPos.MutableBlockPos blockpos = new BlockPos.MutableBlockPos();
        int leaveRange = leavesHeight / 3 - 1;
        int y = pos.getY() + treeHeight - leavesHeight - 3;

        for (int x = pos.getX() - leaveRange; x <= pos.getX() + leaveRange; ++x)
        {
            for (int z = pos.getZ() - leaveRange; z <= pos.getZ() + leaveRange; ++z)
            {
                blockpos.setPos(x, y, z);

                if (!world.isAirBlock(blockpos))
                {
                    continue;
                }

                blockpos.move(EnumFacing.DOWN);

                while (blockpos.getY() > 0 && world.isAirBlock(blockpos))
                {
                    blockpos.move(EnumFacing.DOWN);
                }

                blockpos.move(EnumFacing.UP);

                if (this.fallenLeavesBlock.getBlock().canPlaceBlockAt(world, blockpos) && random.nextInt(3) == 0)
                {
                    setBlockAndNotifyAdequately(world, blockpos, this.fallenLeavesBlock);
                }
                else
                {
                    blockpos.move(EnumFacing.DOWN);

                    IBlockState state = world.getBlockState(blockpos);

                    if (state.getBlock() instanceof IAppalachiaBlockLeavesFallen)
                    {
                        int layers = state.getValue(IAppalachiaBlockLeavesFallen.LAYERS).intValue();

                        setBlockAndNotifyAdequately(world, blockpos, this.fallenLeavesBlock.withProperty(IAppalachiaBlockLeavesFallen.LAYERS, (layers & 7) + 1));
                    }
                }
            }
        }
    }
}

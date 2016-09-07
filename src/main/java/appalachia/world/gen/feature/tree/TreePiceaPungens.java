package appalachia.world.gen.feature.tree;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Picea Pungens (Colorado Spruce)
 */
public class TreePiceaPungens extends AppalachiaTree {

    public TreePiceaPungens() {

        super();
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        IBlockState g = world.getBlockState(new BlockPos(x, y - 1, z));
        if (g != Blocks.GRASS.getDefaultState() && g != Blocks.DIRT.getDefaultState()) {
            return false;
        }

        int small = (int) Math.ceil((double) (this.crownSize / 2));
        int large = small;

        int i, j, k;
        for (i = 0; i < this.trunkSize; i++) {
            world.setBlockState(new BlockPos(x, y, z), this.logBlock, this.generateFlag);
            y++;
        }

        for (i = 0; i < large; i++) {
            if (!this.noLeaves) {

                for (j = -2; j <= 2; j++) {
                    for (k = -2; k <= 2; k++) {
                        if (Math.abs(j) + Math.abs(k) != 4 && ((j > -2 && k > -2 && j < 2 && k < 2) || rand.nextInt(4) != 0)) {
                            world.setBlockState(new BlockPos(x + j, y, z + k), this.leavesBlock, this.generateFlag);
                        }
                    }
                }
            }
            world.setBlockState(new BlockPos(x, y, z), this.logBlock, this.generateFlag);
            y++;
        }

        for (i = 0; i < small; i++) {
            if (!this.noLeaves) {

                for (j = -1; j <= 1; j++) {
                    for (k = -1; k <= 1; k++) {
                        if (Math.abs(j) + Math.abs(k) < 2 || (rand.nextInt(4) != 0)) {
                            world.setBlockState(new BlockPos(x + j, y, z + k), this.leavesBlock, this.generateFlag);
                        }
                    }
                }

                if (i == 0) {
                    world.setBlockState(new BlockPos(x + 1, y, z), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x - 1, y, z), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x, y, z + 1), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x, y, z - 1), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x + 2, y, z), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x - 2, y, z), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x, y, z + 2), this.leavesBlock, this.generateFlag);
                    world.setBlockState(new BlockPos(x, y, z - 2), this.leavesBlock, this.generateFlag);
                }
            }

            world.setBlockState(new BlockPos(x, y, z), this.logBlock, this.generateFlag);
            y++;
        }

        world.setBlockState(new BlockPos(x, y, z), this.logBlock, this.generateFlag);

        if (!this.noLeaves) {

            world.setBlockState(new BlockPos(x + 1, y, z), this.leavesBlock, this.generateFlag);
            world.setBlockState(new BlockPos(x - 1, y, z), this.leavesBlock, this.generateFlag);
            world.setBlockState(new BlockPos(x, y, z + 1), this.leavesBlock, this.generateFlag);
            world.setBlockState(new BlockPos(x, y, z - 1), this.leavesBlock, this.generateFlag);

            world.setBlockState(new BlockPos(x, y + 1, z), this.leavesBlock, this.generateFlag);
            world.setBlockState(new BlockPos(x, y + 2, z), this.leavesBlock, this.generateFlag);
        }

        return true;
    }

    public void buildBranch(World world, Random rand, int x, int y, int z, int dX, int dZ, int logLength, int leaveSize) {

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                for (int k = 0; k < 2; k++) {
                    if (Math.abs(i) + Math.abs(j) + Math.abs(k) < leaveSize + 1) {
                        buildLeaves(world, x + i + (dX * logLength), y + k, z + j + (dZ * logLength));
                    }
                }
            }
        }

        for (int m = 1; m <= logLength; m++) {
            world.setBlockState(new BlockPos(x + (dX * m), y, z + (dZ * m)), this.logBlock, this.generateFlag);
        }
    }

    public void buildLeaves(World world, int x, int y, int z) {

        if (!this.noLeaves) {

            IBlockState b = world.getBlockState(new BlockPos(x, y, z));
            if (b.getMaterial() == Material.AIR) {
                world.setBlockState(new BlockPos(x, y, z), this.leavesBlock, this.generateFlag);
            }
        }
    }
}

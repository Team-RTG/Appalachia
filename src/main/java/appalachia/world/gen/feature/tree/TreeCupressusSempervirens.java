package appalachia.world.gen.feature.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Cupressus Sempervirens (Italian Cypress)
 */
public class TreeCupressusSempervirens extends AppalachiaTree {

    public TreeCupressusSempervirens() {

        super();

        this.validGroundBlocks = new ArrayList<IBlockState>(Arrays.asList(Blocks.GRASS.getDefaultState(), Blocks.DIRT.getDefaultState()));
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        IBlockState g = world.getBlockState(new BlockPos(x, y - 1, z));
        boolean validGroundBlock = false;

        for (int i = 0; i < this.validGroundBlocks.size(); i++) {
            if (g == this.validGroundBlocks.get(i)) {
                validGroundBlock = true;
                break;
            }
        }

        if (!validGroundBlock) {
            return false;
        }

        int i, j, k;
        for (i = 0; i < this.trunkSize; i++) {
            world.setBlockState(new BlockPos(x, y, z), this.logBlock, this.generateFlag);
            y++;
        }

        int small = (int) Math.ceil((double) (this.crownSize / 2));
        int large = small;

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
}

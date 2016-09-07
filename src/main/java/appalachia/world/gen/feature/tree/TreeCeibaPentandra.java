package appalachia.world.gen.feature.tree;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Ceiba Pentandra (White Silk-Cotton Tree)
 */
public class TreeCeibaPentandra extends AppalachiaTree {

    protected float length;
    protected int branch;
    protected float verStart;
    protected float verRand;

    public TreeCeibaPentandra() {

        super();

        this.length = 13f;
        this.branch = 3;
        this.verStart = 0.32f;
        this.verRand = 0.1f;
    }

    public TreeCeibaPentandra(float length, int branch, float verStart, float verRand) {

        this();

        this.length = length;
        this.branch = branch;
        this.verStart = verStart;
        this.verRand = verRand;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        IBlockState b = world.getBlockState(new BlockPos(x, y - 1, z));
        if (b != Blocks.GRASS.getDefaultState() && b != Blocks.DIRT.getDefaultState()) {
            return false;
        }

        if (this.trunkSize > 0) {
            for (int k = 0; k < 3; k++) {
                generateBranch(world, rand, x, y + this.trunkSize, z, (120 * k) - 40 + rand.nextInt(80), 1.6f + rand.nextFloat() * 0.1f, this.trunkSize * 1.7f, 1f);
            }
        }

        for (int i = y + this.trunkSize; i < y + this.crownSize; i++) {
            world.setBlockState(new BlockPos(x, i, z), this.logBlock, this.generateFlag);
        }

        float horDir, verDir;
        int eX, eY, eZ;
        for (int j = 0; j < branch; j++) {
            horDir = (120 * j) - 60 + rand.nextInt(120);
            verDir = verStart + rand.nextFloat() * verRand;
            generateBranch(world, rand, x, y + this.crownSize, z, horDir, verDir, length, 1f);

            eX = x + (int) (Math.cos(horDir * Math.PI / 180D) * verDir * length);
            eZ = z + (int) (Math.sin(horDir * Math.PI / 180D) * verDir * length);
            eY = y + this.crownSize + (int) ((1f - verDir) * length);

            for (int m = 0; m < 1; m++) {
                generateLeaves(world, rand, eX, eY, eZ, 4f, 1.5f);
            }
        }

        return true;
    }

    /*
     * horDir = number between -180D and 180D
     * verDir = number between 1F (horizontal) and 0F (vertical)
     */
    public void generateBranch(World world, Random rand, float x, float y, float z, double horDir, float verDir, float length, float speed) {

        if (verDir < 0f) {
            verDir = -verDir;
        }

        float c = 0f;
        float velY = 1f - verDir;

        if (verDir > 1f) {
            verDir = 1f - (verDir - 1f);
        }

        float velX = (float) Math.cos(horDir * Math.PI / 180D) * verDir;
        float velZ = (float) Math.sin(horDir * Math.PI / 180D) * verDir;

        while (c < length) {
            world.setBlockState(new BlockPos((int) x, (int) y, (int) z), this.logBlock, this.generateFlag);

            x += velX;
            y += velY;
            z += velZ;

            c += speed;
        }
    }

    public void generateLeaves(World world, Random rand, int x, int y, int z, float size, float width) {

        float dist;
        int i, j, k, s = (int) (size - 1f), w = (int) ((size - 1f) * width);
        for (i = -w; i <= w; i++) {
            for (j = -s; j <= s; j++) {
                for (k = -w; k <= w; k++) {
                    dist = Math.abs((float) i / width) + (float) Math.abs(j) + Math.abs((float) k / width);
                    if (dist <= size - 0.5f || (dist <= size && rand.nextBoolean())) {
                        if (dist < 0.6f) {
                            world.setBlockState(new BlockPos(x + i, y + j, z + k), this.logBlock, this.generateFlag);
                        }

                        if (!this.noLeaves) {

                            if (world.isAirBlock(new BlockPos(x + i, y + j, z + k))) {
                                world.setBlockState(new BlockPos(x + i, y + j, z + k), this.leavesBlock, this.generateFlag);
                            }
                        }
                    }
                }
            }
        }
    }

    public TreeCeibaPentandra setLength(float length) {

        this.length = length;
        return this;
    }

    public TreeCeibaPentandra setBranch(int branch) {

        this.branch = branch;
        return this;
    }

    public TreeCeibaPentandra setVerStart(float verStart) {

        this.verStart = verStart;
        return this;
    }

    public TreeCeibaPentandra setVerRand(float verRand) {

        this.verRand = verRand;
        return this;
    }
}

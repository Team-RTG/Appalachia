package appalachia.world.gen.feature.tree;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.config.ConfigAppalachia;


/**
 * Ceiba Rosea (Spanish Pochote)
 */
public class TreeCeibaRosea extends AppalachiaTree {

    protected float length;
    protected int branch;
    protected float verStart;
    protected float verRand;

    public TreeCeibaRosea() {

        super();

        length = 16f;
        branch = 5;
        verStart = 0.32f;
        verRand = 0.1f;
    }

    public TreeCeibaRosea(float length, int branch, float verStart, float verRand) {

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

        if (b == Blocks.SAND.getDefaultState() && !ConfigAppalachia.allowTreesToGenerateOnSand) {
            return false;
        }

        if (b != Blocks.GRASS.getDefaultState() && b != Blocks.DIRT.getDefaultState() && b != Blocks.SAND.getDefaultState()) {
            return false;
        }

        float r = rand.nextFloat() * 360;
        if (this.trunkSize > 0) {
            for (int k = 0; k < 5; k++) {
                generateBranch(world, rand, (float) x + 0.5f, y + this.trunkSize, (float) z + 0.5f, (120 * k) - 25 + rand.nextInt(50) + r, 1.6f + rand.nextFloat() * 0.1f, this.trunkSize * 1.8f, 1f);
            }
        }

        for (int i = y + this.trunkSize - 2; i < y + this.crownSize + 2; i++) {
            world.setBlockState(new BlockPos(x, i, z), this.logBlock, this.generateFlag);
            world.setBlockState(new BlockPos(x + 1, i, z + 1), this.logBlock, this.generateFlag);
        }

        float horDir, verDir;
        int eX, eY, eZ;
        for (int j = 0; j < branch; j++) {
            horDir = (80 * j) - 40 + rand.nextInt(80);
            verDir = verStart + rand.nextFloat() * verRand;
            generateBranch(world, rand, (float) x + 0.5f, y + this.crownSize, (float) z + 0.5f, horDir, verDir, length, 1f);

            eX = (int) (Math.cos(horDir * Math.PI / 180D) * verDir * length);
            eZ = (int) (Math.sin(horDir * Math.PI / 180D) * verDir * length);
            eY = (int) ((1f - verDir) * length);

            for (int m = 0; m < 2; m++) {
                generateLeaves(world, rand, x + eX - 2 + rand.nextInt(5), y + this.crownSize + eY + rand.nextInt(2), z + eZ - 2 + rand.nextInt(5), 4f, 1.5f);
            }

            eX *= 0.8f;
            eY *= 0.8f;
            eZ *= 0.8f;

            generateLeaves(world, rand, x + eX, y + this.crownSize + eY, z + eZ, 3f, 1.5f);
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

    public void generateLeaves(World world, Random rand, float x, float y, float z, float size, float width) {

        float dist;
        int i, j, k, s = (int) (size - 1f), w = (int) ((size - 1f) * width);
        for (i = -w; i <= w; i++) {
            for (j = -s + 1; j <= s; j++) {
                for (k = -w; k <= w; k++) {
                    dist = Math.abs((float) i / width) + (float) Math.abs(j) + Math.abs((float) k / width);
                    if (dist <= size - 0.5f || (dist <= size && rand.nextBoolean())) {
                        if (dist < 1.3f) {
                            world.setBlockState(new BlockPos((int) x + i, (int) y + j, (int) z + k), this.logBlock, this.generateFlag);
                        }

                        if (!this.noLeaves) {

                            if (world.isAirBlock(new BlockPos((int) x + i, (int) y + j, (int) z + k))) {
                                world.setBlockState(new BlockPos((int) x + i, (int) y + j, (int) z + k), this.leavesBlock, this.generateFlag);
                            }
                        }
                    }
                }
            }
        }
    }

    public TreeCeibaRosea setLength(float length) {

        this.length = length;
        return this;
    }

    public TreeCeibaRosea setBranch(int branch) {

        this.branch = branch;
        return this;
    }

    public TreeCeibaRosea setVerStart(float verStart) {

        this.verStart = verStart;
        return this;
    }

    public TreeCeibaRosea setVerRand(float verRand) {

        this.verRand = verRand;
        return this;
    }
}

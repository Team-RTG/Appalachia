package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

public class TreeQuercusRobur extends AppalachiaTree {

    private Random rand;
    private World world;
    private BlockPos basePos = BlockPos.ORIGIN;
    int heightLimit;
    int height;
    double heightAttenuation = 0.618D;
    double branchSlope = 0.381D;
    double scaleWidth = 1.0D;
    double leafDensity = 1.0D;
    TrunkType trunkType;
    int heightLimitLimit = 12;
    int leafDistanceLimit = 4;
    List<TreeQuercusRobur.FoliageCoordinates> foliageCoords;

    public TreeQuercusRobur() {

        this(false);
    }

    public TreeQuercusRobur(boolean notify) {

        super(notify);

        this.trunkType = TrunkType.THIN;
        this.saplingBlock = Blocks.SAPLING.getDefaultState();
    }

    void generateLeafNodeList() {

        this.height = (int)((double)this.heightLimit * this.heightAttenuation);

        if (this.height >= this.heightLimit) {
            this.height = this.heightLimit - 1;
        }

        int i = (int)(1.382D + Math.pow(this.leafDensity * (double)this.heightLimit / 13.0D, 2.0D));

        if (i < 1) {
            i = 1;
        }

        int j = this.basePos.getY() + this.height;
        int k = this.heightLimit - this.leafDistanceLimit;
        this.foliageCoords = Lists.<TreeQuercusRobur.FoliageCoordinates> newArrayList();
        this.foliageCoords.add(new TreeQuercusRobur.FoliageCoordinates(this.basePos.up(k), j));

        for (; k >= 0; --k) {
            float f = this.layerSize(k);

            if (f >= 0.0F) {
                for (int l = 0; l < i; ++l) {
                    double d0 = this.scaleWidth * (double)f * ((double)this.rand.nextFloat() + 0.328D);
                    double d1 = (double)(this.rand.nextFloat() * 2.0F) * Math.PI;
                    double d2 = d0 * Math.sin(d1) + 0.5D;
                    double d3 = d0 * Math.cos(d1) + 0.5D;
                    BlockPos blockpos = this.basePos.add(d2, (double)(k - 1), d3);
                    BlockPos blockpos1 = blockpos.up(this.leafDistanceLimit);

                    if (this.checkBlockLine(blockpos, blockpos1) == -1) {
                        int i1 = this.basePos.getX() - blockpos.getX();
                        int j1 = this.basePos.getZ() - blockpos.getZ();
                        double d4 = (double)blockpos.getY() - Math.sqrt((double)(i1 * i1 + j1 * j1)) * this.branchSlope;
                        int k1 = d4 > (double)j ? j : (int)d4;
                        BlockPos blockpos2 = new BlockPos(this.basePos.getX(), k1, this.basePos.getZ());

                        if (this.checkBlockLine(blockpos2, blockpos) == -1) {
                            this.foliageCoords.add(new TreeQuercusRobur.FoliageCoordinates(blockpos, blockpos2.getY()));
                        }
                    }
                }
            }
        }
    }

    void crossSection(BlockPos pos, float leafSize, IBlockState leafBlock) {

        int i = (int)((double)leafSize + 0.618D);

        for (int j = -i; j <= i; ++j) {
            for (int k = -i; k <= i; ++k) {
                if (Math.pow((double)Math.abs(j) + 0.5D, 2.0D) + Math.pow((double)Math.abs(k) + 0.5D, 2.0D) <= (double)(leafSize * leafSize)) {
                    BlockPos blockpos = pos.add(j, 0, k);
                    IBlockState state = this.world.getBlockState(blockpos);

                    if (state.getBlock().isAir(state, world, blockpos) || state.getBlock().isLeaves(state, world, blockpos)) {
                        this.setBlockAndNotifyAdequately(this.world, blockpos, leafBlock);
                    }
                }
            }
        }
    }

    float layerSize(int y) {

        if ((float)y < (float)this.heightLimit * 0.3F) {
            return -1.0F;
        }
        else {
            float f = (float)this.heightLimit / 2.0F;
            float f1 = f - (float)y;
            float f2 = MathHelper.sqrt_float(f * f - f1 * f1);

            if (f1 == 0.0F) {
                f2 = f;
            }
            else if (Math.abs(f1) >= f) {
                return 0.0F;
            }

            return f2 * 0.5F;
        }
    }

    float leafSize(int y) {

        return y >= 0 && y < this.leafDistanceLimit ? (y != 0 && y != this.leafDistanceLimit - 1 ? 3.0F : 2.0F) : -1.0F;
    }

    void generateLeafNode(BlockPos pos) {

        for (int i = 0; i < this.leafDistanceLimit; ++i) {
            if (!this.noLeaves) {
                this.crossSection(pos.up(i), this.leafSize(i), this.leavesBlock.withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false)));
            }
        }
    }

    void limb(BlockPos p_175937_1_, BlockPos p_175937_2_, IBlockState p_175937_3_) {

        BlockPos blockpos = p_175937_2_.add(-p_175937_1_.getX(), -p_175937_1_.getY(), -p_175937_1_.getZ());
        int i = this.getGreatestDistance(blockpos);
        float f = (float)blockpos.getX() / (float)i;
        float f1 = (float)blockpos.getY() / (float)i;
        float f2 = (float)blockpos.getZ() / (float)i;

        for (int j = 0; j <= i; ++j) {
            BlockPos blockpos1 = p_175937_1_.add((double)(0.5F + (float)j * f), (double)(0.5F + (float)j * f1), (double)(0.5F + (float)j * f2));
            BlockLog.EnumAxis blocklog$enumaxis = this.getLogAxis(p_175937_1_, blockpos1);
            this.setBlockAndNotifyAdequately(this.world, blockpos1, p_175937_3_.withProperty(BlockLog.LOG_AXIS, blocklog$enumaxis));
        }
    }

    private int getGreatestDistance(BlockPos posIn) {

        int i = MathHelper.abs_int(posIn.getX());
        int j = MathHelper.abs_int(posIn.getY());
        int k = MathHelper.abs_int(posIn.getZ());
        return k > i && k > j ? k : (j > i ? j : i);
    }

    private BlockLog.EnumAxis getLogAxis(BlockPos p_175938_1_, BlockPos p_175938_2_) {

        BlockLog.EnumAxis blocklog$enumaxis = BlockLog.EnumAxis.Y;
        int i = Math.abs(p_175938_2_.getX() - p_175938_1_.getX());
        int j = Math.abs(p_175938_2_.getZ() - p_175938_1_.getZ());
        int k = Math.max(i, j);

        if (k > 0) {
            if (i == k) {
                blocklog$enumaxis = BlockLog.EnumAxis.X;
            }
            else if (j == k) {
                blocklog$enumaxis = BlockLog.EnumAxis.Z;
            }
        }

        return blocklog$enumaxis;
    }

    void generateLeaves() {

        for (TreeQuercusRobur.FoliageCoordinates worldgenbigtree$foliagecoordinates : this.foliageCoords) {
            this.generateLeafNode(worldgenbigtree$foliagecoordinates);
        }
    }

    boolean leafNodeNeedsBase(int p_76493_1_) {

        return (double)p_76493_1_ >= (double)this.heightLimit * 0.2D;
    }

    void generateTrunk() {

        BlockPos blockpos = this.basePos;
        BlockPos blockpos1 = this.basePos.up(this.height);
        IBlockState block = this.logBlock;
        this.limb(blockpos, blockpos1, block);

        switch (this.trunkType) {
            case THICK:
                this.limb(blockpos.east(), blockpos1.east(), block);
                this.limb(blockpos.east().south(), blockpos1.east().south(), block);
                this.limb(blockpos.south(), blockpos1.south(), block);
                break;

            default:
                break;
        }
    }

    void generateLeafNodeBases() {

        for (TreeQuercusRobur.FoliageCoordinates worldgenbigtree$foliagecoordinates : this.foliageCoords) {
            int i = worldgenbigtree$foliagecoordinates.getBranchBase();
            BlockPos blockpos = new BlockPos(this.basePos.getX(), i, this.basePos.getZ());

            if (!blockpos.equals(worldgenbigtree$foliagecoordinates) && this.leafNodeNeedsBase(i - this.basePos.getY())) {
                this.limb(blockpos, worldgenbigtree$foliagecoordinates, this.logBlock);
            }
        }
    }

    int checkBlockLine(BlockPos posOne, BlockPos posTwo) {

        BlockPos blockpos = posTwo.add(-posOne.getX(), -posOne.getY(), -posOne.getZ());
        int i = this.getGreatestDistance(blockpos);
        float f = (float)blockpos.getX() / (float)i;
        float f1 = (float)blockpos.getY() / (float)i;
        float f2 = (float)blockpos.getZ() / (float)i;

        if (i == 0) {
            return -1;
        }
        else {
            for (int j = 0; j <= i; ++j) {
                BlockPos blockpos1 = posOne.add((double)(0.5F + (float)j * f), (double)(0.5F + (float)j * f1), (double)(0.5F + (float)j * f2));

                if (!this.isReplaceable(world, blockpos1)) {
                    return j;
                }
            }

            return -1;
        }
    }

    public void setDecorationDefaults() {

        this.leafDistanceLimit = 5;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {

        this.world = worldIn;
        this.basePos = position;
        this.rand = new Random(rand.nextLong());

        if (this.heightLimit == 0) {
            this.heightLimit = 5 + this.rand.nextInt(this.heightLimitLimit);
        }

        if (!this.validTreeLocation()) {
            this.world = null; //Fix vanilla Mem leak, holds latest world
            return false;
        }
        else {
            this.generateLeafNodeList();
            this.generateLeaves();
            this.generateTrunk();
            this.generateLeafNodeBases();
            this.world = null; //Fix vanilla Mem leak, holds latest world
            return true;
        }
    }

    private boolean validTreeLocation() {

        BlockPos down = this.basePos.down();
        net.minecraft.block.state.IBlockState state = this.world.getBlockState(down);
        boolean isSoil = state.getBlock().canSustainPlant(state, this.world, down, net.minecraft.util.EnumFacing.UP, ((net.minecraft.block.BlockSapling)Blocks.SAPLING));

        if (!isSoil) {
            return false;
        }
        else {
            int i = this.checkBlockLine(this.basePos, this.basePos.up(this.heightLimit - 1));

            if (i == -1) {
                return true;
            }
            else if (i < 6) {
                return false;
            }
            else {
                this.heightLimit = i;
                return true;
            }
        }
    }

    static class FoliageCoordinates extends BlockPos {

        private final int branchBase;

        public FoliageCoordinates(BlockPos pos, int branchBase) {

            super(pos.getX(), pos.getY(), pos.getZ());
            this.branchBase = branchBase;
        }

        public int getBranchBase() {

            return this.branchBase;
        }
    }

    public enum TrunkType {
        THIN,
        THICK;
    }
}
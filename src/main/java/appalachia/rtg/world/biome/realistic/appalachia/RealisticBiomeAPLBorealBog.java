package appalachia.rtg.world.biome.realistic.appalachia;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.api.AppalachiaBlocks;

import rtg.config.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.util.CellNoise;
import rtg.util.CliffCalculator;
import rtg.util.OpenSimplexNoise;
import rtg.world.biome.deco.DecoFallenTree;
import rtg.world.biome.deco.DecoGrass;
import rtg.world.biome.deco.DecoShrub;
import rtg.world.biome.deco.DecoTree;
import rtg.world.biome.deco.DecoTree.TreeType;
import rtg.world.gen.feature.tree.rtg.TreeRTG;
import rtg.world.gen.feature.tree.rtg.TreeRTGPiceaPungens;
import rtg.world.gen.surface.SurfaceBase;
import rtg.world.gen.terrain.HeightEffect;
import rtg.world.gen.terrain.HeightVariation;
import rtg.world.gen.terrain.JitterEffect;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBorealBog extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.borealBog;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLBorealBog() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBorealBog();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLBorealBog(config, biome.topBlock, biome.fillerBlock);
    }

    public class SurfaceAPLBorealBog extends SurfaceBase {

        public SurfaceAPLBorealBog(BiomeConfig config, IBlockState top, IBlockState filler) {

            super(config, top, filler);
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int y, int depth, World world, Random rand,
                                 OpenSimplexNoise simplex, CellNoise cell, float[] noise, float river, Biome[] base) {

            float c = CliffCalculator.calc(x, y, noise);
            boolean cliff = c > 1.4f ? true : false;

            for (int k = 255; k > -1; k--) {
                Block b = primer.getBlockState(x, k, y).getBlock();
                if (b == Blocks.AIR) {
                    depth = -1;
                }
                else if (b == Blocks.STONE) {
                    depth++;

                    if (cliff) {
                        if (depth > -1 && depth < 2) {
                            if (rand.nextInt(3) == 0) {

                                primer.setBlockState(x, k, y, hcCobble(world, i, j, x, y, k));
                            }
                            else {

                                primer.setBlockState(x, k, y, hcStone(world, i, j, x, y, k));
                            }
                        }
                        else if (depth < 10) {
                            primer.setBlockState(x, k, y, hcStone(world, i, j, x, y, k));
                        }
                    }
                    else {
                        if (depth == 0 && k > 61) {
                            primer.setBlockState(x, k, y, topBlock);
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, y, fillerBlock);
                        }
                    }
                }
            }
        }
    }

    public class TerrainAPLBorealBog extends TerrainBase {

        private HeightEffect height;

        public TerrainAPLBorealBog() {

            HeightVariation waterLand = new HeightVariation();
            waterLand.height = 1f;
            waterLand.wavelength = 40f;
            waterLand.octave = 0;

            height = new JitterEffect(5f, 10f, waterLand);

        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            return 62f + height.added(simplex, cell, x, y);
        }
    }

    @Override
    public void initDecos() {

        TreeRTG bogSpruce = new TreeRTGPiceaPungens();
        bogSpruce.logBlock = AppalachiaBlocks.log_red_elm_01.getDefaultState();
        bogSpruce.leavesBlock = Blocks.LEAVES.getDefaultState();
        bogSpruce.minTrunkSize = 4;
        bogSpruce.maxTrunkSize = 8;
        bogSpruce.minCrownSize = 8;
        bogSpruce.maxCrownSize = 12;
        DecoTree decoBogSpruce = new DecoTree(bogSpruce);
        decoBogSpruce.strengthFactorForLoops = 3f;
        decoBogSpruce.treeType = TreeType.RTG_TREE;
        decoBogSpruce.distribution.noiseDivisor = 100f;
        decoBogSpruce.distribution.noiseFactor = 6f;
        decoBogSpruce.distribution.noiseAddend = 0.8f;
        decoBogSpruce.treeCondition = DecoTree.TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE;
        decoBogSpruce.treeConditionNoise = 0.2f;
        decoBogSpruce.treeConditionChance = 1;
        decoBogSpruce.maxY = 80;
        this.addDeco(decoBogSpruce);

        TreeRTG ponderosaTree = new TreeRTGPiceaPungens();
        ponderosaTree.logBlock = AppalachiaBlocks.log_red_elm_01.getDefaultState();
        ponderosaTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        ponderosaTree.minTrunkSize = 4;
        ponderosaTree.maxTrunkSize = 8;
        ponderosaTree.minCrownSize = 8;
        ponderosaTree.maxCrownSize = 12;
        ponderosaTree.noLeaves = true;
        this.addTree(ponderosaTree);
        DecoTree deadPineTree = new DecoTree(ponderosaTree);
        deadPineTree.treeType = DecoTree.TreeType.RTG_TREE;
        deadPineTree.treeCondition = DecoTree.TreeCondition.RANDOM_CHANCE;
        deadPineTree.treeConditionChance = 18;
        deadPineTree.maxY = 100;
        this.addDeco(deadPineTree);

        DecoShrub decoShrub = new DecoShrub();
        decoShrub.maxY = 100;
        decoShrub.strengthFactor = 3f;
        this.addDeco(decoShrub);

        DecoFallenTree decoFallenTree = new DecoFallenTree();
        decoFallenTree.distribution.noiseDivisor = 80f;
        decoFallenTree.distribution.noiseFactor = 60f;
        decoFallenTree.distribution.noiseAddend = -15f;
        decoFallenTree.logCondition = DecoFallenTree.LogCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        decoFallenTree.logConditionNoise = 0f;
        decoFallenTree.logConditionChance = 6;
        decoFallenTree.logBlock = BlockUtil.getStateLog2(1);
        decoFallenTree.leavesBlock = BlockUtil.getStateLeaf2(1);
        decoFallenTree.minSize = 3;
        decoFallenTree.maxSize = 6;
        this.addDeco(decoFallenTree, this.getConfig().ALLOW_LOGS.get());

        DecoGrass decoGrass = new DecoGrass();
        decoGrass.maxY = 128;
        decoGrass.strengthFactor = 12f;
        this.addDeco(decoGrass);
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(Biomes.BEACH);
    }
}

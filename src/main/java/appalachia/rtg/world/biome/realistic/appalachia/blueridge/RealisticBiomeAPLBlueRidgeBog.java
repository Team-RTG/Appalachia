package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import appalachia.api.AppalachiaBiomes;
import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAcerRubrum;

import rtg.config.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.util.CellNoise;
import rtg.util.CliffCalculator;
import rtg.util.OpenSimplexNoise;
import rtg.world.biome.deco.*;
import rtg.world.biome.deco.DecoFallenTree.LogCondition;
import rtg.world.biome.deco.DecoTree.TreeCondition;
import rtg.world.biome.deco.DecoTree.TreeType;
import rtg.world.biome.deco.helper.DecoHelper5050;
import rtg.world.biome.deco.helper.DecoHelperRandomSplit;
import rtg.world.gen.feature.tree.rtg.TreeRTG;
import rtg.world.gen.feature.tree.rtg.TreeRTGBetulaPapyrifera;
import rtg.world.gen.feature.tree.rtg.TreeRTGPiceaSitchensis;
import rtg.world.gen.feature.tree.rtg.TreeRTGPinusPonderosa;
import rtg.world.gen.surface.SurfaceBase;
import rtg.world.gen.terrain.HeightEffect;
import rtg.world.gen.terrain.HeightVariation;
import rtg.world.gen.terrain.JitterEffect;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeBog extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeBog;
    public static Biome river = Biomes.RIVER;

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public RealisticBiomeAPLBlueRidgeBog() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

        this.getConfig().addProperty(this.getConfig().ALLOW_LOGS).set(true);
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeBog();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLBlueRidgeBog(config, biome.topBlock, biome.fillerBlock);
    }

    public class SurfaceAPLBlueRidgeBog extends SurfaceBase {

        public SurfaceAPLBlueRidgeBog(BiomeConfig config, IBlockState top, IBlockState filler) {

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

    public class TerrainAPLBlueRidgeBog extends TerrainBase {

        private HeightEffect height;

        public TerrainAPLBlueRidgeBog() {

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

        AppalachiaTree aplRedMaple = new TreeAcerRubrum();
        aplRedMaple.logBlock = AppalachiaBlocks.log_red_maple_01.getDefaultState();
        aplRedMaple.leavesBlock = Blocks.LEAVES.getDefaultState();
        aplRedMaple.minTrunkSize = 4;
        aplRedMaple.maxTrunkSize = 8;
        aplRedMaple.minCrownSize = 8;
        aplRedMaple.maxCrownSize = 12;
        DecoTree oakMaple = new DecoTree(aplRedMaple);
        oakMaple.loops = 1;
        oakMaple.treeType = TreeType.RTG_TREE;
        oakMaple.distribution.noiseDivisor = 100f;
        oakMaple.distribution.noiseFactor = 6f;
        oakMaple.distribution.noiseAddend = 0.8f;
        oakMaple.treeCondition = TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE;
        oakMaple.treeConditionNoise = 0.2f;
        oakMaple.treeConditionChance = 1;
        oakMaple.maxY = treeMaxY;
        this.addDeco(oakMaple);

        TreeRTG papyriferaTreeOak = new TreeRTGBetulaPapyrifera();
        papyriferaTreeOak.logBlock = AppalachiaBlocks.log_white_pine_01.getDefaultState();
        papyriferaTreeOak.leavesBlock = Blocks.LEAVES.getDefaultState();
        papyriferaTreeOak.minTrunkSize = 4;
        papyriferaTreeOak.maxTrunkSize = 8;
        papyriferaTreeOak.minCrownSize = 6;
        papyriferaTreeOak.maxCrownSize = 16;
        this.addTree(papyriferaTreeOak);
        DecoTree paperOak = new DecoTree(papyriferaTreeOak);
        paperOak.strengthFactorForLoops = 8f;
        paperOak.treeType = TreeType.RTG_TREE;
        paperOak.treeCondition = TreeCondition.RANDOM_CHANCE;
        paperOak.treeConditionChance = 1;
        paperOak.maxY = treeMaxY;
        TreeRTG papyriferaTreeSpruce = new TreeRTGBetulaPapyrifera();
        papyriferaTreeSpruce.logBlock = AppalachiaBlocks.log_tulip_poplar_01.getDefaultState();
        papyriferaTreeSpruce.leavesBlock = BlockUtil.getStateLeaf(3);
        papyriferaTreeSpruce.minTrunkSize = 4;
        papyriferaTreeSpruce.maxTrunkSize = 8;
        papyriferaTreeSpruce.minCrownSize = 6;
        papyriferaTreeSpruce.maxCrownSize = 16;
        this.addTree(papyriferaTreeSpruce);
        DecoTree paperSpruce = new DecoTree(papyriferaTreeSpruce);
        paperSpruce.strengthFactorForLoops = 8f;
        paperSpruce.treeType = TreeType.RTG_TREE;
        paperSpruce.treeCondition = TreeCondition.RANDOM_CHANCE;
        paperSpruce.treeConditionChance = 1;
        paperSpruce.maxY = treeMaxY;
        DecoHelper5050 decoPaper = new DecoHelper5050(paperOak, paperSpruce);
        this.addDeco(decoPaper);

        TreeRTG ponderosaOakTree = new TreeRTGPinusPonderosa();
        ponderosaOakTree.logBlock = AppalachiaBlocks.log_black_locust_01.getDefaultState();
        ponderosaOakTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        ponderosaOakTree.minTrunkSize = 11;
        ponderosaOakTree.maxTrunkSize = 21;
        ponderosaOakTree.minCrownSize = 15;
        ponderosaOakTree.maxCrownSize = 29;
        this.addTree(ponderosaOakTree);
        DecoTree oakPines = new DecoTree(ponderosaOakTree);
        oakPines.strengthFactorForLoops = 10f;
        oakPines.treeType = TreeType.RTG_TREE;
        oakPines.distribution.noiseDivisor = 100f;
        oakPines.distribution.noiseFactor = 6f;
        oakPines.distribution.noiseAddend = 0.8f;
        oakPines.treeCondition = TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE;
        oakPines.treeConditionNoise = 0.2f;
        oakPines.treeConditionChance = 1;
        oakPines.maxY = 85;
        TreeRTG ponderosaChestnutTree = new TreeRTGPinusPonderosa();
        ponderosaChestnutTree.logBlock = AppalachiaBlocks.log_honey_locust_01.getDefaultState();
        ponderosaChestnutTree.leavesBlock = Blocks.LEAVES.getStateFromMeta(3);
        ponderosaChestnutTree.minTrunkSize = 11;
        ponderosaChestnutTree.maxTrunkSize = 21;
        ponderosaChestnutTree.minCrownSize = 15;
        ponderosaChestnutTree.maxCrownSize = 29;
        this.addTree(ponderosaChestnutTree);
        DecoTree chestnutPines = new DecoTree(ponderosaChestnutTree);
        chestnutPines.strengthFactorForLoops = 10f;
        chestnutPines.treeType = TreeType.RTG_TREE;
        chestnutPines.distribution.noiseDivisor = 100f;
        chestnutPines.distribution.noiseFactor = 6f;
        chestnutPines.distribution.noiseAddend = 0.8f;
        chestnutPines.treeCondition = TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE;
        chestnutPines.treeConditionNoise = 0.2f;
        chestnutPines.treeConditionChance = 1;
        chestnutPines.maxY = 85;
        DecoHelper5050 decoPines = new DecoHelper5050(oakPines, chestnutPines);
        this.addDeco(decoPines);

        TreeRTG sitchensisTree = new TreeRTGPiceaSitchensis();
        sitchensisTree.logBlock = AppalachiaBlocks.log_hackberry_01.getDefaultState();
        sitchensisTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        sitchensisTree.minTrunkSize = 4;
        sitchensisTree.maxTrunkSize = 10;
        sitchensisTree.minCrownSize = 6;
        sitchensisTree.maxCrownSize = 14;
        this.addTree(sitchensisTree);
        DecoTree oakPine = new DecoTree(sitchensisTree);
        oakPine.strengthFactorForLoops = 8f;
        oakPine.treeType = TreeType.RTG_TREE;
        oakPine.treeCondition = TreeCondition.RANDOM_CHANCE;
        oakPine.treeConditionChance = 1;
        oakPine.maxY = treeMaxY;
        WorldGenerator vanillaTreeDefinition = new WorldGenTrees(false);
        DecoTree vanillaTrees = new DecoTree(vanillaTreeDefinition);
        vanillaTrees.strengthFactorForLoops = 3f;
        vanillaTrees.treeType = TreeType.WORLDGEN;
        vanillaTrees.treeCondition = TreeCondition.RANDOM_CHANCE;
        vanillaTrees.treeConditionChance = 2;
        vanillaTrees.maxY = treeMaxY;
        DecoHelperRandomSplit decoHelperRandomSplit = new DecoHelperRandomSplit();
        decoHelperRandomSplit.decos = new DecoBase[]{oakPine, vanillaTrees};
        decoHelperRandomSplit.chances = new int[]{12, 4};
        this.addDeco(decoHelperRandomSplit);

        // Add some fallen trees of the oak and spruce variety (50/50 distribution).
        DecoFallenTree decoFallenOak = new DecoFallenTree();
        decoFallenOak.logCondition = LogCondition.RANDOM_CHANCE;
        decoFallenOak.logConditionChance = 16;
        decoFallenOak.maxY = 80;
        decoFallenOak.logBlock = AppalachiaBlocks.log_yellow_birch_01.getDefaultState();
        decoFallenOak.leavesBlock = Blocks.LEAVES.getDefaultState();
        decoFallenOak.minSize = 3;
        decoFallenOak.maxSize = 6;
        DecoFallenTree decoFallenSpruce = new DecoFallenTree();
        decoFallenSpruce.logCondition = LogCondition.RANDOM_CHANCE;
        decoFallenSpruce.logConditionChance = 24;
        decoFallenSpruce.maxY = 80;
        decoFallenSpruce.logBlock = AppalachiaBlocks.log_river_birch_01.getDefaultState();
        decoFallenSpruce.leavesBlock = Blocks.LEAVES.getDefaultState();
        decoFallenSpruce.minSize = 3;
        decoFallenSpruce.maxSize = 6;
        DecoHelper5050 decoFallenTree = new DecoHelper5050(decoFallenOak, decoFallenSpruce);
        this.addDeco(decoFallenTree, this.getConfig().ALLOW_LOGS.get());

        // Shrubs to fill in the blanks.
        DecoShrub decoShrubOak = new DecoShrub();
        decoShrubOak.size = 1;
        decoShrubOak.minY = 64;
        decoShrubOak.maxY = shrubMaxY;
        decoShrubOak.strengthFactor = 8f;
        decoShrubOak.chance = 2;
        this.addDeco(decoShrubOak);

        DecoBoulder decoBoulder1 = new DecoBoulder();
        decoBoulder1.boulderBlock = Blocks.COBBLESTONE.getDefaultState();
        decoBoulder1.maxY = 80;
        decoBoulder1.chance = 16;
        decoBoulder1.strengthFactor = 1f;
        this.addDeco(decoBoulder1);

        // Fallen leaves.
        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlocks.leaves_oak_fallen.getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
        decoFallenLeaves.loops = 8;
        this.addDeco(decoFallenLeaves);

        // Very rare 2-block-tall flowers. (TODO: Replace these with Appalachian flora.)
        DecoFlowersRTG decoFlowers2 = new DecoFlowersRTG();
        decoFlowers2.flowers = new int[]{12, 13};
        decoFlowers2.minY = 63;
        decoFlowers2.maxY = 180;
        decoFlowers2.loops = 3;
        this.addDeco(decoFlowers2);

        // Ferns.
        DecoGrass decoFern = new DecoGrass(2);
        decoFern.minY = 63;
        decoFern.maxY = shrubMaxY;
        decoFern.loops = 2;
        this.addDeco(decoFern);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.minY = 63;
        decoGrass.maxY = shrubMaxY;
        decoGrass.strengthFactor = 12f;
        this.addDeco(decoGrass);
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

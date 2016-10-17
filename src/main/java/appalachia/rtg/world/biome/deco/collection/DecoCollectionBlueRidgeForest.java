package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAbiesGrandis;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAcerRubrum;

import rtg.world.biome.deco.*;
import rtg.world.biome.deco.DecoFallenTree.LogCondition;
import rtg.world.biome.deco.DecoTree.TreeCondition;
import rtg.world.biome.deco.DecoTree.TreeType;
import rtg.world.biome.deco.collection.DecoCollectionBase;
import rtg.world.biome.deco.helper.DecoHelper5050;
import rtg.world.biome.deco.helper.DecoHelperRandomSplit;
import rtg.world.gen.feature.tree.rtg.TreeRTG;
import rtg.world.gen.feature.tree.rtg.TreeRTGPiceaSitchensis;
import rtg.world.gen.feature.tree.rtg.TreeRTGPinusPonderosa;


/**
 * @author WhichOnesPink
 */
public class DecoCollectionBlueRidgeForest extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionBlueRidgeForest(boolean fallenTrees) {

        AppalachiaTree aplGrandFirTreeOak = new TreeAbiesGrandis();
        aplGrandFirTreeOak.logBlock = Blocks.LOG.getDefaultState();
        aplGrandFirTreeOak.leavesBlock = Blocks.LEAVES.getDefaultState();
        aplGrandFirTreeOak.minTrunkSize = 10;
        aplGrandFirTreeOak.maxTrunkSize = 20;
        aplGrandFirTreeOak.minCrownSize = 15;
        aplGrandFirTreeOak.maxCrownSize = 30;
        DecoTree oakFir = new DecoTree(aplGrandFirTreeOak);
        oakFir.loops = 1;
        oakFir.treeType = TreeType.RTG_TREE;
        oakFir.distribution.noiseDivisor = 100f;
        oakFir.distribution.noiseFactor = 6f;
        oakFir.distribution.noiseAddend = 0.8f;
        oakFir.treeCondition = TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        oakFir.treeConditionNoise = 0f;
        oakFir.treeConditionChance = 1;
        oakFir.maxY = treeMaxY;

        AppalachiaTree aplGrandFirTreeChestnut = new TreeAbiesGrandis();
        aplGrandFirTreeChestnut.logBlock = AppalachiaBlocks.log_oak_30_30.getDefaultState();
        aplGrandFirTreeChestnut.leavesBlock = Blocks.LEAVES.getStateFromMeta(3);
        aplGrandFirTreeChestnut.minTrunkSize = 10;
        aplGrandFirTreeChestnut.maxTrunkSize = 20;
        aplGrandFirTreeChestnut.minCrownSize = 15;
        aplGrandFirTreeChestnut.maxCrownSize = 30;
        DecoTree chestnutFir = new DecoTree(aplGrandFirTreeChestnut);
        chestnutFir.loops = 1;
        chestnutFir.treeType = TreeType.RTG_TREE;
        chestnutFir.distribution.noiseDivisor = 100f;
        chestnutFir.distribution.noiseFactor = 6f;
        chestnutFir.distribution.noiseAddend = 0.8f;
        chestnutFir.treeCondition = TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        chestnutFir.treeConditionNoise = -0.8f;
        chestnutFir.treeConditionChance = 2;
        chestnutFir.maxY = treeMaxY;
        DecoHelper5050 firTrees = new DecoHelper5050(oakFir, chestnutFir);
        this.addDeco(firTrees);

        AppalachiaTree aplRedMaple = new TreeAcerRubrum();
        aplRedMaple.logBlock = Blocks.LOG.getDefaultState();
        aplRedMaple.leavesBlock = Blocks.LEAVES.getDefaultState();
        aplRedMaple.minTrunkSize = 4;
        aplRedMaple.maxTrunkSize = 8;
        aplRedMaple.minCrownSize = 8;
        aplRedMaple.maxCrownSize = 12;
        DecoTree oakMaple = new DecoTree(aplRedMaple);
        oakMaple.loops = 1;
        oakMaple.treeType = TreeType.RTG_TREE;
        oakMaple.distribution.noiseDivisor = 80f;
        oakMaple.distribution.noiseFactor = 60f;
        oakMaple.distribution.noiseAddend = -15f;
        oakMaple.treeCondition = TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE;
        oakMaple.treeConditionNoise = 0f;
        oakMaple.treeConditionChance = 2;
        oakMaple.maxY = treeMaxY;
        this.addDeco(oakMaple);

        TreeRTG ponderosaOakTree = new TreeRTGPinusPonderosa();
        ponderosaOakTree.logBlock = Blocks.LOG.getDefaultState();
        ponderosaOakTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        ponderosaOakTree.minTrunkSize = 11;
        ponderosaOakTree.maxTrunkSize = 21;
        ponderosaOakTree.minCrownSize = 15;
        ponderosaOakTree.maxCrownSize = 29;
        this.addTree(ponderosaOakTree);

        DecoTree oakPines = new DecoTree(ponderosaOakTree);
        oakPines.strengthFactorForLoops = 8f;
        oakPines.treeType = TreeType.RTG_TREE;
        oakPines.distribution.noiseDivisor = 100f;
        oakPines.distribution.noiseFactor = 6f;
        oakPines.distribution.noiseAddend = 0.8f;
        oakPines.treeCondition = TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        oakPines.treeConditionNoise = 0f;
        oakPines.treeConditionChance = 1;
        oakPines.maxY = 85;

        TreeRTG ponderosaChestnutTree = new TreeRTGPinusPonderosa();
        ponderosaChestnutTree.logBlock = AppalachiaBlocks.log_oak_40_30.getDefaultState();
        ponderosaChestnutTree.leavesBlock = Blocks.LEAVES.getStateFromMeta(3);
        ponderosaChestnutTree.minTrunkSize = 11;
        ponderosaChestnutTree.maxTrunkSize = 21;
        ponderosaChestnutTree.minCrownSize = 15;
        ponderosaChestnutTree.maxCrownSize = 29;
        this.addTree(ponderosaChestnutTree);

        DecoTree chestnutPines = new DecoTree(ponderosaChestnutTree);
        chestnutPines.strengthFactorForLoops = 8f;
        chestnutPines.treeType = TreeType.RTG_TREE;
        chestnutPines.distribution.noiseDivisor = 100f;
        chestnutPines.distribution.noiseFactor = 6f;
        chestnutPines.distribution.noiseAddend = 0.8f;
        chestnutPines.treeCondition = TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        chestnutPines.treeConditionNoise = 0f;
        chestnutPines.treeConditionChance = 1;
        chestnutPines.maxY = 85;

        DecoHelper5050 decoPines = new DecoHelper5050(oakPines, chestnutPines);
        this.addDeco(decoPines);

        TreeRTG sitchensisTree = new TreeRTGPiceaSitchensis();
        sitchensisTree.logBlock = Blocks.LOG.getDefaultState();
        sitchensisTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        sitchensisTree.minTrunkSize = 4;
        sitchensisTree.maxTrunkSize = 10;
        sitchensisTree.minCrownSize = 6;
        sitchensisTree.maxCrownSize = 14;
        this.addTree(sitchensisTree);
        DecoTree oakPine = new DecoTree(sitchensisTree);
        oakPine.strengthFactorForLoops = 4f;
        oakPine.treeType = TreeType.RTG_TREE;
        oakPine.treeCondition = TreeCondition.RANDOM_CHANCE;
        oakPine.treeConditionChance = 3;
        oakPine.maxY = treeMaxY;
        WorldGenerator vanillaTreeDefinition = new WorldGenTrees(false);
        DecoTree vanillaTrees = new DecoTree(vanillaTreeDefinition);
        vanillaTrees.strengthFactorForLoops = 2f;
        vanillaTrees.treeType = TreeType.WORLDGEN;
        vanillaTrees.treeCondition = TreeCondition.RANDOM_CHANCE;
        vanillaTrees.treeConditionChance = 4;
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
        decoFallenOak.logBlock = Blocks.LOG.getDefaultState();
        decoFallenOak.leavesBlock = Blocks.LEAVES.getDefaultState();
        decoFallenOak.minSize = 3;
        decoFallenOak.maxSize = 6;

        DecoFallenTree decoFallenSpruce = new DecoFallenTree();
        decoFallenSpruce.logCondition = LogCondition.RANDOM_CHANCE;
        decoFallenSpruce.logConditionChance = 24;
        decoFallenSpruce.maxY = 80;
        decoFallenSpruce.logBlock = Blocks.LOG.getDefaultState();
        decoFallenSpruce.leavesBlock = Blocks.LEAVES.getDefaultState();
        decoFallenSpruce.minSize = 3;
        decoFallenSpruce.maxSize = 6;

        DecoHelper5050 decoFallenTree = new DecoHelper5050(decoFallenOak, decoFallenSpruce);
        this.addDeco(decoFallenTree, fallenTrees);

        // Shrubs to fill in the blanks.
        DecoShrub decoShrubOak = new DecoShrub();
        decoShrubOak.size = 1;
        decoShrubOak.maxY = shrubMaxY;
        decoShrubOak.strengthFactor = 8f;
        decoShrubOak.chance = 2;
        this.addDeco(decoShrubOak);

        DecoBoulder decoBoulder1 = new DecoBoulder();
        decoBoulder1.boulderBlock = Blocks.MOSSY_COBBLESTONE.getDefaultState();
        decoBoulder1.maxY = 80;
        decoBoulder1.chance = 16;
        decoBoulder1.strengthFactor = 1f;
        this.addDeco(decoBoulder1);

        // Fallen leaves.
        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlocks.leaves_oak_fallen.getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
        decoFallenLeaves.loops = 5;
        this.addDeco(decoFallenLeaves);

        // Only 1-block-tall flowers so we can see the trees better.
        // And only white ones because they go with everything.
        DecoFlowersRTG decoFlowers1 = new DecoFlowersRTG();
        decoFlowers1.flowers = new int[]{3, 6};
        decoFlowers1.maxY = shrubMaxY;
        decoFlowers1.strengthFactor = 6f;
        this.addDeco(decoFlowers1);

        // Very rare 2-block-tall flowers. (TODO: Replace these with Appalachian flora.)
        DecoFlowersRTG decoFlowers2 = new DecoFlowersRTG();
        decoFlowers2.flowers = new int[]{11, 12, 13, 14};
        decoFlowers2.minY = 63;
        decoFlowers2.maxY = 180;
        decoFlowers2.loops = 6;
        this.addDeco(decoFlowers2);

        // Ferns.
        DecoGrass decoFern = new DecoGrass(2);
        decoFern.minY = 60;
        decoFern.maxY = shrubMaxY;
        decoFern.loops = 2;
        this.addDeco(decoFern);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.minY = 60;
        decoGrass.maxY = shrubMaxY;
        decoGrass.loops = 8;
        this.addDeco(decoGrass);
    }
}

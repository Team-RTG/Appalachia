package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.block.logs.AppalachiaBlockLog;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.rtg.world.biome.deco.DecoVines;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAcerRubrum;

import rtg.world.biome.deco.*;
import rtg.world.biome.deco.DecoFallenTree.LogCondition;
import rtg.world.biome.deco.DecoTree.TreeCondition;
import rtg.world.biome.deco.DecoTree.TreeType;
import rtg.world.biome.deco.collection.DecoCollectionBase;
import rtg.world.biome.deco.helper.DecoHelper5050;
import rtg.world.biome.deco.helper.DecoHelperRandomSplit;
import rtg.world.gen.feature.tree.rtg.TreeRTG;
import rtg.world.gen.feature.tree.rtg.TreeRTGBetulaPapyrifera;
import rtg.world.gen.feature.tree.rtg.TreeRTGPiceaSitchensis;
import rtg.world.gen.feature.tree.rtg.TreeRTGPinusPonderosa;


/**
 * @author WhichOnesPink
 */
public class DecoCollectionSmokyBog extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionSmokyBog(boolean fallenTrees) {

        AppalachiaTree aplRedMaple = new TreeAcerRubrum();
        aplRedMaple.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        aplRedMaple.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        papyriferaTreeOak.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        papyriferaTreeOak.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        papyriferaTreeSpruce.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        papyriferaTreeSpruce.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        ponderosaOakTree.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        ponderosaOakTree.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        ponderosaChestnutTree.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        ponderosaChestnutTree.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        sitchensisTree.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        sitchensisTree.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
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
        decoFallenSpruce.logBlock = AppalachiaBlockLog.getRandomLog().getDefaultState();
        decoFallenSpruce.leavesBlock = AppalachiaBlockLeaves.getRandomLeaves().getDefaultState();
        decoFallenSpruce.minSize = 3;
        decoFallenSpruce.maxSize = 6;
        DecoHelper5050 decoFallenTree = new DecoHelper5050(decoFallenOak, decoFallenSpruce);
        this.addDeco(decoFallenTree, fallenTrees);

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
        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlockLeavesFallen.getRandomFallenLeaves().getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
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

        // Poison ivy.
        DecoVines decoPoisonIvy = new DecoVines();
        decoPoisonIvy.vineBlock = AppalachiaBlocks.vine_poison_ivy_01;
        decoPoisonIvy.strengthFactor = 12f;
        decoPoisonIvy.propNorth = AppalachiaBlockVine.NORTH;
        decoPoisonIvy.propEast = AppalachiaBlockVine.EAST;
        decoPoisonIvy.propSouth = AppalachiaBlockVine.SOUTH;
        decoPoisonIvy.propWest = AppalachiaBlockVine.WEST;
        this.addDeco(decoPoisonIvy);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.minY = 63;
        decoGrass.maxY = shrubMaxY;
        decoGrass.strengthFactor = 16f;
        this.addDeco(decoGrass);
    }
}

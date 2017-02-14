package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.block.AppalachiaBlockPair;
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.block.logs.AppalachiaBlockLog;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAcerRubrum;

import rtg.api.world.deco.*;
import rtg.api.world.deco.collection.DecoCollectionBase;
import rtg.api.world.deco.helper.DecoHelper5050;
import rtg.api.world.deco.helper.DecoHelperRandomSplit;
import rtg.api.world.gen.feature.tree.rtg.TreeRTG;
import rtg.api.world.gen.feature.tree.rtg.TreeRTGBetulaPapyrifera;
import rtg.api.world.gen.feature.tree.rtg.TreeRTGPiceaSitchensis;
import rtg.api.world.gen.feature.tree.rtg.TreeRTGPinusPonderosa;


/**
 * @author WhichOnesPink
 */
public class DecoCollectionBlueRidgeBog extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;
    
    private static AppalachiaBlockPair redMaple = new AppalachiaBlockPair();
    private static AppalachiaBlockPair papyriferaOak = new AppalachiaBlockPair();
    private static AppalachiaBlockPair papyriferaSpruce = new AppalachiaBlockPair();
    private static AppalachiaBlockPair ponderosaOak = new AppalachiaBlockPair();
    private static AppalachiaBlockPair ponderosaChestnut = new AppalachiaBlockPair();
    private static AppalachiaBlockPair sitchensis = new AppalachiaBlockPair();
    
    public DecoCollectionBlueRidgeBog(boolean fallenTrees) {

        AppalachiaTree aplRedMaple = new TreeAcerRubrum();
        aplRedMaple.setLogBlock(redMaple.log);
        aplRedMaple.setLeavesBlock(redMaple.leaves);
        aplRedMaple.setMinTrunkSize(4);
        aplRedMaple.setMaxTrunkSize(8);
        aplRedMaple.setMinCrownSize(8);
        aplRedMaple.setMaxCrownSize(12);
        DecoTree oakMaple = new DecoTree(aplRedMaple);
        oakMaple.setLoops(1);
        oakMaple.setTreeType(DecoTree.TreeType.RTG_TREE);
        oakMaple.getDistribution().setNoiseDivisor(100f);
        oakMaple.getDistribution().setNoiseFactor(6f);
        oakMaple.getDistribution().setNoiseAddend(0.8f);
        oakMaple.setTreeCondition(DecoTree.TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE);
        oakMaple.setTreeConditionNoise(0.2f);
        oakMaple.setTreeConditionChance(1);
        oakMaple.setMaxY(treeMaxY);
        this.addDeco(oakMaple);

        TreeRTG papyriferaTreeOak = new TreeRTGBetulaPapyrifera();
        papyriferaTreeOak.setLogBlock(papyriferaOak.log);
        papyriferaTreeOak.setLeavesBlock(papyriferaOak.leaves);
        papyriferaTreeOak.setMinTrunkSize(4);
        papyriferaTreeOak.setMaxTrunkSize(8);
        papyriferaTreeOak.setMinCrownSize(6);
        papyriferaTreeOak.setMaxCrownSize(16);
        this.addTree(papyriferaTreeOak);
        DecoTree paperOak = new DecoTree(papyriferaTreeOak);
        paperOak.setStrengthFactorForLoops(8f);
        paperOak.setTreeType(DecoTree.TreeType.RTG_TREE);
        paperOak.setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE);
        paperOak.setTreeConditionChance(1);
        paperOak.setMaxY(treeMaxY);
        
        TreeRTG papyriferaTreeSpruce = new TreeRTGBetulaPapyrifera();
        papyriferaTreeSpruce.setLogBlock(papyriferaSpruce.log);
        papyriferaTreeSpruce.setLeavesBlock(papyriferaSpruce.leaves);
        papyriferaTreeSpruce.setMinTrunkSize(4);
        papyriferaTreeSpruce.setMaxTrunkSize(8);
        papyriferaTreeSpruce.setMinCrownSize(6);
        papyriferaTreeSpruce.setMaxCrownSize(16);
        this.addTree(papyriferaTreeSpruce);
        DecoTree paperSpruce = new DecoTree(papyriferaTreeSpruce);
        paperSpruce.setStrengthFactorForLoops(8f);
        paperSpruce.setTreeType(DecoTree.TreeType.RTG_TREE);
        paperSpruce.setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE);
        paperSpruce.setTreeConditionChance(1);
        paperSpruce.setMaxY(treeMaxY);
        DecoHelper5050 decoPaper = new DecoHelper5050(paperOak, paperSpruce);
        this.addDeco(decoPaper);

        TreeRTG ponderosaOakTree = new TreeRTGPinusPonderosa();
        ponderosaOakTree.setLogBlock(ponderosaOak.log);
        ponderosaOakTree.setLeavesBlock(ponderosaOak.leaves);
        ponderosaOakTree.setMinTrunkSize(11);
        ponderosaOakTree.setMaxTrunkSize(21);
        ponderosaOakTree.setMinCrownSize(15);
        ponderosaOakTree.setMaxCrownSize(29);
        this.addTree(ponderosaOakTree);
        DecoTree oakPines = new DecoTree(ponderosaOakTree);
        oakPines.setStrengthFactorForLoops(10f);
        oakPines.setTreeType(DecoTree.TreeType.RTG_TREE);
        oakPines.getDistribution().setNoiseDivisor(100f);
        oakPines.getDistribution().setNoiseFactor(6f);
        oakPines.getDistribution().setNoiseAddend(0.8f);
        oakPines.setTreeCondition(DecoTree.TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE);
        oakPines.setTreeConditionNoise(0.2f);
        oakPines.setTreeConditionChance(1);
        oakPines.setMaxY(85);
        TreeRTG ponderosaChestnutTree = new TreeRTGPinusPonderosa();
        ponderosaChestnutTree.setLogBlock(ponderosaChestnut.log);
        ponderosaChestnutTree.setLeavesBlock(ponderosaChestnut.leaves);
        ponderosaChestnutTree.setMinTrunkSize(11);
        ponderosaChestnutTree.setMaxTrunkSize(21);
        ponderosaChestnutTree.setMinCrownSize(15);
        ponderosaChestnutTree.setMaxCrownSize(29);
        this.addTree(ponderosaChestnutTree);
        DecoTree chestnutPines = new DecoTree(ponderosaChestnutTree);
        chestnutPines.setStrengthFactorForLoops(10f);
        chestnutPines.setTreeType(DecoTree.TreeType.RTG_TREE);
        chestnutPines.getDistribution().setNoiseDivisor(100f);
        chestnutPines.getDistribution().setNoiseFactor(6f);
        chestnutPines.getDistribution().setNoiseAddend(0.8f);
        chestnutPines.setTreeCondition(DecoTree.TreeCondition.NOISE_LESSER_AND_RANDOM_CHANCE);
        chestnutPines.setTreeConditionNoise(0.2f);
        chestnutPines.setTreeConditionChance(1);
        chestnutPines.setMaxY(85);
        DecoHelper5050 decoPines = new DecoHelper5050(oakPines, chestnutPines);
        this.addDeco(decoPines);

        TreeRTG sitchensisTree = new TreeRTGPiceaSitchensis();
        sitchensisTree.setLogBlock(sitchensis.log);
        sitchensisTree.setLeavesBlock(sitchensis.leaves);
        sitchensisTree.setMinTrunkSize(4);
        sitchensisTree.setMaxTrunkSize(10);
        sitchensisTree.setMinCrownSize(6);
        sitchensisTree.setMaxCrownSize(14);
        this.addTree(sitchensisTree);
        DecoTree oakPine = new DecoTree(sitchensisTree);
        oakPine.setStrengthFactorForLoops(8f);
        oakPine.setTreeType(DecoTree.TreeType.RTG_TREE);
        oakPine.setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE);
        oakPine.setTreeConditionChance(1);
        oakPine.setMaxY(treeMaxY);
        WorldGenerator vanillaTreeDefinition = new WorldGenTrees(false);
        DecoTree vanillaTrees = new DecoTree(vanillaTreeDefinition);
        vanillaTrees.setStrengthFactorForLoops(3f);
        vanillaTrees.setTreeType(DecoTree.TreeType.WORLDGEN);
        vanillaTrees.setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE);
        vanillaTrees.setTreeConditionChance(2);
        vanillaTrees.setMaxY(treeMaxY);
        DecoHelperRandomSplit decoHelperRandomSplit = new DecoHelperRandomSplit();
        decoHelperRandomSplit.decos = new DecoBase[]{oakPine, vanillaTrees};
        decoHelperRandomSplit.chances = new int[]{12, 4};
        this.addDeco(decoHelperRandomSplit);

        // Add some fallen trees of the oak and spruce variety (50/50 distribution).
        DecoFallenTree decoFallenOak = new DecoFallenTree();
        decoFallenOak.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
        decoFallenOak.setLogConditionChance(16);
        decoFallenOak.setMaxY(80);
        decoFallenOak.setLogBlock(AppalachiaBlocks.log_yellow_birch_01.getDefaultState());
        decoFallenOak.setLeavesBlock(Blocks.LEAVES.getDefaultState());
        decoFallenOak.setMinSize(3);
        decoFallenOak.setMaxSize(6);
        DecoFallenTree decoFallenSpruce = new DecoFallenTree();
        decoFallenSpruce.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
        decoFallenSpruce.setLogConditionChance(24);
        decoFallenSpruce.setMaxY(80);
        decoFallenSpruce.setLogBlock(AppalachiaBlockLog.getRandomLog().getDefaultState());
        decoFallenSpruce.setLeavesBlock(AppalachiaBlockLeaves.getRandomLeaves().getDefaultState());
        decoFallenSpruce.setMinSize(3);
        decoFallenSpruce.setMaxSize(6);
        DecoHelper5050 decoFallenTree = new DecoHelper5050(decoFallenOak, decoFallenSpruce);
        this.addDeco(decoFallenTree, fallenTrees);

        // Shrubs to fill in the blanks.
        DecoShrub decoShrubOak = new DecoShrub();
        decoShrubOak.setSize(1);
        decoShrubOak.setMinY(64);
        decoShrubOak.setMaxY(shrubMaxY);
        decoShrubOak.setStrengthFactor(8f);
        decoShrubOak.setChance(2);
        this.addDeco(decoShrubOak);

        DecoBoulder decoBoulder1 = new DecoBoulder();
        decoBoulder1.setBoulderBlock(Blocks.COBBLESTONE.getDefaultState());
        decoBoulder1.setMaxY(80);
        decoBoulder1.setChance(16);
        decoBoulder1.setStrengthFactor(1f);
        this.addDeco(decoBoulder1);

        // Fallen leaves.
        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlockLeavesFallen.getRandomFallenLeaves().getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
        decoFallenLeaves.setLoops(8);
        this.addDeco(decoFallenLeaves);

        // Very rare 2-block-tall flowers. (TODO: Replace these with Appalachian flora.)
        DecoFlowersRTG decoFlowers2 = new DecoFlowersRTG();
        decoFlowers2.setFlowers(new int[]{12, 13});
        decoFlowers2.setMinY(63);
        decoFlowers2.setMaxY(180);
        decoFlowers2.setLoops(3);
        this.addDeco(decoFlowers2);

        // Ferns.
        DecoGrass decoFern = new DecoGrass(2);
        decoFern.setMinY(63);
        decoFern.setMaxY(shrubMaxY);
        decoFern.setLoops(2);
        this.addDeco(decoFern);

        // Poison ivy.
        DecoVines decoPoisonIvy = new DecoVines();
        decoPoisonIvy.setVineBlock(AppalachiaBlocks.vine_poison_ivy_01);
        decoPoisonIvy.setStrengthFactor(12f);
        decoPoisonIvy.setPropNorth(AppalachiaBlockVine.NORTH);
        decoPoisonIvy.setPropEast(AppalachiaBlockVine.EAST);
        decoPoisonIvy.setPropSouth(AppalachiaBlockVine.SOUTH);
        decoPoisonIvy.setPropWest(AppalachiaBlockVine.WEST);
        this.addDeco(decoPoisonIvy);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.setMinY(63);
        decoGrass.setMaxY(shrubMaxY);
        decoGrass.setStrengthFactor(16f);
        this.addDeco(decoGrass);
    }
}

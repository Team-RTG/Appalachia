package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAbiesGrandis;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAcerRubrum;

import rtg.util.BlockUtil;
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
public class DecoCollectionSmokyForest extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionSmokyForest(boolean fallenTrees) {

        AppalachiaTree aplGrandFirTreeOak = new TreeAbiesGrandis();
        aplGrandFirTreeOak.logBlock = AppalachiaBlocks.log_red_oak_01.getDefaultState();
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
        oakFir.treeConditionNoise = -0.5f;
        oakFir.treeConditionChance = 2;
        oakFir.maxY = treeMaxY;
        AppalachiaTree aplGrandFirTreeChestnut = new TreeAbiesGrandis();
        aplGrandFirTreeChestnut.logBlock = AppalachiaBlocks.log_american_chestnut_01.getDefaultState();
        aplGrandFirTreeChestnut.leavesBlock = Blocks.LEAVES.getDefaultState();
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
        chestnutFir.treeConditionNoise = -0.5f;
        chestnutFir.treeConditionChance = 2;
        chestnutFir.maxY = treeMaxY;
        DecoHelper5050 firTrees = new DecoHelper5050(oakFir, chestnutFir);
        this.addDeco(firTrees);

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
        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlocks.leaves_oak_fallen.getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
        decoFallenLeaves.loops = 8;
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

        // A combo-deal of grass and vines. (This could probably be pulled out into individual decos.)
        DecoJungleGrassVines decoJungleGrassVines = new DecoJungleGrassVines();
        this.addDeco(decoJungleGrassVines);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.minY = 63;
        decoGrass.maxY = shrubMaxY;
        decoGrass.strengthFactor = 12f;
        this.addDeco(decoGrass);
    }
}

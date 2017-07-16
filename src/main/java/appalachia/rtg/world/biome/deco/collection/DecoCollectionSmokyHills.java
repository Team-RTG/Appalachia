package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.init.Blocks;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.block.logs.AppalachiaBlockLog;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.rtg.world.gen.feature.tree.rtg.*;

import rtg.api.config.BiomeConfig;
import rtg.api.world.deco.*;
import rtg.api.world.deco.collection.DecoCollectionBase;
import rtg.api.world.deco.helper.DecoHelper5050;


/**
 * @author WhichOnesPink
 * Loblolly Pine, White Oak, Flowering Dogwood, Black Walnut, Bitternut Hickory, American Chestnut,
 * Persimmon, Box Elder, Shortleaf Pine
 */
public class DecoCollectionSmokyHills extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionSmokyHills(BiomeConfig config) {

        super(config);

        // Loblolly Pine.
        AppalachiaTree treeLoblollyPine = new TreePinusTaeda();
        this.addTree(treeLoblollyPine);
        DecoTree decoLoblollyPine = new DecoTree(treeLoblollyPine);
        decoLoblollyPine.setMaxY(treeMaxY);
        this.addDeco(decoLoblollyPine);

        // White Oak.
        AppalachiaTree treeWhiteOak = new TreeQuercusAlba();
        this.addTree(treeWhiteOak);
        DecoTree decoWhiteOak = new DecoTree(treeWhiteOak);
        decoWhiteOak.setMaxY(treeMaxY);
        this.addDeco(decoWhiteOak);

        // Flowering Dogwood.
        AppalachiaTree treeFloweringDogwood = new TreeCornusFlorida();
        this.addTree(treeFloweringDogwood);
        DecoTree decoFloweringDogwood = new DecoTree(treeFloweringDogwood);
        decoFloweringDogwood.setMaxY(treeMaxY);
        this.addDeco(decoFloweringDogwood);

        // Black Walnut.
        AppalachiaTree treeBlackWalnut = new TreeJuglansNigra();
        this.addTree(treeBlackWalnut);
        DecoTree decoBlackWalnut = new DecoTree(treeBlackWalnut);
        decoBlackWalnut.setMaxY(treeMaxY);
        this.addDeco(decoBlackWalnut);

        // Bitternut Hickory.
        AppalachiaTree treeBitternutHickory = new TreeCaryaCordiformis();
        this.addTree(treeBitternutHickory);
        DecoTree decoBitternutHickory = new DecoTree(treeBitternutHickory);
        decoBitternutHickory.setMaxY(treeMaxY);
        this.addDeco(decoBitternutHickory);

        // American Chestnut.
        AppalachiaTree treeAmericanChestnut = new TreeCastaneaDentata();
        this.addTree(treeAmericanChestnut);
        DecoTree decoAmericanChestnut = new DecoTree(treeAmericanChestnut);
        decoAmericanChestnut.setMaxY(treeMaxY);
        this.addDeco(decoAmericanChestnut);

        // Persimmon.
        AppalachiaTree treePersimmon = new TreeDiospyrosVirginiana();
        this.addTree(treePersimmon);
        DecoTree decoPersimmon = new DecoTree(treePersimmon);
        decoPersimmon.setMaxY(treeMaxY);
        this.addDeco(decoPersimmon);

        // Box Elder.
        AppalachiaTree treeBoxElder = new TreeAcerNegundo();
        this.addTree(treeBoxElder);
        DecoTree decoBoxElder = new DecoTree(treeBoxElder);
        decoBoxElder.setMaxY(treeMaxY);
        this.addDeco(decoBoxElder);

        // Shortleaf Pine.
        AppalachiaTree treeShortleafPine = new TreePinusEchinata();
        this.addTree(treeShortleafPine);
        DecoTree decoShortleafPine = new DecoTree(treeShortleafPine);
        decoShortleafPine.setMaxY(treeMaxY);
        this.addDeco(decoShortleafPine);

        // Add some fallen trees of the oak and spruce variety (50/50 distribution).
        DecoFallenTree decoFallenOak = new DecoFallenTree();
        decoFallenOak.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
        decoFallenOak.setLogConditionChance(16);
        decoFallenOak.setMaxY(80);
        decoFallenOak.setLogBlock(AppalachiaBlockLog.getRandomLog().getDefaultState());
        decoFallenOak.setLeavesBlock(AppalachiaBlockLeaves.getRandomLeaves().getDefaultState());
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
        this.addDeco(decoFallenTree);

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

        // Only 1-block-tall flowers so we can see the trees better.
        // And only white ones because they go with everything.
        DecoFlowersRTG decoFlowers1 = new DecoFlowersRTG();
        decoFlowers1.setFlowers(new int[]{3, 6});
        decoFlowers1.setMaxY(shrubMaxY);
        decoFlowers1.setStrengthFactor(6f);
        this.addDeco(decoFlowers1);

        // Very rare 2-block-tall flowers. (TODO: Replace these with Appalachian flora.)
        DecoFlowersRTG decoFlowers2 = new DecoFlowersRTG();
        decoFlowers2.setFlowers(new int[]{12, 13});
        decoFlowers2.setMinY(63);
        decoFlowers2.setMaxY(180);
        decoFlowers2.setLoops(3);
        this.addDeco(decoFlowers2);

        // Poison ivy.
        DecoVines decoPoisonIvy = new DecoVines();
        decoPoisonIvy.setVineBlock(AppalachiaBlocks.vine_poison_ivy_01);
        decoPoisonIvy.setStrengthFactor(12f);
        decoPoisonIvy.setPropNorth(AppalachiaBlockVine.NORTH);
        decoPoisonIvy.setPropEast(AppalachiaBlockVine.EAST);
        decoPoisonIvy.setPropSouth(AppalachiaBlockVine.SOUTH);
        decoPoisonIvy.setPropWest(AppalachiaBlockVine.WEST);
        this.addDeco(decoPoisonIvy);
    }
}

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
 * Shagbark Hickory, Pignut Hickory, Tulip Poplar, Black Oak, Black Locust, American Chestnut,
 * Hophornbeam, Box Elder, White Pine
 */
public class DecoCollectionBlueRidgeMountains extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionBlueRidgeMountains(BiomeConfig config) {

        super(config);

        // Shagbark Hickory.
        AppalachiaTree treeShagbarkHickory = new TreeShagbarkHickory();
        this.addTree(treeShagbarkHickory);
        DecoTree decoShagbarkHickory = new DecoTree(treeShagbarkHickory);
        decoShagbarkHickory.setMaxY(treeMaxY);
        this.addDeco(decoShagbarkHickory);

        // Pignut Hickory.
        AppalachiaTree treePignutHickory = new TreePignutHickory();
        this.addTree(treePignutHickory);
        DecoTree decoPignutHickory = new DecoTree(treePignutHickory);
        decoPignutHickory.setMaxY(treeMaxY);
        this.addDeco(decoPignutHickory);

        // Tulip Poplar.
        AppalachiaTree treeTulipPoplar = new TreeTulipPoplar();
        this.addTree(treeTulipPoplar);
        DecoTree decoTulipPoplar = new DecoTree(treeTulipPoplar);
        decoTulipPoplar.setMaxY(treeMaxY);
        this.addDeco(decoTulipPoplar);

        // Black Oak.
        AppalachiaTree treeBlackOak = new TreeBlackOak();
        this.addTree(treeBlackOak);
        DecoTree decoBlackOak = new DecoTree(treeBlackOak);
        decoBlackOak.setMaxY(treeMaxY);
        this.addDeco(decoBlackOak);

        // Black Locust.
        AppalachiaTree treeBlackLocust = new TreeBlackLocust();
        this.addTree(treeBlackLocust);
        DecoTree decoBlackLocust = new DecoTree(treeBlackLocust);
        decoBlackLocust.setMaxY(treeMaxY);
        this.addDeco(decoBlackLocust);

        // American Chestnut.
        AppalachiaTree treeAmericanChestnut = new TreeAmericanChestnut();
        this.addTree(treeAmericanChestnut);
        DecoTree decoAmericanChestnut = new DecoTree(treeAmericanChestnut);
        decoAmericanChestnut.setMaxY(treeMaxY);
        this.addDeco(decoAmericanChestnut);

        // Hophornbeam.
        AppalachiaTree treeHophornbeam = new TreeHophornbeam();
        this.addTree(treeHophornbeam);
        DecoTree decoHophornbeam = new DecoTree(treeHophornbeam);
        decoHophornbeam.setMaxY(treeMaxY);
        this.addDeco(decoHophornbeam);

        // Box Elder.
        AppalachiaTree treeBoxElder = new TreeBoxElder();
        this.addTree(treeBoxElder);
        DecoTree decoBoxElder = new DecoTree(treeBoxElder);
        decoBoxElder.setMaxY(treeMaxY);
        this.addDeco(decoBoxElder);

        // White Pine.
        AppalachiaTree treeWhitePine = new TreeWhitePine();
        this.addTree(treeWhitePine);
        DecoTree decoWhitePine = new DecoTree(treeWhitePine);
        decoWhitePine.setMaxY(treeMaxY);
        this.addDeco(decoWhitePine);

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

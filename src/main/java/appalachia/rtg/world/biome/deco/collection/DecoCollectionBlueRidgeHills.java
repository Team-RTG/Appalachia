package appalachia.rtg.world.biome.deco.collection;

import appalachia.rtg.world.gen.feature.tree.rtg.*;

import rtg.api.world.deco.DecoTree;
import rtg.api.world.deco.collection.DecoCollectionBase;


/**
 * @author WhichOnesPink
 * White Oak, Red Elm, Red Oak, Sassafras, Black Oak, Bitternut Hickory, Black Cherry,
 * American Chestnut, White Walnut, White Pine
 */
public class DecoCollectionBlueRidgeHills extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public DecoCollectionBlueRidgeHills(boolean fallenTrees) {

        // White Oak.
        AppalachiaTree treeWhiteOak = new TreeQuercusAlba();
        this.addTree(treeWhiteOak);
        DecoTree decoWhiteOak = new DecoTree(treeWhiteOak);
        decoWhiteOak.setMaxY(treeMaxY);
        this.addDeco(decoWhiteOak);

        // Red Elm.
        AppalachiaTree treeRedElm = new TreeUlmusRubra();
        this.addTree(treeRedElm);
        DecoTree decoRedElm = new DecoTree(treeRedElm);
        decoRedElm.setMaxY(treeMaxY);
        this.addDeco(decoRedElm);

        // Red Oak.
        AppalachiaTree treeRedOak = new TreeQuercusRubra();
        this.addTree(treeRedOak);
        DecoTree decoRedOak = new DecoTree(treeRedOak);
        decoRedOak.setMaxY(treeMaxY);
        this.addDeco(decoRedOak);

        // Sassafras.
        AppalachiaTree treeSassafras = new TreeSassafrasAlbidum();
        this.addTree(treeSassafras);
        DecoTree decoSassafras = new DecoTree(treeSassafras);
        decoSassafras.setMaxY(treeMaxY);
        this.addDeco(decoSassafras);

        // Black Oak.
        AppalachiaTree treeBlackOak = new TreeQuercusVelutina();
        this.addTree(treeBlackOak);
        DecoTree decoBlackOak = new DecoTree(treeBlackOak);
        decoBlackOak.setMaxY(treeMaxY);
        this.addDeco(decoBlackOak);

        // Bitternut Hickory.
        AppalachiaTree treeBitternutHickory = new TreeCaryaCordiformis();
        this.addTree(treeBitternutHickory);
        DecoTree decoBitternutHickory = new DecoTree(treeBitternutHickory);
        decoBitternutHickory.setMaxY(treeMaxY);
        this.addDeco(decoBitternutHickory);

        // Black Cherry.
        AppalachiaTree treeBlackCherry = new TreePrunusSerotina();
        this.addTree(treeBlackCherry);
        DecoTree decoBlackCherry = new DecoTree(treeBlackCherry);
        decoBlackCherry.setMaxY(treeMaxY);
        this.addDeco(decoBlackCherry);

        // American Chestnut.
        AppalachiaTree treeAmericanChestnut = new TreeCastaneaDentata();
        this.addTree(treeAmericanChestnut);
        DecoTree decoAmericanChestnut = new DecoTree(treeAmericanChestnut);
        decoAmericanChestnut.setMaxY(treeMaxY);
        this.addDeco(decoAmericanChestnut);

        // White Walnut.
        AppalachiaTree treeWhiteWalnut = new TreeJuglansCinerea();
        this.addTree(treeWhiteWalnut);
        DecoTree decoWhiteWalnut = new DecoTree(treeWhiteWalnut);
        decoWhiteWalnut.setMaxY(treeMaxY);
        this.addDeco(decoWhiteWalnut);

        // White Pine.
        AppalachiaTree treeWhitePine = new TreePinusStrobus();
        this.addTree(treeWhitePine);
        DecoTree decoWhitePine = new DecoTree(treeWhitePine);
        decoWhitePine.setMaxY(treeMaxY);
        this.addDeco(decoWhitePine);

//        // Add some fallen trees of the oak and spruce variety (50/50 distribution).
//        DecoFallenTree decoFallenOak = new DecoFallenTree();
//        decoFallenOak.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
//        decoFallenOak.setLogConditionChance(16);
//        decoFallenOak.setMaxY(80);
//        decoFallenOak.setLogBlock(AppalachiaBlockLog.getRandomLog().getDefaultState());
//        decoFallenOak.setLeavesBlock(AppalachiaBlockLeaves.getRandomLeaves().getDefaultState());
//        decoFallenOak.setMinSize(3);
//        decoFallenOak.setMaxSize(6);
//        DecoFallenTree decoFallenSpruce = new DecoFallenTree();
//        decoFallenSpruce.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
//        decoFallenSpruce.setLogConditionChance(24);
//        decoFallenSpruce.setMaxY(80);
//        decoFallenSpruce.setLogBlock(AppalachiaBlockLog.getRandomLog().getDefaultState());
//        decoFallenSpruce.setLeavesBlock(AppalachiaBlockLeaves.getRandomLeaves().getDefaultState());
//        decoFallenSpruce.setMinSize(3);
//        decoFallenSpruce.setMaxSize(6);
//        DecoHelper5050 decoFallenTree = new DecoHelper5050(decoFallenOak, decoFallenSpruce);
//        this.addDeco(decoFallenTree, fallenTrees);
//
//        // Shrubs to fill in the blanks.
//        DecoShrub decoShrubOak = new DecoShrub();
//        decoShrubOak.setSize(1);
//        decoShrubOak.setMinY(64);
//        decoShrubOak.setMaxY(shrubMaxY);
//        decoShrubOak.setStrengthFactor(8f);
//        decoShrubOak.setChance(2);
//        this.addDeco(decoShrubOak);
//
//        DecoBoulder decoBoulder1 = new DecoBoulder();
//        decoBoulder1.setBoulderBlock(Blocks.COBBLESTONE.getDefaultState());
//        decoBoulder1.setMaxY(80);
//        decoBoulder1.setChance(16);
//        decoBoulder1.setStrengthFactor(1f);
//        this.addDeco(decoBoulder1);
//
//        // Fallen leaves.
//        DecoLayer decoFallenLeaves = new DecoLayer(AppalachiaBlockLeavesFallen.getRandomFallenLeaves().getDefaultState(), IAppalachiaBlockLeavesFallen.LAYERS);
//        decoFallenLeaves.setLoops(8);
//        this.addDeco(decoFallenLeaves);
//
//        // Only 1-block-tall flowers so we can see the trees better.
//        // And only white ones because they go with everything.
//        DecoFlowersRTG decoFlowers1 = new DecoFlowersRTG();
//        decoFlowers1.setFlowers(new int[]{3, 6});
//        decoFlowers1.setMaxY(shrubMaxY);
//        decoFlowers1.setStrengthFactor(6f);
//        this.addDeco(decoFlowers1);
//
//        // Very rare 2-block-tall flowers. (TODO: Replace these with Appalachian flora.)
//        DecoFlowersRTG decoFlowers2 = new DecoFlowersRTG();
//        decoFlowers2.setFlowers(new int[]{12, 13});
//        decoFlowers2.setMinY(63);
//        decoFlowers2.setMaxY(180);
//        decoFlowers2.setLoops(3);
//        this.addDeco(decoFlowers2);
//
//        // Ferns.
//        DecoGrass decoFern = new DecoGrass(2);
//        decoFern.setMinY(63);
//        decoFern.setMaxY(shrubMaxY);
//        decoFern.setLoops(2);
//        this.addDeco(decoFern);
//
//        // Poison ivy.
//        DecoVines decoPoisonIvy = new DecoVines();
//        decoPoisonIvy.setVineBlock(AppalachiaBlocks.vine_poison_ivy_01);
//        decoPoisonIvy.setStrengthFactor(12f);
//        decoPoisonIvy.setPropNorth(AppalachiaBlockVine.NORTH);
//        decoPoisonIvy.setPropEast(AppalachiaBlockVine.EAST);
//        decoPoisonIvy.setPropSouth(AppalachiaBlockVine.SOUTH);
//        decoPoisonIvy.setPropWest(AppalachiaBlockVine.WEST);
//        this.addDeco(decoPoisonIvy);
//
//        // Grass filler.
//        DecoGrass decoGrass = new DecoGrass();
//        decoGrass.setMinY(63);
//        decoGrass.setMaxY(shrubMaxY);
//        decoGrass.setStrengthFactor(24f);
//        this.addDeco(decoGrass);
    }
}

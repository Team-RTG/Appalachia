package appalachia.rtg.world.biome.deco.collection;

import appalachia.rtg.world.gen.feature.tree.rtg.*;

import rtg.api.world.deco.DecoTree;
import rtg.api.world.deco.collection.DecoCollectionBase;


/**
 * @author WhichOnesPink
 * Red Maple, Red Ash, Hackberry, Honey Locust, Blackgum, Bitternut Hickory, Buckeye, Sycamore
 */
public class DecoCollectionBlueRidgeBog extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;
    
    public DecoCollectionBlueRidgeBog(boolean fallenTrees) {

        // Red Maple.
        AppalachiaTree treeRedMaple = new TreeAcerRubrum();
        this.addTree(treeRedMaple);
        DecoTree decoRedMaple = new DecoTree(treeRedMaple);
        decoRedMaple.setMaxY(treeMaxY);
        this.addDeco(decoRedMaple);

        // Red Ash.
        AppalachiaTree treeRedAsh = new TreeFraxinusPennsylvanica();
        this.addTree(treeRedAsh);
        DecoTree decoRedAsh = new DecoTree(treeRedAsh);
        decoRedAsh.setMaxY(treeMaxY);
        this.addDeco(decoRedAsh);

        // Hackberry.
        AppalachiaTree treeHackberry = new TreeCeltisOccidentalis();
        this.addTree(treeHackberry);
        DecoTree decoHackberry = new DecoTree(treeHackberry);
        decoHackberry.setMaxY(treeMaxY);
        this.addDeco(decoHackberry);

        // Honey Locust.
        AppalachiaTree treeHoneyLocust = new TreeGleditsiaTriacanthos();
        this.addTree(treeHoneyLocust);
        DecoTree decoHoneyLocust = new DecoTree(treeHoneyLocust);
        decoHoneyLocust.setMaxY(treeMaxY);
        this.addDeco(decoHoneyLocust);

        // Blackgum.
        AppalachiaTree treeBlackgum = new TreeNyssaSylvatica();
        this.addTree(treeBlackgum);
        DecoTree decoBlackgum = new DecoTree(treeBlackgum);
        decoBlackgum.setMaxY(treeMaxY);
        this.addDeco(decoBlackgum);

        // Bitternut Hickory.
        AppalachiaTree treeBitternutHickory = new TreeCaryaCordiformis();
        this.addTree(treeBitternutHickory);
        DecoTree decoBitternutHickory = new DecoTree(treeBitternutHickory);
        decoBitternutHickory.setMaxY(treeMaxY);
        this.addDeco(decoBitternutHickory);

        // Buckeye.
        AppalachiaTree treeBuckeye = new TreeAesculusGlabra();
        this.addTree(treeBuckeye);
        DecoTree decoBuckeye = new DecoTree(treeBuckeye);
        decoBuckeye.setMaxY(treeMaxY);
        this.addDeco(decoBuckeye);

        // Sycamore.
        AppalachiaTree treeSycamore = new TreePlatanusOccidentalis();
        this.addTree(treeSycamore);
        DecoTree decoSycamore = new DecoTree(treeSycamore);
        decoSycamore.setMaxY(treeMaxY);
        this.addDeco(decoSycamore);

//        // Add some fallen trees of the oak and spruce variety (50/50 distribution).
//        DecoFallenTree decoFallenOak = new DecoFallenTree();
//        decoFallenOak.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
//        decoFallenOak.setLogConditionChance(16);
//        decoFallenOak.setMaxY(80);
//        decoFallenOak.setLogBlock(AppalachiaBlocks.log_yellow_birch_01.getDefaultState());
//        decoFallenOak.setLeavesBlock(Blocks.LEAVES.getDefaultState());
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
//        decoGrass.setStrengthFactor(16f);
//        this.addDeco(decoGrass);
    }
}

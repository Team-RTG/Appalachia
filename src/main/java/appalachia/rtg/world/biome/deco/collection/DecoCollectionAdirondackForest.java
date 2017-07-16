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
 * Red Maple, American Beech, Red Ash, Hackberry, Black Cherry, Red Oak, White Walnut, White Pine
 */
public class DecoCollectionAdirondackForest extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;
    
    public DecoCollectionAdirondackForest(BiomeConfig config) {

        super(config);

        // Red Maple.
        AppalachiaTree treeRedMaple = new TreeAcerRubrum();
        this.addTree(treeRedMaple);
        DecoTree decoRedMaple = new DecoTree(treeRedMaple);
        decoRedMaple.setMaxY(treeMaxY);
        this.addDeco(decoRedMaple);

        // American Beech.
        AppalachiaTree treeAmericanBeech = new TreeFagusGrandifolia();
        this.addTree(treeAmericanBeech);
        DecoTree decoAmericanBeech = new DecoTree(treeAmericanBeech);
        decoAmericanBeech.setMaxY(treeMaxY);
        this.addDeco(decoAmericanBeech);

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

        // Black Cherry.
        AppalachiaTree treeBlackCherry = new TreePrunusSerotina();
        this.addTree(treeBlackCherry);
        DecoTree decoBlackCherry = new DecoTree(treeBlackCherry);
        decoBlackCherry.setMaxY(treeMaxY);
        this.addDeco(decoBlackCherry);

        // Red Oak.
        AppalachiaTree treeRedOak = new TreeQuercusRubra();
        this.addTree(treeRedOak);
        DecoTree decoRedOak = new DecoTree(treeRedOak);
        decoRedOak.setMaxY(treeMaxY);
        this.addDeco(decoRedOak);

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

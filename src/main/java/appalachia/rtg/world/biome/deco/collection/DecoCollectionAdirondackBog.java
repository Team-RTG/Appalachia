package appalachia.rtg.world.biome.deco.collection;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.block.IAppalachiaBlockLeavesFallen;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.rtg.world.biome.deco.DecoAPLTree;
import appalachia.rtg.world.gen.feature.tree.rtg.*;

import rtg.api.world.deco.*;
import rtg.api.world.deco.collection.DecoCollectionBase;


/**
 * @author WhichOnesPink
 * Red Maple, Hackberry, American Elm, Black Spruce, Tamarack
 */
public class DecoCollectionAdirondackBog extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    protected float redMapleNoiseMin = -5f;
    protected float redMapleNoiseMax = -1f;
    protected float hackberryNoiseMin = -1.75f;
    protected float hackberryNoiseMax = 0f;
    protected float americanElmNoiseMin = -2f;
    protected float americanElmNoiseMax = 2f;
    protected float blackSpruceNoiseMin = 1f;
    protected float blackSpruceNoiseMax = 5f;
    protected float tamarackNoiseMin = 2f;
    protected float tamarackNoiseMax = 6f;

    // Tends to return values between -3f to 5f, with some overflow.
    private DecoTree.Distribution swampDistribution = new DecoTree.Distribution(100f, 6f, 0.8f);
    
    public DecoCollectionAdirondackBog(boolean fallenTrees) {

        // Red Maple.
        AppalachiaTree treeRedMaple = new TreeAcerRubrum();
        this.addTree(treeRedMaple);
        this.addDeco(new DecoAPLTree(treeRedMaple)
            .setMaxY(treeMaxY)
            .setDistribution(swampDistribution)
            .setTreeCondition(DecoTree.TreeCondition.RANDOM_NOT_EQUALS_CHANCE)
            .setTreeConditionNoise(redMapleNoiseMin)
            .setTreeConditionNoise2(redMapleNoiseMax)
            .setTreeConditionChance(3)
            //.setLoops(2)
        );

        // Tamarack.
        AppalachiaTree treeTamarack = new TreeLarixLaricina();
        this.addTree(treeTamarack);
        this.addDeco(new DecoAPLTree(treeTamarack)
                .setMaxY(treeMaxY)
                .setDistribution(swampDistribution)
                .setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE)
                .setTreeConditionNoise(tamarackNoiseMin)
                .setTreeConditionNoise2(tamarackNoiseMax)
                .setTreeConditionChance(3)
            //.setLoops(2)
        );

        // American Elm.
        AppalachiaTree treeAmericanElm = new TreeUlmusAmericana();
        this.addTree(treeAmericanElm);
        this.addDeco(new DecoAPLTree(treeAmericanElm)
                .setMaxY(treeMaxY)
                .setDistribution(swampDistribution)
                .setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE)
                .setTreeConditionNoise(americanElmNoiseMin)
                .setTreeConditionNoise2(americanElmNoiseMax)
                .setTreeConditionChance(5)
            //.setLoops(2)
        );

        // Black Spruce.
        AppalachiaTree treeBlackSpruce = new TreePiceaMariana();
        this.addTree(treeBlackSpruce);
        this.addDeco(new DecoAPLTree(treeBlackSpruce)
                .setMaxY(treeMaxY)
                .setDistribution(swampDistribution)
                .setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE)
                .setTreeConditionNoise(blackSpruceNoiseMin)
                .setTreeConditionNoise2(blackSpruceNoiseMax)
                .setTreeConditionChance(3)
            //.setLoops(2)
        );

        // Hackberry.
        AppalachiaTree treeHackberry = new TreeCeltisOccidentalis(true);
        this.addTree(treeHackberry);
        this.addDeco(new DecoAPLTree(treeHackberry)
                .setMaxY(treeMaxY)
                .setDistribution(swampDistribution)
                .setTreeCondition(DecoTree.TreeCondition.RANDOM_CHANCE)
                .setTreeConditionNoise(hackberryNoiseMin)
                .setTreeConditionNoise2(hackberryNoiseMax)
                .setTreeConditionChance(5)
            //.setLoops(1)
        );

        // Add some fallen trees using the log blocks of the all the trees in this collection.
        DecoFallenTree decoFallenTrees = new DecoFallenTree();
        decoFallenTrees.setLogCondition(DecoFallenTree.LogCondition.RANDOM_CHANCE);
        decoFallenTrees.setLogConditionChance(16);
        decoFallenTrees.setMaxY(80);
        decoFallenTrees.setRandomLogBlocks(this.treeLogs().toArray(new IBlockState[0]));
        decoFallenTrees.setMinSize(3);
        decoFallenTrees.setMaxSize(5);
        this.addDeco(decoFallenTrees, fallenTrees);

        // Shrubs to fill in the blanks.
        DecoShrub decoShrub = new DecoShrub();
        decoShrub.setSize(1);
        decoShrub.setMinY(63);
        decoShrub.setUseDefaultRandom(true);
        decoShrub.setRandomLogBlocks(this.treeLogs().toArray(new IBlockState[0]));
        decoShrub.setRandomLeavesBlocks(this.treeLeaves().toArray(new IBlockState[0]));
        decoShrub.setMaxY(shrubMaxY);
        decoShrub.setStrengthFactor(8f);
        decoShrub.setChance(2);
        this.addDeco(decoShrub);

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

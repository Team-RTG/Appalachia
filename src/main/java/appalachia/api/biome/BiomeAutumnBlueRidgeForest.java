package appalachia.api.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.biome.decorator.DecoratorAutumnBlueRidgeForest;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeTiliaAmericana;

public class BiomeAutumnBlueRidgeForest extends AppalachiaBiome implements IAppalachiaBiome {

    public static BiomeDictionary.Type[] biomeTypes;

    public BiomeAutumnBlueRidgeForest(BiomeProperties props) {

        super(props);
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();
        theBiomeDecorator.treesPerChunk = 1;

        biomeTypes = new BiomeDictionary.Type[]{BiomeDictionary.Type.FOREST};
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {

        return new DecoratorAutumnBlueRidgeForest();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos) {

        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand) {

        return rand.nextInt(3) == 0 ? TREE_FEATURE : rand.nextInt(5) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE;
    }

//    @Override
//    @SideOnly(Side.CLIENT)
//    public int getSkyColorByTemp(float temp)
//    {
//        double noise = GRASS_COLOR_NOISE.getValue((double)temp * 0.0225D, (double)temp * 0.0225D);
//        return (noise < -0.5D) ? 0xB52C0A : ((noise > 0.5D) ? 0xA81411 : 0xB31D01);
//    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos) {

        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return (noise < -0.5D) ? 10703636 : ((noise > 0.5D) ? 11937822 : 12991488);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {

        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return (noise < -0.5D) ? 12991488 : ((noise > 0.5D) ? 10703636 : 11937822);
    }

    @Override
    public void addTreesToBiome() {

        AppalachiaTree tree = new TreeTiliaAmericana();
        tree.logBlock = Blocks.LOG.getDefaultState();
        tree.leavesBlock = Blocks.LEAVES.getDefaultState();
        this.addTree(tree);

//        Tree tree1 = new Tree();
//        tree1.leavesBlock = AppalachiaBlocks.leaves_autumn_orange.getDefaultState();
//        tree1.trunkWidthBottom = 2;
//        tree1.trunkWidthTop = 2;
//        tree1.crownWidthBottom = 2;
//        tree1.crownWidthTop = 2;
//        this.addTree(tree1);

//        Tree tree2 = new Tree();
//        tree2.leavesBlock = AppalachiaBlocks.leaves_autumn_yellow.getDefaultState();
//        tree2.trunkWidthBottom = 2;
//        tree2.crownWidthTop = 2;
//        this.addTree(tree2);

//        TreeQuercusRobur treeYellow = new TreeQuercusRobur();
//        treeYellow.leavesBlock = AppalachiaBlocks.leaves_autumn_yellow.getDefaultState();
//        this.addTree(treeYellow);
//
//        TreeQuercusRobur treeOrange = new TreeQuercusRobur();
//        treeOrange.leavesBlock = AppalachiaBlocks.leaves_autumn_orange.getDefaultState();
//        this.addTree(treeOrange);
//
//        TreeQuercusRobur treeRed = new TreeQuercusRobur();
//        treeRed.leavesBlock = AppalachiaBlocks.leaves_autumn_red.getDefaultState();
//        this.addTree(treeRed);
    }
}
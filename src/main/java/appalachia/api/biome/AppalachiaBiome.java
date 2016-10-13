package appalachia.api.biome;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;

public class AppalachiaBiome extends Biome implements IAppalachiaBiome {

    public ArrayList<AppalachiaTree> appalachiaTrees;

    public AppalachiaBiome(BiomeProperties props) {

        super(props);

        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();

        theBiomeDecorator.treesPerChunk = 3;
        theBiomeDecorator.grassPerChunk = 4;
        theBiomeDecorator.flowersPerChunk = 2;
        theBiomeDecorator.generateLakes = false;

        this.spawnableCreatureList.clear();

        appalachiaTrees = new ArrayList<AppalachiaTree>();
        this.addTreesToBiome();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos) {

        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand) {

        return rand.nextInt(3) == 0 ? TREE_FEATURE : rand.nextInt(5) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE;
    }

    /**
     * Adds a tree to the list of Appalachia trees associated with this biome.
     * The 'allowed' parameter allows us to pass biome config booleans dynamically when configuring the trees in the biome.
     *
     * @param tree
     * @param allowed
     */
    public void addTree(AppalachiaTree tree, boolean allowed) {

        if (allowed) {

            this.appalachiaTrees.add(tree);
        }
    }

    /**
     * Convenience method for addTree() where 'allowed' is assumed to be true.
     *
     * @param tree
     */
    public void addTree(AppalachiaTree tree) {

        this.addTree(tree, true);
    }

    @Override
    public void addTreesToBiome() {

    }
}
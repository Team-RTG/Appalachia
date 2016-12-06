package appalachia.api.biome;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;

import rtg.api.util.noise.OpenSimplexNoise;


public abstract class AppalachiaBiome extends Biome implements IAppalachiaBiome {

    public ArrayList<AppalachiaTree> appalachiaTrees;
    public OpenSimplexNoise simplex = new OpenSimplexNoise(4444);

    public static final int leafColours[] = {
        15924992, 16776960, 16773632, 16770560, 16767232, 16763904,
        16760576, 16757504, 16754176, 16750848, 16747520, 16744448,
        16741120, 16737792, 16734464, 16731392, 16728064, 16724736, 16721408
    };

    public AppalachiaBiome(BiomeProperties props) {

        super(props);

        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();

        theBiomeDecorator.treesPerChunk = 3;
        theBiomeDecorator.grassPerChunk = 4;
        theBiomeDecorator.flowersPerChunk = 2;
        theBiomeDecorator.generateLakes = false;

        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 20, 1, 4));

        appalachiaTrees = new ArrayList<AppalachiaTree>();
        this.addTreesToBiome();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos) {

        super.decorate(world, rand, pos);
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new AppalachiaBiomeDecorator();
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
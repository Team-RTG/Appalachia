package appalachia.world.biome;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import appalachia.world.gen.feature.tree.AppalachiaTree;

public class AppalachiaBiome extends Biome implements IAppalachiaBiome {

    public ArrayList<AppalachiaTree> appalachiaTrees;

    public AppalachiaBiome(BiomeProperties props)
    {
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
    public void decorate(World world, Random rand, BlockPos pos)
    {
        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand)
    {
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

    public static enum AppalachiaBiomeProps {

        APPALACHIAN_MOUNTAINS("Appalachian Mountains", 1.0F, 0.5F, 0.2F, 0.3F, 2368150, false),
        AUTUMN_FOREST("Autumn Forest", 0.2F, 0.2F, 0.3F, 0.8F, 2368150, false),
        COVE_FOREST("Cove Forest", 0.2F, 0.2F, 0.25F, 0.8F, 2368150, false),
        PRAIRIE("Prairie", 0.125F, 0.05F, 0.8F, 0.4F, 2368150, false),
        SMOKY_MOUNTAINS("Smoky Mountains", 1.0F, 0.5F, 0.2F, 0.3F, 2368150, false);

        private final String biomeName;
        private final float baseHeight;
        private final float heightVariation;
        private final float temperature;
        private final float rainfall;
        private final int waterColour;
        private final boolean snowEnabled;
        private final Biome.BiomeProperties props;

        AppalachiaBiomeProps(String biomeName, float baseHeight, float heightVariation, float temperature, float rainfall, int waterColour, boolean snowEnabled) {

            this.biomeName = biomeName;
            this.baseHeight = baseHeight;
            this.heightVariation = heightVariation;
            this.temperature = temperature;
            this.rainfall = rainfall;
            this.waterColour = waterColour;
            this.snowEnabled = snowEnabled;

            this.props = new Biome.BiomeProperties(this.biomeName)
                .setBaseHeight(this.baseHeight)
                .setHeightVariation(this.heightVariation)
                .setTemperature(this.temperature);

            if (this.snowEnabled) {
                this.props.setSnowEnabled();
            }
        }

        public String getBiomeName() {
            return this.biomeName;
        }

        public float getBaseHeight() {
            return this.baseHeight;
        }

        public float getHeightVariation() {
            return this.heightVariation;
        }

        public float getTemperature() {
            return this.temperature;
        }

        public float getRainfall() {
            return this.rainfall;
        }

        public int getWaterColour() {
            return this.waterColour;
        }

        public boolean getSnowEnabled() {
            return this.snowEnabled;
        }

        public Biome.BiomeProperties getProps() {
            return this.props;
        }
    }
}
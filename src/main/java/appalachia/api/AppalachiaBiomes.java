package appalachia.api;

import net.minecraft.world.biome.Biome;

public class AppalachiaBiomes {

    public static Biome blueRidgeForest;
    public static Biome blueRidgeForestAutumn;
    public static Biome blueRidgeHills;
    public static Biome blueRidgeHillsAutumn;
    public static Biome blueRidgeMountains;
    public static Biome blueRidgeMountainsAutumn;
    public static Biome blueRidgeBog;
    public static Biome blueRidgeBogAutumn;
    public static Biome blueRidgeBeach;
    public static Biome blueRidgeRiver;

    public static Biome smokyForest;
    public static Biome smokyForestAutumn;
    public static Biome smokyHills;
    public static Biome smokyHillsAutumn;
    public static Biome smokyMountains;
    public static Biome smokyMountainsAutumn;
    public static Biome smokyBog;
    public static Biome smokyBogAutumn;
    public static Biome smokyBeach;
    public static Biome smokyRiver;

    public static Biome adirondackForest;
    public static Biome adirondackForestAutumn;
    public static Biome adirondackHills;
    public static Biome adirondackHillsAutumn;
    public static Biome adirondackMountains;
    public static Biome adirondackMountainsAutumn;
    public static Biome adirondackBog;
    public static Biome adirondackBogAutumn;
    public static Biome adirondackBeach;
    public static Biome adirondackRiver;


    public static enum AppalachiaBiomeProps {

        //                                                          BH      HV      Temp    Rain    H2OColour   Snow?

        ADIRONDACK_FOREST("Adirondack Forest",                      0.1F,   0.1F,   0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_FOREST_AUTUMN("Autumn Adirondack Forest",        0.1F,   0.1F,   0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_HILLS("Adirondack Hills",                        0.15F,  0.15F,  0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_HILLS_AUTUMN("Autumn Adirondack Hills",          0.15F,  0.15F,  0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_MOUNTAINS("Adirondack Mountains",                0.2F,   0.2F,   0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_MOUNTAINS_AUTUMN("Autumn Adirondack Mountains",  0.2F,   0.2F,   0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_BOG("Adirondack Bog",                            -0.2F,  0.1F,   0.54F,  0.9F,   16777215,   false),
        ADIRONDACK_BOG_AUTUMN("Autumn Adirondack Bog",              -0.2F,  0.1F,   0.54F,  0.9F,   16777215,   false),
        ADIRONDACK_BEACH("Adirondack Beach",                        0.1F,   0.05F,  0.54F,  0.8F,   16777215,   false),
        ADIRONDACK_RIVER("Adirondack River",                        0.1F,   0.05F,  0.54F,  0.8F,   16777215,   false),

        BLUE_RIDGE_FOREST("Blue Ridge Forest",                      0.1F,   0.1F,   0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_FOREST_AUTUMN("Autumn Blue Ridge Forest",        0.1F,   0.1F,   0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_HILLS("Blue Ridge Hills",                        0.15F,  0.15F,  0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_HILLS_AUTUMN("Autumn Blue Ridge Hills",          0.15F,  0.15F,  0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_MOUNTAINS("Blue Ridge Mountains",                0.2F,   0.2F,   0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_MOUNTAINS_AUTUMN("Autumn Blue Ridge Mountains",  0.2F,   0.2F,   0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_BOG("Blue Ridge Bog",                            -0.2F,  0.1F,   0.34F,  0.9F,   16777215,   false),
        BLUE_RIDGE_BOG_AUTUMN("Autumn Blue Ridge Bog",              -0.2F,  0.1F,   0.34F,  0.9F,   16777215,   false),
        BLUE_RIDGE_BEACH("Blue Ridge Beach",                        0.1F,   0.05F,  0.34F,  0.8F,   16777215,   false),
        BLUE_RIDGE_RIVER("Blue Ridge River",                        0.1F,   0.05F,  0.34F,  0.8F,   16777215,   false),

        SMOKY_FOREST("Smoky Forest",                                0.1F,   0.1F,   0.44F,  0.8F,   16777215,   false),
        SMOKY_FOREST_AUTUMN("Autumn Smoky Forest",                  0.1F,   0.1F,   0.44F,  0.8F,   16777215,   false),
        SMOKY_HILLS("Smoky Hills",                                  0.15F,  0.15F,  0.44F,  0.8F,   16777215,   false),
        SMOKY_HILLS_AUTUMN("Autumn Smoky Hills",                    0.15F,  0.15F,  0.44F,  0.8F,   16777215,   false),
        SMOKY_MOUNTAINS("Smoky Mountains",                          0.2F,   0.2F,   0.44F,  0.8F,   16777215,   false),
        SMOKY_MOUNTAINS_AUTUMN("Autumn Smoky Mountains",            0.2F,   0.2F,   0.44F,  0.8F,   16777215,   false),
        SMOKY_BOG("Smoky Bog",                                      -0.2F,  0.1F,   0.44F,  0.9F,   16777215,   false),
        SMOKY_BOG_AUTUMN("Autumn Smoky Bog",                        -0.2F,  0.1F,   0.44F,  0.9F,   16777215,   false),
        SMOKY_BEACH("Smoky Beach",                                  0.1F,   0.05F,  0.44F,  0.8F,   16777215,   false),
        SMOKY_RIVER("Smoky River",                                  0.1F,   0.05F,  0.44F,  0.8F,   16777215,   false);

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
                .setTemperature(this.temperature)
                .setRainfall(this.rainfall)
                .setWaterColor(this.waterColour);

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

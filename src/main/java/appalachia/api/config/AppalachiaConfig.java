package appalachia.api.config;

import rtg.api.config.Config;
import rtg.api.config.property.ConfigProperty;
import rtg.api.config.property.ConfigPropertyBoolean;
import rtg.api.config.property.ConfigPropertyInt;

public class AppalachiaConfig extends Config {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Biomes
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_FOREST;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_FOREST_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_HILLS;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_HILLS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_MOUNTAINS;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_MOUNTAINS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_BOG;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_BOG_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_BEACH;
    public final ConfigPropertyInt BIOME_WEIGHT_ADIRONDACK_RIVER;

    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_FOREST;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_FOREST_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_HILLS;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_HILLS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_BOG;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_BOG_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_BEACH;
    public final ConfigPropertyInt BIOME_WEIGHT_BLUE_RIDGE_RIVER;

    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_FOREST;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_FOREST_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_HILLS;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_HILLS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_MOUNTAINS;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_MOUNTAINS_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_BOG;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_BOG_AUTUMN;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_BEACH;
    public final ConfigPropertyInt BIOME_WEIGHT_SMOKY_RIVER;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Debugging
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public final ConfigPropertyBoolean ENABLE_DEBUGGING;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Geographicraft
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public final ConfigPropertyInt PERCENTAGE_IN_GEOGRAPHICRAFT;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public AppalachiaConfig() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Biomes
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        BIOME_WEIGHT_ADIRONDACK_FOREST = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_FOREST_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_HILLS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_HILLS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_MOUNTAINS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_MOUNTAINS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_BOG = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_BOG_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_BEACH = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_ADIRONDACK_RIVER = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);

        BIOME_WEIGHT_BLUE_RIDGE_FOREST = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_FOREST_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_HILLS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_HILLS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_BOG = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_BOG_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_BEACH = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_BLUE_RIDGE_RIVER = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);

        BIOME_WEIGHT_SMOKY_FOREST = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_FOREST_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_HILLS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_HILLS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_MOUNTAINS = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_MOUNTAINS_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_BOG = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_BOG_AUTUMN = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_BEACH = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);
        BIOME_WEIGHT_SMOKY_RIVER = new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE);

        this.addProperty(BIOME_WEIGHT_ADIRONDACK_FOREST);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_FOREST_AUTUMN);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_HILLS);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_HILLS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_MOUNTAINS);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_MOUNTAINS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_BOG);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_BOG_AUTUMN);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_BEACH);
        this.addProperty(BIOME_WEIGHT_ADIRONDACK_RIVER);

        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_FOREST);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_FOREST_AUTUMN);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_HILLS);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_HILLS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_MOUNTAINS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_BOG);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_BOG_AUTUMN);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_BEACH);
        this.addProperty(BIOME_WEIGHT_BLUE_RIDGE_RIVER);

        this.addProperty(BIOME_WEIGHT_SMOKY_FOREST);
        this.addProperty(BIOME_WEIGHT_SMOKY_FOREST_AUTUMN);
        this.addProperty(BIOME_WEIGHT_SMOKY_HILLS);
        this.addProperty(BIOME_WEIGHT_SMOKY_HILLS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_SMOKY_MOUNTAINS);
        this.addProperty(BIOME_WEIGHT_SMOKY_MOUNTAINS_AUTUMN);
        this.addProperty(BIOME_WEIGHT_SMOKY_BOG);
        this.addProperty(BIOME_WEIGHT_SMOKY_BOG_AUTUMN);
        this.addProperty(BIOME_WEIGHT_SMOKY_BEACH);
        this.addProperty(BIOME_WEIGHT_SMOKY_RIVER);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Debugging
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        ENABLE_DEBUGGING = new ConfigPropertyBoolean(
            ConfigProperty.Type.BOOLEAN,
            "Enable Debugging",
            "Debugging",
            "WARNING: This should only be enabled if you know what you're doing.",
            false
        );
        this.addProperty(ENABLE_DEBUGGING);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Geographicraft
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        PERCENTAGE_IN_GEOGRAPHICRAFT = new ConfigPropertyInt(
            ConfigProperty.Type.INTEGER,
            "Frequency of Appalachia biomes when used in conjunction with Geographicraft's biome layouts",
            "Geographicraft.Frequency",
            "",
            30, 0, 100
        );
        this.addProperty(PERCENTAGE_IN_GEOGRAPHICRAFT);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
}

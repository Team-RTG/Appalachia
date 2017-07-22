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

    // Enabled

    public final ConfigPropertyBoolean ADIRONDACK_FOREST_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_FOREST_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_HILLS_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_HILLS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_MOUNTAINS_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_MOUNTAINS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_BOG_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_BOG_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean ADIRONDACK_BEACH_ENABLED;
    //public final ConfigPropertyBoolean ADIRONDACK_RIVER_ENABLED;

    public final ConfigPropertyBoolean BLUE_RIDGE_FOREST_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_FOREST_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_HILLS_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_HILLS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_MOUNTAINS_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_MOUNTAINS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_BOG_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_BOG_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean BLUE_RIDGE_BEACH_ENABLED;
    //public final ConfigPropertyBoolean BLUE_RIDGE_RIVER_ENABLED;

    public final ConfigPropertyBoolean SMOKY_FOREST_ENABLED;
    public final ConfigPropertyBoolean SMOKY_FOREST_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean SMOKY_HILLS_ENABLED;
    public final ConfigPropertyBoolean SMOKY_HILLS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean SMOKY_MOUNTAINS_ENABLED;
    public final ConfigPropertyBoolean SMOKY_MOUNTAINS_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean SMOKY_BOG_ENABLED;
    public final ConfigPropertyBoolean SMOKY_BOG_AUTUMN_ENABLED;
    public final ConfigPropertyBoolean SMOKY_BEACH_ENABLED;
    //public final ConfigPropertyBoolean SMOKY_RIVER_ENABLED;

    // Weight

    public final ConfigPropertyInt ADIRONDACK_FOREST_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_FOREST_AUTUMN_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_HILLS_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_HILLS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_MOUNTAINS_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_MOUNTAINS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_BOG_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_BOG_AUTUMN_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_BEACH_WEIGHT;
    public final ConfigPropertyInt ADIRONDACK_RIVER_WEIGHT;

    public final ConfigPropertyInt BLUE_RIDGE_FOREST_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_FOREST_AUTUMN_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_HILLS_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_HILLS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_MOUNTAINS_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_MOUNTAINS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_BOG_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_BOG_AUTUMN_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_BEACH_WEIGHT;
    public final ConfigPropertyInt BLUE_RIDGE_RIVER_WEIGHT;

    public final ConfigPropertyInt SMOKY_FOREST_WEIGHT;
    public final ConfigPropertyInt SMOKY_FOREST_AUTUMN_WEIGHT;
    public final ConfigPropertyInt SMOKY_HILLS_WEIGHT;
    public final ConfigPropertyInt SMOKY_HILLS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt SMOKY_MOUNTAINS_WEIGHT;
    public final ConfigPropertyInt SMOKY_MOUNTAINS_AUTUMN_WEIGHT;
    public final ConfigPropertyInt SMOKY_BOG_WEIGHT;
    public final ConfigPropertyInt SMOKY_BOG_AUTUMN_WEIGHT;
    public final ConfigPropertyInt SMOKY_BEACH_WEIGHT;
    public final ConfigPropertyInt SMOKY_RIVER_WEIGHT;

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

        // Enabled

        ADIRONDACK_FOREST_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Forest", "Biomes", "", true));
        ADIRONDACK_FOREST_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Forest (Autumn)", "Biomes", "", true));
        ADIRONDACK_HILLS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Hills", "Biomes", "", true));
        ADIRONDACK_HILLS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Hills (Autumn)", "Biomes", "", true));
        ADIRONDACK_MOUNTAINS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Mountains", "Biomes", "", true));
        ADIRONDACK_MOUNTAINS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Mountains (Autumn)", "Biomes", "", true));
        ADIRONDACK_BOG_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Bog", "Biomes", "", true));
        ADIRONDACK_BOG_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Bog (Autumn)", "Biomes", "", true));
        ADIRONDACK_BEACH_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack Beach", "Biomes", "", true));
        //ADIRONDACK_RIVER_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Adirondack River", "Biomes", "", true));

        BLUE_RIDGE_FOREST_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Forest", "Biomes", "", true));
        BLUE_RIDGE_FOREST_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Forest (Autumn)", "Biomes", "", true));
        BLUE_RIDGE_HILLS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Hills", "Biomes", "", true));
        BLUE_RIDGE_HILLS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Hills (Autumn)", "Biomes", "", true));
        BLUE_RIDGE_MOUNTAINS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Mountains", "Biomes", "", true));
        BLUE_RIDGE_MOUNTAINS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Mountains (Autumn)", "Biomes", "", true));
        BLUE_RIDGE_BOG_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Bog", "Biomes", "", true));
        BLUE_RIDGE_BOG_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Bog (Autumn)", "Biomes", "", true));
        BLUE_RIDGE_BEACH_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge Beach", "Biomes", "", true));
        //BLUE_RIDGE_RIVER_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Blue Ridge River", "Biomes", "", true));

        SMOKY_FOREST_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Forest", "Biomes", "", true));
        SMOKY_FOREST_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Forest (Autumn)", "Biomes", "", true));
        SMOKY_HILLS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Hills", "Biomes", "", true));
        SMOKY_HILLS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Hills (Autumn)", "Biomes", "", true));
        SMOKY_MOUNTAINS_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Mountains", "Biomes", "", true));
        SMOKY_MOUNTAINS_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Mountains (Autumn)", "Biomes", "", true));
        SMOKY_BOG_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Bog", "Biomes", "", true));
        SMOKY_BOG_AUTUMN_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Bog (Autumn)", "Biomes", "", true));
        SMOKY_BEACH_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky Beach", "Biomes", "", true));
        //SMOKY_RIVER_ENABLED = this.addProperty(new ConfigPropertyBoolean(ConfigProperty.Type.BOOLEAN, "Enable Smoky River", "Biomes", "", true));

        // Weight

        ADIRONDACK_FOREST_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_FOREST_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_HILLS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_HILLS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_MOUNTAINS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_MOUNTAINS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        ADIRONDACK_BOG_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        ADIRONDACK_BOG_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        ADIRONDACK_BEACH_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));
        ADIRONDACK_RIVER_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Adirondack River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));

        BLUE_RIDGE_FOREST_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_FOREST_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_HILLS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_HILLS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_MOUNTAINS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_MOUNTAINS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_BOG_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_BOG_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_BEACH_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));
        BLUE_RIDGE_RIVER_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Blue Ridge River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));

        SMOKY_FOREST_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Forest Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_FOREST_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Forest (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_HILLS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Hills Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_HILLS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Hills (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_MOUNTAINS_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Mountains Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_MOUNTAINS_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Mountains (Autumn) Biome Weight", "Biomes.Weights", "", 20, 0, Integer.MAX_VALUE));
        SMOKY_BOG_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Bog Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        SMOKY_BOG_AUTUMN_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Bog (Autumn) Biome Weight", "Biomes.Weights", "", 10, 0, Integer.MAX_VALUE));
        SMOKY_BEACH_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky Beach Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));
        SMOKY_RIVER_WEIGHT = this.addProperty(new ConfigPropertyInt(ConfigProperty.Type.INTEGER, "Smoky River Biome Weight", "Biomes.Weights", "", 0, 0, Integer.MAX_VALUE));

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Debugging
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        ENABLE_DEBUGGING = this.addProperty(new ConfigPropertyBoolean(
            ConfigProperty.Type.BOOLEAN,
            "Enable Debugging",
            "Debugging",
            "WARNING: This should only be enabled if you know what you're doing.",
            false
        ));

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Geographicraft
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        PERCENTAGE_IN_GEOGRAPHICRAFT = this.addProperty(new ConfigPropertyInt(
            ConfigProperty.Type.INTEGER,
            "Frequency of Appalachia biomes when used in conjunction with Geographicraft's biome layouts",
            "Geographicraft.Frequency",
            "",
            30, 0, 100
        ));

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
}

package appalachia.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import appalachia.util.Logger;


public class ConfigAppalachia {

    public static Configuration config;
    public static int biomeIDCounter = 40;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Biome IDs
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int biomeID_AppalachianMountains = 40;
    public static int biomeID_AutumnForest = 41;
    public static int biomeID_CoveForest = 42;
    public static int biomeID_Prairie = 43;
    public static int biomeID_SmokyMountains = 44;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Biome Weights
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int biomeWeight_AppalachianMountains = 20;
    public static int biomeWeight_AutumnForest = 20;
    public static int biomeWeight_CoveForest = 20;
    public static int biomeWeight_Prairie = 20;
    public static int biomeWeight_SmokyMountains = 20;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Debugging
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static boolean enableDebugging = false;

    public static boolean allowTreesToGenerateOnSand = false;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void init(File configFile) {

        config = new Configuration(configFile);

        try {

            config.load();

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Biome IDs
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            biomeID_AppalachianMountains = config.getInt("Appalachian Mountains Biome ID", "Biome IDs", biomeID_AppalachianMountains, 0, 255, "");
            biomeID_AutumnForest = config.getInt("Autumn Forest Biome ID", "Biome IDs", biomeID_AutumnForest, 0, 255, "");
            biomeID_CoveForest = config.getInt("Cove Forest Biome ID", "Biome IDs", biomeID_CoveForest, 0, 255, "");
            biomeID_Prairie = config.getInt("Prairie Biome ID", "Biome IDs", biomeID_Prairie, 0, 255, "");
            biomeID_SmokyMountains = config.getInt("Smoky Mountains Biome ID", "Biome IDs", biomeID_SmokyMountains, 0, 255, "");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Biome Weights
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            biomeWeight_AppalachianMountains = config.getInt("Appalachian Mountains Biome Weight", "Biome Weights", biomeWeight_AppalachianMountains, 0, Integer.MAX_VALUE, "");
            biomeWeight_AutumnForest = config.getInt("Autumn Forest Biome Weight", "Biome Weights", biomeWeight_AutumnForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_CoveForest = config.getInt("Cove Forest Biome Weight", "Biome Weights", biomeWeight_CoveForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_Prairie = config.getInt("Prairie Biome Weight", "Biome Weights", biomeWeight_Prairie, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyMountains = config.getInt("Smoky Mountains Biome Weight", "Biome Weights", biomeWeight_SmokyMountains, 0, Integer.MAX_VALUE, "");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Debugging
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            enableDebugging = config.getBoolean("Enable Debugging", "Debugging", enableDebugging, "WARNING: This should only be enabled if you know what you're doing." + Configuration.NEW_LINE);

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        }
        catch (Exception e) {

            Logger.error("Appalachia had a problem loading Appalachia configuration.");
        }
        finally {

            if (config.hasChanged()) {
                config.save();
            }
        }
    }
}
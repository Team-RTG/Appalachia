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

    public static int biomeID_BlueRidgeMountains = biomeIDCounter++;
    public static int biomeID_BlueRidgeForest = biomeIDCounter++;
    public static int biomeID_BlueRidgeHills = biomeIDCounter++;
    public static int biomeID_BlueRidgeBog = biomeIDCounter++;
    public static int biomeID_BlueRidgeBeach = biomeIDCounter++;
    public static int biomeID_BlueRidgeRiver = biomeIDCounter++;
    public static int biomeID_SmokyMountains = biomeIDCounter++;

    public static int biomeID_BlueRidgeForestAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeHillsAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeMountainsAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeBogAutumn = biomeIDCounter++;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Biome Weights
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int biomeWeight_BlueRidgeMountains = 20;
    public static int biomeWeight_BlueRidgeForest = 20;
    public static int biomeWeight_BlueRidgeHills = 20;
    public static int biomeWeight_BlueRidgeBog = 10;
    public static int biomeWeight_BlueRidgeBeach = 0;
    public static int biomeWeight_BlueRidgeRiver = 0;
    public static int biomeWeight_SmokyMountains = 20;

    public static int biomeWeight_BlueRidgeForestAutumn = 20;
    public static int biomeWeight_BlueRidgeHillsAutumn = 20;
    public static int biomeWeight_BlueRidgeMountainsAutumn = 20;
    public static int biomeWeight_BlueRidgeBogAutumn = 10;

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

            biomeID_BlueRidgeMountains = config.getInt("Blue Ridge Mountains Biome ID", "Biome IDs", biomeID_BlueRidgeMountains, 0, 255, "");
            biomeID_BlueRidgeForest = config.getInt("Blue Ridge Forest Biome ID", "Biome IDs", biomeID_BlueRidgeForest, 0, 255, "");
            biomeID_BlueRidgeHills = config.getInt("Blue Ridge Hills Biome ID", "Biome IDs", biomeID_BlueRidgeHills, 0, 255, "");
            biomeID_BlueRidgeBog = config.getInt("Blue Ridge Bog Biome ID", "Biome IDs", biomeID_BlueRidgeBog, 0, 255, "");
            biomeID_BlueRidgeBeach = config.getInt("Blue Ridge Beach Biome ID", "Biome IDs", biomeID_BlueRidgeBeach, 0, 255, "");
            biomeID_BlueRidgeRiver = config.getInt("Blue Ridge River Biome ID", "Biome IDs", biomeID_BlueRidgeRiver, 0, 255, "");
            biomeID_SmokyMountains = config.getInt("Smoky Mountains Biome ID", "Biome IDs", biomeID_SmokyMountains, 0, 255, "");

            biomeID_BlueRidgeForestAutumn = config.getInt("Autumn Blue Ridge Forest Biome ID", "Biome IDs", biomeID_BlueRidgeForestAutumn, 0, 255, "");
            biomeID_BlueRidgeHillsAutumn = config.getInt("Autumn Blue Ridge Hills Biome ID", "Biome IDs", biomeID_BlueRidgeHillsAutumn, 0, 255, "");
            biomeID_BlueRidgeMountainsAutumn = config.getInt("Autumn Blue Ridge Mountains Biome ID", "Biome IDs", biomeID_BlueRidgeMountainsAutumn, 0, 255, "");
            biomeID_BlueRidgeBogAutumn = config.getInt("Autumn Blue Ridge Bog Biome ID", "Biome IDs", biomeID_BlueRidgeBogAutumn, 0, 255, "");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Biome Weights
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            biomeWeight_BlueRidgeMountains = config.getInt("Blue Ridge Mountains Biome Weight", "Biome Weights", biomeWeight_BlueRidgeMountains, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeForest = config.getInt("Blue Ridge Forest Biome Weight", "Biome Weights", biomeWeight_BlueRidgeForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeHills = config.getInt("Blue Ridge Hills Biome Weight", "Biome Weights", biomeWeight_BlueRidgeHills, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBog = config.getInt("Blue Ridge Bog Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBog, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBeach = config.getInt("Blue Ridge Beach Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBeach, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeRiver = config.getInt("Blue Ridge River Biome Weight", "Biome Weights", biomeWeight_BlueRidgeRiver, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyMountains = config.getInt("Smoky Mountains Biome Weight", "Biome Weights", biomeWeight_SmokyMountains, 0, Integer.MAX_VALUE, "");

            biomeWeight_BlueRidgeForestAutumn = config.getInt("Autumn Blue Ridge Forest Biome Weight", "Biome Weights", biomeWeight_BlueRidgeForestAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeHillsAutumn = config.getInt("Autumn Blue Ridge Hills Biome Weight", "Biome Weights", biomeWeight_BlueRidgeHillsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeMountainsAutumn = config.getInt("Autumn Blue Ridge Mountains Biome Weight", "Biome Weights", biomeWeight_BlueRidgeMountainsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBogAutumn = config.getInt("Autumn Blue Ridge Bog Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBogAutumn, 0, Integer.MAX_VALUE, "");

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
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

    public static int biomeID_AdirondackForest = biomeIDCounter++;
    public static int biomeID_AdirondackForestAutumn = biomeIDCounter++;
    public static int biomeID_AdirondackHills = biomeIDCounter++;
    public static int biomeID_AdirondackHillsAutumn = biomeIDCounter++;
    public static int biomeID_AdirondackMountains = biomeIDCounter++;
    public static int biomeID_AdirondackMountainsAutumn = biomeIDCounter++;
    public static int biomeID_AdirondackBog = biomeIDCounter++;
    public static int biomeID_AdirondackBogAutumn = biomeIDCounter++;
    public static int biomeID_AdirondackBeach = biomeIDCounter++;
    public static int biomeID_AdirondackRiver = biomeIDCounter++;

    public static int biomeID_BlueRidgeForest = biomeIDCounter++;
    public static int biomeID_BlueRidgeForestAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeHills = biomeIDCounter++;
    public static int biomeID_BlueRidgeHillsAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeMountains = biomeIDCounter++;
    public static int biomeID_BlueRidgeMountainsAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeBog = biomeIDCounter++;
    public static int biomeID_BlueRidgeBogAutumn = biomeIDCounter++;
    public static int biomeID_BlueRidgeBeach = biomeIDCounter++;
    public static int biomeID_BlueRidgeRiver = biomeIDCounter++;

    public static int biomeID_SmokyForest = biomeIDCounter++;
    public static int biomeID_SmokyForestAutumn = biomeIDCounter++;
    public static int biomeID_SmokyHills = biomeIDCounter++;
    public static int biomeID_SmokyHillsAutumn = biomeIDCounter++;
    public static int biomeID_SmokyMountains = biomeIDCounter++;
    public static int biomeID_SmokyMountainsAutumn = biomeIDCounter++;
    public static int biomeID_SmokyBog = biomeIDCounter++;
    public static int biomeID_SmokyBogAutumn = biomeIDCounter++;
    public static int biomeID_SmokyBeach = biomeIDCounter++;
    public static int biomeID_SmokyRiver = biomeIDCounter++;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Biome Weights
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static int biomeWeight_AdirondackForest = 20;
    public static int biomeWeight_AdirondackForestAutumn = 20;
    public static int biomeWeight_AdirondackHills = 20;
    public static int biomeWeight_AdirondackHillsAutumn = 20;
    public static int biomeWeight_AdirondackMountains = 20;
    public static int biomeWeight_AdirondackMountainsAutumn = 20;
    public static int biomeWeight_AdirondackBog = 10;
    public static int biomeWeight_AdirondackBogAutumn = 10;
    public static int biomeWeight_AdirondackBeach = 0;
    public static int biomeWeight_AdirondackRiver = 0;

    public static int biomeWeight_BlueRidgeForest = 20;
    public static int biomeWeight_BlueRidgeForestAutumn = 20;
    public static int biomeWeight_BlueRidgeHills = 20;
    public static int biomeWeight_BlueRidgeHillsAutumn = 20;
    public static int biomeWeight_BlueRidgeMountains = 20;
    public static int biomeWeight_BlueRidgeMountainsAutumn = 20;
    public static int biomeWeight_BlueRidgeBog = 10;
    public static int biomeWeight_BlueRidgeBogAutumn = 10;
    public static int biomeWeight_BlueRidgeBeach = 0;
    public static int biomeWeight_BlueRidgeRiver = 0;

    public static int biomeWeight_SmokyForest = 20;
    public static int biomeWeight_SmokyForestAutumn = 20;
    public static int biomeWeight_SmokyHills = 20;
    public static int biomeWeight_SmokyHillsAutumn = 20;
    public static int biomeWeight_SmokyMountains = 20;
    public static int biomeWeight_SmokyMountainsAutumn = 20;
    public static int biomeWeight_SmokyBog = 10;
    public static int biomeWeight_SmokyBogAutumn = 10;
    public static int biomeWeight_SmokyBeach = 0;
    public static int biomeWeight_SmokyRiver = 0;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Debugging
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static boolean enableDebugging = false;

    public static boolean allowTreesToGenerateOnSand = false;
    
    public static int percentageInGeographicraft = 30;

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    public static void init(File configFile) {

        config = new Configuration(configFile);

        try {

            config.load();

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Biome IDs
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            biomeID_AdirondackForest = config.getInt("Adirondack Forest Biome ID", "Biome IDs", biomeID_AdirondackForest, 0, 255, "");
            biomeID_AdirondackForestAutumn = config.getInt("Autumn Adirondack Forest Biome ID", "Biome IDs", biomeID_AdirondackForestAutumn, 0, 255, "");
            biomeID_AdirondackHills = config.getInt("Adirondack Hills Biome ID", "Biome IDs", biomeID_AdirondackHills, 0, 255, "");
            biomeID_AdirondackHillsAutumn = config.getInt("Autumn Adirondack Hills Biome ID", "Biome IDs", biomeID_AdirondackHillsAutumn, 0, 255, "");
            biomeID_AdirondackMountains = config.getInt("Adirondack Mountains Biome ID", "Biome IDs", biomeID_AdirondackMountains, 0, 255, "");
            biomeID_AdirondackMountainsAutumn = config.getInt("Autumn Adirondack Mountains Biome ID", "Biome IDs", biomeID_AdirondackMountainsAutumn, 0, 255, "");
            biomeID_AdirondackBog = config.getInt("Adirondack Bog Biome ID", "Biome IDs", biomeID_AdirondackBog, 0, 255, "");
            biomeID_AdirondackBogAutumn = config.getInt("Autumn Adirondack Bog Biome ID", "Biome IDs", biomeID_AdirondackBogAutumn, 0, 255, "");
            biomeID_AdirondackBeach = config.getInt("Adirondack Beach Biome ID", "Biome IDs", biomeID_AdirondackBeach, 0, 255, "");
            biomeID_AdirondackRiver = config.getInt("Adirondack River Biome ID", "Biome IDs", biomeID_AdirondackRiver, 0, 255, "");

            biomeID_BlueRidgeForest = config.getInt("Blue Ridge Forest Biome ID", "Biome IDs", biomeID_BlueRidgeForest, 0, 255, "");
            biomeID_BlueRidgeForestAutumn = config.getInt("Autumn Blue Ridge Forest Biome ID", "Biome IDs", biomeID_BlueRidgeForestAutumn, 0, 255, "");
            biomeID_BlueRidgeHills = config.getInt("Blue Ridge Hills Biome ID", "Biome IDs", biomeID_BlueRidgeHills, 0, 255, "");
            biomeID_BlueRidgeHillsAutumn = config.getInt("Autumn Blue Ridge Hills Biome ID", "Biome IDs", biomeID_BlueRidgeHillsAutumn, 0, 255, "");
            biomeID_BlueRidgeMountains = config.getInt("Blue Ridge Mountains Biome ID", "Biome IDs", biomeID_BlueRidgeMountains, 0, 255, "");
            biomeID_BlueRidgeMountainsAutumn = config.getInt("Autumn Blue Ridge Mountains Biome ID", "Biome IDs", biomeID_BlueRidgeMountainsAutumn, 0, 255, "");
            biomeID_BlueRidgeBog = config.getInt("Blue Ridge Bog Biome ID", "Biome IDs", biomeID_BlueRidgeBog, 0, 255, "");
            biomeID_BlueRidgeBogAutumn = config.getInt("Autumn Blue Ridge Bog Biome ID", "Biome IDs", biomeID_BlueRidgeBogAutumn, 0, 255, "");
            biomeID_BlueRidgeBeach = config.getInt("Blue Ridge Beach Biome ID", "Biome IDs", biomeID_BlueRidgeBeach, 0, 255, "");
            biomeID_BlueRidgeRiver = config.getInt("Blue Ridge River Biome ID", "Biome IDs", biomeID_BlueRidgeRiver, 0, 255, "");

            biomeID_SmokyForest = config.getInt("Smoky Forest Biome ID", "Biome IDs", biomeID_SmokyForest, 0, 255, "");
            biomeID_SmokyForestAutumn = config.getInt("Autumn Smoky Forest Biome ID", "Biome IDs", biomeID_SmokyForestAutumn, 0, 255, "");
            biomeID_SmokyHills = config.getInt("Smoky Hills Biome ID", "Biome IDs", biomeID_SmokyHills, 0, 255, "");
            biomeID_SmokyHillsAutumn = config.getInt("Autumn Smoky Hills Biome ID", "Biome IDs", biomeID_SmokyHillsAutumn, 0, 255, "");
            biomeID_SmokyMountains = config.getInt("Smoky Mountains Biome ID", "Biome IDs", biomeID_SmokyMountains, 0, 255, "");
            biomeID_SmokyMountainsAutumn = config.getInt("Autumn Smoky Mountains Biome ID", "Biome IDs", biomeID_SmokyMountainsAutumn, 0, 255, "");
            biomeID_SmokyBog = config.getInt("Smoky Bog Biome ID", "Biome IDs", biomeID_SmokyBog, 0, 255, "");
            biomeID_SmokyBogAutumn = config.getInt("Autumn Smoky Bog Biome ID", "Biome IDs", biomeID_SmokyBogAutumn, 0, 255, "");
            biomeID_SmokyBeach = config.getInt("Smoky Beach Biome ID", "Biome IDs", biomeID_SmokyBeach, 0, 255, "");
            biomeID_SmokyRiver = config.getInt("Smoky River Biome ID", "Biome IDs", biomeID_SmokyRiver, 0, 255, "");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Biome Weights
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            biomeWeight_AdirondackForest = config.getInt("Adirondack Forest Biome Weight", "Biome Weights", biomeWeight_AdirondackForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackForestAutumn = config.getInt("Autumn Adirondack Forest Biome Weight", "Biome Weights", biomeWeight_AdirondackForestAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackHills = config.getInt("Adirondack Hills Biome Weight", "Biome Weights", biomeWeight_AdirondackHills, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackHillsAutumn = config.getInt("Autumn Adirondack Hills Biome Weight", "Biome Weights", biomeWeight_AdirondackHillsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackMountains = config.getInt("Adirondack Mountains Biome Weight", "Biome Weights", biomeWeight_AdirondackMountains, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackMountainsAutumn = config.getInt("Autumn Adirondack Mountains Biome Weight", "Biome Weights", biomeWeight_AdirondackMountainsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackBog = config.getInt("Adirondack Bog Biome Weight", "Biome Weights", biomeWeight_AdirondackBog, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackBogAutumn = config.getInt("Autumn Adirondack Bog Biome Weight", "Biome Weights", biomeWeight_AdirondackBogAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackBeach = config.getInt("Adirondack Beach Biome Weight", "Biome Weights", biomeWeight_AdirondackBeach, 0, Integer.MAX_VALUE, "");
            biomeWeight_AdirondackRiver = config.getInt("Adirondack River Biome Weight", "Biome Weights", biomeWeight_AdirondackRiver, 0, Integer.MAX_VALUE, "");

            biomeWeight_BlueRidgeForest = config.getInt("Blue Ridge Forest Biome Weight", "Biome Weights", biomeWeight_BlueRidgeForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeForestAutumn = config.getInt("Autumn Blue Ridge Forest Biome Weight", "Biome Weights", biomeWeight_BlueRidgeForestAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeHills = config.getInt("Blue Ridge Hills Biome Weight", "Biome Weights", biomeWeight_BlueRidgeHills, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeHillsAutumn = config.getInt("Autumn Blue Ridge Hills Biome Weight", "Biome Weights", biomeWeight_BlueRidgeHillsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeMountains = config.getInt("Blue Ridge Mountains Biome Weight", "Biome Weights", biomeWeight_BlueRidgeMountains, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeMountainsAutumn = config.getInt("Autumn Blue Ridge Mountains Biome Weight", "Biome Weights", biomeWeight_BlueRidgeMountainsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBog = config.getInt("Blue Ridge Bog Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBog, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBogAutumn = config.getInt("Autumn Blue Ridge Bog Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBogAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeBeach = config.getInt("Blue Ridge Beach Biome Weight", "Biome Weights", biomeWeight_BlueRidgeBeach, 0, Integer.MAX_VALUE, "");
            biomeWeight_BlueRidgeRiver = config.getInt("Blue Ridge River Biome Weight", "Biome Weights", biomeWeight_BlueRidgeRiver, 0, Integer.MAX_VALUE, "");

            biomeWeight_SmokyForest = config.getInt("Smoky Forest Biome Weight", "Biome Weights", biomeWeight_SmokyForest, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyForestAutumn = config.getInt("Autumn Smoky Forest Biome Weight", "Biome Weights", biomeWeight_SmokyForestAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyHills = config.getInt("Smoky Hills Biome Weight", "Biome Weights", biomeWeight_SmokyHills, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyHillsAutumn = config.getInt("Autumn Smoky Hills Biome Weight", "Biome Weights", biomeWeight_SmokyHillsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyMountains = config.getInt("Smoky Mountains Biome Weight", "Biome Weights", biomeWeight_SmokyMountains, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyMountainsAutumn = config.getInt("Autumn Smoky Mountains Biome Weight", "Biome Weights", biomeWeight_SmokyMountainsAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyBog = config.getInt("Smoky Bog Biome Weight", "Biome Weights", biomeWeight_SmokyBog, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyBogAutumn = config.getInt("Autumn Smoky Bog Biome Weight", "Biome Weights", biomeWeight_SmokyBogAutumn, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyBeach = config.getInt("Smoky Beach Biome Weight", "Biome Weights", biomeWeight_SmokyBeach, 0, Integer.MAX_VALUE, "");
            biomeWeight_SmokyRiver = config.getInt("Smoky River Biome Weight", "Biome Weights", biomeWeight_SmokyRiver, 0, Integer.MAX_VALUE, "");

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Debugging
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

            enableDebugging = config.getBoolean("Enable Debugging", "Debugging", enableDebugging, "WARNING: This should only be enabled if you know what you're doing." + Configuration.NEW_LINE);

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            // Geographicraft Frequencies
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            
            percentageInGeographicraft = config.getInt("Pecentage of Appalachia Biomes with Geographicraft", "Geographicraft", percentageInGeographicraft, 0, 100, "");
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
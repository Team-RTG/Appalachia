package appalachia.biome;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.api.biome.AppalachiaBiome;
import appalachia.api.biome.BiomeBorealBog;
import appalachia.api.biome.blueridge.*;
import appalachia.api.biome.blueridge.autumn.BiomeBlueRidgeForestAutumn;
import appalachia.api.biome.blueridge.autumn.BiomeBlueRidgeHillsAutumn;
import appalachia.api.biome.blueridge.autumn.BiomeBlueRidgeMountainsAutumn;
import appalachia.config.ConfigAppalachia;
import appalachia.util.BiomeUtils;
import appalachia.util.Logger;
import static appalachia.api.AppalachiaBiomes.*;
import static appalachia.reference.ModInfo.MOD_ID;

public class AppalachiaBiomeManager {


    public AppalachiaBiomeManager() {

    }

    public static void registerBiomes() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Appalachian Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        appalachianMountains = new BiomeAppalachianMountains(AppalachiaBiomeProps.APPALACHIAN_MOUNTAINS.getProps());
//        registerBiomeWithTypes(
//            appalachianMountains,
//            "appalachianmountains",
//            ConfigAppalachia.biomeWeight_AppalachianMountains,
//            BiomeManager.BiomeType.COOL,
//            BiomeAppalachianMountains.biomeTypes
//        );
//        BiomeManager.addSpawnBiome(appalachianMountains);
//        BiomeManager.addVillageBiome(appalachianMountains, true);
//        BiomeManager.addStrongholdBiome(appalachianMountains);
//        Biome.EXPLORATION_BIOMES_LIST.add(appalachianMountains);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeForest = new BiomeBlueRidgeForest(AppalachiaBiomeProps.BLUE_RIDGE_FOREST.getProps());
        registerBiomeWithTypes(
            blueRidgeForest,
            "blueridgeforest",
            ConfigAppalachia.biomeWeight_BlueRidgeForest,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeForest);
        BiomeManager.addVillageBiome(blueRidgeForest, true);
        BiomeManager.addStrongholdBiome(blueRidgeForest);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeHills = new BiomeBlueRidgeHills(AppalachiaBiomeProps.BLUE_RIDGE_HILLS.getProps());
        registerBiomeWithTypes(
            blueRidgeHills,
            "blueridgehills",
            ConfigAppalachia.biomeWeight_BlueRidgeHills,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeHills.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeHills);
        BiomeManager.addVillageBiome(blueRidgeHills, true);
        BiomeManager.addStrongholdBiome(blueRidgeHills);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHills);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeMountains = new BiomeBlueRidgeMountains(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            blueRidgeMountains,
            "blueridgemountains",
            ConfigAppalachia.biomeWeight_BlueRidgeMountains,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeMountains);
        BiomeManager.addVillageBiome(blueRidgeMountains, true);
        BiomeManager.addStrongholdBiome(blueRidgeMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountains);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeForestAutumn = new BiomeBlueRidgeForestAutumn(AppalachiaBiomeProps.BLUE_RIDGE_FOREST_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeForestAutumn,
            "blueridgeforestautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeForestAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForestAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeForestAutumn);
        BiomeManager.addVillageBiome(blueRidgeForestAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeForestAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForestAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeHillsAutumn = new BiomeBlueRidgeHillsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_HILLS_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeHillsAutumn,
            "blueridgehillsautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeHillsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeHillsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeHillsAutumn);
        BiomeManager.addVillageBiome(blueRidgeHillsAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeHillsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHillsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeMountainsAutumn = new BiomeBlueRidgeMountainsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS_AUTUMN.getProps());
        registerBiomeWithTypes(
            blueRidgeMountainsAutumn,
            "blueridgemountainsautumn",
            ConfigAppalachia.biomeWeight_BlueRidgeMountainsAutumn,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeMountainsAutumn.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeMountainsAutumn);
        BiomeManager.addVillageBiome(blueRidgeMountainsAutumn, true);
        BiomeManager.addStrongholdBiome(blueRidgeMountainsAutumn);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountainsAutumn);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeBeach = new BiomeBlueRidgeBeach(AppalachiaBiomeProps.BLUE_RIDGE_BEACH.getProps());
        registerBiomeWithTypes(
            blueRidgeBeach,
            "blueridgebeach",
            ConfigAppalachia.biomeWeight_BlueRidgeBeach,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeBeach.biomeTypes
        );
        BiomeManager.addSpawnBiome(blueRidgeBeach);
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        blueRidgeRiver = new BiomeBlueRidgeRiver(AppalachiaBiomeProps.BLUE_RIDGE_RIVER.getProps());
        registerBiomeWithTypes(
            blueRidgeRiver,
            "blueridgeriver",
            ConfigAppalachia.biomeWeight_BlueRidgeRiver,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeRiver.biomeTypes
        );
        Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeRiver);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Boreal Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        borealBog = new BiomeBorealBog(AppalachiaBiomeProps.BOREAL_BOG.getProps());
        registerBiomeWithTypes(
            borealBog,
            "borealbog",
            ConfigAppalachia.biomeWeight_BorealBog,
            BiomeManager.BiomeType.COOL,
            BiomeBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(borealBog);
        BiomeManager.addVillageBiome(borealBog, true);
        BiomeManager.addStrongholdBiome(borealBog);
        Biome.EXPLORATION_BIOMES_LIST.add(borealBog);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Prairie
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        prairie = new BiomePrairie(AppalachiaBiomeProps.PRAIRIE.getProps());
//        registerBiomeWithTypes(
//            prairie,
//            "prairie",
//            ConfigAppalachia.biomeWeight_Prairie,
//            BiomeManager.BiomeType.WARM,
//            BiomePrairie.biomeTypes
//        );
//        BiomeManager.addSpawnBiome(prairie);
//        BiomeManager.addVillageBiome(prairie, true);
//        BiomeManager.addStrongholdBiome(prairie);
//        Biome.EXPLORATION_BIOMES_LIST.add(prairie);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//        smokyMountains = new BiomeSmokyMountains(AppalachiaBiomeProps.SMOKY_MOUNTAINS.getProps());
//        registerBiomeWithTypes(
//            smokyMountains,
//            "smokymountains",
//            ConfigAppalachia.biomeWeight_SmokyMountains,
//            BiomeManager.BiomeType.COOL,
//            BiomeSmokyMountains.biomeTypes
//        );
//        BiomeManager.addSpawnBiome(smokyMountains);
//        BiomeManager.addVillageBiome(smokyMountains, true);
//        BiomeManager.addStrongholdBiome(smokyMountains);
//        Biome.EXPLORATION_BIOMES_LIST.add(smokyMountains);
    }

    public static void doBiomeCheck() {

        Biome[] b = BiomeUtils.getRegisteredBiomes();

        for (int i = 0; i < 256; i++) {
            if (b[i] != null) {
                Biome biome = b[i];
                int biomeId = BiomeUtils.getId(b[i]);
                String biomeName = BiomeUtils.getName(b[i]);
                String biomeClass = b[i].getBiomeClass().getName();

                Logger.info("Biome (" + biomeId + ") " + biomeName + " from " + biomeClass);

                switch (biomeId) {

                    case 8:     // The Nether
                    case 9:     // The End
                    case 127:   // The Void

                        // Do nothing.
                        break;

                    default:

                        if (biome instanceof AppalachiaBiome) {

                            Logger.info("SUCCESS! %s (%d) was found.", biome.getBiomeName(), BiomeUtils.getId(biome));
                        }

                        break;
                }
            }
        }
    }

    private static void registerBiomeWithTypes(Biome biome, String name, int weight, BiomeManager.BiomeType btype, BiomeDictionary.Type... types) {

        GameRegistry.register(biome.setRegistryName(new ResourceLocation(MOD_ID, name)));
        BiomeDictionary.registerBiomeType(biome, types);
        BiomeManager.addBiome(btype, new BiomeManager.BiomeEntry(biome, weight));
    }
}
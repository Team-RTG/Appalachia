package appalachia.biome;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.api.biome.*;
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

        appalachianMountains = new BiomeAppalachianMountains(AppalachiaBiomeProps.APPALACHIAN_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            appalachianMountains,
            "appalachianmountains",
            ConfigAppalachia.biomeWeight_AppalachianMountains,
            BiomeManager.BiomeType.COOL,
            BiomeAppalachianMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(appalachianMountains);
        BiomeManager.addVillageBiome(appalachianMountains, true);
        BiomeManager.addStrongholdBiome(appalachianMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(appalachianMountains);

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

        autumnBlueRidgeForest = new BiomeAutumnBlueRidgeForest(AppalachiaBiomeProps.AUTUMN_BLUE_RIDGE_FOREST.getProps());
        registerBiomeWithTypes(
            autumnBlueRidgeForest,
            "autumnblueridgeforest",
            ConfigAppalachia.biomeWeight_AutumnBlueRidgeForest,
            BiomeManager.BiomeType.COOL,
            BiomeAutumnBlueRidgeForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(autumnBlueRidgeForest);
        BiomeManager.addVillageBiome(autumnBlueRidgeForest, true);
        BiomeManager.addStrongholdBiome(autumnBlueRidgeForest);
        Biome.EXPLORATION_BIOMES_LIST.add(autumnBlueRidgeForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Prairie
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        prairie = new BiomePrairie(AppalachiaBiomeProps.PRAIRIE.getProps());
        registerBiomeWithTypes(
            prairie,
            "prairie",
            ConfigAppalachia.biomeWeight_Prairie,
            BiomeManager.BiomeType.WARM,
            BiomePrairie.biomeTypes
        );
        BiomeManager.addSpawnBiome(prairie);
        BiomeManager.addVillageBiome(prairie, true);
        BiomeManager.addStrongholdBiome(prairie);
        Biome.EXPLORATION_BIOMES_LIST.add(prairie);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyMountains = new BiomeSmokyMountains(AppalachiaBiomeProps.SMOKY_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            smokyMountains,
            "smokymountains",
            ConfigAppalachia.biomeWeight_SmokyMountains,
            BiomeManager.BiomeType.COOL,
            BiomeSmokyMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyMountains);
        BiomeManager.addVillageBiome(smokyMountains, true);
        BiomeManager.addStrongholdBiome(smokyMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyMountains);
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
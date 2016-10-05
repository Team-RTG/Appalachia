package appalachia.world.biome;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.config.ConfigAppalachia;
import appalachia.util.BiomeUtils;
import appalachia.util.Logger;
import appalachia.world.biome.AppalachiaBiome.AppalachiaBiomeProps;
import static appalachia.api.AppalachiaBiomes.*;
import static appalachia.reference.ModInfo.MOD_ID;

public class AppalachiaBiomeManager {


    public AppalachiaBiomeManager() {

    }

    public static void registerBiomes() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Appalachian Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        appalachianMountains = new BiomeAppalachianMountains(AppalachiaBiome.AppalachiaBiomeProps.APPALACHIAN_MOUNTAINS.getProps());
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
        // Autumn Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        autumnForest = new BiomeAutumnForest(AppalachiaBiomeProps.AUTUMN_FOREST.getProps());
        registerBiomeWithTypes(
            autumnForest,
            "autumnforest",
            ConfigAppalachia.biomeWeight_AutumnForest,
            BiomeManager.BiomeType.COOL,
            BiomeAutumnForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(autumnForest);
        BiomeManager.addVillageBiome(autumnForest, true);
        BiomeManager.addStrongholdBiome(autumnForest);
        Biome.EXPLORATION_BIOMES_LIST.add(autumnForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Cove Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        coveForest = new BiomeCoveForest(AppalachiaBiomeProps.COVE_FOREST.getProps());
        registerBiomeWithTypes(
            coveForest,
            "coveforest",
            ConfigAppalachia.biomeWeight_CoveForest,
            BiomeManager.BiomeType.COOL,
            BiomeCoveForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(coveForest);
        BiomeManager.addVillageBiome(coveForest, true);
        BiomeManager.addStrongholdBiome(coveForest);
        Biome.EXPLORATION_BIOMES_LIST.add(coveForest);

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

    public static void doBiomeCheck()
    {
        Biome[] b = BiomeUtils.getRegisteredBiomes();

        for (int i = 0; i < 256; i++)
        {
            if (b[i] != null)
            {
                Biome biome = b[i];
                int biomeId = BiomeUtils.getId(b[i]);
                String biomeName = BiomeUtils.getName(b[i]);
                String biomeClass = b[i].getBiomeClass().getName();

                Logger.debug("Biome (" + biomeId + ") " + biomeName + " from " + biomeClass);

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
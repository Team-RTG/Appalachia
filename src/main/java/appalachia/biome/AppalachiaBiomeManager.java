package appalachia.biome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.api.biome.AppalachiaBiome;
import appalachia.api.biome.adirondack.*;
import appalachia.api.biome.blueridge.*;
import appalachia.api.biome.smoky.*;
import appalachia.util.BiomeUtils;
import appalachia.util.Logger;
import static appalachia.api.AppalachiaAPI.aplConfig;
import static appalachia.api.AppalachiaBiomes.*;
import static appalachia.reference.ModInfo.MOD_ID;

public class AppalachiaBiomeManager {

    private static GeographicraftSettingsBuilder gcBuilder = new GeographicraftSettingsBuilder();

    public AppalachiaBiomeManager() {

    }

    public static void registerBiomes() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_FOREST_ENABLED.get()) {
            adirondackForest = new BiomeAdirondackForest(AppalachiaBiomeProps.ADIRONDACK_FOREST.getProps());
            registerBiomeWithTypes(
                adirondackForest,
                "adirondackforest",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_FOREST_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackForest);
            BiomeManager.addVillageBiome(adirondackForest, true);
            BiomeManager.addStrongholdBiome(adirondackForest);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackForest);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Adirondack Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_FOREST_AUTUMN_ENABLED.get()) {
            adirondackForestAutumn = new BiomeAdirondackForestAutumn(AppalachiaBiomeProps.ADIRONDACK_FOREST_AUTUMN.getProps());
            registerBiomeWithTypes(
                adirondackForestAutumn,
                "adirondackforestautumn",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_FOREST_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackForestAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackForestAutumn);
            BiomeManager.addVillageBiome(adirondackForestAutumn, true);
            BiomeManager.addStrongholdBiome(adirondackForestAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackForestAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_HILLS_ENABLED.get()) {
            adirondackHills = new BiomeAdirondackHills(AppalachiaBiomeProps.ADIRONDACK_HILLS.getProps());
            registerBiomeWithTypes(
                adirondackHills,
                "adirondackhills",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_HILLS_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackHills.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackHills);
            BiomeManager.addVillageBiome(adirondackHills, true);
            BiomeManager.addStrongholdBiome(adirondackHills);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackHills);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Adirondack Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_HILLS_AUTUMN_ENABLED.get()) {
            adirondackHillsAutumn = new BiomeAdirondackHillsAutumn(AppalachiaBiomeProps.ADIRONDACK_HILLS_AUTUMN.getProps());
            registerBiomeWithTypes(
                adirondackHillsAutumn,
                "adirondackhillsautumn",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_HILLS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackHillsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackHillsAutumn);
            BiomeManager.addVillageBiome(adirondackHillsAutumn, true);
            BiomeManager.addStrongholdBiome(adirondackHillsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackHillsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_MOUNTAINS_ENABLED.get()) {
            adirondackMountains = new BiomeAdirondackMountains(AppalachiaBiomeProps.ADIRONDACK_MOUNTAINS.getProps());
            registerBiomeWithTypes(
                adirondackMountains,
                "adirondackmountains",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_MOUNTAINS_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackMountains.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackMountains);
            BiomeManager.addVillageBiome(adirondackMountains, true);
            BiomeManager.addStrongholdBiome(adirondackMountains);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackMountains);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Adirondack Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_MOUNTAINS_AUTUMN_ENABLED.get()) {
            adirondackMountainsAutumn = new BiomeAdirondackMountainsAutumn(AppalachiaBiomeProps.ADIRONDACK_MOUNTAINS_AUTUMN.getProps());
            registerBiomeWithTypes(
                adirondackMountainsAutumn,
                "adirondackmountainsautumn",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_MOUNTAINS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackMountainsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackMountainsAutumn);
            BiomeManager.addVillageBiome(adirondackMountainsAutumn, true);
            BiomeManager.addStrongholdBiome(adirondackMountainsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackMountainsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_BOG_ENABLED.get()) {
            adirondackBog = new BiomeAdirondackBog(AppalachiaBiomeProps.ADIRONDACK_BOG.getProps());
            registerBiomeWithTypes(
                adirondackBog,
                "adirondackbog",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_BOG_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackBog);
            BiomeManager.addVillageBiome(adirondackBog, true);
            BiomeManager.addStrongholdBiome(adirondackBog);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackBog);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Adirondack Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_BOG_AUTUMN_ENABLED.get()) {
            adirondackBogAutumn = new BiomeAdirondackBogAutumn(AppalachiaBiomeProps.ADIRONDACK_BOG_AUTUMN.getProps());
            registerBiomeWithTypes(
                adirondackBogAutumn,
                "adirondackbogautumn",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_BOG_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackBogAutumn);
            BiomeManager.addVillageBiome(adirondackBogAutumn, true);
            BiomeManager.addStrongholdBiome(adirondackBogAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackBogAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.ADIRONDACK_BEACH_ENABLED.get()) {
            adirondackBeach = new BiomeAdirondackBeach(AppalachiaBiomeProps.ADIRONDACK_BEACH.getProps());
            registerBiomeWithTypes(
                adirondackBeach,
                "adirondackbeach",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_BEACH_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackBeach.biomeTypes
            );
            BiomeManager.addSpawnBiome(adirondackBeach);
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackBeach);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Adirondack River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //if (aplConfig.ADIRONDACK_RIVER_ENABLED.get()) {
            adirondackRiver = new BiomeAdirondackRiver(AppalachiaBiomeProps.ADIRONDACK_RIVER.getProps());
            registerBiomeWithTypes(
                adirondackRiver,
                "adirondackriver",
                AppalachiaBiomeGroup.ADIRONDACK,
                aplConfig.ADIRONDACK_RIVER_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeAdirondackRiver.biomeTypes
            );
            Biome.EXPLORATION_BIOMES_LIST.add(adirondackRiver);
        //}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_FOREST_ENABLED.get()) {
            blueRidgeForest = new BiomeBlueRidgeForest(AppalachiaBiomeProps.BLUE_RIDGE_FOREST.getProps());
            registerBiomeWithTypes(
                blueRidgeForest,
                "blueridgeforest",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_FOREST_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeForest);
            BiomeManager.addVillageBiome(blueRidgeForest, true);
            BiomeManager.addStrongholdBiome(blueRidgeForest);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForest);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_FOREST_AUTUMN_ENABLED.get()) {
            blueRidgeForestAutumn = new BiomeBlueRidgeForestAutumn(AppalachiaBiomeProps.BLUE_RIDGE_FOREST_AUTUMN.getProps());
            registerBiomeWithTypes(
                blueRidgeForestAutumn,
                "blueridgeforestautumn",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_FOREST_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeForestAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeForestAutumn);
            BiomeManager.addVillageBiome(blueRidgeForestAutumn, true);
            BiomeManager.addStrongholdBiome(blueRidgeForestAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeForestAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_HILLS_ENABLED.get()) {
            blueRidgeHills = new BiomeBlueRidgeHills(AppalachiaBiomeProps.BLUE_RIDGE_HILLS.getProps());
            registerBiomeWithTypes(
                blueRidgeHills,
                "blueridgehills",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_HILLS_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeHills.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeHills);
            BiomeManager.addVillageBiome(blueRidgeHills, true);
            BiomeManager.addStrongholdBiome(blueRidgeHills);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHills);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_HILLS_AUTUMN_ENABLED.get()) {
            blueRidgeHillsAutumn = new BiomeBlueRidgeHillsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_HILLS_AUTUMN.getProps());
            registerBiomeWithTypes(
                blueRidgeHillsAutumn,
                "blueridgehillsautumn",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_HILLS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeHillsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeHillsAutumn);
            BiomeManager.addVillageBiome(blueRidgeHillsAutumn, true);
            BiomeManager.addStrongholdBiome(blueRidgeHillsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeHillsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_MOUNTAINS_ENABLED.get()) {
            blueRidgeMountains = new BiomeBlueRidgeMountains(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS.getProps());
            registerBiomeWithTypes(
                blueRidgeMountains,
                "blueridgemountains",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_MOUNTAINS_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeMountains.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeMountains);
            BiomeManager.addVillageBiome(blueRidgeMountains, true);
            BiomeManager.addStrongholdBiome(blueRidgeMountains);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountains);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_MOUNTAINS_AUTUMN_ENABLED.get()) {
            blueRidgeMountainsAutumn = new BiomeBlueRidgeMountainsAutumn(AppalachiaBiomeProps.BLUE_RIDGE_MOUNTAINS_AUTUMN.getProps());
            registerBiomeWithTypes(
                blueRidgeMountainsAutumn,
                "blueridgemountainsautumn",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_MOUNTAINS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeMountainsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeMountainsAutumn);
            BiomeManager.addVillageBiome(blueRidgeMountainsAutumn, true);
            BiomeManager.addStrongholdBiome(blueRidgeMountainsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeMountainsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_BOG_ENABLED.get()) {
            blueRidgeBog = new BiomeBlueRidgeBog(AppalachiaBiomeProps.BLUE_RIDGE_BOG.getProps());
            registerBiomeWithTypes(
                blueRidgeBog,
                "blueridgebog",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_BOG_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeBog);
            BiomeManager.addVillageBiome(blueRidgeBog, true);
            BiomeManager.addStrongholdBiome(blueRidgeBog);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeBog);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Blue Ridge Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_BOG_AUTUMN_ENABLED.get()) {
            blueRidgeBogAutumn = new BiomeBlueRidgeBogAutumn(AppalachiaBiomeProps.BLUE_RIDGE_BOG_AUTUMN.getProps());
            registerBiomeWithTypes(
                blueRidgeBogAutumn,
                "blueridgebogautumn",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_BOG_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeBogAutumn);
            BiomeManager.addVillageBiome(blueRidgeBogAutumn, true);
            BiomeManager.addStrongholdBiome(blueRidgeBogAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeBogAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.BLUE_RIDGE_BEACH_ENABLED.get()) {
            blueRidgeBeach = new BiomeBlueRidgeBeach(AppalachiaBiomeProps.BLUE_RIDGE_BEACH.getProps());
            registerBiomeWithTypes(
                blueRidgeBeach,
                "blueridgebeach",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_BEACH_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeBeach.biomeTypes
            );
            BiomeManager.addSpawnBiome(blueRidgeBeach);
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeBeach);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Blue Ridge River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //if (aplConfig.BLUE_RIDGE_RIVER_ENABLED.get()) {
            blueRidgeRiver = new BiomeBlueRidgeRiver(AppalachiaBiomeProps.BLUE_RIDGE_RIVER.getProps());
            registerBiomeWithTypes(
                blueRidgeRiver,
                "blueridgeriver",
                AppalachiaBiomeGroup.BLUERIDGE,
                aplConfig.BLUE_RIDGE_RIVER_WEIGHT.get(),
                BiomeManager.BiomeType.COOL,
                BiomeBlueRidgeRiver.biomeTypes
            );
            Biome.EXPLORATION_BIOMES_LIST.add(blueRidgeRiver);
        //}

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_FOREST_ENABLED.get()) {
            smokyForest = new BiomeSmokyForest(AppalachiaBiomeProps.SMOKY_FOREST.getProps());
            registerBiomeWithTypes(
                smokyForest,
                "smokyforest",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_FOREST_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyForest);
            BiomeManager.addVillageBiome(smokyForest, true);
            BiomeManager.addStrongholdBiome(smokyForest);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyForest);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_FOREST_AUTUMN_ENABLED.get()) {
            smokyForestAutumn = new BiomeSmokyForestAutumn(AppalachiaBiomeProps.SMOKY_FOREST_AUTUMN.getProps());
            registerBiomeWithTypes(
                smokyForestAutumn,
                "smokyforestautumn",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_FOREST_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyForestAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyForestAutumn);
            BiomeManager.addVillageBiome(smokyForestAutumn, true);
            BiomeManager.addStrongholdBiome(smokyForestAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyForestAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_HILLS_ENABLED.get()) {
            smokyHills = new BiomeSmokyHills(AppalachiaBiomeProps.SMOKY_HILLS.getProps());
            registerBiomeWithTypes(
                smokyHills,
                "smokyhills",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_HILLS_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyHills.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyHills);
            BiomeManager.addVillageBiome(smokyHills, true);
            BiomeManager.addStrongholdBiome(smokyHills);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyHills);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Hills
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_HILLS_AUTUMN_ENABLED.get()) {
            smokyHillsAutumn = new BiomeSmokyHillsAutumn(AppalachiaBiomeProps.SMOKY_HILLS_AUTUMN.getProps());
            registerBiomeWithTypes(
                smokyHillsAutumn,
                "smokyhillsautumn",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_HILLS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyHillsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyHillsAutumn);
            BiomeManager.addVillageBiome(smokyHillsAutumn, true);
            BiomeManager.addStrongholdBiome(smokyHillsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyHillsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_MOUNTAINS_ENABLED.get()) {
            smokyMountains = new BiomeSmokyMountains(AppalachiaBiomeProps.SMOKY_MOUNTAINS.getProps());
            registerBiomeWithTypes(
                smokyMountains,
                "smokymountains",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_MOUNTAINS_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyMountains.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyMountains);
            BiomeManager.addVillageBiome(smokyMountains, true);
            BiomeManager.addStrongholdBiome(smokyMountains);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyMountains);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_MOUNTAINS_AUTUMN_ENABLED.get()) {
            smokyMountainsAutumn = new BiomeSmokyMountainsAutumn(AppalachiaBiomeProps.SMOKY_MOUNTAINS_AUTUMN.getProps());
            registerBiomeWithTypes(
                smokyMountainsAutumn,
                "smokymountainsautumn",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_MOUNTAINS_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyMountainsAutumn.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyMountainsAutumn);
            BiomeManager.addVillageBiome(smokyMountainsAutumn, true);
            BiomeManager.addStrongholdBiome(smokyMountainsAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyMountainsAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_BOG_ENABLED.get()) {
            smokyBog = new BiomeSmokyBog(AppalachiaBiomeProps.SMOKY_BOG.getProps());
            registerBiomeWithTypes(
                smokyBog,
                "smokybog",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_BOG_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyBog);
            BiomeManager.addVillageBiome(smokyBog, true);
            BiomeManager.addStrongholdBiome(smokyBog);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyBog);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Smoky Bog
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_BOG_AUTUMN_ENABLED.get()) {
            smokyBogAutumn = new BiomeSmokyBogAutumn(AppalachiaBiomeProps.SMOKY_BOG_AUTUMN.getProps());
            registerBiomeWithTypes(
                smokyBogAutumn,
                "smokybogautumn",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_BOG_AUTUMN_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyForest.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyBogAutumn);
            BiomeManager.addVillageBiome(smokyBogAutumn, true);
            BiomeManager.addStrongholdBiome(smokyBogAutumn);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyBogAutumn);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Beach
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        if (aplConfig.SMOKY_BEACH_ENABLED.get()) {
            smokyBeach = new BiomeSmokyBeach(AppalachiaBiomeProps.SMOKY_BEACH.getProps());
            registerBiomeWithTypes(
                smokyBeach,
                "smokybeach",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_BEACH_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyBeach.biomeTypes
            );
            BiomeManager.addSpawnBiome(smokyBeach);
            Biome.EXPLORATION_BIOMES_LIST.add(smokyBeach);
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky River
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //if (aplConfig.SMOKY_RIVER_ENABLED.get()) {
            smokyRiver = new BiomeSmokyRiver(AppalachiaBiomeProps.SMOKY_RIVER.getProps());
            registerBiomeWithTypes(
                smokyRiver,
                "smokyriver",
                AppalachiaBiomeGroup.SMOKY,
                aplConfig.SMOKY_RIVER_WEIGHT.get(),
                BiomeManager.BiomeType.WARM,
                BiomeSmokyRiver.biomeTypes
            );
            Biome.EXPLORATION_BIOMES_LIST.add(smokyRiver);
            gcBuilder.setBiomes(appalachiaBiomes, biomeGroups);
        //}
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
        gcBuilder.activate();
    }

    private static List<Biome> appalachiaBiomes = new ArrayList();
    private static HashMap<Biome,Integer> configWeights = new HashMap();
    private static HashMap<Biome,BiomeManager.BiomeType> biomeTypes = new HashMap();
    private static HashMap<Biome,AppalachiaBiomeGroup> biomeGroups = new HashMap();
    
    private static void registerBiomeWithTypes(Biome biome, String name, AppalachiaBiomeGroup group, int weight, BiomeManager.BiomeType btype, BiomeDictionary.Type... types) {

        GameRegistry.register(biome.setRegistryName(new ResourceLocation(MOD_ID, name)));
        BiomeDictionary.registerBiomeType(biome, types);
        BiomeManager.addBiome(btype, new BiomeManager.BiomeEntry(biome, weight));
        appalachiaBiomes.add(biome);
        configWeights.put(biome, weight);
        biomeTypes.put(biome, btype);
        biomeGroups.put(biome, group);
        // try to pass to Geographicraft. 
        gcBuilder.registerBiomeWithTypes(biome, name, group, weight, btype, types);
    }
    
    public static void updateBiomes(WorldTypeEvent.InitBiomeGens event) {
        gcBuilder.updateBiomes(event.getWorldType());
        /* Failed attempt at dynamic Appalachia biomes in the vanilla generator
        // rather than tracking what biomes are in or out, the algorithm is to add
        // all Appalachia biomes for RTG worlds only, redo the biome generators
        // and then take the Appalachia biomes out.

        if (event.getWorldType().getWorldTypeName().equalsIgnoreCase("RTG")) {
            // add the Appalachia biomes to the climates
            for (Biome biome: appalachiaBiomes) {
                BiomeManager.addBiome(biomeTypes.get(biome), new BiomeManager.BiomeEntry(biome, configWeights.get(biome)));
            } 
            // replace the GenLayers
            event.setNewBiomeGens(GenLayer.initializeAllBiomeGenerators(event.getSeed(), event.getWorldType(),""));
            //event.setNewBiomeGens(new GenLayer[1]);
            event.setResult(WorldTypeEvent.Result.ALLOW);
            if (1>0) return;
            // take Appalachia biomes back out. Only works for Warm and Cool right now.
            ArrayList<BiomeEntry> toRemove = new ArrayList();
            ImmutableList<BiomeEntry> biomes = BiomeManager.getBiomes(BiomeManager.BiomeType.COOL);
            for (BiomeEntry biomeEntry: biomes) {
                if (appalachiaBiomes.contains(biomeEntry.biome)) {
                    toRemove.add(biomeEntry);
                }
            }
            for (BiomeEntry removed: toRemove) {
                BiomeManager.removeBiome(BiomeManager.BiomeType.COOL, removed);
            }
            toRemove = new ArrayList();
            biomes = BiomeManager.getBiomes(BiomeManager.BiomeType.WARM);
            for (BiomeEntry biomeEntry: biomes) {
                if (appalachiaBiomes.contains(biomeEntry.biome)) {
                    toRemove.add(biomeEntry);
                }
            }
            for (BiomeEntry removed: toRemove) {
                BiomeManager.removeBiome(BiomeManager.BiomeType.WARM, removed);

        }
            }
            */
    }
}
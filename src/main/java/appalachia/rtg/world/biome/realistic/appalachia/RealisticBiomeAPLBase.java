package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.fml.common.Loader;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.adirondack.*;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.*;
import appalachia.rtg.world.biome.realistic.appalachia.smoky.*;

import rtg.world.biome.realistic.RealisticBiomeBase;

public abstract class RealisticBiomeAPLBase extends RealisticBiomeBase {

    public static RealisticBiomeBase aplAdirondackForest;
    public static RealisticBiomeBase aplAdirondackForestAutumn;
    public static RealisticBiomeBase aplAdirondackHills;
    public static RealisticBiomeBase aplAdirondackHillsAutumn;
    public static RealisticBiomeBase aplAdirondackMountains;
    public static RealisticBiomeBase aplAdirondackMountainsAutumn;
    public static RealisticBiomeBase aplAdirondackBog;
    public static RealisticBiomeBase aplAdirondackBogAutumn;
    public static RealisticBiomeBase aplAdirondackBeach;
    public static RealisticBiomeBase aplAdirondackRiver;

    public static RealisticBiomeBase aplBlueRidgeForest;
    public static RealisticBiomeBase aplBlueRidgeForestAutumn;
    public static RealisticBiomeBase aplBlueRidgeHills;
    public static RealisticBiomeBase aplBlueRidgeHillsAutumn;
    public static RealisticBiomeBase aplBlueRidgeMountains;
    public static RealisticBiomeBase aplBlueRidgeMountainsAutumn;
    public static RealisticBiomeBase aplBlueRidgeBog;
    public static RealisticBiomeBase aplBlueRidgeBogAutumn;
    public static RealisticBiomeBase aplBlueRidgeBeach;
    public static RealisticBiomeBase aplBlueRidgeRiver;

    public static RealisticBiomeBase aplSmokyForest;
    public static RealisticBiomeBase aplSmokyForestAutumn;
    public static RealisticBiomeBase aplSmokyHills;
    public static RealisticBiomeBase aplSmokyHillsAutumn;
    public static RealisticBiomeBase aplSmokyMountains;
    public static RealisticBiomeBase aplSmokyMountainsAutumn;
    public static RealisticBiomeBase aplSmokyBog;
    public static RealisticBiomeBase aplSmokyBogAutumn;
    public static RealisticBiomeBase aplSmokyBeach;
    public static RealisticBiomeBase aplSmokyRiver;

    public RealisticBiomeAPLBase(Biome b, Biome riverbiome) {

        super(b, riverbiome);

        this.waterSurfaceLakeChance = 0;
        this.lavaSurfaceLakeChance = 0;
    }

    @Override
    public String modSlug() {
        return "appalachia";
    }

    public static void addBiomes() {

        if (Loader.isModLoaded("appalachia")) {

            if (AppalachiaBiomes.adirondackForest != null) {
                aplAdirondackForest = new RealisticBiomeAPLAdirondackForest();
            }
            if (AppalachiaBiomes.adirondackHills != null) {
                aplAdirondackHills = new RealisticBiomeAPLAdirondackHills();
            }
            if (AppalachiaBiomes.adirondackMountains != null) {
                aplAdirondackMountains = new RealisticBiomeAPLAdirondackMountains();
            }
            if (AppalachiaBiomes.adirondackBog != null) {
                aplAdirondackBog = new RealisticBiomeAPLAdirondackBog();
            }
            if (AppalachiaBiomes.adirondackBeach != null) {
                aplAdirondackBeach = new RealisticBiomeAPLAdirondackBeach();
            }
            if (AppalachiaBiomes.adirondackRiver != null) {
                aplAdirondackRiver = new RealisticBiomeAPLAdirondackRiver();
            }

            if (AppalachiaBiomes.blueRidgeForest != null) {
                aplBlueRidgeForest = new RealisticBiomeAPLBlueRidgeForest();
            }
            if (AppalachiaBiomes.blueRidgeHills != null) {
                aplBlueRidgeHills = new RealisticBiomeAPLBlueRidgeHills();
            }
            if (AppalachiaBiomes.blueRidgeMountains != null) {
                aplBlueRidgeMountains = new RealisticBiomeAPLBlueRidgeMountains();
            }
            if (AppalachiaBiomes.blueRidgeBog != null) {
                aplBlueRidgeBog = new RealisticBiomeAPLBlueRidgeBog();
            }
            if (AppalachiaBiomes.blueRidgeBeach != null) {
                aplBlueRidgeBeach = new RealisticBiomeAPLBlueRidgeBeach();
            }
            if (AppalachiaBiomes.blueRidgeRiver != null) {
                aplBlueRidgeRiver = new RealisticBiomeAPLBlueRidgeRiver();
            }

            if (AppalachiaBiomes.smokyForest != null) {
                aplSmokyForest = new RealisticBiomeAPLSmokyForest();
            }
            if (AppalachiaBiomes.smokyHills != null) {
                aplSmokyHills = new RealisticBiomeAPLSmokyHills();
            }
            if (AppalachiaBiomes.smokyMountains != null) {
                aplSmokyMountains = new RealisticBiomeAPLSmokyMountains();
            }
            if (AppalachiaBiomes.smokyBog != null) {
                aplSmokyBog = new RealisticBiomeAPLSmokyBog();
            }
            if (AppalachiaBiomes.smokyBeach != null) {
                aplSmokyBeach = new RealisticBiomeAPLSmokyBeach();
            }
            if (AppalachiaBiomes.smokyRiver != null) {
                aplSmokyRiver = new RealisticBiomeAPLSmokyRiver();
            }

            // Autumnal biomes must be added last.

            if (AppalachiaBiomes.adirondackForestAutumn != null) {
                aplAdirondackForestAutumn = new RealisticBiomeAPLAdirondackForestAutumn();
            }
            if (AppalachiaBiomes.adirondackHillsAutumn != null) {
                aplAdirondackHillsAutumn = new RealisticBiomeAPLAdirondackHillsAutumn();
            }
            if (AppalachiaBiomes.adirondackMountainsAutumn != null) {
                aplAdirondackMountainsAutumn = new RealisticBiomeAPLAdirondackMountainsAutumn();
            }
            if (AppalachiaBiomes.adirondackBogAutumn != null) {
                aplAdirondackBogAutumn = new RealisticBiomeAPLAdirondackBogAutumn();
            }

            if (AppalachiaBiomes.blueRidgeForestAutumn != null) {
                aplBlueRidgeForestAutumn = new RealisticBiomeAPLBlueRidgeForestAutumn();
            }
            if (AppalachiaBiomes.blueRidgeHillsAutumn != null) {
                aplBlueRidgeHillsAutumn = new RealisticBiomeAPLBlueRidgeHillsAutumn();
            }
            if (AppalachiaBiomes.blueRidgeMountainsAutumn != null) {
                aplBlueRidgeMountainsAutumn = new RealisticBiomeAPLBlueRidgeMountainsAutumn();
            }
            if (AppalachiaBiomes.blueRidgeBogAutumn != null) {
                aplBlueRidgeBogAutumn = new RealisticBiomeAPLBlueRidgeBogAutumn();
            }

            if (AppalachiaBiomes.smokyForestAutumn != null) {
                aplSmokyForestAutumn = new RealisticBiomeAPLSmokyForestAutumn();
            }
            if (AppalachiaBiomes.smokyHillsAutumn != null) {
                aplSmokyHillsAutumn = new RealisticBiomeAPLSmokyHillsAutumn();
            }
            if (AppalachiaBiomes.smokyMountainsAutumn != null) {
                aplSmokyMountainsAutumn = new RealisticBiomeAPLSmokyMountainsAutumn();
            }
            if (AppalachiaBiomes.smokyBogAutumn != null) {
                aplSmokyBogAutumn = new RealisticBiomeAPLSmokyBogAutumn();
            }
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(Biomes.STONE_BEACH);
    }
}

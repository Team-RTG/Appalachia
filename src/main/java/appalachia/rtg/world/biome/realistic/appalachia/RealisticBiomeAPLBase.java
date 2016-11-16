package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.fml.common.Loader;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.*;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.autumn.RealisticBiomeAPLBlueRidgeForestAutumn;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.autumn.RealisticBiomeAPLBlueRidgeHillsAutumn;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.autumn.RealisticBiomeAPLBlueRidgeMountainsAutumn;

import rtg.world.biome.realistic.RealisticBiomeBase;

public abstract class RealisticBiomeAPLBase extends RealisticBiomeBase {

    public static RealisticBiomeBase aplAppalachianMountains;
    public static RealisticBiomeBase aplBlueRidgeForestAutumn;
    public static RealisticBiomeBase aplBlueRidgeHillsAutumn;
    public static RealisticBiomeBase aplBlueRidgeMountainsAutumn;
    public static RealisticBiomeBase aplBlueRidgeForest;
    public static RealisticBiomeBase aplBlueRidgeHills;
    public static RealisticBiomeBase aplBlueRidgeBeach;
    public static RealisticBiomeBase aplBlueRidgeRiver;
    public static RealisticBiomeBase aplBlueRidgeMountains;
    public static RealisticBiomeBase aplPrairie;
    public static RealisticBiomeBase aplSmokyMountains;

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
            if (AppalachiaBiomes.appalachianMountains != null) {
                aplAppalachianMountains = new RealisticBiomeAPLAppalachianMountains();
            }
            if (AppalachiaBiomes.blueRidgeForest != null) {
                aplBlueRidgeForest = new RealisticBiomeAPLBlueRidgeForest();
            }
            if (AppalachiaBiomes.blueRidgeHills != null) {
                aplBlueRidgeHills = new RealisticBiomeAPLBlueRidgeHills();
            }
            if (AppalachiaBiomes.blueRidgeBeach != null) {
                aplBlueRidgeBeach = new RealisticBiomeAPLBlueRidgeBeach();
            }
            if (AppalachiaBiomes.blueRidgeRiver != null) {
                aplBlueRidgeRiver = new RealisticBiomeAPLBlueRidgeRiver();
            }
            if (AppalachiaBiomes.blueRidgeMountains != null) {
                aplBlueRidgeMountains = new RealisticBiomeAPLBlueRidgeMountains();
            }
            if (AppalachiaBiomes.prairie != null) {
                aplPrairie = new RealisticBiomeAPLPrairie();
            }
            if (AppalachiaBiomes.smokyMountains != null) {
                aplSmokyMountains = new RealisticBiomeAPLSmokyMountains();
            }

            // Autumnal biomes must be added last.
            if (AppalachiaBiomes.blueRidgeForestAutumn != null) {
                aplBlueRidgeForestAutumn = new RealisticBiomeAPLBlueRidgeForestAutumn();
            }
            if (AppalachiaBiomes.blueRidgeHillsAutumn != null) {
                aplBlueRidgeHillsAutumn = new RealisticBiomeAPLBlueRidgeHillsAutumn();
            }
            if (AppalachiaBiomes.blueRidgeMountainsAutumn != null) {
                aplBlueRidgeMountainsAutumn = new RealisticBiomeAPLBlueRidgeMountainsAutumn();
            }
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(Biomes.STONE_BEACH);
    }
}

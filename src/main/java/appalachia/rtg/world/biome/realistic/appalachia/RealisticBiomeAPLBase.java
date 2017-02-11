package appalachia.rtg.world.biome.realistic.appalachia;

import java.util.ArrayList;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.fml.common.Loader;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.adirondack.*;
import appalachia.rtg.world.biome.realistic.appalachia.blueridge.*;
import appalachia.rtg.world.biome.realistic.appalachia.smoky.*;

import rtg.api.config.BiomeConfig;
import rtg.api.world.biome.BiomeDecoratorRTG;
import rtg.api.world.biome.IRealisticBiome;
import rtg.api.world.biome.RealisticBiomeManager;
import rtg.api.world.deco.DecoBase;
import rtg.api.world.gen.feature.tree.rtg.TreeRTG;

public abstract class RealisticBiomeAPLBase implements IRealisticBiome {

    public static IRealisticBiome aplAdirondackForest;
    public static IRealisticBiome aplAdirondackForestAutumn;
    public static IRealisticBiome aplAdirondackHills;
    public static IRealisticBiome aplAdirondackHillsAutumn;
    public static IRealisticBiome aplAdirondackMountains;
    public static IRealisticBiome aplAdirondackMountainsAutumn;
    public static IRealisticBiome aplAdirondackBog;
    public static IRealisticBiome aplAdirondackBogAutumn;
    public static IRealisticBiome aplAdirondackBeach;
    public static IRealisticBiome aplAdirondackRiver;

    public static IRealisticBiome aplBlueRidgeForest;
    public static IRealisticBiome aplBlueRidgeForestAutumn;
    public static IRealisticBiome aplBlueRidgeHills;
    public static IRealisticBiome aplBlueRidgeHillsAutumn;
    public static IRealisticBiome aplBlueRidgeMountains;
    public static IRealisticBiome aplBlueRidgeMountainsAutumn;
    public static IRealisticBiome aplBlueRidgeBog;
    public static IRealisticBiome aplBlueRidgeBogAutumn;
    public static IRealisticBiome aplBlueRidgeBeach;
    public static IRealisticBiome aplBlueRidgeRiver;

    public static IRealisticBiome aplSmokyForest;
    public static IRealisticBiome aplSmokyForestAutumn;
    public static IRealisticBiome aplSmokyHills;
    public static IRealisticBiome aplSmokyHillsAutumn;
    public static IRealisticBiome aplSmokyMountains;
    public static IRealisticBiome aplSmokyMountainsAutumn;
    public static IRealisticBiome aplSmokyBog;
    public static IRealisticBiome aplSmokyBogAutumn;
    public static IRealisticBiome aplSmokyBeach;
    public static IRealisticBiome aplSmokyRiver;

    protected final BiomeConfig config;
    protected final Biome baseBiome;
    protected final Biome riverBiome;
    protected final BiomeDecoratorRTG rDecorator;

    protected ArrayList<DecoBase> decos;
    protected ArrayList<TreeRTG> rtgTrees;

    public RealisticBiomeAPLBase(Biome b, Biome riverbiome) {

        this.baseBiome = b;
        this.riverBiome = riverbiome;
        this.config = new BiomeConfig();
        this.rDecorator = new BiomeDecoratorRTG(this, b);
        this.decos = new ArrayList<DecoBase>();
        this.rtgTrees = new ArrayList<TreeRTG>();
    }

    @Override
    public String modSlug() {
        return "appalachia";
    }

    @Override
    public Biome baseBiome() {
        return this.baseBiome;
    }

    @Override
    public Biome riverBiome() {
        return this.riverBiome;
    }

    @Override
    public Biome beachBiome() {
        return Biomes.STONE_BEACH;
    }

    @Override
    public boolean generatesEmeralds() {
        return false;
    }

    @Override
    public boolean generatesSilverfish() {
        return false;
    }

    @Override
    public int waterSurfaceLakeChance() {
        return 0;
    }

    @Override
    public int lavaSurfaceLakeChance() {
        return 0;
    }

    @Override
    public BiomeConfig getConfig() {
        return this.config;
    }

    @Override
    public ArrayList<DecoBase> getDecos() {
        return this.decos;
    }

    @Override
    public ArrayList<TreeRTG> getTrees() {
        return this.rtgTrees;
    }

    @Override
    public BiomeDecoratorRTG rDecorator() {
        return this.rDecorator;
    }

    public static void addBiomes() {

        if (Loader.isModLoaded("appalachia")) {

            if (AppalachiaBiomes.adirondackForest != null) {
                aplAdirondackForest = new RealisticBiomeAPLAdirondackForest();
                RealisticBiomeManager.addBiome(aplAdirondackForest);
            }
            if (AppalachiaBiomes.adirondackHills != null) {
                aplAdirondackHills = new RealisticBiomeAPLAdirondackHills();
                RealisticBiomeManager.addBiome(aplAdirondackHills);
            }
            if (AppalachiaBiomes.adirondackMountains != null) {
                aplAdirondackMountains = new RealisticBiomeAPLAdirondackMountains();
                RealisticBiomeManager.addBiome(aplAdirondackMountains);
            }
            if (AppalachiaBiomes.adirondackBog != null) {
                aplAdirondackBog = new RealisticBiomeAPLAdirondackBog();
                RealisticBiomeManager.addBiome(aplAdirondackBog);
            }
            if (AppalachiaBiomes.adirondackBeach != null) {
                aplAdirondackBeach = new RealisticBiomeAPLAdirondackBeach();
                RealisticBiomeManager.addBiome(aplAdirondackBeach);
            }
            if (AppalachiaBiomes.adirondackRiver != null) {
                aplAdirondackRiver = new RealisticBiomeAPLAdirondackRiver();
                RealisticBiomeManager.addBiome(aplAdirondackRiver);
            }

            if (AppalachiaBiomes.blueRidgeForest != null) {
                aplBlueRidgeForest = new RealisticBiomeAPLBlueRidgeForest();
                RealisticBiomeManager.addBiome(aplBlueRidgeForest);
            }
            if (AppalachiaBiomes.blueRidgeHills != null) {
                aplBlueRidgeHills = new RealisticBiomeAPLBlueRidgeHills();
                RealisticBiomeManager.addBiome(aplBlueRidgeHills);
            }
            if (AppalachiaBiomes.blueRidgeMountains != null) {
                aplBlueRidgeMountains = new RealisticBiomeAPLBlueRidgeMountains();
                RealisticBiomeManager.addBiome(aplBlueRidgeMountains);
            }
            if (AppalachiaBiomes.blueRidgeBog != null) {
                aplBlueRidgeBog = new RealisticBiomeAPLBlueRidgeBog();
                RealisticBiomeManager.addBiome(aplBlueRidgeBog);
            }
            if (AppalachiaBiomes.blueRidgeBeach != null) {
                aplBlueRidgeBeach = new RealisticBiomeAPLBlueRidgeBeach();
                RealisticBiomeManager.addBiome(aplBlueRidgeBeach);
            }
            if (AppalachiaBiomes.blueRidgeRiver != null) {
                aplBlueRidgeRiver = new RealisticBiomeAPLBlueRidgeRiver();
                RealisticBiomeManager.addBiome(aplBlueRidgeRiver);
            }

            if (AppalachiaBiomes.smokyForest != null) {
                aplSmokyForest = new RealisticBiomeAPLSmokyForest();
                RealisticBiomeManager.addBiome(aplSmokyForest);
            }
            if (AppalachiaBiomes.smokyHills != null) {
                aplSmokyHills = new RealisticBiomeAPLSmokyHills();
                RealisticBiomeManager.addBiome(aplSmokyHills);
            }
            if (AppalachiaBiomes.smokyMountains != null) {
                aplSmokyMountains = new RealisticBiomeAPLSmokyMountains();
                RealisticBiomeManager.addBiome(aplSmokyMountains);
            }
            if (AppalachiaBiomes.smokyBog != null) {
                aplSmokyBog = new RealisticBiomeAPLSmokyBog();
                RealisticBiomeManager.addBiome(aplSmokyBog);
            }
            if (AppalachiaBiomes.smokyBeach != null) {
                aplSmokyBeach = new RealisticBiomeAPLSmokyBeach();
                RealisticBiomeManager.addBiome(aplSmokyBeach);
            }
            if (AppalachiaBiomes.smokyRiver != null) {
                aplSmokyRiver = new RealisticBiomeAPLSmokyRiver();
                RealisticBiomeManager.addBiome(aplSmokyRiver);
            }

            // Autumnal biomes must be added last.

            if (AppalachiaBiomes.adirondackForestAutumn != null) {
                aplAdirondackForestAutumn = new RealisticBiomeAPLAdirondackForestAutumn();
                RealisticBiomeManager.addBiome(aplAdirondackForestAutumn);
            }
            if (AppalachiaBiomes.adirondackHillsAutumn != null) {
                aplAdirondackHillsAutumn = new RealisticBiomeAPLAdirondackHillsAutumn();
                RealisticBiomeManager.addBiome(aplAdirondackHillsAutumn);
            }
            if (AppalachiaBiomes.adirondackMountainsAutumn != null) {
                aplAdirondackMountainsAutumn = new RealisticBiomeAPLAdirondackMountainsAutumn();
                RealisticBiomeManager.addBiome(aplAdirondackMountainsAutumn);
            }
            if (AppalachiaBiomes.adirondackBogAutumn != null) {
                aplAdirondackBogAutumn = new RealisticBiomeAPLAdirondackBogAutumn();
                RealisticBiomeManager.addBiome(aplAdirondackBogAutumn);
            }

            if (AppalachiaBiomes.blueRidgeForestAutumn != null) {
                aplBlueRidgeForestAutumn = new RealisticBiomeAPLBlueRidgeForestAutumn();
                RealisticBiomeManager.addBiome(aplBlueRidgeForestAutumn);
            }
            if (AppalachiaBiomes.blueRidgeHillsAutumn != null) {
                aplBlueRidgeHillsAutumn = new RealisticBiomeAPLBlueRidgeHillsAutumn();
                RealisticBiomeManager.addBiome(aplBlueRidgeHillsAutumn);
            }
            if (AppalachiaBiomes.blueRidgeMountainsAutumn != null) {
                aplBlueRidgeMountainsAutumn = new RealisticBiomeAPLBlueRidgeMountainsAutumn();
                RealisticBiomeManager.addBiome(aplBlueRidgeMountainsAutumn);
            }
            if (AppalachiaBiomes.blueRidgeBogAutumn != null) {
                aplBlueRidgeBogAutumn = new RealisticBiomeAPLBlueRidgeBogAutumn();
                RealisticBiomeManager.addBiome(aplBlueRidgeBogAutumn);
            }

            if (AppalachiaBiomes.smokyForestAutumn != null) {
                aplSmokyForestAutumn = new RealisticBiomeAPLSmokyForestAutumn();
                RealisticBiomeManager.addBiome(aplSmokyForestAutumn);
            }
            if (AppalachiaBiomes.smokyHillsAutumn != null) {
                aplSmokyHillsAutumn = new RealisticBiomeAPLSmokyHillsAutumn();
                RealisticBiomeManager.addBiome(aplSmokyHillsAutumn);
            }
            if (AppalachiaBiomes.smokyMountainsAutumn != null) {
                aplSmokyMountainsAutumn = new RealisticBiomeAPLSmokyMountainsAutumn();
                RealisticBiomeManager.addBiome(aplSmokyMountainsAutumn);
            }
            if (AppalachiaBiomes.smokyBogAutumn != null) {
                aplSmokyBogAutumn = new RealisticBiomeAPLSmokyBogAutumn();
                RealisticBiomeManager.addBiome(aplSmokyBogAutumn);
            }
        }
    }
}

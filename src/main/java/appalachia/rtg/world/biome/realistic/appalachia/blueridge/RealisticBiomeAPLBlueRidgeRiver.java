package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeRiver;

import rtg.api.biome.BiomeConfig;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeRiver extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeRiver;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeRiver(BiomeConfig config) {

        super(config, biome, river,
            new SurfaceAPLBlueRidgeRiver(config)
        );
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeRiver();
    }

    public class TerrainAPLBlueRidgeRiver extends TerrainBase {

        public TerrainAPLBlueRidgeRiver() {

        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            return terrainFlatLakes(x, y, simplex, river, 3f, 60f);
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

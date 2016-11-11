package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeBeach;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeBeach extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeBeach;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeBeach(BiomeConfig config) {

        super(config, biome, river,
            new SurfaceAPLBlueRidgeBeach(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeBeach();
    }

    public class TerrainAPLBlueRidgeBeach extends TerrainBase {

        public TerrainAPLBlueRidgeBeach() {

        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            return terrainBeach(x, y, simplex, river, 180f, 35f, 63f);
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

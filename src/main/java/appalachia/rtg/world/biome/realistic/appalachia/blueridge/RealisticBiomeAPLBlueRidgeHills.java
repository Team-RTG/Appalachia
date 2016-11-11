package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeHills;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeHills;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeHills extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeHills;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeHills(BiomeConfig config) {

        super(config, biome, river,
            new SurfaceAPLBlueRidgeHills(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeHills.decorationLogsId)));
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeHills();
    }

    public class TerrainAPLBlueRidgeHills extends TerrainBase {

        protected float hillStrength = 30f;

        public TerrainAPLBlueRidgeHills() {

            this(72f, 30f);
        }

        public TerrainAPLBlueRidgeHills(float bh, float hs) {

            base = bh;
            hillStrength = hs;
        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            return terrainHighland(x, y, simplex, cell, river, 10f, 68f, hillStrength, base - 62f);

        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

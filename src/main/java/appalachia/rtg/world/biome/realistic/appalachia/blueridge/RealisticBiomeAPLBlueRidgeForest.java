package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeForest;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeForest;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeForest extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeForest;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeForest(BiomeConfig config) {

        super(config, biome, river,
            new SurfaceAPLBlueRidgeForest(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeForest.decorationLogsId)));
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeForest();
    }

    public class TerrainAPLBlueRidgeForest extends TerrainBase {

        protected float hillStrength = 10f;// this needs to be linked to the

        public TerrainAPLBlueRidgeForest() {

        }

        @Override
        public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

            groundNoise = groundNoise(x, y, groundVariation, simplex);

            float m = hills(x, y, hillStrength, simplex, river);

            float floNoise = 65f + groundNoise + m;

            return riverized(floNoise, river);
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

package appalachia.rtg.world.biome.realistic.appalachia.blueridge.autumn;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeForestAutumn;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeForestAutumn;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeForestAutumn;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;

public class RealisticBiomeAPLBlueRidgeForestAutumn extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeForestAutumn;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeForestAutumn(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeForestAutumn(),
            new SurfaceAPLBlueRidgeForestAutumn(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeForestAutumn.decorationLogsId)));
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}
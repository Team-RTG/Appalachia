package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLAutumnBlueRidgeForest;

import rtg.api.biome.BiomeConfig;

public class RealisticBiomeAPLAutumnBlueRidgeForest extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.autumnBlueRidgeForest;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLAutumnBlueRidgeForest(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLAutumnBlueRidgeForest(58f, 84f, 24f),
            new SurfaceAPLAutumnBlueRidgeForest(config, biome.topBlock, biome.fillerBlock, 0f, 1.5f, 60f, 65f, 1.5f, Blocks.DIRT.getStateFromMeta(2), 0.15f)
        );

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLAutumnBlueRidgeForest.decorationLogsId)));
    }
}

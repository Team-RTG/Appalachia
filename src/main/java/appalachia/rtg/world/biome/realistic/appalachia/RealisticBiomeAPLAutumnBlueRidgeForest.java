package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLAutumnBlueRidgeForest;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;

public class RealisticBiomeAPLAutumnBlueRidgeForest extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.autumnBlueRidgeForest;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLAutumnBlueRidgeForest(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLAutumnBlueRidgeForest(),
            new SurfaceAPLAutumnBlueRidgeForest(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLAutumnBlueRidgeForest.decorationLogsId)));
    }
}

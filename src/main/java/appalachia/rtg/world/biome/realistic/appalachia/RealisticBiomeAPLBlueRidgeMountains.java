package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeMountains;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeMountains;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeMountains;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;

public class RealisticBiomeAPLBlueRidgeMountains extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeMountains;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLBlueRidgeMountains(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeMountains(120f, 100f),
            new SurfaceAPLBlueRidgeMountains(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.noWaterFeatures = true;

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeMountains.decorationLogsId)));
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

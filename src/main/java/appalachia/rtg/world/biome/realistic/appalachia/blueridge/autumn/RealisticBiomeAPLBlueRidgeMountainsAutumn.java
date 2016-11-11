package appalachia.rtg.world.biome.realistic.appalachia.blueridge.autumn;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeMountainsAutumn;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeMountainsAutumn;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;
import rtg.world.biome.realistic.RealisticBiomeBase;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLBlueRidgeMountainsAutumn extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeMountainsAutumn;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeMountainsAutumn(BiomeConfig config) {

        super(config, biome, river,
            new SurfaceAPLBlueRidgeMountainsAutumn(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );

        this.noWaterFeatures = true;

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeMountainsAutumn.decorationLogsId)));
    }

    @Override
    public TerrainBase initTerrain() {

        return RealisticBiomeBase.getBiome(Biome.getIdForBiome(AppalachiaBiomes.blueRidgeMountains)).getTerrain();
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

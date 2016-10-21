package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeRiver;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeRiver;

import rtg.api.biome.BiomeConfig;

public class RealisticBiomeAPLBlueRidgeRiver extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeRiver;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeRiver(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeRiver(),
            new SurfaceAPLBlueRidgeRiver(config)
        );
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

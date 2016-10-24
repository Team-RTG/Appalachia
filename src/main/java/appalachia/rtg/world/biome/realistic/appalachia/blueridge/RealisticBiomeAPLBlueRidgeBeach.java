package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeBeach;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeBeach;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;

public class RealisticBiomeAPLBlueRidgeBeach extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeBeach;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeBeach(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeBeach(),
            new SurfaceAPLBlueRidgeBeach(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.blueRidgeBeach);
    }
}

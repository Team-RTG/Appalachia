package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeMountains;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeMountains;

import rtg.api.biome.BiomeConfig;
import rtg.world.biome.deco.DecoBaseBiomeDecorations;

public class RealisticBiomeAPLBlueRidgeMountains extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeMountains;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLBlueRidgeMountains(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeMountains(),
            new SurfaceAPLBlueRidgeMountains(config, biome.topBlock, biome.fillerBlock)
        );

        this.noWaterFeatures = true;

        DecoBaseBiomeDecorations decoBaseBiomeDecorations = new DecoBaseBiomeDecorations();
        this.addDeco(decoBaseBiomeDecorations);
    }
}

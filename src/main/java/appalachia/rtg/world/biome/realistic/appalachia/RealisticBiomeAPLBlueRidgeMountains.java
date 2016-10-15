package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeMountains;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeForest;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeMountains;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeMountains;

import rtg.api.biome.BiomeConfig;

public class RealisticBiomeAPLBlueRidgeMountains extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeMountains;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLBlueRidgeMountains(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeMountains(120f, 100f),
            new SurfaceAPLBlueRidgeMountains(config,
                biome.topBlock, //Block top
                biome.fillerBlock, //Block filler,
                Blocks.DIRT.getStateFromMeta(2), //IBlockState mixTop,
                biome.fillerBlock, //IBlockState mixFill,
                80f, //float mixWidth,
                -0.15f, //float mixHeight,
                10f, //float smallWidth,
                0.5f //float smallStrength
            )
        );

        this.noWaterFeatures = true;

        this.addDecoCollection(new DecoCollectionBlueRidgeForest(this.config._boolean(BiomeConfigAPLBlueRidgeMountains.decorationLogsId)));
    }
}

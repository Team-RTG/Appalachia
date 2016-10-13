package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLAutumnBlueRidgeForest;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLAutumnBlueRidgeForest;

import rtg.api.biome.BiomeConfig;
import rtg.world.biome.deco.DecoBaseBiomeDecorations;
import rtg.world.biome.deco.DecoBoulder;
import rtg.world.biome.deco.DecoFallenTree;

public class RealisticBiomeAPLAutumnBlueRidgeForest extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.autumnBlueRidgeForest;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLAutumnBlueRidgeForest(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLAutumnBlueRidgeForest(58f, 84f, 24f),
            new SurfaceAPLAutumnBlueRidgeForest(config,
                biome.topBlock, //Block top
                biome.fillerBlock, //Block filler,
                biome.topBlock, //IBlockState mixTop,
                biome.fillerBlock, //IBlockState mixFill,
                80f, //float mixWidth, 
                -0.15f, //float mixHeight, 
                10f, //float smallWidth, 
                0.5f //float smallStrength
            )
        );

        DecoBoulder decoBoulder = new DecoBoulder();
        decoBoulder.boulderBlock = Blocks.COBBLESTONE.getDefaultState();
        decoBoulder.chance = 16;
        decoBoulder.maxY = 95;
        decoBoulder.strengthFactor = 1f;
        this.addDeco(decoBoulder);

        DecoFallenTree decoFallenTree = new DecoFallenTree();
        decoFallenTree.loops = 1;
        decoFallenTree.distribution.noiseDivisor = 100f;
        decoFallenTree.distribution.noiseFactor = 6f;
        decoFallenTree.distribution.noiseAddend = 0.8f;
        decoFallenTree.logCondition = DecoFallenTree.LogCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        decoFallenTree.logConditionNoise = 0f;
        decoFallenTree.logConditionChance = 16;
        decoFallenTree.logBlock = Blocks.LOG.getDefaultState();
        decoFallenTree.leavesBlock = Blocks.LEAVES.getDefaultState();
        decoFallenTree.minSize = 3;
        decoFallenTree.maxSize = 5;
        this.addDeco(decoFallenTree, this.config._boolean(BiomeConfigAPLAutumnBlueRidgeForest.decorationLogsId));

        DecoBaseBiomeDecorations decoBaseBiomeDecorations = new DecoBaseBiomeDecorations();
        decoBaseBiomeDecorations.notEqualsZeroChance = 12;
        decoBaseBiomeDecorations.loops = 1;
        this.addDeco(decoBaseBiomeDecorations);
    }
}

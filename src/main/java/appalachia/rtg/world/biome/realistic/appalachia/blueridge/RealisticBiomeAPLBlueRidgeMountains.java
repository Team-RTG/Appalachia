package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeMountains;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.terrain.SpikeEverywhereEffect;
import appalachia.rtg.world.gen.terrain.TerrainRidgedRegion;

import rtg.api.config.BiomeConfig;
import rtg.api.util.BlockUtil;
import rtg.api.util.CliffCalculator;
import rtg.api.util.noise.OpenSimplexNoise;
import rtg.api.world.RTGWorld;
import rtg.api.world.surface.SurfaceBase;
import rtg.api.world.terrain.FunctionalTerrainBase;
import rtg.api.world.terrain.TerrainBase;
import rtg.api.world.terrain.heighteffect.HeightVariation;
import rtg.api.world.terrain.heighteffect.JitterEffect;
import rtg.api.world.terrain.heighteffect.MountainsWithPassesEffect;
import rtg.api.world.terrain.heighteffect.RaiseEffect;


public class RealisticBiomeAPLBlueRidgeMountains extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeMountains;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    public RealisticBiomeAPLBlueRidgeMountains() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

        this.getConfig().addProperty(this.getConfig().ALLOW_LOGS).set(true);

        this.getConfig().addProperty(this.getConfig().SURFACE_MIX_BLOCK).set("");
        this.getConfig().addProperty(this.getConfig().SURFACE_MIX_BLOCK_META).set(0);
    }

    @Override
    public boolean noWaterFeatures() {
        return true;
    }

    @Override
    public TerrainBase initTerrain() {

        TerrainRidgedRegion.Parameters parameters = new TerrainRidgedRegion.Parameters();
        SpikeEverywhereEffect mountains= new SpikeEverywhereEffect();
        mountains.spiked = new RaiseEffect(70);
        mountains.octave = 2;
        mountains.power = 0.5f;
        mountains.wavelength = 200;
        mountains.minimumSimplex = 0.3f;
        parameters.ridgeAmplitude = mountains;
        parameters.ridgeBase = 40;
        return new TerrainRidgedRegion(parameters);
        //return new TerrainAPLBlueRidgeMountains(120f, 100f);
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLBlueRidgeMountains(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f);
    }

    public class SurfaceAPLBlueRidgeMountains extends SurfaceBase {

        public IBlockState mixBlock;
        public float width;
        public float height;

        public SurfaceAPLBlueRidgeMountains(BiomeConfig config, IBlockState top, IBlockState filler, IBlockState mix, float mixWidth, float mixHeight) {

            super(config, top, filler);

            mixBlock = this.getConfigBlock(config.SURFACE_MIX_BLOCK.get(), config.SURFACE_MIX_BLOCK_META.get(), mix);

            width = mixWidth;
            height = mixHeight;
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int z, int depth, RTGWorld rtgWorld, float[] noise, float river, Biome[] base) {

            Random rand = rtgWorld.rand;
            OpenSimplexNoise simplex = rtgWorld.simplex;
            float c = CliffCalculator.calc(x, z, noise);
            boolean cliff = c > 2.3f ? true : false; // 2.3f because higher thresholds result in fewer stone cliffs (more grassy cliffs)

            for (int k = 255; k > -1; k--) {
                Block b = primer.getBlockState(x, k, z).getBlock();
                if (b == Blocks.AIR) {
                    depth = -1;
                }
                else if (b == Blocks.STONE) {
                    depth++;

                    if (cliff) {
                        if (depth > -1 && depth < 2) {
                            if (rand.nextInt(3) == 0) {

                                primer.setBlockState(x, k, z, hcCobble(rtgWorld, i, j, x, z, k));
                            }
                            else {

                                primer.setBlockState(x, k, z, hcStone(rtgWorld, i, j, x, z, k));
                            }
                        }
                        else if (depth < 10) {
                            primer.setBlockState(x, k, z, hcStone(rtgWorld, i, j, x, z, k));
                        }
                    }
                    else {
                        if (depth == 0 && k > 61) {
                            if (simplex.noise2(i / width, j / width) > height) // > 0.27f, i / 12f
                            {
                                primer.setBlockState(x, k, z, mixBlock);
                            }
                            else {
                                primer.setBlockState(x, k, z, topBlock);
                            }
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, z, fillerBlock);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void initDecos() {

        this.addDecoCollection(new DecoCollectionBlueRidgeMountains(this.getConfig().ALLOW_LOGS.get()));
    }

    public class TerrainAPLBlueRidgeMountains extends FunctionalTerrainBase {

        protected float width;
        protected float strength;
        protected float spikeWidth = 40;
        protected float spikeHeight = 20;

        public TerrainAPLBlueRidgeMountains(float mountainWidth, float mountainStrength) {

            this(mountainWidth, mountainStrength, 90f);
        }

        public TerrainAPLBlueRidgeMountains(float mountainWidth, float mountainStrength, float baseHeight) {

            width = mountainWidth;
            strength = mountainStrength;
            base = baseHeight;
            MountainsWithPassesEffect mountainEffect = new MountainsWithPassesEffect();
            mountainEffect.mountainHeight = strength;
            mountainEffect.mountainWavelength = width;
            mountainEffect.spikeHeight = this.spikeHeight;
            mountainEffect.spikeWavelength = this.spikeWidth;

            this.height = new JitterEffect(6f, 10f, mountainEffect);
            height = new JitterEffect(2f, 6f, height);

            HeightVariation passHeight = new HeightVariation();
            passHeight.height = 15;
            passHeight.octave = 4;
            passHeight.wavelength = 70;

            height = height.plus(passHeight);

        }
    }

    @Override
    public Biome beachBiome() {
        return AppalachiaBiomes.blueRidgeBeach;
    }
}

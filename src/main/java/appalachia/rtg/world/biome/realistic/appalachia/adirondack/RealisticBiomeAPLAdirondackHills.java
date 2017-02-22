package appalachia.rtg.world.biome.realistic.appalachia.adirondack;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionAdirondackHills;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.rtg.world.gen.terrain.SpikeEverywhereEffect;
import appalachia.rtg.world.gen.terrain.TerrainRidgedRegion;

import rtg.api.config.BiomeConfig;
import rtg.api.util.BlockUtil;
import rtg.api.util.CliffCalculator;
import rtg.api.util.noise.OpenSimplexNoise;
import rtg.api.world.RTGWorld;
import rtg.api.world.surface.SurfaceBase;
import rtg.api.world.terrain.TerrainBase;
import rtg.api.world.terrain.heighteffect.RaiseEffect;


public class RealisticBiomeAPLAdirondackHills extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.adirondackHills;
    public static Biome river = AppalachiaBiomes.adirondackRiver;

    public RealisticBiomeAPLAdirondackHills() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

        this.getConfig().addProperty(this.getConfig().ALLOW_LOGS).set(true);

        this.getConfig().addProperty(this.getConfig().SURFACE_MIX_BLOCK).set("");
        this.getConfig().addProperty(this.getConfig().SURFACE_MIX_BLOCK_META).set(0);
    }

    @Override
    public TerrainBase initTerrain() {

        TerrainRidgedRegion.Parameters parameters = new TerrainRidgedRegion.Parameters();
        SpikeEverywhereEffect mountains= new SpikeEverywhereEffect();
        mountains.spiked = new RaiseEffect(40);
        mountains.octave = 2;
        mountains.power = 0.7f;
        mountains.wavelength = 200;
        mountains.minimumSimplex = 0.3f;
        parameters.ridgeAmplitude = mountains;
        parameters.ridgeBase =15;
        parameters.mediumJitter = 20;
        parameters.groundNoise = 4;
        return new TerrainRidgedRegion(parameters);
        //return new TerrainAPLAdirondackHills();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLAdirondackHills(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f);
    }

    public class SurfaceAPLAdirondackHills extends SurfaceBase {

        public IBlockState mixBlock;
        public float width;
        public float height;

        public SurfaceAPLAdirondackHills(BiomeConfig config, IBlockState top, IBlockState filler, IBlockState mix, float mixWidth, float mixHeight) {

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

        this.addDecoCollection(new DecoCollectionAdirondackHills(this.getConfig().ALLOW_LOGS.get()));
    }

    public class TerrainAPLAdirondackHills extends TerrainBase {

        protected float hillStrength = 30f;

        public TerrainAPLAdirondackHills() {

            this(72f, 30f);
        }

        public TerrainAPLAdirondackHills(float bh, float hs) {

            base = bh;
            hillStrength = hs;
        }

        @Override
        public float generateNoise(RTGWorld rtgWorld, int x, int y, float border, float river) {

            return terrainHighland(x, y, rtgWorld.simplex, rtgWorld.cell, river, 10f, 68f, hillStrength, base - 62f);

        }
    }

    @Override
    public Biome beachBiome() {
        return AppalachiaBiomes.adirondackBeach;
    }
}

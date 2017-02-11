package appalachia.rtg.world.biome.realistic.appalachia.smoky;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionSmokyBog;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;

import rtg.api.config.BiomeConfig;
import rtg.api.util.CliffCalculator;
import rtg.api.util.noise.OpenSimplexNoise;
import rtg.api.world.RTGWorld;
import rtg.api.world.surface.SurfaceBase;
import rtg.api.world.terrain.TerrainBase;
import rtg.api.world.terrain.heighteffect.HeightEffect;
import rtg.api.world.terrain.heighteffect.HeightVariation;
import rtg.api.world.terrain.heighteffect.JitterEffect;


public class RealisticBiomeAPLSmokyBogAutumn extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.smokyBogAutumn;
    public static Biome river = AppalachiaBiomes.smokyRiver;

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public RealisticBiomeAPLSmokyBogAutumn() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

        this.getConfig().addProperty(this.getConfig().ALLOW_LOGS).set(true);
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLSmokyBogAutumn();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLSmokyBogAutumn(config, biome.topBlock, biome.fillerBlock);
    }

    public class SurfaceAPLSmokyBogAutumn extends SurfaceBase {

        public SurfaceAPLSmokyBogAutumn(BiomeConfig config, IBlockState top, IBlockState filler) {

            super(config, top, filler);
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int y, int depth, RTGWorld rtgWorld, float[] noise, float river, Biome[] base) {

            Random rand = rtgWorld.rand;
            OpenSimplexNoise simplex = rtgWorld.simplex;
            float c = CliffCalculator.calc(x, y, noise);
            boolean cliff = c > 1.4f ? true : false;

            for (int k = 255; k > -1; k--) {
                Block b = primer.getBlockState(x, k, y).getBlock();
                if (b == Blocks.AIR) {
                    depth = -1;
                }
                else if (b == Blocks.STONE) {
                    depth++;

                    if (cliff) {
                        if (depth > -1 && depth < 2) {
                            if (rand.nextInt(3) == 0) {

                                primer.setBlockState(x, k, y, hcCobble(rtgWorld, i, j, x, y, k));
                            }
                            else {

                                primer.setBlockState(x, k, y, hcStone(rtgWorld, i, j, x, y, k));
                            }
                        }
                        else if (depth < 10) {
                            primer.setBlockState(x, k, y, hcStone(rtgWorld, i, j, x, y, k));
                        }
                    }
                    else {
                        if (depth == 0 && k > 61) {
                            primer.setBlockState(x, k, y, topBlock);
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, y, fillerBlock);
                        }
                    }
                }
            }
        }
    }

    public class TerrainAPLSmokyBogAutumn extends TerrainBase {

        private HeightEffect height;

        public TerrainAPLSmokyBogAutumn() {

            HeightVariation waterLand = new HeightVariation();
            waterLand.height = 1f;
            waterLand.wavelength = 40f;
            waterLand.octave = 0;

            height = new JitterEffect(5f, 10f, waterLand);

        }

        @Override
        public float generateNoise(RTGWorld rtgWorld, int x, int y, float border, float river) {

            return 62f + height.added(rtgWorld, x, y);
        }
    }

    @Override
    public void initDecos() {

        this.addDecoCollection(new DecoCollectionSmokyBog(this.getConfig().ALLOW_LOGS.get()));
    }

    @Override
    public Biome beachBiome() {
        return AppalachiaBiomes.smokyBeach;
    }
}

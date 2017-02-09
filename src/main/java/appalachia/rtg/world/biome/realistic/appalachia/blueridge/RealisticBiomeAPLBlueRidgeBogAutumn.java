package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.deco.collection.DecoCollectionBlueRidgeBog;
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


public class RealisticBiomeAPLBlueRidgeBogAutumn extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeBogAutumn;
    public static Biome river = AppalachiaBiomes.blueRidgeRiver;

    protected static int treeMaxY = 220;
    protected static int shrubMaxY = 220;

    public RealisticBiomeAPLBlueRidgeBogAutumn() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

        this.getConfig().addProperty(this.getConfig().ALLOW_LOGS).set(true);
    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLBlueRidgeBogAutumn();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLBlueRidgeBogAutumn(config, biome.topBlock, biome.fillerBlock);
    }

    public class SurfaceAPLBlueRidgeBogAutumn extends SurfaceBase {

        public SurfaceAPLBlueRidgeBogAutumn(BiomeConfig config, IBlockState top, IBlockState filler) {

            super(config, top, filler);
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int z, int depth, RTGWorld rtgWorld, float[] noise, float river, Biome[] base) {

            Random rand = rtgWorld.rand;
            OpenSimplexNoise simplex = rtgWorld.simplex;
            float c = CliffCalculator.calc(x, z, noise);
            boolean cliff = c > 1.4f ? true : false;

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
                            primer.setBlockState(x, k, z, topBlock);
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, z, fillerBlock);
                        }
                    }
                }
            }
        }
    }

    public class TerrainAPLBlueRidgeBogAutumn extends TerrainBase {

        private HeightEffect height;

        public TerrainAPLBlueRidgeBogAutumn() {

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

        this.addDecoCollection(new DecoCollectionBlueRidgeBog(this.getConfig().ALLOW_LOGS.get()));
    }

    @Override
    public Biome beachBiome() {
        return AppalachiaBiomes.blueRidgeBeach;
    }
}

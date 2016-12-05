package appalachia.rtg.world.biome.realistic.appalachia.smoky;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;

import rtg.api.config.BiomeConfig;
import rtg.api.util.noise.OpenSimplexNoise;
import rtg.api.world.RTGWorld;
import rtg.world.gen.surface.SurfaceBase;
import rtg.world.gen.terrain.TerrainBase;

public class RealisticBiomeAPLSmokyRiver extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.smokyRiver;
    public static Biome river = AppalachiaBiomes.smokyRiver;

    public RealisticBiomeAPLSmokyRiver() {

        super(biome, river);
    }

    @Override
    public void initConfig() {

    }

    @Override
    public TerrainBase initTerrain() {

        return new TerrainAPLSmokyRiver();
    }

    @Override
    public SurfaceBase initSurface() {

        return new SurfaceAPLSmokyRiver(config);
    }

    public class SurfaceAPLSmokyRiver extends SurfaceBase {

        public SurfaceAPLSmokyRiver(BiomeConfig config) {

            super(config, Blocks.GRASS, (byte) 0, Blocks.DIRT, (byte) 0);
        }

        @Override
        public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int z, int depth, RTGWorld rtgWorld, float[] noise, float river, Biome[] base) {

            Random rand = rtgWorld.rand;
            OpenSimplexNoise simplex = rtgWorld.simplex;

            if (river > 0.05f && river + (simplex.noise2(i / 10f, j / 10f) * 0.15f) > 0.8f) {
                Block b;
                for (int k = 255; k > -1; k--) {
                    b = primer.getBlockState(x, k, z).getBlock();
                    if (b == Blocks.AIR) {
                        depth = -1;
                    }
                    else if (b != Blocks.WATER) {
                        depth++;

                        if (depth == 0 && k > 61) {
                            primer.setBlockState(x, k, z, Blocks.GRASS.getDefaultState());
                        }
                        else if (depth < 4) {
                            primer.setBlockState(x, k, z, Blocks.DIRT.getDefaultState());
                        }
                        else if (depth > 4) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void initDecos() {

    }

    public class TerrainAPLSmokyRiver extends TerrainBase {

        public TerrainAPLSmokyRiver() {

        }

        @Override
        public float generateNoise(RTGWorld rtgWorld, int x, int y, float border, float river) {

            return terrainFlatLakes(x, y, rtgWorld.simplex, river, 3f, 60f);
        }
    }

    @Override
    public Biome beachBiome() {
        return this.beachBiome(AppalachiaBiomes.smokyBeach);
    }
}

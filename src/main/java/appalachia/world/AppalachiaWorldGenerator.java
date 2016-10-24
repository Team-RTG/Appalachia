package appalachia.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;

import net.minecraftforge.fml.common.IWorldGenerator;


public class AppalachiaWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimension()) {
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;

            default:
                break;
        }
    }

    public void generateSurface(World world, Random random, int chunkX, int chunkZ) {

    }
}
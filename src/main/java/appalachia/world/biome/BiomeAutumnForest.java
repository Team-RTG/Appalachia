package appalachia.world.biome;

import java.util.Random;

import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeAutumnForest extends AppalachiaBiome implements IAppalachiaBiome {

    public static BiomeDictionary.Type[] biomeTypes;

    public BiomeAutumnForest(BiomeProperties props)
    {
        super(props);
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();
        theBiomeDecorator.treesPerChunk = 4;
        spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 60, 1, 5));
        spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 60, 1, 3));

        biomeTypes = new BiomeDictionary.Type[] { BiomeDictionary.Type.FOREST };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new BiomeAutumnForestDecorator();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos)
    {
        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand)
    {
        return rand.nextInt(3) == 0 ? TREE_FEATURE : rand.nextInt(5) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float temp)
    {
        double noise = GRASS_COLOR_NOISE.getValue((double)temp * 0.0225D, (double)temp * 0.0225D);
        return noise < -0.7D ? 0xD4DB55 : (noise < -0.3D ? 0xBBDD54 : 0xA3E053);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos)
    {
        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return noise < -0.7D ? 0xD4DB55 : (noise < -0.3D ? 0xBBDD54 : 0xA3E053);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos)
    {
        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return noise < -0.7D ? 0xD4DB55 : (noise < -0.3D ? 0xBBDD54 : 0xA3E053);
    }
}
package appalachia.api.biome.blueridge.autumn;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.AppalachiaBiome;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeForestAutumn;
import appalachia.entity.monster.EntityBlackBear;

import rtg.util.OpenSimplexNoise;

public class BiomeBlueRidgeForestAutumn extends AppalachiaBiome implements IAppalachiaBiome {

    public static BiomeDictionary.Type[] biomeTypes;

    private static final int leafColours[] = {
        15924992, 16776960, 16773632, 16770560, 16767232, 16763904,
        16760576, 16757504, 16754176, 16750848, 16747520, 16744448,
        16741120, 16737792, 16734464, 16731392, 16728064, 16724736, 16721408
    };

    public OpenSimplexNoise simplex = new OpenSimplexNoise(4444);

    public BiomeBlueRidgeForestAutumn(BiomeProperties props) {

        super(props);
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();
        theBiomeDecorator.treesPerChunk = 1;

        this.spawnableCreatureList.add(new SpawnListEntry(EntityBlackBear.class, 8, 1, 2));

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.AUTUMN,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {

        return new DecoratorBlueRidgeForestAutumn();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos) {

        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand) {

        return rand.nextInt(3) == 0 ? TREE_FEATURE : rand.nextInt(5) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE;
    }

//    @Override
//    @SideOnly(Side.CLIENT)
//    public int getSkyColorByTemp(float temp)
//    {
//        double noise = GRASS_COLOR_NOISE.getValue((double)temp * 0.0225D, (double)temp * 0.0225D);
//        return (noise < -0.5D) ? 0xB52C0A : ((noise > 0.5D) ? 0xA81411 : 0xB31D01);
//    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos) {

        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        //return noise < -0.1D ? 0x9c752a : 0x967129; // Brown.
        return noise < -0.1D ? 0x968c29 : 0x968129;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {

        int noise = (int) (simplex.noise(pos.getX()/16, pos.getZ()/16)*9+9);
        return leafColours[noise];
    }
}
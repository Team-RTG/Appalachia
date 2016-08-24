package appalachia.world.biome;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AppalachianBiome extends Biome {

    public AppalachianBiome(BiomeProperties props)
    {
        super(props);
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();
        theBiomeDecorator.treesPerChunk = 3;

        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    @Override
    public void decorate(World world, Random rand, BlockPos pos)
    {
        super.decorate(world, rand, pos);
    }

    @Override
    public WorldGenAbstractTree genBigTreeChance(Random rand)
    {
        return rand.nextInt(3) == 0 ? TREE_FEATURE : rand.nextInt(5) == 0 ? new WorldGenBigTree(false) : TREE_FEATURE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float temp)
    {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos)
    {
        return 0x30217A;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos)
    {
        return 0x30217A;
    }
}
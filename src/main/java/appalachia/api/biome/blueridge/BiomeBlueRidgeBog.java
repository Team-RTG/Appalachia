package appalachia.api.biome.blueridge;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.entity.passive.EntityFireFly;

public class BiomeBlueRidgeBog extends BiomeBlueRidge implements IAppalachiaBiome {

    public static BiomeDictionary.Type[] biomeTypes;

    public BiomeBlueRidgeBog(BiomeProperties props) {

        super(props);

        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.DIRT.getDefaultState();
        theBiomeDecorator.treesPerChunk = 2;

        this.spawnableCreatureList.clear();
        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireFly.class, 10, 4, 8));

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.SWAMP,
            BiomeDictionary.Type.LUSH,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

//    @Override
//    @SideOnly(Side.CLIENT)
//    public int getSkyColorByTemp(float temp)
//    {
//        return 0x347db0;
//    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getGrassColorAtPos(BlockPos pos) {

        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return noise < -0.1D ? 0x6E661E : 0x7B7322;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {

        double noise = GRASS_COLOR_NOISE.getValue((double)pos.getX() * 0.0225D, (double)pos.getZ() * 0.0225D);
        return noise < -0.1D ? 0x6E661E : 0x7B7322;
    }
}
package appalachia.api.biome.blueridge;

import net.minecraft.init.Blocks;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeBlueRidgeBeach extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeBeach(BiomeProperties props) {

        super(props);

        this.topBlock = Blocks.GRAVEL.getDefaultState();

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.BEACH,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }
}
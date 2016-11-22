package appalachia.api.biome.blueridge;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeBlueRidgeHills extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeHills(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            BiomeDictionary.Type.HILLS,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }
}
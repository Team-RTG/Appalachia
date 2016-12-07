package appalachia.api.biome.adirondack;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeAdirondackHills extends BiomeAdirondack implements IAppalachiaBiome {

    public BiomeAdirondackHills(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            BiomeDictionary.Type.HILLS,
            AppalachiaBiomeTypes.ADIRONDACK
        };
    }
}
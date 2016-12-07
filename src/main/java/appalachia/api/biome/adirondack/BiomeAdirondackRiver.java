package appalachia.api.biome.adirondack;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeAdirondackRiver extends BiomeAdirondack implements IAppalachiaBiome {

    public BiomeAdirondackRiver(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.RIVER,
            BiomeDictionary.Type.WATER,
            AppalachiaBiomeTypes.ADIRONDACK
        };
    }
}
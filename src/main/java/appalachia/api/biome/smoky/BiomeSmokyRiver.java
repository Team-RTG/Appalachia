package appalachia.api.biome.smoky;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeSmokyRiver extends BiomeSmoky implements IAppalachiaBiome {

    public BiomeSmokyRiver(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.RIVER,
            BiomeDictionary.Type.WATER,
            AppalachiaBiomeTypes.SMOKY
        };
    }
}
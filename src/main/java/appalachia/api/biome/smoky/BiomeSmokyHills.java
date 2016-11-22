package appalachia.api.biome.smoky;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeSmokyHills extends BiomeSmoky implements IAppalachiaBiome {

    public BiomeSmokyHills(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            BiomeDictionary.Type.HILLS,
            AppalachiaBiomeTypes.SMOKY
        };
    }
}
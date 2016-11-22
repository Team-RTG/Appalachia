package appalachia.api.biome.smoky;

import net.minecraft.init.Blocks;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeSmokyBeach extends BiomeSmoky implements IAppalachiaBiome {

    public BiomeSmokyBeach(BiomeProperties props) {

        super(props);

        this.topBlock = Blocks.GRAVEL.getDefaultState();

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.BEACH,
            AppalachiaBiomeTypes.SMOKY
        };
    }
}
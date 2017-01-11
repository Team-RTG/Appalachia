package appalachia.api.biome.adirondack;

import net.minecraft.init.Blocks;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeAdirondackBeach extends BiomeAdirondack implements IAppalachiaBiome {

    public BiomeAdirondackBeach(BiomeProperties props) {

        super(props);

        this.topBlock = Blocks.GRAVEL.getDefaultState();

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.BEACH,
            AppalachiaBiomeTypes.ADIRONDACK
        };
    }
}
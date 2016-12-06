package appalachia.api.biome.adirondack;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.entity.passive.EntityFireFly;

public class BiomeAdirondackForest extends BiomeAdirondack implements IAppalachiaBiome {

    public BiomeAdirondackForest(BiomeProperties props) {

        super(props);

        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireFly.class, 10, 4, 8));

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.ADIRONDACK
        };
    }
}
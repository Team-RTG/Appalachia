package appalachia.api.biome.smoky;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.entity.passive.EntityFireFly;

public class BiomeSmokyForest extends BiomeSmoky implements IAppalachiaBiome {

    public BiomeSmokyForest(BiomeProperties props) {

        super(props);

        this.spawnableCreatureList.add(new SpawnListEntry(EntityFireFly.class, 15, 4, 10));

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.SMOKY
        };
    }
}
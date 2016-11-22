package appalachia.api.biome.blueridge;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.entity.passive.EntityFireFly;

public class BiomeBlueRidgeForest extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeForest(BiomeProperties props) {

        super(props);

        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireFly.class, 10, 4, 8));

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }
}
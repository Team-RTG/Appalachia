package appalachia.api.biome.blueridge;

import net.minecraft.world.biome.BiomeDecorator;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeForest;

public class BiomeBlueRidgeForest extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeForest(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new DecoratorBlueRidgeForest();
    }
}
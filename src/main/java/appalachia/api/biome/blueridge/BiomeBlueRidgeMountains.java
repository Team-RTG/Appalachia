package appalachia.api.biome.blueridge;

import net.minecraft.world.biome.BiomeDecorator;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeMountains;

public class BiomeBlueRidgeMountains extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeMountains(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.HILLS,
            BiomeDictionary.Type.MOUNTAIN,
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new DecoratorBlueRidgeMountains();
    }
}
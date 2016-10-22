package appalachia.api.biome.blueridge;

import net.minecraft.world.biome.BiomeDecorator;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeRiver;

public class BiomeBlueRidgeRiver extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeRiver(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.RIVER,
            BiomeDictionary.Type.WATER,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new DecoratorBlueRidgeRiver();
    }
}
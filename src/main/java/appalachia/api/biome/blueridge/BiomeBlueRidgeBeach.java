package appalachia.api.biome.blueridge;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;

import net.minecraftforge.common.BiomeDictionary;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeBeach;

public class BiomeBlueRidgeBeach extends BiomeBlueRidge implements IAppalachiaBiome {

    public BiomeBlueRidgeBeach(BiomeProperties props) {

        super(props);

        this.topBlock = Blocks.GRAVEL.getDefaultState();

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.BEACH,
            AppalachiaBiomeTypes.BLUERIDGE
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new DecoratorBlueRidgeBeach();
    }
}
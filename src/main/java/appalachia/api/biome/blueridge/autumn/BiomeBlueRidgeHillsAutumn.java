package appalachia.api.biome.blueridge.autumn;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.BiomeDecorator;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;
import appalachia.api.biome.blueridge.BiomeBlueRidgeHills;
import appalachia.api.biome.decorator.blueridge.DecoratorBlueRidgeHillsAutumn;

public class BiomeBlueRidgeHillsAutumn extends BiomeBlueRidgeHills implements IAppalachiaBiome {

    public BiomeBlueRidgeHillsAutumn(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.FOREST,
            BiomeDictionary.Type.DENSE,
            BiomeDictionary.Type.HILLS,
            AppalachiaBiomeTypes.BLUERIDGE,
            AppalachiaBiomeTypes.AUTUMN
        };
    }

    @Override
    public BiomeDecorator createBiomeDecorator() {
        return new DecoratorBlueRidgeHillsAutumn();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {

        int noise = (int) (simplex.noise(pos.getX()/16, pos.getZ()/16)*9+9);
        return leafColours[noise];
    }
}
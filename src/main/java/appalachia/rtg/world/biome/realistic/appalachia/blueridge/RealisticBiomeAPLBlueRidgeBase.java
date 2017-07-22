package appalachia.rtg.world.biome.realistic.appalachia.blueridge;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;


public abstract class RealisticBiomeAPLBlueRidgeBase extends RealisticBiomeAPLBase {

    public RealisticBiomeAPLBlueRidgeBase(Biome biome, Biome river) {
        super(biome, river);
    }

    @Override
    public Biome beachBiome() {
        return (AppalachiaBiomes.blueRidgeBeach != null) ? AppalachiaBiomes.blueRidgeBeach : Biomes.STONE_BEACH;
    }
}

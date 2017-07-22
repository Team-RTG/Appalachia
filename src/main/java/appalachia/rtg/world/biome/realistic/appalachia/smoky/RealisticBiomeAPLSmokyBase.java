package appalachia.rtg.world.biome.realistic.appalachia.smoky;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;


public abstract class RealisticBiomeAPLSmokyBase extends RealisticBiomeAPLBase {

    public RealisticBiomeAPLSmokyBase(Biome biome, Biome river) {
        super(biome, river);
    }

    @Override
    public Biome beachBiome() {
        return (AppalachiaBiomes.smokyBeach != null) ? AppalachiaBiomes.smokyBeach : Biomes.STONE_BEACH;
    }
}

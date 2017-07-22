package appalachia.rtg.world.biome.realistic.appalachia.adirondack;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;


public abstract class RealisticBiomeAPLAdirondackBase extends RealisticBiomeAPLBase {

    public RealisticBiomeAPLAdirondackBase(Biome biome, Biome river) {
        super(biome, river);
    }

    @Override
    public Biome beachBiome() {
        return (AppalachiaBiomes.adirondackBeach != null) ? AppalachiaBiomes.adirondackBeach : Biomes.STONE_BEACH;
    }
}

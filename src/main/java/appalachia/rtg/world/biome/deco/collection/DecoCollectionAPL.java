package appalachia.rtg.world.biome.deco.collection;

import appalachia.rtg.world.biome.deco.DecoPlants;

import rtg.api.config.BiomeConfig;
import rtg.api.world.deco.DecoGrass;
import rtg.api.world.deco.collection.DecoCollectionBase;


public class DecoCollectionAPL extends DecoCollectionBase {

    protected static int treeMaxY = 220;
    protected static int foliageMaxY = 220;

    public DecoCollectionAPL(BiomeConfig config) {

        super(config);

        // Plants
        DecoPlants decoPlants = new DecoPlants();
        decoPlants.setMinY(63);
        decoPlants.setMaxY(foliageMaxY);
        decoPlants.setLoops(4);
        this.addDeco(decoPlants);

        // Ferns.
        DecoGrass decoFern = new DecoGrass(2);
        decoFern.setMinY(63);
        decoFern.setMaxY(foliageMaxY);
        decoFern.setLoops(2);
        this.addDeco(decoFern);

        // Grass filler.
        DecoGrass decoGrass = new DecoGrass();
        decoGrass.setMinY(63);
        decoGrass.setMaxY(foliageMaxY);
        decoGrass.setStrengthFactor(16f);
        this.addDeco(decoGrass);
    }
}

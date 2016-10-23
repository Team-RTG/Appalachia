package appalachia.rtg.world.gen.terrain.appalachia;

import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.gen.terrain.TerrainBase;

public class TerrainAPLBlueRidgeHills extends TerrainBase {

    private float hillStrength = 30f;

    public TerrainAPLBlueRidgeHills() {

        this(72f, 30f);
    }

    public TerrainAPLBlueRidgeHills(float bh, float hs) {

        base = bh;
        hillStrength = hs;
    }

    @Override
    public float generateNoise(OpenSimplexNoise simplex, CellNoise cell, int x, int y, float border, float river) {

        return terrainHighland(x, y, simplex, cell, river, 10f, 68f, hillStrength, base - 62f);

    }
}

package appalachia.rtg.world.gen.terrain.appalachia;

import rtg.world.gen.terrain.FunctionalTerrainBase;
import rtg.world.gen.terrain.HeightVariation;
import rtg.world.gen.terrain.JitterEffect;
import rtg.world.gen.terrain.MountainsWithPassesEffect;

public class TerrainAPLBlueRidgeMountains extends FunctionalTerrainBase {

    protected float width;
    protected float strength;
    protected float spikeWidth = 40;
    protected float spikeHeight = 20;

    public TerrainAPLBlueRidgeMountains(float mountainWidth, float mountainStrength) {

        this(mountainWidth, mountainStrength, 90f);
    }

    public TerrainAPLBlueRidgeMountains(float mountainWidth, float mountainStrength, float baseHeight) {

        width = mountainWidth;
        strength = mountainStrength;
        base = baseHeight;
        MountainsWithPassesEffect mountainEffect = new MountainsWithPassesEffect();
        mountainEffect.mountainHeight = strength;
        mountainEffect.mountainWavelength = width;
        mountainEffect.spikeHeight = this.spikeHeight;
        mountainEffect.spikeWavelength = this.spikeWidth;

        this.height = new JitterEffect(6f, 10f, mountainEffect);
        height = new JitterEffect(2f, 6f, height);

        HeightVariation passHeight = new HeightVariation();
        passHeight.height = 15;
        passHeight.octave = 4;
        passHeight.wavelength = 70;

        height = height.plus(passHeight);

    }
}
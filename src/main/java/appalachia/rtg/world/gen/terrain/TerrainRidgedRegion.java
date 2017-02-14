/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.rtg.world.gen.terrain;

import rtg.api.world.RTGWorld;
import rtg.api.world.terrain.TerrainBase;
import rtg.api.world.terrain.heighteffect.HeightEffect;
import rtg.api.world.terrain.heighteffect.HeightVariation;
import rtg.api.world.terrain.heighteffect.JitterEffect;
import rtg.api.world.terrain.heighteffect.RaiseEffect;

/**
 *
 * @author Zeno410
 */
public class TerrainRidgedRegion extends TerrainBase {
    
    private float basinWavelength;
    private HeightEffect ridgeAmplitude;
    VoronoiRidgingEffect ridging;
    private HeightEffect ridgeBase;
    private HeightEffect totalHeight;
    private float groundNoise;
    public TerrainRidgedRegion(Parameters parameters) {
        this.base = parameters.base;
        this.basinWavelength = parameters.basinWavelength;
        ridging = new VoronoiRidgingEffect();
        ridging.floor = parameters.basinFloor;
        ridging.cap = parameters.ridgeCap;
        ridging.minimumDivisor =.5f;
        ridging.pointWavelength = basinWavelength;
        ridgeAmplitude = parameters.ridgeAmplitude;
        groundNoise = parameters.groundNoise;
        
        // base ridge level
        HeightVariation underlying = new HeightVariation();
        underlying.height = parameters.ridgeVariability;
        underlying.octave = 3;
        underlying.wavelength = 50;
        ridgeBase = underlying.plus(new RaiseEffect(parameters.ridgeBase));
        
        JitterEffect overall = new JitterEffect();
        overall.amplitude = parameters.jitterAmplitude;
        overall.wavelength = parameters.jitterWavelength;
        overall.jittered = new MultipliedEffects(ridging,ridgeAmplitude.plus(ridgeBase));
        
        JitterEffect wobble = new JitterEffect();
        wobble.amplitude = parameters.mediumJitter;
        wobble.wavelength = 50;
        wobble.jittered = overall;
        
        totalHeight = overall;
                
    }

    public static class Parameters {
        public float base = 72f;
        public float basinWavelength = 2500f;
        public float jitterWavelength = 200f;
        public float jitterAmplitude = 50f;
        public HeightEffect ridgeAmplitude = new RaiseEffect(70);   
        public float basinFloor = 0.1f;
        public float ridgeCap = 1.0f;
        public float ridgeBase = 10f;
        public float ridgeVariability = 10;
        public float mediumJitter = 10;
        public float groundNoise = 6;
    }
    @Override
    public float generateNoise(RTGWorld rtgw,  int x, int y, float border, float river) {
        return riverized(totalHeight.added(rtgw, x, y)+base+TerrainBase.groundNoise(x, y, river, rtgw.simplex),river);
    }

}

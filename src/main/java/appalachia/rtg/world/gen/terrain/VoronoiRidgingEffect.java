/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.rtg.world.gen.terrain;

import rtg.api.world.RTGWorld;
import rtg.api.world.terrain.heighteffect.HeightEffect;
import rtg.api.world.terrain.TerrainBase;

/**
 * This returns a value generally between just below 0 and 1 depending on the distance from a voronoi cell border
 * It uses multipliers and modulos to produce multiple round of ridges
 * 0 is on the border
 * @author Zeno410
 */
public class VoronoiRidgingEffect extends HeightEffect {

    public float pointWavelength = 0;
    public float floor = -0.1f;
    public float minimumDivisor = 0.1f;//low divisors can produce excessive rates of change
    public float cycles = 5f;// the number of ridges passed between the border and the center
    public float cap = 1.1f; // A cap to smooth out ridge tops.
    
    public VoronoiRidgingEffect() {}
    
    @Override
    public float added(RTGWorld rtgWorld, float x, float y) {
         double[] points = rtgWorld.cell.octave(1).eval((float) x / pointWavelength, (float) y / pointWavelength);      
         //double divisor = Math.max(minimumDivisor, points[1]);
         float raise = (float) ((points[1] - points[0]) / points[1]);
         // make it cycle: multiply by cycles and get the distance from the nearest integer;
         
         raise *= cycles;
         raise -= Math.round(raise);
         raise = Math.abs(raise)*2f;
         raise = 1.0f-raise;
         raise = TerrainBase.blendedHillHeight(raise, floor);
         // smooth off the tops
         raise = 1f - TerrainBase.blendedHillHeight(1f - raise, 1f - cap);
         // if this will be too steep tamp it down
         if (points[1]< minimumDivisor) {
             raise = raise * (float)(points[1]/minimumDivisor);
         }
         return raise;
    }


}
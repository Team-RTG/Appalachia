/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.rtg.world.gen.terrain;

import rtg.api.world.RTGWorld;
import rtg.api.world.terrain.heighteffect.HeightEffect;

/**
 *
 * @author Zeno410
 */
public class MultipliedEffects extends HeightEffect {
    private final HeightEffect first;
    private final HeightEffect second;
    
    public MultipliedEffects(HeightEffect first, HeightEffect second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public float added(RTGWorld rtgw, float f, float f1) {
        return first.added(rtgw, f, f1)*second.added(rtgw, f, f1);
    }

}

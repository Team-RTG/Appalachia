/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import net.minecraft.world.gen.layer.GenLayer;

/**
 * This class copies the prior layer into a new array that won't get zapped by
 * IntCache manipulations
 * @author Zeno410
 */
public class GenLayerReliable extends GenLayer {
    
    public GenLayerReliable(GenLayer parent) {
        super(0);
        this.parent = parent;
    }

    @Override
    public int[] getInts(int arg0, int arg1, int arg2, int arg3) {
        int [] source = parent.getInts(arg0, arg1, arg2, arg3);
        int [] result = new int[source.length];
        System.arraycopy(source, 0, result, 0, source.length);
        return result;
    }
    
}
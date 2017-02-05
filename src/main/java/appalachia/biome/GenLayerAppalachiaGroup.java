/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import net.minecraft.world.gen.layer.GenLayer;

/**
 *
 * @author Zeno410
 */
public class GenLayerAppalachiaGroup extends GenLayer {        

    public GenLayerAppalachiaGroup(long seed, GenLayer parent) {
        super(seed);
        this.parent = parent;
    }
    
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int [] parentVals = parent.getInts(par1, par2, par3, par4);
        int[] var6 = new int[par3 * par4];


        for (int var7 = 0; var7 < par4; ++var7) {
            for (int var8 = 0; var8 < par3; ++var8){
                int index = var8 + var7 * par3;
                if (parentVals[index]==0) {
                    var6[index] = 0;
                } else {
                    this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                    // three groups, plus one to distinguish them from non-APP biomes
                    var6[index] = this.nextInt(3)+1;
                }
            }
        }
        return var6;
    }


}

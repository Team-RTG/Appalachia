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
public class GenLayerAppalachia extends GenLayer {
    /**
     * Returns an array of boolean values. True indicates place an Appalachia biome if possible
     */
    
    private int probability;
    public GenLayerAppalachia(int probability) {
        super(4321L);
        this.probability = probability;
    }
    
    public int[] getInts(int par1, int par2, int par3, int par4)
    {
        //int[] var5 = this.parent.getInts(par1, par2, par3, par4);
        int[] var6 = new int[par3 * par4];


        for (int var7 = 0; var7 < par4; ++var7) {
            for (int var8 = 0; var8 < par3; ++var8){
                this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                var6[var8 + var7 * par3] = (this.nextInt(100)< probability) ? 1 :0 ;
            }
        }
        return var6;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appalachia.biome;

/**
 *
 * @author Zeno410
 */
public enum AppalachiaBiomeGroup {
    BLUERIDGE(1),
    SMOKY (2),
    ADIRONDACK(3);
    
    public final int groupNumber;
    
     AppalachiaBiomeGroup(int number) {
         groupNumber = number;
     }
    
}

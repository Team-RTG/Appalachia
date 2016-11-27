/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import climateControl.api.BiomePackage;
import climateControl.api.BiomePackageRegistry;
import climateControl.api.BiomeSettings;

/**
 *
 * @author Zeno410
 */
public class GeographicraftPackage extends BiomePackage {

    private GeographicraftSettings cloned;
    public GeographicraftPackage(GeographicraftSettings cloned) {
        super("AppalachiaInGC.cfg");
        this.cloned = cloned;
    }
    @Override
    public BiomeSettings freshBiomeSetting() {
        return cloned.copy();
    }
    
    public void activate() {

        try {
            BiomePackageRegistry.instance.register(this);
        }
        catch (Exception e) {
            throw new RuntimeException("Geographicraft not found.");
        }
    }

}

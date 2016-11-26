/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

/**
 *
 * @author Zeno410
 */
public class GeographicraftSettingsBuilder {
    
    private GeographicraftSettings settings;
    private GeographicraftPackage geographicraftPackage;
    
    public GeographicraftSettingsBuilder() {
        try {
            settings = new GeographicraftSettings();
            geographicraftPackage = new GeographicraftPackage(settings);
        } catch (Error error) {
            // no action; Geographicraft is not installed;
        }
    }

    public void registerBiomeWithTypes(Biome biome, String name, int weight, BiomeManager.BiomeType btype, BiomeDictionary.Type... types) {
         if (settings != null) {
             settings.registerBiomeWithTypes(biome, name, weight, btype, types);
         }
    }
    
    public void activate() {
        if (geographicraftPackage != null) geographicraftPackage.activate();
    }
}


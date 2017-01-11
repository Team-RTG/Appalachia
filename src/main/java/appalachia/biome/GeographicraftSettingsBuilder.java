/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import java.util.Collection;
import net.minecraft.world.WorldType;
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
    private GeographicraftGrouper grouper;
    
    public GeographicraftSettingsBuilder() {
        try {
            settings = new GeographicraftSettings();
            geographicraftPackage = new GeographicraftPackage(settings);
        } catch (Error error) {
            // no action; Geographicraft is not installed;
        }
    }

    public void setBiomes(Collection<Biome> appalachiaBiomes) {
        try {
            grouper = new GeographicraftGrouper(appalachiaBiomes,2,30);
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
    
    public void updateBiomes(WorldType worldType) {
        if (geographicraftPackage != null) geographicraftPackage.onInitBiomeGens(worldType);
    }
}


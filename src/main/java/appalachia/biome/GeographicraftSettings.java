/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;


import java.io.File;

import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

import climateControl.api.BiomeSettings;
import climateControl.api.ClimateControlRules;
import climateControl.api.ClimateDistribution;

/**
 *
 * @author Zeno410
 */
public class GeographicraftSettings extends BiomeSettings {

    public GeographicraftSettings() {
        super("Appalachia");
    }

    public void registerBiomeWithTypes(Biome biome, String name, AppalachiaBiomeGroup group, int weight, BiomeManager.BiomeType btype, BiomeDictionary.Type... types) {
        // creating the biome
        Element gcBiome = new Element(biome.getBiomeName(), Biome.getIdForBiome(biome), weight, false, ClimateDistribution.MEDIUM.name());
    }
    
    public GeographicraftSettings copy() {
        GeographicraftSettings result = new GeographicraftSettings();
        for (Element element: this.elements()) {
            result.makeElement(element.name, element.biomeID().value(), element.biomeIncidences().value(), element.distribution().name());
        }
        return result;
    }
    
    private void makeElement(String name, int biomeID, int weight, String climate) {
        Element gcBiome = new Element(name, biomeID,weight,false,climate);
    }
    
    @Override
    public void setRules(ClimateControlRules ccr) {
        // no action
    }

    @Override
    public void setNativeBiomeIDs(File file) {
        // not needed; constructed on the fly
    }

    @Override
    public void onNewWorld() {
        // nothing needed;
    }

    @Override
    public boolean biomesAreActive() {
        return true;
    }

}

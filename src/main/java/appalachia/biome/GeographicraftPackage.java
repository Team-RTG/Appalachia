/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import climateControl.api.BiomePackage;
import climateControl.api.BiomePackageRegistry;
import climateControl.api.BiomeSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.world.WorldType;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;

/**
 *
 * @author Zeno410
 */
public class GeographicraftPackage extends BiomePackage {

    private final GeographicraftSettings cloned;
    private boolean rtgWorld = false;
    public GeographicraftPackage(GeographicraftSettings cloned) {
        super("AppalachiaInGC.cfg");
        this.cloned = cloned;
    }
    @Override
    public BiomeSettings freshBiomeSetting() {
        if (rtgWorld) {
            return cloned.copy();
        }
        // otherwise nothing send empty settings;
        return new GeographicraftSettings();
    }
    
    public void activate() {

        try {
            BiomePackageRegistry.instance.register(this);
        }
        catch (Exception e) {
            throw new RuntimeException("Geographicraft not found.");
        }
    }
    
    public void onInitBiomeGens(WorldType worldType) {
        rtgWorld = (worldType.getWorldTypeName().equalsIgnoreCase("RTG"));
    }
}

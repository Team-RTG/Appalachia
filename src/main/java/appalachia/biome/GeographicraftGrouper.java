/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appalachia.biome;

import climateControl.api.DistributionPartitioner;
import climateControl.api.IncidenceModifier;
import com.Zeno410Utils.Numbered;
import java.util.ArrayList;
import java.util.Collection;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerSmooth;
import net.minecraft.world.gen.layer.GenLayerZoom;

/**
 *
 * @author Zeno410
 */
public class GeographicraftGrouper extends DistributionPartitioner {
    private final int size;
    private final int probability;
    private final GenLayer appalachiaLayer;
            
    public GeographicraftGrouper(Collection<Biome> appalachiaBiomes, int size, int probability) {
        super(incidenceModifiers(appalachiaBiomes));
        this.size = size;
        this.probability = probability;
        appalachiaLayer = this.biomeGenerators(size);
        DistributionPartitioner.register("Appalachia", this);
    }
    
    @Override
    protected IncidenceModifier modifier(int x, int z) {
        int index = appalachiaLayer.getInts(x, z, 1, 1)[0];
        return super.modifiers.get(index);
    }
    
    public void initWorldGenSeed(long seed) {
        appalachiaLayer.initWorldGenSeed(seed);
    }
    
    private GenLayer biomeGenerators(long par0) {
        
        GenLayerAppalachia var17 = new GenLayerAppalachia(probability);
        
        GenLayerSmooth var15 = new GenLayerSmooth(1000L, var17);
        GenLayer var6 = GenLayerZoom.magnify(1000L, var15, size);
        
        GenLayerSmooth var8 = new GenLayerSmooth(1000L, var6);
        
        var8.initWorldGenSeed(par0);
        GenLayer reliable = new GenLayerReliable(var8);
        return reliable;
    }

    private static ArrayList<IncidenceModifier> incidenceModifiers(Collection<Biome> appalachiaBiomes) {
        boolean [] appalachiaBiome = new boolean[256];
        for (Biome biome: appalachiaBiomes) {
            appalachiaBiome[Biome.getIdForBiome(biome)]= true;
        }
        ArrayList<IncidenceModifier> result = new ArrayList<IncidenceModifier>();
        result.add(new LowlandModifier(appalachiaBiome));
        result.add(new AppalachiaModifier(appalachiaBiome));
        return result;
    }
    
    private static class LowlandModifier implements IncidenceModifier {
        
        public LowlandModifier(boolean [] appalachiaBiome) {
            this.appalachiaBiome = appalachiaBiome;
        }
        private final boolean [] appalachiaBiome;

        public int modifiedIncidence(Numbered<Biome> biomeIncidence) {
            Biome biome = biomeIncidence.item();
            // erase mountains;
            if (appalachiaBiome[Biome.getIdForBiome(biome)]) {
                 return 0;
            }
            return biomeIncidence.count();
        }
    }
    
    private static class AppalachiaModifier implements IncidenceModifier {
        
        public AppalachiaModifier(boolean [] appalachiaBiome) {
            this.appalachiaBiome = appalachiaBiome;
        }
        private final boolean [] appalachiaBiome;

        public int modifiedIncidence(Numbered<Biome> biomeIncidence) {
            Biome biome = biomeIncidence.item();
            // erase mountains;
            if (appalachiaBiome[Biome.getIdForBiome(biome)]) {
                 return biomeIncidence.count();
            }
            return 0;
        }
    }
}

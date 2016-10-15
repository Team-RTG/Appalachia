package appalachia.rtg.config;

import appalachia.rtg.api.biome.appalachia.config.*;


public class BiomeConfigManagerAPL {

    public static void initBiomeConfigs() {

        initBiomeConfigsAPL();
    }

    public static void initBiomeConfigsAPL() {

        BiomeConfigAPL.biomeConfigAPLAppalachianMountains = new BiomeConfigAPLAppalachianMountains();
        BiomeConfigAPL.biomeConfigAPLAutumnBlueRidgeForest = new BiomeConfigAPLAutumnBlueRidgeForest();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeForest = new BiomeConfigAPLBlueRidgeForest();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeMountains = new BiomeConfigAPLBlueRidgeMountains();
        BiomeConfigAPL.biomeConfigAPLPrairie = new BiomeConfigAPLPrairie();
        BiomeConfigAPL.biomeConfigAPLSmokyMountains = new BiomeConfigAPLSmokyMountains();
    }
}
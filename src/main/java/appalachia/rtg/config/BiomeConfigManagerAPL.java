package appalachia.rtg.config;

import appalachia.rtg.api.biome.appalachia.config.*;


public class BiomeConfigManagerAPL {

    public static void initBiomeConfigs() {

        initBiomeConfigsAPL();
    }

    public static void initBiomeConfigsAPL() {

        BiomeConfigAPL.biomeConfigAPLAppalachianMountains = new BiomeConfigAPLAppalachianMountains();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeForestAutumn = new BiomeConfigAPLBlueRidgeForestAutumn();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeForest = new BiomeConfigAPLBlueRidgeForest();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeBeach = new BiomeConfigAPLBlueRidgeBeach();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeRiver = new BiomeConfigAPLBlueRidgeRiver();
        BiomeConfigAPL.biomeConfigAPLBlueRidgeMountains = new BiomeConfigAPLBlueRidgeMountains();
        BiomeConfigAPL.biomeConfigAPLPrairie = new BiomeConfigAPLPrairie();
        BiomeConfigAPL.biomeConfigAPLSmokyMountains = new BiomeConfigAPLSmokyMountains();
    }
}

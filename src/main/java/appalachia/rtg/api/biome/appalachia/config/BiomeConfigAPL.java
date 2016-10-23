package appalachia.rtg.api.biome.appalachia.config;

import rtg.api.biome.BiomeConfig;

public class BiomeConfigAPL {

    public static BiomeConfig biomeConfigAPLAppalachianMountains;
    public static BiomeConfig biomeConfigAPLBlueRidgeForestAutumn;
    public static BiomeConfig biomeConfigAPLBlueRidgeForest;
    public static BiomeConfig biomeConfigAPLBlueRidgeHills;
    public static BiomeConfig biomeConfigAPLBlueRidgeBeach;
    public static BiomeConfig biomeConfigAPLBlueRidgeRiver;
    public static BiomeConfig biomeConfigAPLBlueRidgeMountains;
    public static BiomeConfig biomeConfigAPLPrairie;
    public static BiomeConfig biomeConfigAPLSmokyMountains;

    public static BiomeConfig[] getBiomeConfigs() {

        BiomeConfig[] biomeConfigs = new BiomeConfig[]{
            biomeConfigAPLAppalachianMountains,
            biomeConfigAPLBlueRidgeForestAutumn,
            biomeConfigAPLBlueRidgeForest,
            biomeConfigAPLBlueRidgeHills,
            biomeConfigAPLBlueRidgeBeach,
            biomeConfigAPLBlueRidgeRiver,
            biomeConfigAPLBlueRidgeMountains,
            biomeConfigAPLPrairie,
            biomeConfigAPLSmokyMountains
        };

        return biomeConfigs;
    }
}

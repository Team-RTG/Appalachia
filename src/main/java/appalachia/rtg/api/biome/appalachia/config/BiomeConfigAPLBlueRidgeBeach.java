package appalachia.rtg.api.biome.appalachia.config;


import rtg.api.biome.BiomeConfigProperty;

public class BiomeConfigAPLBlueRidgeBeach extends BiomeConfigAPLBase {

    public static final String surfaceMixBlockId = "surfaceMixBlock";
    public static final String surfaceMixBlockName = "RTG Surface: Mix Block";

    public static final String surfaceMixBlockMetaId = "surfaceMixBlockMeta";
    public static final String surfaceMixBlockMetaName = "RTG Surface: Mix Block Meta";

    public BiomeConfigAPLBlueRidgeBeach() {

        super("blueridgebeach");

        this.addProperty(new BiomeConfigProperty(surfaceMixBlockId, BiomeConfigProperty.Type.STRING, surfaceMixBlockName, "", ""));
        this.addProperty(new BiomeConfigProperty(surfaceMixBlockMetaId, BiomeConfigProperty.Type.STRING, surfaceMixBlockMetaName, "", ""));
    }
}

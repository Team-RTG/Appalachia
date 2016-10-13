package appalachia.rtg.api.biome.appalachia.config;

import rtg.api.biome.BiomeConfigProperty;
import rtg.api.biome.BiomeConfigProperty.Type;


public class BiomeConfigAPLAutumnBlueRidgeForest extends BiomeConfigAPLBase {

    public static final String decorationLogsId = "decorationLogs";
    public static final String decorationLogsName = "RTG Decoration: Logs";

    public BiomeConfigAPLAutumnBlueRidgeForest() {

        super("autumnblueridgeforest");

        this.addProperty(new BiomeConfigProperty(decorationLogsId, Type.BOOLEAN, decorationLogsName, "", true));
    }
}

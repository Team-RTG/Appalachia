package appalachia.rtg.api.biome.appalachia.config;

import rtg.api.biome.BiomeConfigProperty;
import rtg.api.biome.BiomeConfigProperty.Type;


public class BiomeConfigAPLSmokyMountains extends BiomeConfigAPLBase {

    public static final String decorationLogsId = "decorationLogs";
    public static final String decorationLogsName = "RTG Decoration: Logs";

    public BiomeConfigAPLSmokyMountains() {

        super("smokymountains");

        this.addProperty(new BiomeConfigProperty(decorationLogsId, Type.BOOLEAN, decorationLogsName, "", true));
    }
}

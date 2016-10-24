package appalachia.rtg.config.appalachia;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPL;

import rtg.config.BiomeConfigManager;
import rtg.util.Logger;

public class ConfigAPL {

    public static Configuration config;

    public static void init(File configFile) {

        config = new Configuration(configFile);

        try {
            config.load();

            BiomeConfigManager.setBiomeConfigsFromUserConfigs(BiomeConfigAPL.getBiomeConfigs(), config);
        }
        catch (Exception e) {
            Logger.error("RTG had a problem loading APL configuration.");
        }
        finally {
            if (config.hasChanged()) {
                config.save();
            }
        }
    }
}

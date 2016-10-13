package appalachia.rtg.config;

import java.io.File;

import appalachia.rtg.config.appalachia.ConfigAPL;

public class ConfigManagerAPL {

    public static File aplConfigFile;

    public static void init(String configpath) {

        aplConfigFile = new File(configpath + "biomes/appalachia.cfg");

        ConfigAPL.init(aplConfigFile);
    }
}

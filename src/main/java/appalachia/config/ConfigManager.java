package appalachia.config;

import java.io.File;

import appalachia.config.appalachia.ConfigAppalachia;

public class ConfigManager {

    public static File appalachiaConfigFile;

    private ConfigAppalachia configAppalachia = new ConfigAppalachia();

    public static void init(String configpath) {

        appalachiaConfigFile = new File(configpath + "appalachia.cfg");

        ConfigAppalachia.init(appalachiaConfigFile);
    }

    public ConfigAppalachia appalachia() {

        return configAppalachia;
    }
}

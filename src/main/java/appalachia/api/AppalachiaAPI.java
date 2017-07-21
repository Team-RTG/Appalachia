package appalachia.api;

import java.util.Random;

import appalachia.api.config.AppalachiaConfig;

public class AppalachiaAPI {

    public static final String API_VERSION = "0.0.1";
    public static Random rand = new Random(4444);
    public static AppalachiaConfig aplConfig;

    public static AppalachiaConfig config() {
        return aplConfig;
    }
}
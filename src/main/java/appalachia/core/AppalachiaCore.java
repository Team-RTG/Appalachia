package appalachia.core;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

/**
 * This class is dedicated to the Appalachia addon for RTG
 * The complete source code for this mod can be found on github.
 * Class: AppalachiaCore
 * Created by HellFirePvP
 * Date: 12.02.2017 / 15:23
 */
@IFMLLoadingPlugin.Name(value = "AppalachiaCore")
@IFMLLoadingPlugin.MCVersion(value = "1.10.2")
@IFMLLoadingPlugin.TransformerExclusions({"appalachia.core"})
@IFMLLoadingPlugin.SortingIndex(1001)
public class AppalachiaCore implements IFMLLoadingPlugin {

    public static boolean isDebofEnabled = false;

    public AppalachiaCore() {
        FMLLog.info("[AppalachiaCore] Initialized.");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        isDebofEnabled = (boolean) data.get("runtimeDeobfuscationEnabled");
    }

    @Override
    public String getAccessTransformerClass() {
        return "appalachia.core.AppalachiaTransformer";
    }

}

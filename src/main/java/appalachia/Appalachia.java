package appalachia;

import java.io.File;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.block.BlockManager;
import appalachia.config.ConfigManager;
import appalachia.event.EventManager;
import appalachia.item.ItemManager;
import appalachia.proxy.ClientProxy;
import appalachia.proxy.CommonProxy;
import appalachia.world.AppalachiaWorldGenerator;
import appalachia.world.biome.AppalachiaBiomeManager;
import static appalachia.reference.ModInfo.*;


@SuppressWarnings({"WeakerAccess", "unused"})
@Mod(
    modid = MOD_ID,
    name = MOD_NAME,
    version = MOD_VERSION,
    dependencies = "required-after:Forge@[" + MCF_MINVER + "," + MCF_MAXVER + ")" + MOD_DEPS,
    acceptableRemoteVersions = "*"
)
public class Appalachia {

    @Instance(MOD_ID)
    public static Appalachia instance;
    public static String configPath;
    public static EventManager eventMgr;

    @SidedProxy(serverSide = CommonProxy.LOCATION, clientSide = ClientProxy.LOCATION)
    public static CommonProxy proxy;

    private ConfigManager configManager = new ConfigManager();

    @EventHandler
    public void initPre(FMLPreInitializationEvent event) {

        instance = this;

        configPath = event.getModConfigurationDirectory() + File.separator + CONFIG_DIRECTORY + File.separator;
        ConfigManager.init(configPath);

        BlockManager.registerBlocks();
        ItemManager.registerItems();

        if (event.getSide().isClient()) {
            BlockManager.registerModels();
            ItemManager.registerModels();
        }

        AppalachiaBiomeManager.registerBiomes();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        eventMgr = new EventManager();
        eventMgr.registerEventHandlers();

        BlockManager.addRecipes();
        GameRegistry.registerWorldGenerator(new AppalachiaWorldGenerator(), 0);
        AppalachiaBiomeManager.doBiomeCheck();
    }

    @EventHandler
    public void initPost(FMLPostInitializationEvent event) {

    }
}

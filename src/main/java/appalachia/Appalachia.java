package appalachia;


import java.io.File;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import appalachia.config.ConfigManager;
import appalachia.event.EventManager;
import appalachia.proxy.CommonProxy;
import appalachia.reference.ModInfo;
import appalachia.world.BiomeAutumnForest;
import static appalachia.api.biome.AppalachiaBiomes.autumnForest;
import static appalachia.reference.ModInfo.*;


@Mod(modid = ModInfo.MOD_ID, name = MOD_NAME, version = MOD_VERSION, dependencies = "required-after:Forge@[" + FORGE_DEP + ",)", acceptableRemoteVersions = "*")
public class Appalachia
{

    @Instance(MOD_ID)
    public static Appalachia instance;
    public static String configPath;
    public static EventManager eventMgr;

    @SidedProxy(serverSide = ModInfo.PROXY_COMMON, clientSide = ModInfo.PROXY_CLIENT)
    public static CommonProxy proxy;

    private ConfigManager configManager = new ConfigManager();

    @EventHandler
    public void fmlLifeCycleEvent(FMLPreInitializationEvent event) {

        instance = this;

        configPath = event.getModConfigurationDirectory() + File.separator + ModInfo.CONFIG_DIRECTORY + File.separator;
        ConfigManager.init(configPath);

        eventMgr = new EventManager();
        eventMgr.registerEventHandlers();

        autumnForest = new BiomeAutumnForest(new BiomeProperties("Autumn Forest").setWaterColor(14745518));

        registerBiomes();
    }

    @EventHandler
    public void fmlLifeCycleEvent(FMLInitializationEvent event) {}

    @EventHandler
    public void fmlLifeCycle(FMLPostInitializationEvent event) {

    }

    public static void registerBiomes()
    {
        Biome.registerBiome(42, "Autumn Forest", autumnForest);

        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(autumnForest, 10));
        BiomeManager.addSpawnBiome(autumnForest);
        BiomeManager.addStrongholdBiome(autumnForest);

        Biome.EXPLORATION_BIOMES_LIST.add(autumnForest);

        BiomeDictionary.registerBiomeType(autumnForest, new BiomeDictionary.Type[] { BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS });
    }
}

package appalachia;

import java.io.File;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.*;
import appalachia.config.ConfigAppalachia;
import appalachia.config.ConfigManager;
import appalachia.crafting.CraftingManager;
import appalachia.event.EventManager;
import appalachia.item.ItemManager;
import appalachia.proxy.CommonProxy;
import appalachia.world.AppalachiaWorldGenerator;
import appalachia.world.biome.AppalachiaBiome.AppalachiaBiomeProps;
import appalachia.world.biome.BiomeAutumnForest;
import static appalachia.api.AppalachiaBiomes.autumnForest;
import static appalachia.reference.ModInfo.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION, dependencies = "required-after:Forge@[" + FORGE_DEP + ",)", acceptableRemoteVersions = "*")
public class Appalachia
{

    @Instance(MOD_ID)
    public static Appalachia instance;
    public static String configPath;
    public static EventManager eventMgr;

    @SidedProxy(serverSide = PROXY_COMMON, clientSide = PROXY_CLIENT)
    public static CommonProxy proxy;

    private ConfigManager configManager = new ConfigManager();

    @EventHandler
    public void fmlLifeCycleEvent(FMLPreInitializationEvent event) {

        instance = this;

        configPath = event.getModConfigurationDirectory() + File.separator + CONFIG_DIRECTORY + File.separator;
        ConfigManager.init(configPath);

        eventMgr = new EventManager();
        eventMgr.registerEventHandlers();

        AppalachiaBlocks.sugi_log = new BlockSugiLog();
        AppalachiaBlocks.sugi_leaves = new BlockSugiLeaves();
        AppalachiaBlocks.sugi_sapling = new BlockSugiSapling();
        AppalachiaBlocks.sugi_planks = new BlockSugiWood();
        AppalachiaBlocks.sugi_slab = new BlockSugiWoodSlab();
        AppalachiaBlocks.sugi_stairs = new BlockSugiStairs();
        AppalachiaBlocks.sugi_fence = new BlockSugiFence();
        AppalachiaBlocks.sugi_fence_gate = new BlockSugiFenceGate();

        BlockManager.registerBlocks();
        ItemManager.registerItems();

        if (event.getSide().isClient())
        {
            BlockManager.registerModels();
            ItemManager.registerModels();
        }

        autumnForest = new BiomeAutumnForest(AppalachiaBiomeProps.AUTUMN_FOREST.getProps());
        registerBiomeWithTypes(
            autumnForest,
            "autumnforest",
            ConfigAppalachia.biomeWeight_AutumnForest,
            BiomeType.COOL,
            BiomeAutumnForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(autumnForest);
        BiomeManager.addVillageBiome(autumnForest, true);
        BiomeManager.addStrongholdBiome(autumnForest);
        Biome.EXPLORATION_BIOMES_LIST.add(autumnForest);


        addOreDictionaryStuff();
    }

    @EventHandler
    public void fmlLifeCycleEvent(FMLInitializationEvent event) {

        CraftingManager.addRecipes();

        GameRegistry.registerWorldGenerator(new AppalachiaWorldGenerator(), 0);
    }

    @EventHandler
    public void fmlLifeCycle(FMLPostInitializationEvent event) {

    }

    private static void registerBiomeWithTypes(Biome biome, String name, int weight, BiomeType btype, BiomeDictionary.Type...types) {

        GameRegistry.register(biome.setRegistryName(new ResourceLocation(MOD_ID, name)));
        BiomeDictionary.registerBiomeType(biome, types);
        BiomeManager.addBiome(btype, new BiomeEntry(biome, weight));
    }

    private void addOreDictionaryStuff() {

        OreDictionary.registerOre("logWood", AppalachiaBlocks.autumnForest_Log);
        OreDictionary.registerOre("plankWood", AppalachiaBlocks.autumnForest_Planks);
        OreDictionary.registerOre("treeSapling", AppalachiaBlocks.autumnForest_Sapling);
        OreDictionary.registerOre("treeLeaves", AppalachiaBlocks.autumnForest_Leaves);
    }
}

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
import appalachia.block.BlockManager;
import appalachia.config.ConfigAppalachia;
import appalachia.config.ConfigManager;
import appalachia.crafting.CraftingManager;
import appalachia.event.EventManager;
import appalachia.item.ItemManager;
import appalachia.proxy.CommonProxy;
import appalachia.util.BiomeUtils;
import appalachia.util.Logger;
import appalachia.world.AppalachiaWorldGenerator;
import appalachia.world.biome.AppalachiaBiome.AppalachiaBiomeProps;
import appalachia.world.biome.*;
import static appalachia.api.AppalachiaBiomes.*;
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

        BlockManager.registerBlocks();
        ItemManager.registerItems();

        if (event.getSide().isClient())
        {
            BlockManager.registerModels();
            ItemManager.registerModels();
        }

        addBiomes();

        addOreDictionaryStuff();
    }

    @EventHandler
    public void fmlLifeCycleEvent(FMLInitializationEvent event) {

        CraftingManager.addRecipes();

        GameRegistry.registerWorldGenerator(new AppalachiaWorldGenerator(), 0);

        doBiomeCheck();
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

        OreDictionary.registerOre("logWood", AppalachiaBlocks.log_autumn_grey);
        OreDictionary.registerOre("plankWood", AppalachiaBlocks.sugi_planks);
        OreDictionary.registerOre("treeSapling", AppalachiaBlocks.sugi_sapling);
        OreDictionary.registerOre("treeLeaves", AppalachiaBlocks.leaves_autumn_red);
    }

    private void addBiomes() {

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Appalachian Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        appalachianMountains = new BiomeAppalachianMountains(AppalachiaBiomeProps.APPALACHIAN_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            appalachianMountains,
            "appalachianmountains",
            ConfigAppalachia.biomeWeight_AppalachianMountains,
            BiomeType.COOL,
            BiomeAppalachianMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(appalachianMountains);
        BiomeManager.addVillageBiome(appalachianMountains, true);
        BiomeManager.addStrongholdBiome(appalachianMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(appalachianMountains);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Autumn Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

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

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Cove Forest
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        coveForest = new BiomeCoveForest(AppalachiaBiomeProps.COVE_FOREST.getProps());
        registerBiomeWithTypes(
            coveForest,
            "coveforest",
            ConfigAppalachia.biomeWeight_CoveForest,
            BiomeType.COOL,
            BiomeCoveForest.biomeTypes
        );
        BiomeManager.addSpawnBiome(coveForest);
        BiomeManager.addVillageBiome(coveForest, true);
        BiomeManager.addStrongholdBiome(coveForest);
        Biome.EXPLORATION_BIOMES_LIST.add(coveForest);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Prairie
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        prairie = new BiomePrairie(AppalachiaBiomeProps.PRAIRIE.getProps());
        registerBiomeWithTypes(
            prairie,
            "prairie",
            ConfigAppalachia.biomeWeight_Prairie,
            BiomeType.WARM,
            BiomePrairie.biomeTypes
        );
        BiomeManager.addSpawnBiome(prairie);
        BiomeManager.addVillageBiome(prairie, true);
        BiomeManager.addStrongholdBiome(prairie);
        Biome.EXPLORATION_BIOMES_LIST.add(prairie);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // Smoky Mountains
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        smokyMountains = new BiomeSmokyMountains(AppalachiaBiomeProps.SMOKY_MOUNTAINS.getProps());
        registerBiomeWithTypes(
            smokyMountains,
            "smokymountains",
            ConfigAppalachia.biomeWeight_SmokyMountains,
            BiomeType.COOL,
            BiomeSmokyMountains.biomeTypes
        );
        BiomeManager.addSpawnBiome(smokyMountains);
        BiomeManager.addVillageBiome(smokyMountains, true);
        BiomeManager.addStrongholdBiome(smokyMountains);
        Biome.EXPLORATION_BIOMES_LIST.add(smokyMountains);
    }

    private static void doBiomeCheck()
    {
        Biome[] b = BiomeUtils.getRegisteredBiomes();

        for (int i = 0; i < 256; i++)
        {
            if (b[i] != null)
            {
                Biome biome = b[i];
                int biomeId = BiomeUtils.getId(b[i]);
                String biomeName = BiomeUtils.getName(b[i]);
                String biomeClass = b[i].getBiomeClass().getName();

                Logger.debug("Biome (" + biomeId + ") " + biomeName + " from " + biomeClass);

                switch (biomeId) {

                    case 8:     // The Nether
                    case 9:     // The End
                    case 127:   // The Void

                        // Do nothing.
                        break;

                    default:

                        if (biome instanceof AppalachiaBiome) {

                            Logger.info("SUCCESS! %s (%d) was found.", biome.getBiomeName(), BiomeUtils.getId(biome));
                        }

                        break;
                }
            }
        }
    }
}

package appalachia.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import appalachia.biome.AppalachiaBiomeManager;
import appalachia.block.BlockManager;
import appalachia.client.sound.SoundManager;
import appalachia.entity.EntityManager;
import appalachia.item.ItemManager;
import appalachia.item.crafting.CraftingManager;

public class CommonProxy {

    public static final String LOCATION = "appalachia.proxy.CommonProxy";

    public void preInit(FMLPreInitializationEvent event) {

        BlockManager.registerBlocks();
        ItemManager.registerItems();
        CraftingManager.registerRecipes();
        SoundManager.registerSounds();
        AppalachiaBiomeManager.registerBiomes();
        EntityManager.registerEntities();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void registerRenderers() {}
}
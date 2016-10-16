package appalachia.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import appalachia.entity.EntityManager;

public class CommonProxy {

    public static final String LOCATION = "appalachia.proxy.CommonProxy";

    public void preInit(FMLPreInitializationEvent event) {

        EntityManager.registerEntities();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void registerRenderers() {}
}
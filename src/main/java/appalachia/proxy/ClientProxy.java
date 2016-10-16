package appalachia.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;

import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.client.renderer.entity.RenderBlackBear;
import appalachia.entity.monster.EntityBlackBear;

public class ClientProxy extends CommonProxy {

    public static final String LOCATION = "appalachia.proxy.ClientProxy";

    @Override
    public void preInit(FMLPreInitializationEvent event) {

        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {

        super.init(event);

        registerColorHandlers();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

        super.postInit(event);
    }

    @SideOnly(Side.CLIENT)
    public static void registerColorHandlers(){
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_oak_fallen);
    }

    @Override
    public void registerRenderers()
    {
        registerEntityRenderer(EntityBlackBear.class, RenderBlackBear.class);
    }

    private static <E extends Entity> void registerEntityRenderer(Class<E> entityClass, Class<? extends Render<E>> renderClass)
    {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderFactory<E>(renderClass));
    }

    private static class EntityRenderFactory<E extends Entity> implements IRenderFactory<E>
    {
        private Class<? extends Render<E>> renderClass;

        private EntityRenderFactory(Class<? extends Render<E>> renderClass)
        {
            this.renderClass = renderClass;
        }

        @Override
        public Render<E> createRenderFor(RenderManager manager)
        {
            Render<E> renderer = null;

            try
            {
                renderer = renderClass.getConstructor(RenderManager.class).newInstance(manager);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            return renderer;
        }
    }
}

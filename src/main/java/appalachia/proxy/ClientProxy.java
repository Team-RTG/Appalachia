package appalachia.proxy;

import net.minecraft.client.Minecraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;

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
}

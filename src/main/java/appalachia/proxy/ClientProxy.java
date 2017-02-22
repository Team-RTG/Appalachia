package appalachia.proxy;

import net.minecraft.client.Minecraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.fallen.AppalachiaBlockLeavesFallen;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.entity.EntityManager;

public class ClientProxy extends CommonProxy {

    public static final String LOCATION = "appalachia.proxy.ClientProxy";

    @Override
    public void preInit(FMLPreInitializationEvent event) {

        super.preInit(event);

        EntityManager.registerModels();
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

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockVine.ColourHandler(), AppalachiaBlocks.vine_poison_ivy_01);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // DYNAMICALLY-GENERATED CODE - PLEASE DO NOT MODIFY BELOW THIS LINE
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_american_basswood_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_american_basswood_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_american_beech_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_american_beech_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_american_chestnut_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_american_chestnut_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_american_elm_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_american_elm_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_american_sweetgum_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_american_sweetgum_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_atlantic_white_cedar_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_atlantic_white_cedar_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_balsam_fir_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_balsam_fir_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_bitternut_hickory_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_bitternut_hickory_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_black_cherry_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_black_cherry_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_black_locust_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_black_locust_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_black_oak_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_black_oak_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_black_spruce_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_black_spruce_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_black_walnut_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_black_walnut_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_blackgum_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_blackgum_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_blue_beech_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_blue_beech_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_box_elder_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_box_elder_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_buckeye_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_buckeye_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_eastern_hemlock_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_eastern_hemlock_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_flowering_dogwood_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_flowering_dogwood_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_hackberry_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_hackberry_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_honey_locust_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_honey_locust_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_hophornbeam_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_hophornbeam_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_loblolly_pine_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_loblolly_pine_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_persimmon_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_persimmon_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_pignut_hickory_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_pignut_hickory_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_red_ash_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_red_ash_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_red_elm_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_red_elm_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_red_maple_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_red_maple_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_red_oak_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_red_oak_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_red_spruce_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_red_spruce_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_river_birch_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_river_birch_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_sassafras_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_sassafras_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_shagbark_hickory_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_shagbark_hickory_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_shortleaf_pine_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_shortleaf_pine_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_sugar_maple_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_sugar_maple_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_sycamore_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_sycamore_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_tamarack_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_tamarack_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_tulip_poplar_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_tulip_poplar_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_white_oak_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_white_oak_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_white_pine_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_white_pine_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_white_walnut_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_white_walnut_01_fallen);

        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeaves.ColourHandler(), AppalachiaBlocks.leaves_yellow_birch_01);
        Minecraft.getMinecraft().getBlockColors().registerBlockColorHandler(new AppalachiaBlockLeavesFallen.ColourHandler(), AppalachiaBlocks.leaves_yellow_birch_01_fallen);




    }
}

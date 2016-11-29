package appalachia.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.fencegates.*;
import appalachia.block.fences.*;
import appalachia.block.leaves.*;
import appalachia.block.leaves.fallen.*;
import appalachia.block.logs.*;
import appalachia.block.planks.*;
import appalachia.block.saplings.*;
import appalachia.block.slabs.*;
import appalachia.block.stairs.*;
import appalachia.block.vines.AppalachiaBlockVine;
import appalachia.block.vines.BlockVinePoisonIvy01;
import appalachia.item.ItemManager;
import appalachia.item.leaves.fallen.AppalachiaItemLeavesFallen;
import appalachia.item.slabs.AppalachiaItemSlab;

public class BlockManager {

    public static ArrayList<Block> appalachiaBlocks = new ArrayList<>();

    public static ArrayList<Block> appalachiaVines = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaLogs = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaPlanks = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaSlabs = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaStairs = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaFences = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaFenceGates = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaLeaves = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaLeavesFallen = new ArrayList<Block>() {

    };
    public static ArrayList<Block> appalachiaSaplings = new ArrayList<Block>() {

    };

    public static void registerBlocks() {

        //Vines.

        AppalachiaBlocks.vine_poison_ivy_01 = new BlockVinePoisonIvy01();

        addVines();

        //Leaves.

        AppalachiaBlocks.leaves_american_beech_01 = new BlockLeavesAmericanBeech01();
        AppalachiaBlocks.leaves_american_chestnut_01 = new BlockLeavesAmericanChestnut01();
        AppalachiaBlocks.leaves_american_elm_01 = new BlockLeavesAmericanElm01();
        AppalachiaBlocks.leaves_ash_01 = new BlockLeavesAsh01();
        AppalachiaBlocks.leaves_bitternut_hickory_01 = new BlockLeavesBitternutHickory01();
        AppalachiaBlocks.leaves_black_cherry_01 = new BlockLeavesBlackCherry01();
        AppalachiaBlocks.leaves_black_gum_01 = new BlockLeavesBlackGum01();
        AppalachiaBlocks.leaves_black_locust_01 = new BlockLeavesBlackLocust01();
        AppalachiaBlocks.leaves_black_oak_01 = new BlockLeavesBlackOak01();
        AppalachiaBlocks.leaves_black_walnut_01 = new BlockLeavesBlackWalnut01();
        AppalachiaBlocks.leaves_blue_beech_01 = new BlockLeavesBlueBeech01();
        AppalachiaBlocks.leaves_box_elder_01 = new BlockLeavesBoxElder01();
        AppalachiaBlocks.leaves_buckeye_01 = new BlockLeavesBuckeye01();
        AppalachiaBlocks.leaves_cedar_01 = new BlockLeavesCedar01();
        AppalachiaBlocks.leaves_dogwood_01 = new BlockLeavesDogwood01();
        AppalachiaBlocks.leaves_hackberry_01 = new BlockLeavesHackberry01();
        AppalachiaBlocks.leaves_honey_locust_01 = new BlockLeavesHoneyLocust01();
        AppalachiaBlocks.leaves_hop_hornbeam_01 = new BlockLeavesHopHornbeam01();
        AppalachiaBlocks.leaves_persimmon_01 = new BlockLeavesPersimmon01();
        AppalachiaBlocks.leaves_pignut_hickory_01 = new BlockLeavesPignutHickory01();
        AppalachiaBlocks.leaves_red_elm_01 = new BlockLeavesRedElm01();
        AppalachiaBlocks.leaves_red_maple_01 = new BlockLeavesRedMaple01();
        AppalachiaBlocks.leaves_red_oak_01 = new BlockLeavesRedOak01();
        AppalachiaBlocks.leaves_river_birch_01 = new BlockLeavesRiverBirch01();
        AppalachiaBlocks.leaves_sassafras_01 = new BlockLeavesSassafras01();
        AppalachiaBlocks.leaves_shagbark_hickory_01 = new BlockLeavesShagbarkHickory01();
        AppalachiaBlocks.leaves_shortleaf_pine_01 = new BlockLeavesShortleafPine01();
        AppalachiaBlocks.leaves_sugar_maple_01 = new BlockLeavesSugarMaple01();
        AppalachiaBlocks.leaves_sycamore_01 = new BlockLeavesSycamore01();
        AppalachiaBlocks.leaves_tulip_poplar_01 = new BlockLeavesTulipPoplar01();
        AppalachiaBlocks.leaves_white_oak_01 = new BlockLeavesWhiteOak01();
        AppalachiaBlocks.leaves_white_pine_01 = new BlockLeavesWhitePine01();
        AppalachiaBlocks.leaves_white_walnut_01 = new BlockLeavesWhiteWalnut01();
        AppalachiaBlocks.leaves_yellow_birch_01 = new BlockLeavesYellowBirch01();

        addLeaves();

        //Fallen leaves.

        AppalachiaBlocks.leaves_american_beech_01_fallen = new BlockLeavesAmericanBeech01Fallen();
        AppalachiaBlocks.leaves_american_chestnut_01_fallen = new BlockLeavesAmericanChestnut01Fallen();
        AppalachiaBlocks.leaves_american_elm_01_fallen = new BlockLeavesAmericanElm01Fallen();
        AppalachiaBlocks.leaves_ash_01_fallen = new BlockLeavesAsh01Fallen();
        AppalachiaBlocks.leaves_bitternut_hickory_01_fallen = new BlockLeavesBitternutHickory01Fallen();
        AppalachiaBlocks.leaves_black_cherry_01_fallen = new BlockLeavesBlackCherry01Fallen();
        AppalachiaBlocks.leaves_black_gum_01_fallen = new BlockLeavesBlackGum01Fallen();
        AppalachiaBlocks.leaves_black_locust_01_fallen = new BlockLeavesBlackLocust01Fallen();
        AppalachiaBlocks.leaves_black_oak_01_fallen = new BlockLeavesBlackOak01Fallen();
        AppalachiaBlocks.leaves_black_walnut_01_fallen = new BlockLeavesBlackWalnut01Fallen();
        AppalachiaBlocks.leaves_blue_beech_01_fallen = new BlockLeavesBlueBeech01Fallen();
        AppalachiaBlocks.leaves_box_elder_01_fallen = new BlockLeavesBoxElder01Fallen();
        AppalachiaBlocks.leaves_buckeye_01_fallen = new BlockLeavesBuckeye01Fallen();
        AppalachiaBlocks.leaves_cedar_01_fallen = new BlockLeavesCedar01Fallen();
        AppalachiaBlocks.leaves_dogwood_01_fallen = new BlockLeavesDogwood01Fallen();
        AppalachiaBlocks.leaves_hackberry_01_fallen = new BlockLeavesHackberry01Fallen();
        AppalachiaBlocks.leaves_honey_locust_01_fallen = new BlockLeavesHoneyLocust01Fallen();
        AppalachiaBlocks.leaves_hop_hornbeam_01_fallen = new BlockLeavesHopHornbeam01Fallen();
        AppalachiaBlocks.leaves_persimmon_01_fallen = new BlockLeavesPersimmon01Fallen();
        AppalachiaBlocks.leaves_pignut_hickory_01_fallen = new BlockLeavesPignutHickory01Fallen();
        AppalachiaBlocks.leaves_red_elm_01_fallen = new BlockLeavesRedElm01Fallen();
        AppalachiaBlocks.leaves_red_maple_01_fallen = new BlockLeavesRedMaple01Fallen();
        AppalachiaBlocks.leaves_red_oak_01_fallen = new BlockLeavesRedOak01Fallen();
        AppalachiaBlocks.leaves_river_birch_01_fallen = new BlockLeavesRiverBirch01Fallen();
        AppalachiaBlocks.leaves_sassafras_01_fallen = new BlockLeavesSassafras01Fallen();
        AppalachiaBlocks.leaves_shagbark_hickory_01_fallen = new BlockLeavesShagbarkHickory01Fallen();
        AppalachiaBlocks.leaves_shortleaf_pine_01_fallen = new BlockLeavesShortleafPine01Fallen();
        AppalachiaBlocks.leaves_sugar_maple_01_fallen = new BlockLeavesSugarMaple01Fallen();
        AppalachiaBlocks.leaves_sycamore_01_fallen = new BlockLeavesSycamore01Fallen();
        AppalachiaBlocks.leaves_tulip_poplar_01_fallen = new BlockLeavesTulipPoplar01Fallen();
        AppalachiaBlocks.leaves_white_oak_01_fallen = new BlockLeavesWhiteOak01Fallen();
        AppalachiaBlocks.leaves_white_pine_01_fallen = new BlockLeavesWhitePine01Fallen();
        AppalachiaBlocks.leaves_white_walnut_01_fallen = new BlockLeavesWhiteWalnut01Fallen();
        AppalachiaBlocks.leaves_yellow_birch_01_fallen = new BlockLeavesYellowBirch01Fallen();

        addFallenLeaves();

        //Logs.

        AppalachiaBlocks.log_american_beech_01 = new BlockLogAmericanBeech01();
        AppalachiaBlocks.log_american_chestnut_01 = new BlockLogAmericanChestnut01();
        AppalachiaBlocks.log_american_elm_01 = new BlockLogAmericanElm01();
        AppalachiaBlocks.log_ash_01 = new BlockLogAsh01();
        AppalachiaBlocks.log_bitternut_hickory_01 = new BlockLogBitternutHickory01();
        AppalachiaBlocks.log_black_cherry_01 = new BlockLogBlackCherry01();
        AppalachiaBlocks.log_black_gum_01 = new BlockLogBlackGum01();
        AppalachiaBlocks.log_black_locust_01 = new BlockLogBlackLocust01();
        AppalachiaBlocks.log_black_oak_01 = new BlockLogBlackOak01();
        AppalachiaBlocks.log_black_walnut_01 = new BlockLogBlackWalnut01();
        AppalachiaBlocks.log_blue_beech_01 = new BlockLogBlueBeech01();
        AppalachiaBlocks.log_box_elder_01 = new BlockLogBoxElder01();
        AppalachiaBlocks.log_buckeye_01 = new BlockLogBuckeye01();
        AppalachiaBlocks.log_cedar_01 = new BlockLogCedar01();
        AppalachiaBlocks.log_dogwood_01 = new BlockLogDogwood01();
        AppalachiaBlocks.log_hackberry_01 = new BlockLogHackberry01();
        AppalachiaBlocks.log_honey_locust_01 = new BlockLogHoneyLocust01();
        AppalachiaBlocks.log_hop_hornbeam_01 = new BlockLogHopHornbeam01();
        AppalachiaBlocks.log_persimmon_01 = new BlockLogPersimmon01();
        AppalachiaBlocks.log_pignut_hickory_01 = new BlockLogPignutHickory01();
        AppalachiaBlocks.log_red_elm_01 = new BlockLogRedElm01();
        AppalachiaBlocks.log_red_maple_01 = new BlockLogRedMaple01();
        AppalachiaBlocks.log_red_oak_01 = new BlockLogRedOak01();
        AppalachiaBlocks.log_river_birch_01 = new BlockLogRiverBirch01();
        AppalachiaBlocks.log_sassafras_01 = new BlockLogSassafras01();
        AppalachiaBlocks.log_shagbark_hickory_01 = new BlockLogShagbarkHickory01();
        AppalachiaBlocks.log_shortleaf_pine_01 = new BlockLogShortleafPine01();
        AppalachiaBlocks.log_sugar_maple_01 = new BlockLogSugarMaple01();
        AppalachiaBlocks.log_sycamore_01 = new BlockLogSycamore01();
        AppalachiaBlocks.log_tulip_poplar_01 = new BlockLogTulipPoplar01();
        AppalachiaBlocks.log_white_oak_01 = new BlockLogWhiteOak01();
        AppalachiaBlocks.log_white_pine_01 = new BlockLogWhitePine01();
        AppalachiaBlocks.log_white_walnut_01 = new BlockLogWhiteWalnut01();
        AppalachiaBlocks.log_yellow_birch_01 = new BlockLogYellowBirch01();

        addLogs();

        //Planks.

        AppalachiaBlocks.planks_american_beech_01 = new BlockPlanksAmericanBeech01();
        AppalachiaBlocks.planks_american_chestnut_01 = new BlockPlanksAmericanChestnut01();
        AppalachiaBlocks.planks_american_elm_01 = new BlockPlanksAmericanElm01();
        AppalachiaBlocks.planks_ash_01 = new BlockPlanksAsh01();
        AppalachiaBlocks.planks_bitternut_hickory_01 = new BlockPlanksBitternutHickory01();
        AppalachiaBlocks.planks_black_cherry_01 = new BlockPlanksBlackCherry01();
        AppalachiaBlocks.planks_black_gum_01 = new BlockPlanksBlackGum01();
        AppalachiaBlocks.planks_black_locust_01 = new BlockPlanksBlackLocust01();
        AppalachiaBlocks.planks_black_oak_01 = new BlockPlanksBlackOak01();
        AppalachiaBlocks.planks_black_walnut_01 = new BlockPlanksBlackWalnut01();
        AppalachiaBlocks.planks_blue_beech_01 = new BlockPlanksBlueBeech01();
        AppalachiaBlocks.planks_box_elder_01 = new BlockPlanksBoxElder01();
        AppalachiaBlocks.planks_buckeye_01 = new BlockPlanksBuckeye01();
        AppalachiaBlocks.planks_cedar_01 = new BlockPlanksCedar01();
        AppalachiaBlocks.planks_dogwood_01 = new BlockPlanksDogwood01();
        AppalachiaBlocks.planks_hackberry_01 = new BlockPlanksHackberry01();
        AppalachiaBlocks.planks_honey_locust_01 = new BlockPlanksHoneyLocust01();
        AppalachiaBlocks.planks_hop_hornbeam_01 = new BlockPlanksHopHornbeam01();
        AppalachiaBlocks.planks_persimmon_01 = new BlockPlanksPersimmon01();
        AppalachiaBlocks.planks_pignut_hickory_01 = new BlockPlanksPignutHickory01();
        AppalachiaBlocks.planks_red_elm_01 = new BlockPlanksRedElm01();
        AppalachiaBlocks.planks_red_maple_01 = new BlockPlanksRedMaple01();
        AppalachiaBlocks.planks_red_oak_01 = new BlockPlanksRedOak01();
        AppalachiaBlocks.planks_river_birch_01 = new BlockPlanksRiverBirch01();
        AppalachiaBlocks.planks_sassafras_01 = new BlockPlanksSassafras01();
        AppalachiaBlocks.planks_shagbark_hickory_01 = new BlockPlanksShagbarkHickory01();
        AppalachiaBlocks.planks_shortleaf_pine_01 = new BlockPlanksShortleafPine01();
        AppalachiaBlocks.planks_sugar_maple_01 = new BlockPlanksSugarMaple01();
        AppalachiaBlocks.planks_sycamore_01 = new BlockPlanksSycamore01();
        AppalachiaBlocks.planks_tulip_poplar_01 = new BlockPlanksTulipPoplar01();
        AppalachiaBlocks.planks_white_oak_01 = new BlockPlanksWhiteOak01();
        AppalachiaBlocks.planks_white_pine_01 = new BlockPlanksWhitePine01();
        AppalachiaBlocks.planks_white_walnut_01 = new BlockPlanksWhiteWalnut01();
        AppalachiaBlocks.planks_yellow_birch_01 = new BlockPlanksYellowBirch01();

        addPlanks();

        //Slabs.

        AppalachiaBlocks.slab_american_beech_01 = new BlockSlabAmericanBeech01();
        AppalachiaBlocks.slab_american_chestnut_01 = new BlockSlabAmericanChestnut01();
        AppalachiaBlocks.slab_american_elm_01 = new BlockSlabAmericanElm01();
        AppalachiaBlocks.slab_ash_01 = new BlockSlabAsh01();
        AppalachiaBlocks.slab_bitternut_hickory_01 = new BlockSlabBitternutHickory01();
        AppalachiaBlocks.slab_black_cherry_01 = new BlockSlabBlackCherry01();
        AppalachiaBlocks.slab_black_gum_01 = new BlockSlabBlackGum01();
        AppalachiaBlocks.slab_black_locust_01 = new BlockSlabBlackLocust01();
        AppalachiaBlocks.slab_black_oak_01 = new BlockSlabBlackOak01();
        AppalachiaBlocks.slab_black_walnut_01 = new BlockSlabBlackWalnut01();
        AppalachiaBlocks.slab_blue_beech_01 = new BlockSlabBlueBeech01();
        AppalachiaBlocks.slab_box_elder_01 = new BlockSlabBoxElder01();
        AppalachiaBlocks.slab_buckeye_01 = new BlockSlabBuckeye01();
        AppalachiaBlocks.slab_cedar_01 = new BlockSlabCedar01();
        AppalachiaBlocks.slab_dogwood_01 = new BlockSlabDogwood01();
        AppalachiaBlocks.slab_hackberry_01 = new BlockSlabHackberry01();
        AppalachiaBlocks.slab_honey_locust_01 = new BlockSlabHoneyLocust01();
        AppalachiaBlocks.slab_hop_hornbeam_01 = new BlockSlabHopHornbeam01();
        AppalachiaBlocks.slab_persimmon_01 = new BlockSlabPersimmon01();
        AppalachiaBlocks.slab_pignut_hickory_01 = new BlockSlabPignutHickory01();
        AppalachiaBlocks.slab_red_elm_01 = new BlockSlabRedElm01();
        AppalachiaBlocks.slab_red_maple_01 = new BlockSlabRedMaple01();
        AppalachiaBlocks.slab_red_oak_01 = new BlockSlabRedOak01();
        AppalachiaBlocks.slab_river_birch_01 = new BlockSlabRiverBirch01();
        AppalachiaBlocks.slab_sassafras_01 = new BlockSlabSassafras01();
        AppalachiaBlocks.slab_shagbark_hickory_01 = new BlockSlabShagbarkHickory01();
        AppalachiaBlocks.slab_shortleaf_pine_01 = new BlockSlabShortleafPine01();
        AppalachiaBlocks.slab_sugar_maple_01 = new BlockSlabSugarMaple01();
        AppalachiaBlocks.slab_sycamore_01 = new BlockSlabSycamore01();
        AppalachiaBlocks.slab_tulip_poplar_01 = new BlockSlabTulipPoplar01();
        AppalachiaBlocks.slab_white_oak_01 = new BlockSlabWhiteOak01();
        AppalachiaBlocks.slab_white_pine_01 = new BlockSlabWhitePine01();
        AppalachiaBlocks.slab_white_walnut_01 = new BlockSlabWhiteWalnut01();
        AppalachiaBlocks.slab_yellow_birch_01 = new BlockSlabYellowBirch01();

        addSlabs();

        //Stairs.

        AppalachiaBlocks.stairs_american_beech_01 = new BlockStairsAmericanBeech01();
        AppalachiaBlocks.stairs_american_chestnut_01 = new BlockStairsAmericanChestnut01();
        AppalachiaBlocks.stairs_american_elm_01 = new BlockStairsAmericanElm01();
        AppalachiaBlocks.stairs_ash_01 = new BlockStairsAsh01();
        AppalachiaBlocks.stairs_bitternut_hickory_01 = new BlockStairsBitternutHickory01();
        AppalachiaBlocks.stairs_black_cherry_01 = new BlockStairsBlackCherry01();
        AppalachiaBlocks.stairs_black_gum_01 = new BlockStairsBlackGum01();
        AppalachiaBlocks.stairs_black_locust_01 = new BlockStairsBlackLocust01();
        AppalachiaBlocks.stairs_black_oak_01 = new BlockStairsBlackOak01();
        AppalachiaBlocks.stairs_black_walnut_01 = new BlockStairsBlackWalnut01();
        AppalachiaBlocks.stairs_blue_beech_01 = new BlockStairsBlueBeech01();
        AppalachiaBlocks.stairs_box_elder_01 = new BlockStairsBoxElder01();
        AppalachiaBlocks.stairs_buckeye_01 = new BlockStairsBuckeye01();
        AppalachiaBlocks.stairs_cedar_01 = new BlockStairsCedar01();
        AppalachiaBlocks.stairs_dogwood_01 = new BlockStairsDogwood01();
        AppalachiaBlocks.stairs_hackberry_01 = new BlockStairsHackberry01();
        AppalachiaBlocks.stairs_honey_locust_01 = new BlockStairsHoneyLocust01();
        AppalachiaBlocks.stairs_hop_hornbeam_01 = new BlockStairsHopHornbeam01();
        AppalachiaBlocks.stairs_persimmon_01 = new BlockStairsPersimmon01();
        AppalachiaBlocks.stairs_pignut_hickory_01 = new BlockStairsPignutHickory01();
        AppalachiaBlocks.stairs_red_elm_01 = new BlockStairsRedElm01();
        AppalachiaBlocks.stairs_red_maple_01 = new BlockStairsRedMaple01();
        AppalachiaBlocks.stairs_red_oak_01 = new BlockStairsRedOak01();
        AppalachiaBlocks.stairs_river_birch_01 = new BlockStairsRiverBirch01();
        AppalachiaBlocks.stairs_sassafras_01 = new BlockStairsSassafras01();
        AppalachiaBlocks.stairs_shagbark_hickory_01 = new BlockStairsShagbarkHickory01();
        AppalachiaBlocks.stairs_shortleaf_pine_01 = new BlockStairsShortleafPine01();
        AppalachiaBlocks.stairs_sugar_maple_01 = new BlockStairsSugarMaple01();
        AppalachiaBlocks.stairs_sycamore_01 = new BlockStairsSycamore01();
        AppalachiaBlocks.stairs_tulip_poplar_01 = new BlockStairsTulipPoplar01();
        AppalachiaBlocks.stairs_white_oak_01 = new BlockStairsWhiteOak01();
        AppalachiaBlocks.stairs_white_pine_01 = new BlockStairsWhitePine01();
        AppalachiaBlocks.stairs_white_walnut_01 = new BlockStairsWhiteWalnut01();
        AppalachiaBlocks.stairs_yellow_birch_01 = new BlockStairsYellowBirch01();

        addStairs();

        //Fences.

        AppalachiaBlocks.fence_american_beech_01 = new BlockFenceAmericanBeech01();
        AppalachiaBlocks.fence_american_chestnut_01 = new BlockFenceAmericanChestnut01();
        AppalachiaBlocks.fence_american_elm_01 = new BlockFenceAmericanElm01();
        AppalachiaBlocks.fence_ash_01 = new BlockFenceAsh01();
        AppalachiaBlocks.fence_bitternut_hickory_01 = new BlockFenceBitternutHickory01();
        AppalachiaBlocks.fence_black_cherry_01 = new BlockFenceBlackCherry01();
        AppalachiaBlocks.fence_black_gum_01 = new BlockFenceBlackGum01();
        AppalachiaBlocks.fence_black_locust_01 = new BlockFenceBlackLocust01();
        AppalachiaBlocks.fence_black_oak_01 = new BlockFenceBlackOak01();
        AppalachiaBlocks.fence_black_walnut_01 = new BlockFenceBlackWalnut01();
        AppalachiaBlocks.fence_blue_beech_01 = new BlockFenceBlueBeech01();
        AppalachiaBlocks.fence_box_elder_01 = new BlockFenceBoxElder01();
        AppalachiaBlocks.fence_buckeye_01 = new BlockFenceBuckeye01();
        AppalachiaBlocks.fence_cedar_01 = new BlockFenceCedar01();
        AppalachiaBlocks.fence_dogwood_01 = new BlockFenceDogwood01();
        AppalachiaBlocks.fence_hackberry_01 = new BlockFenceHackberry01();
        AppalachiaBlocks.fence_honey_locust_01 = new BlockFenceHoneyLocust01();
        AppalachiaBlocks.fence_hop_hornbeam_01 = new BlockFenceHopHornbeam01();
        AppalachiaBlocks.fence_persimmon_01 = new BlockFencePersimmon01();
        AppalachiaBlocks.fence_pignut_hickory_01 = new BlockFencePignutHickory01();
        AppalachiaBlocks.fence_red_elm_01 = new BlockFenceRedElm01();
        AppalachiaBlocks.fence_red_maple_01 = new BlockFenceRedMaple01();
        AppalachiaBlocks.fence_red_oak_01 = new BlockFenceRedOak01();
        AppalachiaBlocks.fence_river_birch_01 = new BlockFenceRiverBirch01();
        AppalachiaBlocks.fence_sassafras_01 = new BlockFenceSassafras01();
        AppalachiaBlocks.fence_shagbark_hickory_01 = new BlockFenceShagbarkHickory01();
        AppalachiaBlocks.fence_shortleaf_pine_01 = new BlockFenceShortleafPine01();
        AppalachiaBlocks.fence_sugar_maple_01 = new BlockFenceSugarMaple01();
        AppalachiaBlocks.fence_sycamore_01 = new BlockFenceSycamore01();
        AppalachiaBlocks.fence_tulip_poplar_01 = new BlockFenceTulipPoplar01();
        AppalachiaBlocks.fence_white_oak_01 = new BlockFenceWhiteOak01();
        AppalachiaBlocks.fence_white_pine_01 = new BlockFenceWhitePine01();
        AppalachiaBlocks.fence_white_walnut_01 = new BlockFenceWhiteWalnut01();
        AppalachiaBlocks.fence_yellow_birch_01 = new BlockFenceYellowBirch01();

        addFences();

        //Fence gates.

        AppalachiaBlocks.fence_gate_american_beech_01 = new BlockFenceGateAmericanBeech01();
        AppalachiaBlocks.fence_gate_american_chestnut_01 = new BlockFenceGateAmericanChestnut01();
        AppalachiaBlocks.fence_gate_american_elm_01 = new BlockFenceGateAmericanElm01();
        AppalachiaBlocks.fence_gate_ash_01 = new BlockFenceGateAsh01();
        AppalachiaBlocks.fence_gate_bitternut_hickory_01 = new BlockFenceGateBitternutHickory01();
        AppalachiaBlocks.fence_gate_black_cherry_01 = new BlockFenceGateBlackCherry01();
        AppalachiaBlocks.fence_gate_black_gum_01 = new BlockFenceGateBlackGum01();
        AppalachiaBlocks.fence_gate_black_locust_01 = new BlockFenceGateBlackLocust01();
        AppalachiaBlocks.fence_gate_black_oak_01 = new BlockFenceGateBlackOak01();
        AppalachiaBlocks.fence_gate_black_walnut_01 = new BlockFenceGateBlackWalnut01();
        AppalachiaBlocks.fence_gate_blue_beech_01 = new BlockFenceGateBlueBeech01();
        AppalachiaBlocks.fence_gate_box_elder_01 = new BlockFenceGateBoxElder01();
        AppalachiaBlocks.fence_gate_buckeye_01 = new BlockFenceGateBuckeye01();
        AppalachiaBlocks.fence_gate_cedar_01 = new BlockFenceGateCedar01();
        AppalachiaBlocks.fence_gate_dogwood_01 = new BlockFenceGateDogwood01();
        AppalachiaBlocks.fence_gate_hackberry_01 = new BlockFenceGateHackberry01();
        AppalachiaBlocks.fence_gate_honey_locust_01 = new BlockFenceGateHoneyLocust01();
        AppalachiaBlocks.fence_gate_hop_hornbeam_01 = new BlockFenceGateHopHornbeam01();
        AppalachiaBlocks.fence_gate_persimmon_01 = new BlockFenceGatePersimmon01();
        AppalachiaBlocks.fence_gate_pignut_hickory_01 = new BlockFenceGatePignutHickory01();
        AppalachiaBlocks.fence_gate_red_elm_01 = new BlockFenceGateRedElm01();
        AppalachiaBlocks.fence_gate_red_maple_01 = new BlockFenceGateRedMaple01();
        AppalachiaBlocks.fence_gate_red_oak_01 = new BlockFenceGateRedOak01();
        AppalachiaBlocks.fence_gate_river_birch_01 = new BlockFenceGateRiverBirch01();
        AppalachiaBlocks.fence_gate_sassafras_01 = new BlockFenceGateSassafras01();
        AppalachiaBlocks.fence_gate_shagbark_hickory_01 = new BlockFenceGateShagbarkHickory01();
        AppalachiaBlocks.fence_gate_shortleaf_pine_01 = new BlockFenceGateShortleafPine01();
        AppalachiaBlocks.fence_gate_sugar_maple_01 = new BlockFenceGateSugarMaple01();
        AppalachiaBlocks.fence_gate_sycamore_01 = new BlockFenceGateSycamore01();
        AppalachiaBlocks.fence_gate_tulip_poplar_01 = new BlockFenceGateTulipPoplar01();
        AppalachiaBlocks.fence_gate_white_oak_01 = new BlockFenceGateWhiteOak01();
        AppalachiaBlocks.fence_gate_white_pine_01 = new BlockFenceGateWhitePine01();
        AppalachiaBlocks.fence_gate_white_walnut_01 = new BlockFenceGateWhiteWalnut01();
        AppalachiaBlocks.fence_gate_yellow_birch_01 = new BlockFenceGateYellowBirch01();

        addFenceGates();

        //Saplings.

        AppalachiaBlocks.sapling_american_beech_01 = new BlockSaplingAmericanBeech01();
        AppalachiaBlocks.sapling_american_chestnut_01 = new BlockSaplingAmericanChestnut01();
        AppalachiaBlocks.sapling_american_elm_01 = new BlockSaplingAmericanElm01();
        AppalachiaBlocks.sapling_ash_01 = new BlockSaplingAsh01();
        AppalachiaBlocks.sapling_bitternut_hickory_01 = new BlockSaplingBitternutHickory01();
        AppalachiaBlocks.sapling_black_cherry_01 = new BlockSaplingBlackCherry01();
        AppalachiaBlocks.sapling_black_gum_01 = new BlockSaplingBlackGum01();
        AppalachiaBlocks.sapling_black_locust_01 = new BlockSaplingBlackLocust01();
        AppalachiaBlocks.sapling_black_oak_01 = new BlockSaplingBlackOak01();
        AppalachiaBlocks.sapling_black_walnut_01 = new BlockSaplingBlackWalnut01();
        AppalachiaBlocks.sapling_blue_beech_01 = new BlockSaplingBlueBeech01();
        AppalachiaBlocks.sapling_box_elder_01 = new BlockSaplingBoxElder01();
        AppalachiaBlocks.sapling_buckeye_01 = new BlockSaplingBuckeye01();
        AppalachiaBlocks.sapling_cedar_01 = new BlockSaplingCedar01();
        AppalachiaBlocks.sapling_dogwood_01 = new BlockSaplingDogwood01();
        AppalachiaBlocks.sapling_hackberry_01 = new BlockSaplingHackberry01();
        AppalachiaBlocks.sapling_honey_locust_01 = new BlockSaplingHoneyLocust01();
        AppalachiaBlocks.sapling_hop_hornbeam_01 = new BlockSaplingHopHornbeam01();
        AppalachiaBlocks.sapling_persimmon_01 = new BlockSaplingPersimmon01();
        AppalachiaBlocks.sapling_pignut_hickory_01 = new BlockSaplingPignutHickory01();
        AppalachiaBlocks.sapling_red_elm_01 = new BlockSaplingRedElm01();
        AppalachiaBlocks.sapling_red_maple_01 = new BlockSaplingRedMaple01();
        AppalachiaBlocks.sapling_red_oak_01 = new BlockSaplingRedOak01();
        AppalachiaBlocks.sapling_river_birch_01 = new BlockSaplingRiverBirch01();
        AppalachiaBlocks.sapling_sassafras_01 = new BlockSaplingSassafras01();
        AppalachiaBlocks.sapling_shagbark_hickory_01 = new BlockSaplingShagbarkHickory01();
        AppalachiaBlocks.sapling_shortleaf_pine_01 = new BlockSaplingShortleafPine01();
        AppalachiaBlocks.sapling_sugar_maple_01 = new BlockSaplingSugarMaple01();
        AppalachiaBlocks.sapling_sycamore_01 = new BlockSaplingSycamore01();
        AppalachiaBlocks.sapling_tulip_poplar_01 = new BlockSaplingTulipPoplar01();
        AppalachiaBlocks.sapling_white_oak_01 = new BlockSaplingWhiteOak01();
        AppalachiaBlocks.sapling_white_pine_01 = new BlockSaplingWhitePine01();
        AppalachiaBlocks.sapling_white_walnut_01 = new BlockSaplingWhiteWalnut01();
        AppalachiaBlocks.sapling_yellow_birch_01 = new BlockSaplingYellowBirch01();

        addSaplings();

        addAppalachiaBlocks();

        registerBlocksAndItemBlocks();
        registerOres();
        setFireInfo();
    }

    private static void addVines() {
        appalachiaVines.add(AppalachiaBlocks.vine_poison_ivy_01);
    }

    /*
     * ALPHABETICAL ORDER MATTERS WHEN ADDING INDIVIDUAL BLOCKS TO THE BLOCK LISTS!!!
     * For example...
     * addShapedRecipes() loops through the planks and uses the same index to get() the associated slabs, stairs, fences, and fence gates.
     * addShapelessRecipes() loops through the logs and uses the same index to get() the associated planks.
     */

    private static void addLogs() {

        appalachiaLogs.add(AppalachiaBlocks.log_american_beech_01);
        appalachiaLogs.add(AppalachiaBlocks.log_american_chestnut_01);
        appalachiaLogs.add(AppalachiaBlocks.log_american_elm_01);
        appalachiaLogs.add(AppalachiaBlocks.log_ash_01);
        appalachiaLogs.add(AppalachiaBlocks.log_bitternut_hickory_01);
        appalachiaLogs.add(AppalachiaBlocks.log_black_cherry_01);
        appalachiaLogs.add(AppalachiaBlocks.log_black_gum_01);
        appalachiaLogs.add(AppalachiaBlocks.log_black_locust_01);
        appalachiaLogs.add(AppalachiaBlocks.log_black_oak_01);
        appalachiaLogs.add(AppalachiaBlocks.log_black_walnut_01);
        appalachiaLogs.add(AppalachiaBlocks.log_blue_beech_01);
        appalachiaLogs.add(AppalachiaBlocks.log_box_elder_01);
        appalachiaLogs.add(AppalachiaBlocks.log_buckeye_01);
        appalachiaLogs.add(AppalachiaBlocks.log_cedar_01);
        appalachiaLogs.add(AppalachiaBlocks.log_dogwood_01);
        appalachiaLogs.add(AppalachiaBlocks.log_hackberry_01);
        appalachiaLogs.add(AppalachiaBlocks.log_honey_locust_01);
        appalachiaLogs.add(AppalachiaBlocks.log_hop_hornbeam_01);
        appalachiaLogs.add(AppalachiaBlocks.log_persimmon_01);
        appalachiaLogs.add(AppalachiaBlocks.log_pignut_hickory_01);
        appalachiaLogs.add(AppalachiaBlocks.log_red_elm_01);
        appalachiaLogs.add(AppalachiaBlocks.log_red_maple_01);
        appalachiaLogs.add(AppalachiaBlocks.log_red_oak_01);
        appalachiaLogs.add(AppalachiaBlocks.log_river_birch_01);
        appalachiaLogs.add(AppalachiaBlocks.log_sassafras_01);
        appalachiaLogs.add(AppalachiaBlocks.log_shagbark_hickory_01);
        appalachiaLogs.add(AppalachiaBlocks.log_shortleaf_pine_01);
        appalachiaLogs.add(AppalachiaBlocks.log_sugar_maple_01);
        appalachiaLogs.add(AppalachiaBlocks.log_sycamore_01);
        appalachiaLogs.add(AppalachiaBlocks.log_tulip_poplar_01);
        appalachiaLogs.add(AppalachiaBlocks.log_white_oak_01);
        appalachiaLogs.add(AppalachiaBlocks.log_white_pine_01);
        appalachiaLogs.add(AppalachiaBlocks.log_white_walnut_01);
        appalachiaLogs.add(AppalachiaBlocks.log_yellow_birch_01);
    }

    private static void addPlanks() {

        appalachiaPlanks.add(AppalachiaBlocks.planks_american_beech_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_american_chestnut_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_american_elm_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_ash_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_bitternut_hickory_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_black_cherry_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_black_gum_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_black_locust_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_black_oak_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_black_walnut_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_blue_beech_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_box_elder_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_buckeye_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_cedar_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_dogwood_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_hackberry_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_honey_locust_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_hop_hornbeam_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_persimmon_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_pignut_hickory_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_red_elm_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_red_maple_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_red_oak_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_river_birch_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_sassafras_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_shagbark_hickory_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_shortleaf_pine_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_sugar_maple_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_sycamore_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_tulip_poplar_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_white_oak_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_white_pine_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_white_walnut_01);
        appalachiaPlanks.add(AppalachiaBlocks.planks_yellow_birch_01);
    }

    private static void addSlabs() {

        appalachiaSlabs.add(AppalachiaBlocks.slab_american_beech_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_american_chestnut_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_american_elm_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_ash_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_bitternut_hickory_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_black_cherry_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_black_gum_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_black_locust_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_black_oak_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_black_walnut_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_blue_beech_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_box_elder_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_buckeye_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_cedar_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_dogwood_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_hackberry_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_honey_locust_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_hop_hornbeam_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_persimmon_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_pignut_hickory_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_red_elm_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_red_maple_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_red_oak_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_river_birch_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_sassafras_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_shagbark_hickory_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_shortleaf_pine_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_sugar_maple_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_sycamore_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_tulip_poplar_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_white_oak_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_white_pine_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_white_walnut_01);
        appalachiaSlabs.add(AppalachiaBlocks.slab_yellow_birch_01);
    }

    private static void addStairs() {

        appalachiaStairs.add(AppalachiaBlocks.stairs_american_beech_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_american_chestnut_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_american_elm_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_ash_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_bitternut_hickory_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_black_cherry_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_black_gum_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_black_locust_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_black_oak_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_black_walnut_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_blue_beech_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_box_elder_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_buckeye_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_cedar_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_dogwood_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_hackberry_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_honey_locust_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_hop_hornbeam_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_persimmon_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_pignut_hickory_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_red_elm_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_red_maple_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_red_oak_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_river_birch_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_sassafras_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_shagbark_hickory_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_shortleaf_pine_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_sugar_maple_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_sycamore_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_tulip_poplar_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_white_oak_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_white_pine_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_white_walnut_01);
        appalachiaStairs.add(AppalachiaBlocks.stairs_yellow_birch_01);
    }

    private static void addFences() {

        appalachiaFences.add(AppalachiaBlocks.fence_american_beech_01);
        appalachiaFences.add(AppalachiaBlocks.fence_american_chestnut_01);
        appalachiaFences.add(AppalachiaBlocks.fence_american_elm_01);
        appalachiaFences.add(AppalachiaBlocks.fence_ash_01);
        appalachiaFences.add(AppalachiaBlocks.fence_bitternut_hickory_01);
        appalachiaFences.add(AppalachiaBlocks.fence_black_cherry_01);
        appalachiaFences.add(AppalachiaBlocks.fence_black_gum_01);
        appalachiaFences.add(AppalachiaBlocks.fence_black_locust_01);
        appalachiaFences.add(AppalachiaBlocks.fence_black_oak_01);
        appalachiaFences.add(AppalachiaBlocks.fence_black_walnut_01);
        appalachiaFences.add(AppalachiaBlocks.fence_blue_beech_01);
        appalachiaFences.add(AppalachiaBlocks.fence_box_elder_01);
        appalachiaFences.add(AppalachiaBlocks.fence_buckeye_01);
        appalachiaFences.add(AppalachiaBlocks.fence_cedar_01);
        appalachiaFences.add(AppalachiaBlocks.fence_dogwood_01);
        appalachiaFences.add(AppalachiaBlocks.fence_hackberry_01);
        appalachiaFences.add(AppalachiaBlocks.fence_honey_locust_01);
        appalachiaFences.add(AppalachiaBlocks.fence_hop_hornbeam_01);
        appalachiaFences.add(AppalachiaBlocks.fence_persimmon_01);
        appalachiaFences.add(AppalachiaBlocks.fence_pignut_hickory_01);
        appalachiaFences.add(AppalachiaBlocks.fence_red_elm_01);
        appalachiaFences.add(AppalachiaBlocks.fence_red_maple_01);
        appalachiaFences.add(AppalachiaBlocks.fence_red_oak_01);
        appalachiaFences.add(AppalachiaBlocks.fence_river_birch_01);
        appalachiaFences.add(AppalachiaBlocks.fence_sassafras_01);
        appalachiaFences.add(AppalachiaBlocks.fence_shagbark_hickory_01);
        appalachiaFences.add(AppalachiaBlocks.fence_shortleaf_pine_01);
        appalachiaFences.add(AppalachiaBlocks.fence_sugar_maple_01);
        appalachiaFences.add(AppalachiaBlocks.fence_sycamore_01);
        appalachiaFences.add(AppalachiaBlocks.fence_tulip_poplar_01);
        appalachiaFences.add(AppalachiaBlocks.fence_white_oak_01);
        appalachiaFences.add(AppalachiaBlocks.fence_white_pine_01);
        appalachiaFences.add(AppalachiaBlocks.fence_white_walnut_01);
        appalachiaFences.add(AppalachiaBlocks.fence_yellow_birch_01);
    }

    private static void addFenceGates() {

        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_american_beech_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_american_chestnut_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_american_elm_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_ash_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_bitternut_hickory_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_black_cherry_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_black_gum_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_black_locust_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_black_oak_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_black_walnut_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_blue_beech_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_box_elder_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_buckeye_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_cedar_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_dogwood_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_hackberry_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_honey_locust_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_hop_hornbeam_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_persimmon_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_pignut_hickory_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_red_elm_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_red_maple_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_red_oak_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_river_birch_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_sassafras_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_shagbark_hickory_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_shortleaf_pine_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_sugar_maple_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_sycamore_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_tulip_poplar_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_white_oak_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_white_pine_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_white_walnut_01);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_yellow_birch_01);
    }

    private static void addLeaves() {

        appalachiaLeaves.add(AppalachiaBlocks.leaves_american_beech_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_american_chestnut_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_american_elm_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_ash_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_bitternut_hickory_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_black_cherry_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_black_gum_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_black_locust_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_black_oak_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_black_walnut_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_blue_beech_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_box_elder_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_buckeye_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_cedar_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_dogwood_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_hackberry_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_honey_locust_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_hop_hornbeam_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_persimmon_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_pignut_hickory_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_red_elm_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_red_maple_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_red_oak_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_river_birch_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_sassafras_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_shagbark_hickory_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_shortleaf_pine_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_sugar_maple_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_sycamore_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_tulip_poplar_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_white_oak_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_white_pine_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_white_walnut_01);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_yellow_birch_01);
    }

    private static void addFallenLeaves() {

        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_american_beech_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_american_chestnut_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_american_elm_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_ash_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_bitternut_hickory_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_black_cherry_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_black_gum_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_black_locust_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_black_oak_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_black_walnut_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_blue_beech_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_box_elder_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_buckeye_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_cedar_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_dogwood_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_hackberry_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_honey_locust_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_hop_hornbeam_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_persimmon_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_pignut_hickory_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_red_elm_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_red_maple_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_red_oak_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_river_birch_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_sassafras_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_shagbark_hickory_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_shortleaf_pine_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_sugar_maple_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_sycamore_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_tulip_poplar_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_white_oak_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_white_pine_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_white_walnut_01_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_yellow_birch_01_fallen);
    }

    private static void addSaplings() {

        appalachiaSaplings.add(AppalachiaBlocks.sapling_american_beech_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_american_chestnut_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_american_elm_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_ash_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_bitternut_hickory_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_black_cherry_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_black_gum_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_black_locust_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_black_oak_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_black_walnut_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_blue_beech_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_box_elder_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_buckeye_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_cedar_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_dogwood_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_hackberry_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_honey_locust_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_hop_hornbeam_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_persimmon_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_pignut_hickory_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_red_elm_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_red_maple_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_red_oak_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_river_birch_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_sassafras_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_shagbark_hickory_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_shortleaf_pine_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_sugar_maple_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_sycamore_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_tulip_poplar_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_white_oak_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_white_pine_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_white_walnut_01);
        appalachiaSaplings.add(AppalachiaBlocks.sapling_yellow_birch_01);
    }

    private static void addAppalachiaBlocks() {

        for (int i = 0; i < appalachiaVines.size(); i++) {
            appalachiaBlocks.add(appalachiaVines.get(i));
        }

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            appalachiaBlocks.add(appalachiaLogs.get(i));
        }

        for (int i = 0; i < appalachiaPlanks.size(); i++) {
            appalachiaBlocks.add(appalachiaPlanks.get(i));
        }

        for (int i = 0; i < appalachiaSlabs.size(); i++) {
            appalachiaBlocks.add(appalachiaSlabs.get(i));
        }

        for (int i = 0; i < appalachiaStairs.size(); i++) {
            appalachiaBlocks.add(appalachiaStairs.get(i));
        }

        for (int i = 0; i < appalachiaFences.size(); i++) {
            appalachiaBlocks.add(appalachiaFences.get(i));
        }

        for (int i = 0; i < appalachiaFenceGates.size(); i++) {
            appalachiaBlocks.add(appalachiaFenceGates.get(i));
        }

        for (int i = 0; i < appalachiaLeaves.size(); i++) {
            appalachiaBlocks.add(appalachiaLeaves.get(i));
        }

        for (int i = 0; i < appalachiaLeavesFallen.size(); i++) {
            appalachiaBlocks.add(appalachiaLeavesFallen.get(i));
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            appalachiaBlocks.add(appalachiaSaplings.get(i));
        }
    }

    private static void registerBlocksAndItemBlocks() {

        for (int i = 0; i < appalachiaVines.size(); i++) {
            AppalachiaBlockVine block = (AppalachiaBlockVine)appalachiaVines.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            AppalachiaBlockLog block = (AppalachiaBlockLog)appalachiaLogs.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaPlanks.size(); i++) {
            AppalachiaBlockPlanks block = (AppalachiaBlockPlanks)appalachiaPlanks.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaSlabs.size(); i++) {
            AppalachiaBlockSlab block = (AppalachiaBlockSlab)appalachiaSlabs.get(i);
            AppalachiaBlockPlanks planks = (AppalachiaBlockPlanks)appalachiaPlanks.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new AppalachiaItemSlab(block, planks.getDefaultState()), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaStairs.size(); i++) {
            AppalachiaBlockStairs block = (AppalachiaBlockStairs)appalachiaStairs.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaFences.size(); i++) {
            AppalachiaBlockFence block = (AppalachiaBlockFence)appalachiaFences.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaFenceGates.size(); i++) {
            AppalachiaBlockFenceGate block = (AppalachiaBlockFenceGate)appalachiaFenceGates.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaLeaves.size(); i++) {
            AppalachiaBlockLeaves block = (AppalachiaBlockLeaves)appalachiaLeaves.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaLeavesFallen.size(); i++) {
            AppalachiaBlockLeavesFallen block = (AppalachiaBlockLeavesFallen)appalachiaLeavesFallen.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new AppalachiaItemLeavesFallen(block), block.getRegistryName());
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            AppalachiaBlockSapling block = (AppalachiaBlockSapling)appalachiaSaplings.get(i);
            block.setRegistryName(block.registryName());
            GameRegistry.register(block);
            GameRegistry.register(new ItemBlock(block), block.getRegistryName());
        }
    }

    private static void registerOres() {

        for (int i = 0; i < appalachiaVines.size(); i++) {
            OreDictionary.registerOre("vine", new ItemStack(appalachiaVines.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            OreDictionary.registerOre("logWood", new ItemStack(appalachiaLogs.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaPlanks.size(); i++) {
            OreDictionary.registerOre("plankWood", new ItemStack(appalachiaPlanks.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaSlabs.size(); i++) {
            OreDictionary.registerOre("slabWood", new ItemStack(appalachiaSlabs.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaStairs.size(); i++) {
            OreDictionary.registerOre("stairWood", new ItemStack(appalachiaStairs.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaFences.size(); i++) {
            OreDictionary.registerOre("fenceWood", new ItemStack(appalachiaFences.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaFenceGates.size(); i++) {
            OreDictionary.registerOre("fenceGateWood", new ItemStack(appalachiaFenceGates.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaLeaves.size(); i++) {
            OreDictionary.registerOre("treeLeaves", new ItemStack(appalachiaLeaves.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaLeavesFallen.size(); i++) {
            OreDictionary.registerOre("treeLeavesFallen", new ItemStack(appalachiaLeavesFallen.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            OreDictionary.registerOre("treeSapling", new ItemStack(appalachiaSaplings.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }
    }

    private static void setFireInfo() {

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaLogs.get(i), 5, 5);
        }

        for (int i = 0; i < appalachiaPlanks.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaPlanks.get(i), 5, 20);
        }

        for (int i = 0; i < appalachiaSlabs.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaSlabs.get(i), 5, 20);
        }

        for (int i = 0; i < appalachiaStairs.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaStairs.get(i), 5, 20);
        }

        for (int i = 0; i < appalachiaFences.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaFences.get(i), 5, 20);
        }

        for (int i = 0; i < appalachiaFenceGates.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaFenceGates.get(i), 5, 20);
        }

        for (int i = 0; i < appalachiaLeaves.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaLeaves.get(i), 30, 60);
        }

        for (int i = 0; i < appalachiaLeavesFallen.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaLeavesFallen.get(i), 30, 60);
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            Blocks.FIRE.setFireInfo(appalachiaSaplings.get(i), 20, 60);
        }
    }

    public static void addRecipes() {

        addShapedRecipes();
        addShapelessRecipes();
        addSmeltingRecipes();
    }

    private static void addShapedRecipes() {

        for (int i = 0; i < appalachiaPlanks.size(); i++) {

            GameRegistry.addRecipe(new ItemStack(appalachiaSlabs.get(i), 6), "###", '#', appalachiaPlanks.get(i));
            GameRegistry.addRecipe(new ItemStack(appalachiaStairs.get(i), 4), "  #", " ##", "###", '#', appalachiaPlanks.get(i));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(appalachiaFences.get(i), 3), "#S#", "#S#", 'S', "stickWood", '#', appalachiaPlanks.get(i)));
            GameRegistry.addRecipe(new ShapedOreRecipe(appalachiaFenceGates.get(i), "S#S", "S#S", 'S', "stickWood", '#', appalachiaPlanks.get(i)));
        }
    }

    private static void addShapelessRecipes() {

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(appalachiaPlanks.get(i), 4), new ItemStack(appalachiaLogs.get(i), 1, OreDictionary.WILDCARD_VALUE));
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK), new ItemStack(appalachiaSaplings.get(i)));
        }
    }

    private static void addSmeltingRecipes() {

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            GameRegistry.addSmelting(appalachiaLogs.get(i), new ItemStack(Items.COAL, 1, 1), 0.15F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {

        for (int i = 0; i < appalachiaVines.size(); i++) {
            registerModel(appalachiaVines.get(i));
        }

        for (int i = 0; i < appalachiaLogs.size(); i++) {
            registerModel(appalachiaLogs.get(i));
            ModelLoader.setCustomStateMapper(appalachiaLogs.get(i), new StateMap.Builder().ignore(AppalachiaBlockLog.VARIANT).build());
        }

        for (int i = 0; i < appalachiaPlanks.size(); i++) {
            registerModel(appalachiaPlanks.get(i));
            ModelLoader.setCustomStateMapper(appalachiaPlanks.get(i), new StateMap.Builder().ignore(AppalachiaBlockPlanks.DOUBLE).build());
        }

        for (int i = 0; i < appalachiaSlabs.size(); i++) {
            registerModel(appalachiaSlabs.get(i));
        }

        for (int i = 0; i < appalachiaStairs.size(); i++) {
            registerModel(appalachiaStairs.get(i));
        }

        for (int i = 0; i < appalachiaFences.size(); i++) {
            registerModel(appalachiaFences.get(i));
        }

        for (int i = 0; i < appalachiaFenceGates.size(); i++) {
            registerModel(appalachiaFenceGates.get(i));
            ModelLoader.setCustomStateMapper(appalachiaFenceGates.get(i), new StateMap.Builder().ignore(AppalachiaBlockFenceGate.POWERED).build());
        }

        for (int i = 0; i < appalachiaLeaves.size(); i++) {
            registerModel(appalachiaLeaves.get(i));
            ModelLoader.setCustomStateMapper(appalachiaLeaves.get(i), new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        }

        for (int i = 0; i < appalachiaLeavesFallen.size(); i++) {
            registerModel(appalachiaLeavesFallen.get(i));
        }

        for (int i = 0; i < appalachiaSaplings.size(); i++) {
            registerModel(appalachiaSaplings.get(i));
            ModelLoader.setCustomStateMapper(appalachiaSaplings.get(i), new StateMap.Builder().ignore(BlockSapling.TYPE, BlockSapling.STAGE).build());
        }
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block, String modelName) {

        ItemManager.registerModel(Item.getItemFromBlock(block), modelName);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block) {

        ItemManager.registerModel(Item.getItemFromBlock(block));
    }

    @SideOnly(Side.CLIENT)
    private static void registerModelWithMeta(Block block, String... modelName) {

        ItemManager.registerModelWithMeta(Item.getItemFromBlock(block), modelName);
    }
}

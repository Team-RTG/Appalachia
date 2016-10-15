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
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.BlockLeavesAutumnOrange;
import appalachia.block.leaves.BlockLeavesAutumnRed;
import appalachia.block.leaves.BlockLeavesAutumnYellow;
import appalachia.block.leaves.fallen.*;
import appalachia.block.logs.*;
import appalachia.block.planks.*;
import appalachia.block.saplings.AppalachiaBlockSapling;
import appalachia.block.saplings.BlockSaplingQuercusRobur;
import appalachia.block.slabs.*;
import appalachia.block.stairs.*;
import appalachia.item.ItemManager;
import appalachia.item.leaves.fallen.AppalachiaItemLeavesFallen;
import appalachia.item.slabs.AppalachiaItemSlab;

public class BlockManager {

    public static ArrayList<Block> appalachiaBlocks = new ArrayList<Block>() {

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

        //Logs.
        AppalachiaBlocks.log_autumn_grey = new BlockLogAutumnGrey();

        AppalachiaBlocks.log_oak_10_10 = new BlockLogOakH10S10();
        AppalachiaBlocks.log_oak_10_20 = new BlockLogOakH10S20();
        AppalachiaBlocks.log_oak_10_30 = new BlockLogOakH10S30();
        AppalachiaBlocks.log_oak_10_40 = new BlockLogOakH10S40();
        AppalachiaBlocks.log_oak_10_50 = new BlockLogOakH10S50();
        AppalachiaBlocks.log_oak_10_60 = new BlockLogOakH10S60();
        AppalachiaBlocks.log_oak_10_70 = new BlockLogOakH10S70();
        AppalachiaBlocks.log_oak_10_80 = new BlockLogOakH10S80();
        AppalachiaBlocks.log_oak_10_90 = new BlockLogOakH10S90();
        AppalachiaBlocks.log_oak_10_100 = new BlockLogOakH10S100();
        AppalachiaBlocks.log_oak_10_110 = new BlockLogOakH10S110();
        AppalachiaBlocks.log_oak_10_120 = new BlockLogOakH10S120();
        AppalachiaBlocks.log_oak_10_130 = new BlockLogOakH10S130();
        AppalachiaBlocks.log_oak_10_140 = new BlockLogOakH10S140();
        AppalachiaBlocks.log_oak_10_150 = new BlockLogOakH10S150();
        AppalachiaBlocks.log_oak_10_160 = new BlockLogOakH10S160();
        AppalachiaBlocks.log_oak_10_170 = new BlockLogOakH10S170();
        AppalachiaBlocks.log_oak_10_180 = new BlockLogOakH10S180();
        AppalachiaBlocks.log_oak_10_190 = new BlockLogOakH10S190();
        AppalachiaBlocks.log_oak_10_200 = new BlockLogOakH10S200();
        AppalachiaBlocks.log_oak_20_10 = new BlockLogOakH20S10();
        AppalachiaBlocks.log_oak_20_20 = new BlockLogOakH20S20();
        AppalachiaBlocks.log_oak_20_30 = new BlockLogOakH20S30();
        AppalachiaBlocks.log_oak_20_40 = new BlockLogOakH20S40();
        AppalachiaBlocks.log_oak_20_50 = new BlockLogOakH20S50();
        AppalachiaBlocks.log_oak_20_60 = new BlockLogOakH20S60();
        AppalachiaBlocks.log_oak_20_70 = new BlockLogOakH20S70();
        AppalachiaBlocks.log_oak_20_80 = new BlockLogOakH20S80();
        AppalachiaBlocks.log_oak_20_90 = new BlockLogOakH20S90();
        AppalachiaBlocks.log_oak_20_100 = new BlockLogOakH20S100();
        AppalachiaBlocks.log_oak_20_110 = new BlockLogOakH20S110();
        AppalachiaBlocks.log_oak_20_120 = new BlockLogOakH20S120();
        AppalachiaBlocks.log_oak_20_130 = new BlockLogOakH20S130();
        AppalachiaBlocks.log_oak_20_140 = new BlockLogOakH20S140();
        AppalachiaBlocks.log_oak_20_150 = new BlockLogOakH20S150();
        AppalachiaBlocks.log_oak_20_160 = new BlockLogOakH20S160();
        AppalachiaBlocks.log_oak_20_170 = new BlockLogOakH20S170();
        AppalachiaBlocks.log_oak_20_180 = new BlockLogOakH20S180();
        AppalachiaBlocks.log_oak_20_190 = new BlockLogOakH20S190();
        AppalachiaBlocks.log_oak_20_200 = new BlockLogOakH20S200();
        AppalachiaBlocks.log_oak_30_10 = new BlockLogOakH30S10();
        AppalachiaBlocks.log_oak_30_20 = new BlockLogOakH30S20();
        AppalachiaBlocks.log_oak_30_30 = new BlockLogOakH30S30();
        AppalachiaBlocks.log_oak_30_40 = new BlockLogOakH30S40();
        AppalachiaBlocks.log_oak_30_50 = new BlockLogOakH30S50();
        AppalachiaBlocks.log_oak_30_60 = new BlockLogOakH30S60();
        AppalachiaBlocks.log_oak_30_70 = new BlockLogOakH30S70();
        AppalachiaBlocks.log_oak_30_80 = new BlockLogOakH30S80();
        AppalachiaBlocks.log_oak_30_90 = new BlockLogOakH30S90();
        AppalachiaBlocks.log_oak_30_100 = new BlockLogOakH30S100();
        AppalachiaBlocks.log_oak_30_110 = new BlockLogOakH30S110();
        AppalachiaBlocks.log_oak_30_120 = new BlockLogOakH30S120();
        AppalachiaBlocks.log_oak_30_130 = new BlockLogOakH30S130();
        AppalachiaBlocks.log_oak_30_140 = new BlockLogOakH30S140();
        AppalachiaBlocks.log_oak_30_150 = new BlockLogOakH30S150();
        AppalachiaBlocks.log_oak_30_160 = new BlockLogOakH30S160();
        AppalachiaBlocks.log_oak_30_170 = new BlockLogOakH30S170();
        AppalachiaBlocks.log_oak_30_180 = new BlockLogOakH30S180();
        AppalachiaBlocks.log_oak_30_190 = new BlockLogOakH30S190();
        AppalachiaBlocks.log_oak_30_200 = new BlockLogOakH30S200();
        AppalachiaBlocks.log_oak_30_210 = new BlockLogOakH30S210();
        AppalachiaBlocks.log_oak_30_220 = new BlockLogOakH30S220();
        AppalachiaBlocks.log_oak_30_230 = new BlockLogOakH30S230();
        AppalachiaBlocks.log_oak_30_240 = new BlockLogOakH30S240();
        AppalachiaBlocks.log_oak_30_250 = new BlockLogOakH30S250();
        AppalachiaBlocks.log_oak_40_10 = new BlockLogOakH40S10();
        AppalachiaBlocks.log_oak_40_20 = new BlockLogOakH40S20();
        AppalachiaBlocks.log_oak_40_30 = new BlockLogOakH40S30();
        AppalachiaBlocks.log_oak_40_40 = new BlockLogOakH40S40();
        AppalachiaBlocks.log_oak_40_50 = new BlockLogOakH40S50();
        AppalachiaBlocks.log_oak_40_60 = new BlockLogOakH40S60();
        AppalachiaBlocks.log_oak_40_70 = new BlockLogOakH40S70();
        AppalachiaBlocks.log_oak_40_80 = new BlockLogOakH40S80();
        AppalachiaBlocks.log_oak_40_90 = new BlockLogOakH40S90();
        AppalachiaBlocks.log_oak_40_100 = new BlockLogOakH40S100();
        AppalachiaBlocks.log_oak_40_110 = new BlockLogOakH40S110();
        AppalachiaBlocks.log_oak_40_120 = new BlockLogOakH40S120();
        AppalachiaBlocks.log_oak_40_130 = new BlockLogOakH40S130();
        AppalachiaBlocks.log_oak_40_140 = new BlockLogOakH40S140();
        AppalachiaBlocks.log_oak_40_150 = new BlockLogOakH40S150();
        AppalachiaBlocks.log_oak_40_160 = new BlockLogOakH40S160();
        AppalachiaBlocks.log_oak_40_170 = new BlockLogOakH40S170();
        AppalachiaBlocks.log_oak_40_180 = new BlockLogOakH40S180();
        AppalachiaBlocks.log_oak_40_190 = new BlockLogOakH40S190();
        AppalachiaBlocks.log_oak_40_200 = new BlockLogOakH40S200();
        AppalachiaBlocks.log_oak_180_10 = new BlockLogOakH180S10();
        AppalachiaBlocks.log_oak_180_20 = new BlockLogOakH180S20();
        AppalachiaBlocks.log_oak_180_30 = new BlockLogOakH180S30();
        AppalachiaBlocks.log_oak_180_40 = new BlockLogOakH180S40();
        AppalachiaBlocks.log_oak_180_50 = new BlockLogOakH180S50();
        AppalachiaBlocks.log_oak_180_60 = new BlockLogOakH180S60();
        AppalachiaBlocks.log_oak_180_70 = new BlockLogOakH180S70();
        AppalachiaBlocks.log_oak_180_80 = new BlockLogOakH180S80();
        AppalachiaBlocks.log_oak_180_90 = new BlockLogOakH180S90();
        AppalachiaBlocks.log_oak_180_100 = new BlockLogOakH180S100();
        addLogs();

        //Planks.
        AppalachiaBlocks.planks_autumn_grey = new BlockPlanksAutumnGrey();

        AppalachiaBlocks.planks_oak_10_10 = new BlockPlanksOakH10S10();
        AppalachiaBlocks.planks_oak_10_20 = new BlockPlanksOakH10S20();
        AppalachiaBlocks.planks_oak_10_30 = new BlockPlanksOakH10S30();
        AppalachiaBlocks.planks_oak_10_40 = new BlockPlanksOakH10S40();
        AppalachiaBlocks.planks_oak_10_50 = new BlockPlanksOakH10S50();
        AppalachiaBlocks.planks_oak_10_60 = new BlockPlanksOakH10S60();
        AppalachiaBlocks.planks_oak_10_70 = new BlockPlanksOakH10S70();
        AppalachiaBlocks.planks_oak_10_80 = new BlockPlanksOakH10S80();
        AppalachiaBlocks.planks_oak_10_90 = new BlockPlanksOakH10S90();
        AppalachiaBlocks.planks_oak_10_100 = new BlockPlanksOakH10S100();
        AppalachiaBlocks.planks_oak_10_110 = new BlockPlanksOakH10S110();
        AppalachiaBlocks.planks_oak_10_120 = new BlockPlanksOakH10S120();
        AppalachiaBlocks.planks_oak_10_130 = new BlockPlanksOakH10S130();
        AppalachiaBlocks.planks_oak_10_140 = new BlockPlanksOakH10S140();
        AppalachiaBlocks.planks_oak_10_150 = new BlockPlanksOakH10S150();
        AppalachiaBlocks.planks_oak_10_160 = new BlockPlanksOakH10S160();
        AppalachiaBlocks.planks_oak_10_170 = new BlockPlanksOakH10S170();
        AppalachiaBlocks.planks_oak_10_180 = new BlockPlanksOakH10S180();
        AppalachiaBlocks.planks_oak_10_190 = new BlockPlanksOakH10S190();
        AppalachiaBlocks.planks_oak_10_200 = new BlockPlanksOakH10S200();
        AppalachiaBlocks.planks_oak_20_10 = new BlockPlanksOakH20S10();
        AppalachiaBlocks.planks_oak_20_20 = new BlockPlanksOakH20S20();
        AppalachiaBlocks.planks_oak_20_30 = new BlockPlanksOakH20S30();
        AppalachiaBlocks.planks_oak_20_40 = new BlockPlanksOakH20S40();
        AppalachiaBlocks.planks_oak_20_50 = new BlockPlanksOakH20S50();
        AppalachiaBlocks.planks_oak_20_60 = new BlockPlanksOakH20S60();
        AppalachiaBlocks.planks_oak_20_70 = new BlockPlanksOakH20S70();
        AppalachiaBlocks.planks_oak_20_80 = new BlockPlanksOakH20S80();
        AppalachiaBlocks.planks_oak_20_90 = new BlockPlanksOakH20S90();
        AppalachiaBlocks.planks_oak_20_100 = new BlockPlanksOakH20S100();
        AppalachiaBlocks.planks_oak_20_110 = new BlockPlanksOakH20S110();
        AppalachiaBlocks.planks_oak_20_120 = new BlockPlanksOakH20S120();
        AppalachiaBlocks.planks_oak_20_130 = new BlockPlanksOakH20S130();
        AppalachiaBlocks.planks_oak_20_140 = new BlockPlanksOakH20S140();
        AppalachiaBlocks.planks_oak_20_150 = new BlockPlanksOakH20S150();
        AppalachiaBlocks.planks_oak_20_160 = new BlockPlanksOakH20S160();
        AppalachiaBlocks.planks_oak_20_170 = new BlockPlanksOakH20S170();
        AppalachiaBlocks.planks_oak_20_180 = new BlockPlanksOakH20S180();
        AppalachiaBlocks.planks_oak_20_190 = new BlockPlanksOakH20S190();
        AppalachiaBlocks.planks_oak_20_200 = new BlockPlanksOakH20S200();
        AppalachiaBlocks.planks_oak_30_10 = new BlockPlanksOakH30S10();
        AppalachiaBlocks.planks_oak_30_20 = new BlockPlanksOakH30S20();
        AppalachiaBlocks.planks_oak_30_30 = new BlockPlanksOakH30S30();
        AppalachiaBlocks.planks_oak_30_40 = new BlockPlanksOakH30S40();
        AppalachiaBlocks.planks_oak_30_50 = new BlockPlanksOakH30S50();
        AppalachiaBlocks.planks_oak_30_60 = new BlockPlanksOakH30S60();
        AppalachiaBlocks.planks_oak_30_70 = new BlockPlanksOakH30S70();
        AppalachiaBlocks.planks_oak_30_80 = new BlockPlanksOakH30S80();
        AppalachiaBlocks.planks_oak_30_90 = new BlockPlanksOakH30S90();
        AppalachiaBlocks.planks_oak_30_100 = new BlockPlanksOakH30S100();
        AppalachiaBlocks.planks_oak_30_110 = new BlockPlanksOakH30S110();
        AppalachiaBlocks.planks_oak_30_120 = new BlockPlanksOakH30S120();
        AppalachiaBlocks.planks_oak_30_130 = new BlockPlanksOakH30S130();
        AppalachiaBlocks.planks_oak_30_140 = new BlockPlanksOakH30S140();
        AppalachiaBlocks.planks_oak_30_150 = new BlockPlanksOakH30S150();
        AppalachiaBlocks.planks_oak_30_160 = new BlockPlanksOakH30S160();
        AppalachiaBlocks.planks_oak_30_170 = new BlockPlanksOakH30S170();
        AppalachiaBlocks.planks_oak_30_180 = new BlockPlanksOakH30S180();
        AppalachiaBlocks.planks_oak_30_190 = new BlockPlanksOakH30S190();
        AppalachiaBlocks.planks_oak_30_200 = new BlockPlanksOakH30S200();
        AppalachiaBlocks.planks_oak_30_210 = new BlockPlanksOakH30S210();
        AppalachiaBlocks.planks_oak_30_220 = new BlockPlanksOakH30S220();
        AppalachiaBlocks.planks_oak_30_230 = new BlockPlanksOakH30S230();
        AppalachiaBlocks.planks_oak_30_240 = new BlockPlanksOakH30S240();
        AppalachiaBlocks.planks_oak_30_250 = new BlockPlanksOakH30S250();
        AppalachiaBlocks.planks_oak_40_10 = new BlockPlanksOakH40S10();
        AppalachiaBlocks.planks_oak_40_20 = new BlockPlanksOakH40S20();
        AppalachiaBlocks.planks_oak_40_30 = new BlockPlanksOakH40S30();
        AppalachiaBlocks.planks_oak_40_40 = new BlockPlanksOakH40S40();
        AppalachiaBlocks.planks_oak_40_50 = new BlockPlanksOakH40S50();
        AppalachiaBlocks.planks_oak_40_60 = new BlockPlanksOakH40S60();
        AppalachiaBlocks.planks_oak_40_70 = new BlockPlanksOakH40S70();
        AppalachiaBlocks.planks_oak_40_80 = new BlockPlanksOakH40S80();
        AppalachiaBlocks.planks_oak_40_90 = new BlockPlanksOakH40S90();
        AppalachiaBlocks.planks_oak_40_100 = new BlockPlanksOakH40S100();
        AppalachiaBlocks.planks_oak_40_110 = new BlockPlanksOakH40S110();
        AppalachiaBlocks.planks_oak_40_120 = new BlockPlanksOakH40S120();
        AppalachiaBlocks.planks_oak_40_130 = new BlockPlanksOakH40S130();
        AppalachiaBlocks.planks_oak_40_140 = new BlockPlanksOakH40S140();
        AppalachiaBlocks.planks_oak_40_150 = new BlockPlanksOakH40S150();
        AppalachiaBlocks.planks_oak_40_160 = new BlockPlanksOakH40S160();
        AppalachiaBlocks.planks_oak_40_170 = new BlockPlanksOakH40S170();
        AppalachiaBlocks.planks_oak_40_180 = new BlockPlanksOakH40S180();
        AppalachiaBlocks.planks_oak_40_190 = new BlockPlanksOakH40S190();
        AppalachiaBlocks.planks_oak_40_200 = new BlockPlanksOakH40S200();
        AppalachiaBlocks.planks_oak_180_10 = new BlockPlanksOakH180S10();
        AppalachiaBlocks.planks_oak_180_20 = new BlockPlanksOakH180S20();
        AppalachiaBlocks.planks_oak_180_30 = new BlockPlanksOakH180S30();
        AppalachiaBlocks.planks_oak_180_40 = new BlockPlanksOakH180S40();
        AppalachiaBlocks.planks_oak_180_50 = new BlockPlanksOakH180S50();
        AppalachiaBlocks.planks_oak_180_60 = new BlockPlanksOakH180S60();
        AppalachiaBlocks.planks_oak_180_70 = new BlockPlanksOakH180S70();
        AppalachiaBlocks.planks_oak_180_80 = new BlockPlanksOakH180S80();
        AppalachiaBlocks.planks_oak_180_90 = new BlockPlanksOakH180S90();
        AppalachiaBlocks.planks_oak_180_100 = new BlockPlanksOakH180S100();
        addPlanks();

        //Slabs.
        AppalachiaBlocks.slab_autumn_grey = new BlockSlabAutumnGrey();

        AppalachiaBlocks.slab_oak_10_10 = new BlockSlabOakH10S10();
        AppalachiaBlocks.slab_oak_10_20 = new BlockSlabOakH10S20();
        AppalachiaBlocks.slab_oak_10_30 = new BlockSlabOakH10S30();
        AppalachiaBlocks.slab_oak_10_40 = new BlockSlabOakH10S40();
        AppalachiaBlocks.slab_oak_10_50 = new BlockSlabOakH10S50();
        AppalachiaBlocks.slab_oak_10_60 = new BlockSlabOakH10S60();
        AppalachiaBlocks.slab_oak_10_70 = new BlockSlabOakH10S70();
        AppalachiaBlocks.slab_oak_10_80 = new BlockSlabOakH10S80();
        AppalachiaBlocks.slab_oak_10_90 = new BlockSlabOakH10S90();
        AppalachiaBlocks.slab_oak_10_100 = new BlockSlabOakH10S100();
        AppalachiaBlocks.slab_oak_10_110 = new BlockSlabOakH10S110();
        AppalachiaBlocks.slab_oak_10_120 = new BlockSlabOakH10S120();
        AppalachiaBlocks.slab_oak_10_130 = new BlockSlabOakH10S130();
        AppalachiaBlocks.slab_oak_10_140 = new BlockSlabOakH10S140();
        AppalachiaBlocks.slab_oak_10_150 = new BlockSlabOakH10S150();
        AppalachiaBlocks.slab_oak_10_160 = new BlockSlabOakH10S160();
        AppalachiaBlocks.slab_oak_10_170 = new BlockSlabOakH10S170();
        AppalachiaBlocks.slab_oak_10_180 = new BlockSlabOakH10S180();
        AppalachiaBlocks.slab_oak_10_190 = new BlockSlabOakH10S190();
        AppalachiaBlocks.slab_oak_10_200 = new BlockSlabOakH10S200();
        AppalachiaBlocks.slab_oak_20_10 = new BlockSlabOakH20S10();
        AppalachiaBlocks.slab_oak_20_20 = new BlockSlabOakH20S20();
        AppalachiaBlocks.slab_oak_20_30 = new BlockSlabOakH20S30();
        AppalachiaBlocks.slab_oak_20_40 = new BlockSlabOakH20S40();
        AppalachiaBlocks.slab_oak_20_50 = new BlockSlabOakH20S50();
        AppalachiaBlocks.slab_oak_20_60 = new BlockSlabOakH20S60();
        AppalachiaBlocks.slab_oak_20_70 = new BlockSlabOakH20S70();
        AppalachiaBlocks.slab_oak_20_80 = new BlockSlabOakH20S80();
        AppalachiaBlocks.slab_oak_20_90 = new BlockSlabOakH20S90();
        AppalachiaBlocks.slab_oak_20_100 = new BlockSlabOakH20S100();
        AppalachiaBlocks.slab_oak_20_110 = new BlockSlabOakH20S110();
        AppalachiaBlocks.slab_oak_20_120 = new BlockSlabOakH20S120();
        AppalachiaBlocks.slab_oak_20_130 = new BlockSlabOakH20S130();
        AppalachiaBlocks.slab_oak_20_140 = new BlockSlabOakH20S140();
        AppalachiaBlocks.slab_oak_20_150 = new BlockSlabOakH20S150();
        AppalachiaBlocks.slab_oak_20_160 = new BlockSlabOakH20S160();
        AppalachiaBlocks.slab_oak_20_170 = new BlockSlabOakH20S170();
        AppalachiaBlocks.slab_oak_20_180 = new BlockSlabOakH20S180();
        AppalachiaBlocks.slab_oak_20_190 = new BlockSlabOakH20S190();
        AppalachiaBlocks.slab_oak_20_200 = new BlockSlabOakH20S200();
        AppalachiaBlocks.slab_oak_30_10 = new BlockSlabOakH30S10();
        AppalachiaBlocks.slab_oak_30_20 = new BlockSlabOakH30S20();
        AppalachiaBlocks.slab_oak_30_30 = new BlockSlabOakH30S30();
        AppalachiaBlocks.slab_oak_30_40 = new BlockSlabOakH30S40();
        AppalachiaBlocks.slab_oak_30_50 = new BlockSlabOakH30S50();
        AppalachiaBlocks.slab_oak_30_60 = new BlockSlabOakH30S60();
        AppalachiaBlocks.slab_oak_30_70 = new BlockSlabOakH30S70();
        AppalachiaBlocks.slab_oak_30_80 = new BlockSlabOakH30S80();
        AppalachiaBlocks.slab_oak_30_90 = new BlockSlabOakH30S90();
        AppalachiaBlocks.slab_oak_30_100 = new BlockSlabOakH30S100();
        AppalachiaBlocks.slab_oak_30_110 = new BlockSlabOakH30S110();
        AppalachiaBlocks.slab_oak_30_120 = new BlockSlabOakH30S120();
        AppalachiaBlocks.slab_oak_30_130 = new BlockSlabOakH30S130();
        AppalachiaBlocks.slab_oak_30_140 = new BlockSlabOakH30S140();
        AppalachiaBlocks.slab_oak_30_150 = new BlockSlabOakH30S150();
        AppalachiaBlocks.slab_oak_30_160 = new BlockSlabOakH30S160();
        AppalachiaBlocks.slab_oak_30_170 = new BlockSlabOakH30S170();
        AppalachiaBlocks.slab_oak_30_180 = new BlockSlabOakH30S180();
        AppalachiaBlocks.slab_oak_30_190 = new BlockSlabOakH30S190();
        AppalachiaBlocks.slab_oak_30_200 = new BlockSlabOakH30S200();
        AppalachiaBlocks.slab_oak_30_210 = new BlockSlabOakH30S210();
        AppalachiaBlocks.slab_oak_30_220 = new BlockSlabOakH30S220();
        AppalachiaBlocks.slab_oak_30_230 = new BlockSlabOakH30S230();
        AppalachiaBlocks.slab_oak_30_240 = new BlockSlabOakH30S240();
        AppalachiaBlocks.slab_oak_30_250 = new BlockSlabOakH30S250();
        AppalachiaBlocks.slab_oak_40_10 = new BlockSlabOakH40S10();
        AppalachiaBlocks.slab_oak_40_20 = new BlockSlabOakH40S20();
        AppalachiaBlocks.slab_oak_40_30 = new BlockSlabOakH40S30();
        AppalachiaBlocks.slab_oak_40_40 = new BlockSlabOakH40S40();
        AppalachiaBlocks.slab_oak_40_50 = new BlockSlabOakH40S50();
        AppalachiaBlocks.slab_oak_40_60 = new BlockSlabOakH40S60();
        AppalachiaBlocks.slab_oak_40_70 = new BlockSlabOakH40S70();
        AppalachiaBlocks.slab_oak_40_80 = new BlockSlabOakH40S80();
        AppalachiaBlocks.slab_oak_40_90 = new BlockSlabOakH40S90();
        AppalachiaBlocks.slab_oak_40_100 = new BlockSlabOakH40S100();
        AppalachiaBlocks.slab_oak_40_110 = new BlockSlabOakH40S110();
        AppalachiaBlocks.slab_oak_40_120 = new BlockSlabOakH40S120();
        AppalachiaBlocks.slab_oak_40_130 = new BlockSlabOakH40S130();
        AppalachiaBlocks.slab_oak_40_140 = new BlockSlabOakH40S140();
        AppalachiaBlocks.slab_oak_40_150 = new BlockSlabOakH40S150();
        AppalachiaBlocks.slab_oak_40_160 = new BlockSlabOakH40S160();
        AppalachiaBlocks.slab_oak_40_170 = new BlockSlabOakH40S170();
        AppalachiaBlocks.slab_oak_40_180 = new BlockSlabOakH40S180();
        AppalachiaBlocks.slab_oak_40_190 = new BlockSlabOakH40S190();
        AppalachiaBlocks.slab_oak_40_200 = new BlockSlabOakH40S200();
        AppalachiaBlocks.slab_oak_180_10 = new BlockSlabOakH180S10();
        AppalachiaBlocks.slab_oak_180_20 = new BlockSlabOakH180S20();
        AppalachiaBlocks.slab_oak_180_30 = new BlockSlabOakH180S30();
        AppalachiaBlocks.slab_oak_180_40 = new BlockSlabOakH180S40();
        AppalachiaBlocks.slab_oak_180_50 = new BlockSlabOakH180S50();
        AppalachiaBlocks.slab_oak_180_60 = new BlockSlabOakH180S60();
        AppalachiaBlocks.slab_oak_180_70 = new BlockSlabOakH180S70();
        AppalachiaBlocks.slab_oak_180_80 = new BlockSlabOakH180S80();
        AppalachiaBlocks.slab_oak_180_90 = new BlockSlabOakH180S90();
        AppalachiaBlocks.slab_oak_180_100 = new BlockSlabOakH180S100();
        addSlabs();

        //Stairs.
        AppalachiaBlocks.stairs_autumn_grey = new BlockStairsAutumnGrey();

        AppalachiaBlocks.stairs_oak_10_10 = new BlockStairsOakH10S10();
        AppalachiaBlocks.stairs_oak_10_20 = new BlockStairsOakH10S20();
        AppalachiaBlocks.stairs_oak_10_30 = new BlockStairsOakH10S30();
        AppalachiaBlocks.stairs_oak_10_40 = new BlockStairsOakH10S40();
        AppalachiaBlocks.stairs_oak_10_50 = new BlockStairsOakH10S50();
        AppalachiaBlocks.stairs_oak_10_60 = new BlockStairsOakH10S60();
        AppalachiaBlocks.stairs_oak_10_70 = new BlockStairsOakH10S70();
        AppalachiaBlocks.stairs_oak_10_80 = new BlockStairsOakH10S80();
        AppalachiaBlocks.stairs_oak_10_90 = new BlockStairsOakH10S90();
        AppalachiaBlocks.stairs_oak_10_100 = new BlockStairsOakH10S100();
        AppalachiaBlocks.stairs_oak_10_110 = new BlockStairsOakH10S110();
        AppalachiaBlocks.stairs_oak_10_120 = new BlockStairsOakH10S120();
        AppalachiaBlocks.stairs_oak_10_130 = new BlockStairsOakH10S130();
        AppalachiaBlocks.stairs_oak_10_140 = new BlockStairsOakH10S140();
        AppalachiaBlocks.stairs_oak_10_150 = new BlockStairsOakH10S150();
        AppalachiaBlocks.stairs_oak_10_160 = new BlockStairsOakH10S160();
        AppalachiaBlocks.stairs_oak_10_170 = new BlockStairsOakH10S170();
        AppalachiaBlocks.stairs_oak_10_180 = new BlockStairsOakH10S180();
        AppalachiaBlocks.stairs_oak_10_190 = new BlockStairsOakH10S190();
        AppalachiaBlocks.stairs_oak_10_200 = new BlockStairsOakH10S200();
        AppalachiaBlocks.stairs_oak_20_10 = new BlockStairsOakH20S10();
        AppalachiaBlocks.stairs_oak_20_20 = new BlockStairsOakH20S20();
        AppalachiaBlocks.stairs_oak_20_30 = new BlockStairsOakH20S30();
        AppalachiaBlocks.stairs_oak_20_40 = new BlockStairsOakH20S40();
        AppalachiaBlocks.stairs_oak_20_50 = new BlockStairsOakH20S50();
        AppalachiaBlocks.stairs_oak_20_60 = new BlockStairsOakH20S60();
        AppalachiaBlocks.stairs_oak_20_70 = new BlockStairsOakH20S70();
        AppalachiaBlocks.stairs_oak_20_80 = new BlockStairsOakH20S80();
        AppalachiaBlocks.stairs_oak_20_90 = new BlockStairsOakH20S90();
        AppalachiaBlocks.stairs_oak_20_100 = new BlockStairsOakH20S100();
        AppalachiaBlocks.stairs_oak_20_110 = new BlockStairsOakH20S110();
        AppalachiaBlocks.stairs_oak_20_120 = new BlockStairsOakH20S120();
        AppalachiaBlocks.stairs_oak_20_130 = new BlockStairsOakH20S130();
        AppalachiaBlocks.stairs_oak_20_140 = new BlockStairsOakH20S140();
        AppalachiaBlocks.stairs_oak_20_150 = new BlockStairsOakH20S150();
        AppalachiaBlocks.stairs_oak_20_160 = new BlockStairsOakH20S160();
        AppalachiaBlocks.stairs_oak_20_170 = new BlockStairsOakH20S170();
        AppalachiaBlocks.stairs_oak_20_180 = new BlockStairsOakH20S180();
        AppalachiaBlocks.stairs_oak_20_190 = new BlockStairsOakH20S190();
        AppalachiaBlocks.stairs_oak_20_200 = new BlockStairsOakH20S200();
        AppalachiaBlocks.stairs_oak_30_10 = new BlockStairsOakH30S10();
        AppalachiaBlocks.stairs_oak_30_20 = new BlockStairsOakH30S20();
        AppalachiaBlocks.stairs_oak_30_30 = new BlockStairsOakH30S30();
        AppalachiaBlocks.stairs_oak_30_40 = new BlockStairsOakH30S40();
        AppalachiaBlocks.stairs_oak_30_50 = new BlockStairsOakH30S50();
        AppalachiaBlocks.stairs_oak_30_60 = new BlockStairsOakH30S60();
        AppalachiaBlocks.stairs_oak_30_70 = new BlockStairsOakH30S70();
        AppalachiaBlocks.stairs_oak_30_80 = new BlockStairsOakH30S80();
        AppalachiaBlocks.stairs_oak_30_90 = new BlockStairsOakH30S90();
        AppalachiaBlocks.stairs_oak_30_100 = new BlockStairsOakH30S100();
        AppalachiaBlocks.stairs_oak_30_110 = new BlockStairsOakH30S110();
        AppalachiaBlocks.stairs_oak_30_120 = new BlockStairsOakH30S120();
        AppalachiaBlocks.stairs_oak_30_130 = new BlockStairsOakH30S130();
        AppalachiaBlocks.stairs_oak_30_140 = new BlockStairsOakH30S140();
        AppalachiaBlocks.stairs_oak_30_150 = new BlockStairsOakH30S150();
        AppalachiaBlocks.stairs_oak_30_160 = new BlockStairsOakH30S160();
        AppalachiaBlocks.stairs_oak_30_170 = new BlockStairsOakH30S170();
        AppalachiaBlocks.stairs_oak_30_180 = new BlockStairsOakH30S180();
        AppalachiaBlocks.stairs_oak_30_190 = new BlockStairsOakH30S190();
        AppalachiaBlocks.stairs_oak_30_200 = new BlockStairsOakH30S200();
        AppalachiaBlocks.stairs_oak_30_210 = new BlockStairsOakH30S210();
        AppalachiaBlocks.stairs_oak_30_220 = new BlockStairsOakH30S220();
        AppalachiaBlocks.stairs_oak_30_230 = new BlockStairsOakH30S230();
        AppalachiaBlocks.stairs_oak_30_240 = new BlockStairsOakH30S240();
        AppalachiaBlocks.stairs_oak_30_250 = new BlockStairsOakH30S250();
        AppalachiaBlocks.stairs_oak_40_10 = new BlockStairsOakH40S10();
        AppalachiaBlocks.stairs_oak_40_20 = new BlockStairsOakH40S20();
        AppalachiaBlocks.stairs_oak_40_30 = new BlockStairsOakH40S30();
        AppalachiaBlocks.stairs_oak_40_40 = new BlockStairsOakH40S40();
        AppalachiaBlocks.stairs_oak_40_50 = new BlockStairsOakH40S50();
        AppalachiaBlocks.stairs_oak_40_60 = new BlockStairsOakH40S60();
        AppalachiaBlocks.stairs_oak_40_70 = new BlockStairsOakH40S70();
        AppalachiaBlocks.stairs_oak_40_80 = new BlockStairsOakH40S80();
        AppalachiaBlocks.stairs_oak_40_90 = new BlockStairsOakH40S90();
        AppalachiaBlocks.stairs_oak_40_100 = new BlockStairsOakH40S100();
        AppalachiaBlocks.stairs_oak_40_110 = new BlockStairsOakH40S110();
        AppalachiaBlocks.stairs_oak_40_120 = new BlockStairsOakH40S120();
        AppalachiaBlocks.stairs_oak_40_130 = new BlockStairsOakH40S130();
        AppalachiaBlocks.stairs_oak_40_140 = new BlockStairsOakH40S140();
        AppalachiaBlocks.stairs_oak_40_150 = new BlockStairsOakH40S150();
        AppalachiaBlocks.stairs_oak_40_160 = new BlockStairsOakH40S160();
        AppalachiaBlocks.stairs_oak_40_170 = new BlockStairsOakH40S170();
        AppalachiaBlocks.stairs_oak_40_180 = new BlockStairsOakH40S180();
        AppalachiaBlocks.stairs_oak_40_190 = new BlockStairsOakH40S190();
        AppalachiaBlocks.stairs_oak_40_200 = new BlockStairsOakH40S200();
        AppalachiaBlocks.stairs_oak_180_10 = new BlockStairsOakH180S10();
        AppalachiaBlocks.stairs_oak_180_20 = new BlockStairsOakH180S20();
        AppalachiaBlocks.stairs_oak_180_30 = new BlockStairsOakH180S30();
        AppalachiaBlocks.stairs_oak_180_40 = new BlockStairsOakH180S40();
        AppalachiaBlocks.stairs_oak_180_50 = new BlockStairsOakH180S50();
        AppalachiaBlocks.stairs_oak_180_60 = new BlockStairsOakH180S60();
        AppalachiaBlocks.stairs_oak_180_70 = new BlockStairsOakH180S70();
        AppalachiaBlocks.stairs_oak_180_80 = new BlockStairsOakH180S80();
        AppalachiaBlocks.stairs_oak_180_90 = new BlockStairsOakH180S90();
        AppalachiaBlocks.stairs_oak_180_100 = new BlockStairsOakH180S100();
        addStairs();

        //Fences.
        AppalachiaBlocks.fence_autumn_grey = new BlockFenceAutumnGrey();

        AppalachiaBlocks.fence_oak_10_10 = new BlockFenceOakH10S10();
        AppalachiaBlocks.fence_oak_10_20 = new BlockFenceOakH10S20();
        AppalachiaBlocks.fence_oak_10_30 = new BlockFenceOakH10S30();
        AppalachiaBlocks.fence_oak_10_40 = new BlockFenceOakH10S40();
        AppalachiaBlocks.fence_oak_10_50 = new BlockFenceOakH10S50();
        AppalachiaBlocks.fence_oak_10_60 = new BlockFenceOakH10S60();
        AppalachiaBlocks.fence_oak_10_70 = new BlockFenceOakH10S70();
        AppalachiaBlocks.fence_oak_10_80 = new BlockFenceOakH10S80();
        AppalachiaBlocks.fence_oak_10_90 = new BlockFenceOakH10S90();
        AppalachiaBlocks.fence_oak_10_100 = new BlockFenceOakH10S100();
        AppalachiaBlocks.fence_oak_10_110 = new BlockFenceOakH10S110();
        AppalachiaBlocks.fence_oak_10_120 = new BlockFenceOakH10S120();
        AppalachiaBlocks.fence_oak_10_130 = new BlockFenceOakH10S130();
        AppalachiaBlocks.fence_oak_10_140 = new BlockFenceOakH10S140();
        AppalachiaBlocks.fence_oak_10_150 = new BlockFenceOakH10S150();
        AppalachiaBlocks.fence_oak_10_160 = new BlockFenceOakH10S160();
        AppalachiaBlocks.fence_oak_10_170 = new BlockFenceOakH10S170();
        AppalachiaBlocks.fence_oak_10_180 = new BlockFenceOakH10S180();
        AppalachiaBlocks.fence_oak_10_190 = new BlockFenceOakH10S190();
        AppalachiaBlocks.fence_oak_10_200 = new BlockFenceOakH10S200();
        AppalachiaBlocks.fence_oak_20_10 = new BlockFenceOakH20S10();
        AppalachiaBlocks.fence_oak_20_20 = new BlockFenceOakH20S20();
        AppalachiaBlocks.fence_oak_20_30 = new BlockFenceOakH20S30();
        AppalachiaBlocks.fence_oak_20_40 = new BlockFenceOakH20S40();
        AppalachiaBlocks.fence_oak_20_50 = new BlockFenceOakH20S50();
        AppalachiaBlocks.fence_oak_20_60 = new BlockFenceOakH20S60();
        AppalachiaBlocks.fence_oak_20_70 = new BlockFenceOakH20S70();
        AppalachiaBlocks.fence_oak_20_80 = new BlockFenceOakH20S80();
        AppalachiaBlocks.fence_oak_20_90 = new BlockFenceOakH20S90();
        AppalachiaBlocks.fence_oak_20_100 = new BlockFenceOakH20S100();
        AppalachiaBlocks.fence_oak_20_110 = new BlockFenceOakH20S110();
        AppalachiaBlocks.fence_oak_20_120 = new BlockFenceOakH20S120();
        AppalachiaBlocks.fence_oak_20_130 = new BlockFenceOakH20S130();
        AppalachiaBlocks.fence_oak_20_140 = new BlockFenceOakH20S140();
        AppalachiaBlocks.fence_oak_20_150 = new BlockFenceOakH20S150();
        AppalachiaBlocks.fence_oak_20_160 = new BlockFenceOakH20S160();
        AppalachiaBlocks.fence_oak_20_170 = new BlockFenceOakH20S170();
        AppalachiaBlocks.fence_oak_20_180 = new BlockFenceOakH20S180();
        AppalachiaBlocks.fence_oak_20_190 = new BlockFenceOakH20S190();
        AppalachiaBlocks.fence_oak_20_200 = new BlockFenceOakH20S200();
        AppalachiaBlocks.fence_oak_30_10 = new BlockFenceOakH30S10();
        AppalachiaBlocks.fence_oak_30_20 = new BlockFenceOakH30S20();
        AppalachiaBlocks.fence_oak_30_30 = new BlockFenceOakH30S30();
        AppalachiaBlocks.fence_oak_30_40 = new BlockFenceOakH30S40();
        AppalachiaBlocks.fence_oak_30_50 = new BlockFenceOakH30S50();
        AppalachiaBlocks.fence_oak_30_60 = new BlockFenceOakH30S60();
        AppalachiaBlocks.fence_oak_30_70 = new BlockFenceOakH30S70();
        AppalachiaBlocks.fence_oak_30_80 = new BlockFenceOakH30S80();
        AppalachiaBlocks.fence_oak_30_90 = new BlockFenceOakH30S90();
        AppalachiaBlocks.fence_oak_30_100 = new BlockFenceOakH30S100();
        AppalachiaBlocks.fence_oak_30_110 = new BlockFenceOakH30S110();
        AppalachiaBlocks.fence_oak_30_120 = new BlockFenceOakH30S120();
        AppalachiaBlocks.fence_oak_30_130 = new BlockFenceOakH30S130();
        AppalachiaBlocks.fence_oak_30_140 = new BlockFenceOakH30S140();
        AppalachiaBlocks.fence_oak_30_150 = new BlockFenceOakH30S150();
        AppalachiaBlocks.fence_oak_30_160 = new BlockFenceOakH30S160();
        AppalachiaBlocks.fence_oak_30_170 = new BlockFenceOakH30S170();
        AppalachiaBlocks.fence_oak_30_180 = new BlockFenceOakH30S180();
        AppalachiaBlocks.fence_oak_30_190 = new BlockFenceOakH30S190();
        AppalachiaBlocks.fence_oak_30_200 = new BlockFenceOakH30S200();
        AppalachiaBlocks.fence_oak_30_210 = new BlockFenceOakH30S210();
        AppalachiaBlocks.fence_oak_30_220 = new BlockFenceOakH30S220();
        AppalachiaBlocks.fence_oak_30_230 = new BlockFenceOakH30S230();
        AppalachiaBlocks.fence_oak_30_240 = new BlockFenceOakH30S240();
        AppalachiaBlocks.fence_oak_30_250 = new BlockFenceOakH30S250();
        AppalachiaBlocks.fence_oak_40_10 = new BlockFenceOakH40S10();
        AppalachiaBlocks.fence_oak_40_20 = new BlockFenceOakH40S20();
        AppalachiaBlocks.fence_oak_40_30 = new BlockFenceOakH40S30();
        AppalachiaBlocks.fence_oak_40_40 = new BlockFenceOakH40S40();
        AppalachiaBlocks.fence_oak_40_50 = new BlockFenceOakH40S50();
        AppalachiaBlocks.fence_oak_40_60 = new BlockFenceOakH40S60();
        AppalachiaBlocks.fence_oak_40_70 = new BlockFenceOakH40S70();
        AppalachiaBlocks.fence_oak_40_80 = new BlockFenceOakH40S80();
        AppalachiaBlocks.fence_oak_40_90 = new BlockFenceOakH40S90();
        AppalachiaBlocks.fence_oak_40_100 = new BlockFenceOakH40S100();
        AppalachiaBlocks.fence_oak_40_110 = new BlockFenceOakH40S110();
        AppalachiaBlocks.fence_oak_40_120 = new BlockFenceOakH40S120();
        AppalachiaBlocks.fence_oak_40_130 = new BlockFenceOakH40S130();
        AppalachiaBlocks.fence_oak_40_140 = new BlockFenceOakH40S140();
        AppalachiaBlocks.fence_oak_40_150 = new BlockFenceOakH40S150();
        AppalachiaBlocks.fence_oak_40_160 = new BlockFenceOakH40S160();
        AppalachiaBlocks.fence_oak_40_170 = new BlockFenceOakH40S170();
        AppalachiaBlocks.fence_oak_40_180 = new BlockFenceOakH40S180();
        AppalachiaBlocks.fence_oak_40_190 = new BlockFenceOakH40S190();
        AppalachiaBlocks.fence_oak_40_200 = new BlockFenceOakH40S200();
        AppalachiaBlocks.fence_oak_180_10 = new BlockFenceOakH180S10();
        AppalachiaBlocks.fence_oak_180_20 = new BlockFenceOakH180S20();
        AppalachiaBlocks.fence_oak_180_30 = new BlockFenceOakH180S30();
        AppalachiaBlocks.fence_oak_180_40 = new BlockFenceOakH180S40();
        AppalachiaBlocks.fence_oak_180_50 = new BlockFenceOakH180S50();
        AppalachiaBlocks.fence_oak_180_60 = new BlockFenceOakH180S60();
        AppalachiaBlocks.fence_oak_180_70 = new BlockFenceOakH180S70();
        AppalachiaBlocks.fence_oak_180_80 = new BlockFenceOakH180S80();
        AppalachiaBlocks.fence_oak_180_90 = new BlockFenceOakH180S90();
        AppalachiaBlocks.fence_oak_180_100 = new BlockFenceOakH180S100();
        addFences();

        //Fence gates.
        AppalachiaBlocks.fence_gate_autumn_grey = new BlockFenceGateAutumnGrey();

        AppalachiaBlocks.fence_gate_oak_10_10 = new BlockFenceGateOakH10S10();
        AppalachiaBlocks.fence_gate_oak_10_20 = new BlockFenceGateOakH10S20();
        AppalachiaBlocks.fence_gate_oak_10_30 = new BlockFenceGateOakH10S30();
        AppalachiaBlocks.fence_gate_oak_10_40 = new BlockFenceGateOakH10S40();
        AppalachiaBlocks.fence_gate_oak_10_50 = new BlockFenceGateOakH10S50();
        AppalachiaBlocks.fence_gate_oak_10_60 = new BlockFenceGateOakH10S60();
        AppalachiaBlocks.fence_gate_oak_10_70 = new BlockFenceGateOakH10S70();
        AppalachiaBlocks.fence_gate_oak_10_80 = new BlockFenceGateOakH10S80();
        AppalachiaBlocks.fence_gate_oak_10_90 = new BlockFenceGateOakH10S90();
        AppalachiaBlocks.fence_gate_oak_10_100 = new BlockFenceGateOakH10S100();
        AppalachiaBlocks.fence_gate_oak_10_110 = new BlockFenceGateOakH10S110();
        AppalachiaBlocks.fence_gate_oak_10_120 = new BlockFenceGateOakH10S120();
        AppalachiaBlocks.fence_gate_oak_10_130 = new BlockFenceGateOakH10S130();
        AppalachiaBlocks.fence_gate_oak_10_140 = new BlockFenceGateOakH10S140();
        AppalachiaBlocks.fence_gate_oak_10_150 = new BlockFenceGateOakH10S150();
        AppalachiaBlocks.fence_gate_oak_10_160 = new BlockFenceGateOakH10S160();
        AppalachiaBlocks.fence_gate_oak_10_170 = new BlockFenceGateOakH10S170();
        AppalachiaBlocks.fence_gate_oak_10_180 = new BlockFenceGateOakH10S180();
        AppalachiaBlocks.fence_gate_oak_10_190 = new BlockFenceGateOakH10S190();
        AppalachiaBlocks.fence_gate_oak_10_200 = new BlockFenceGateOakH10S200();
        AppalachiaBlocks.fence_gate_oak_20_10 = new BlockFenceGateOakH20S10();
        AppalachiaBlocks.fence_gate_oak_20_20 = new BlockFenceGateOakH20S20();
        AppalachiaBlocks.fence_gate_oak_20_30 = new BlockFenceGateOakH20S30();
        AppalachiaBlocks.fence_gate_oak_20_40 = new BlockFenceGateOakH20S40();
        AppalachiaBlocks.fence_gate_oak_20_50 = new BlockFenceGateOakH20S50();
        AppalachiaBlocks.fence_gate_oak_20_60 = new BlockFenceGateOakH20S60();
        AppalachiaBlocks.fence_gate_oak_20_70 = new BlockFenceGateOakH20S70();
        AppalachiaBlocks.fence_gate_oak_20_80 = new BlockFenceGateOakH20S80();
        AppalachiaBlocks.fence_gate_oak_20_90 = new BlockFenceGateOakH20S90();
        AppalachiaBlocks.fence_gate_oak_20_100 = new BlockFenceGateOakH20S100();
        AppalachiaBlocks.fence_gate_oak_20_110 = new BlockFenceGateOakH20S110();
        AppalachiaBlocks.fence_gate_oak_20_120 = new BlockFenceGateOakH20S120();
        AppalachiaBlocks.fence_gate_oak_20_130 = new BlockFenceGateOakH20S130();
        AppalachiaBlocks.fence_gate_oak_20_140 = new BlockFenceGateOakH20S140();
        AppalachiaBlocks.fence_gate_oak_20_150 = new BlockFenceGateOakH20S150();
        AppalachiaBlocks.fence_gate_oak_20_160 = new BlockFenceGateOakH20S160();
        AppalachiaBlocks.fence_gate_oak_20_170 = new BlockFenceGateOakH20S170();
        AppalachiaBlocks.fence_gate_oak_20_180 = new BlockFenceGateOakH20S180();
        AppalachiaBlocks.fence_gate_oak_20_190 = new BlockFenceGateOakH20S190();
        AppalachiaBlocks.fence_gate_oak_20_200 = new BlockFenceGateOakH20S200();
        AppalachiaBlocks.fence_gate_oak_30_10 = new BlockFenceGateOakH30S10();
        AppalachiaBlocks.fence_gate_oak_30_20 = new BlockFenceGateOakH30S20();
        AppalachiaBlocks.fence_gate_oak_30_30 = new BlockFenceGateOakH30S30();
        AppalachiaBlocks.fence_gate_oak_30_40 = new BlockFenceGateOakH30S40();
        AppalachiaBlocks.fence_gate_oak_30_50 = new BlockFenceGateOakH30S50();
        AppalachiaBlocks.fence_gate_oak_30_60 = new BlockFenceGateOakH30S60();
        AppalachiaBlocks.fence_gate_oak_30_70 = new BlockFenceGateOakH30S70();
        AppalachiaBlocks.fence_gate_oak_30_80 = new BlockFenceGateOakH30S80();
        AppalachiaBlocks.fence_gate_oak_30_90 = new BlockFenceGateOakH30S90();
        AppalachiaBlocks.fence_gate_oak_30_100 = new BlockFenceGateOakH30S100();
        AppalachiaBlocks.fence_gate_oak_30_110 = new BlockFenceGateOakH30S110();
        AppalachiaBlocks.fence_gate_oak_30_120 = new BlockFenceGateOakH30S120();
        AppalachiaBlocks.fence_gate_oak_30_130 = new BlockFenceGateOakH30S130();
        AppalachiaBlocks.fence_gate_oak_30_140 = new BlockFenceGateOakH30S140();
        AppalachiaBlocks.fence_gate_oak_30_150 = new BlockFenceGateOakH30S150();
        AppalachiaBlocks.fence_gate_oak_30_160 = new BlockFenceGateOakH30S160();
        AppalachiaBlocks.fence_gate_oak_30_170 = new BlockFenceGateOakH30S170();
        AppalachiaBlocks.fence_gate_oak_30_180 = new BlockFenceGateOakH30S180();
        AppalachiaBlocks.fence_gate_oak_30_190 = new BlockFenceGateOakH30S190();
        AppalachiaBlocks.fence_gate_oak_30_200 = new BlockFenceGateOakH30S200();
        AppalachiaBlocks.fence_gate_oak_30_210 = new BlockFenceGateOakH30S210();
        AppalachiaBlocks.fence_gate_oak_30_220 = new BlockFenceGateOakH30S220();
        AppalachiaBlocks.fence_gate_oak_30_230 = new BlockFenceGateOakH30S230();
        AppalachiaBlocks.fence_gate_oak_30_240 = new BlockFenceGateOakH30S240();
        AppalachiaBlocks.fence_gate_oak_30_250 = new BlockFenceGateOakH30S250();
        AppalachiaBlocks.fence_gate_oak_40_10 = new BlockFenceGateOakH40S10();
        AppalachiaBlocks.fence_gate_oak_40_20 = new BlockFenceGateOakH40S20();
        AppalachiaBlocks.fence_gate_oak_40_30 = new BlockFenceGateOakH40S30();
        AppalachiaBlocks.fence_gate_oak_40_40 = new BlockFenceGateOakH40S40();
        AppalachiaBlocks.fence_gate_oak_40_50 = new BlockFenceGateOakH40S50();
        AppalachiaBlocks.fence_gate_oak_40_60 = new BlockFenceGateOakH40S60();
        AppalachiaBlocks.fence_gate_oak_40_70 = new BlockFenceGateOakH40S70();
        AppalachiaBlocks.fence_gate_oak_40_80 = new BlockFenceGateOakH40S80();
        AppalachiaBlocks.fence_gate_oak_40_90 = new BlockFenceGateOakH40S90();
        AppalachiaBlocks.fence_gate_oak_40_100 = new BlockFenceGateOakH40S100();
        AppalachiaBlocks.fence_gate_oak_40_110 = new BlockFenceGateOakH40S110();
        AppalachiaBlocks.fence_gate_oak_40_120 = new BlockFenceGateOakH40S120();
        AppalachiaBlocks.fence_gate_oak_40_130 = new BlockFenceGateOakH40S130();
        AppalachiaBlocks.fence_gate_oak_40_140 = new BlockFenceGateOakH40S140();
        AppalachiaBlocks.fence_gate_oak_40_150 = new BlockFenceGateOakH40S150();
        AppalachiaBlocks.fence_gate_oak_40_160 = new BlockFenceGateOakH40S160();
        AppalachiaBlocks.fence_gate_oak_40_170 = new BlockFenceGateOakH40S170();
        AppalachiaBlocks.fence_gate_oak_40_180 = new BlockFenceGateOakH40S180();
        AppalachiaBlocks.fence_gate_oak_40_190 = new BlockFenceGateOakH40S190();
        AppalachiaBlocks.fence_gate_oak_40_200 = new BlockFenceGateOakH40S200();
        AppalachiaBlocks.fence_gate_oak_180_10 = new BlockFenceGateOakH180S10();
        AppalachiaBlocks.fence_gate_oak_180_20 = new BlockFenceGateOakH180S20();
        AppalachiaBlocks.fence_gate_oak_180_30 = new BlockFenceGateOakH180S30();
        AppalachiaBlocks.fence_gate_oak_180_40 = new BlockFenceGateOakH180S40();
        AppalachiaBlocks.fence_gate_oak_180_50 = new BlockFenceGateOakH180S50();
        AppalachiaBlocks.fence_gate_oak_180_60 = new BlockFenceGateOakH180S60();
        AppalachiaBlocks.fence_gate_oak_180_70 = new BlockFenceGateOakH180S70();
        AppalachiaBlocks.fence_gate_oak_180_80 = new BlockFenceGateOakH180S80();
        AppalachiaBlocks.fence_gate_oak_180_90 = new BlockFenceGateOakH180S90();
        AppalachiaBlocks.fence_gate_oak_180_100 = new BlockFenceGateOakH180S100();
        addFenceGates();

        //Leaves.
        AppalachiaBlocks.leaves_autumn_orange = new BlockLeavesAutumnOrange();
        AppalachiaBlocks.leaves_autumn_red = new BlockLeavesAutumnRed();
        AppalachiaBlocks.leaves_autumn_yellow = new BlockLeavesAutumnYellow();
        addLeaves();

        //Fallen leaves.
        AppalachiaBlocks.leaves_oak_fallen = new BlockLeavesOakFallen();
        AppalachiaBlocks.leaves_autumn_orange_fallen = new BlockLeavesAutumnOrangeFallen();
        AppalachiaBlocks.leaves_autumn_red_fallen = new BlockLeavesAutumnRedFallen();
        AppalachiaBlocks.leaves_autumn_yellow_fallen = new BlockLeavesAutumnYellowFallen();
        addFallenLeaves();

        //Saplings.
        AppalachiaBlocks.sapling_quercus_robur = new BlockSaplingQuercusRobur();
        addSaplings();

        addAppalachiaBlocks();

        registerBlocksAndItemBlocks();
        registerOres();
        setFireInfo();
    }

    /*
     * ALPHABETICAL ORDER MATTERS WHEN ADDING INDIVIDUAL BLOCKS TO THE BLOCK LISTS!!!
     * For example...
     * addShapedRecipes() loops through the planks and uses the same index to get() the associated slabs, stairs, fences, and fence gates.
     * addShapelessRecipes() loops through the logs and uses the same index to get() the associated planks.
     */

    private static void addLogs() {

        appalachiaLogs.add(AppalachiaBlocks.log_autumn_grey);

        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_10);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_20);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_30);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_40);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_50);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_60);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_70);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_80);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_90);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_100);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_110);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_120);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_130);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_140);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_150);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_160);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_170);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_180);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_190);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_10_200);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_10);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_20);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_30);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_40);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_50);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_60);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_70);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_80);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_90);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_100);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_110);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_120);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_130);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_140);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_150);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_160);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_170);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_180);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_190);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_20_200);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_10);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_20);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_30);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_40);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_50);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_60);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_70);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_80);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_90);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_100);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_110);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_120);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_130);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_140);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_150);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_160);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_170);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_180);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_190);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_200);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_210);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_220);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_230);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_240);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_30_250);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_10);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_20);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_30);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_40);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_50);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_60);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_70);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_80);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_90);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_100);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_110);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_120);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_130);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_140);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_150);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_160);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_170);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_180);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_190);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_40_200);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_10);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_20);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_30);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_40);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_50);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_60);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_70);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_80);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_90);
        appalachiaLogs.add(AppalachiaBlocks.log_oak_180_100);
    }

    private static void addPlanks() {

        appalachiaPlanks.add(AppalachiaBlocks.planks_autumn_grey);

        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_10);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_20);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_30);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_40);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_50);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_60);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_70);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_80);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_90);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_100);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_110);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_120);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_130);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_140);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_150);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_160);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_170);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_180);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_190);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_10_200);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_10);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_20);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_30);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_40);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_50);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_60);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_70);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_80);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_90);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_100);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_110);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_120);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_130);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_140);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_150);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_160);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_170);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_180);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_190);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_20_200);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_10);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_20);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_30);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_40);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_50);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_60);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_70);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_80);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_90);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_100);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_110);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_120);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_130);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_140);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_150);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_160);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_170);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_180);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_190);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_200);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_210);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_220);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_230);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_240);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_30_250);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_10);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_20);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_30);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_40);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_50);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_60);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_70);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_80);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_90);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_100);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_110);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_120);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_130);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_140);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_150);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_160);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_170);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_180);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_190);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_40_200);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_10);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_20);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_30);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_40);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_50);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_60);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_70);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_80);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_90);
        appalachiaPlanks.add(AppalachiaBlocks.planks_oak_180_100);
    }

    private static void addSlabs() {

        appalachiaSlabs.add(AppalachiaBlocks.slab_autumn_grey);

        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_10);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_20);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_30);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_40);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_50);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_60);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_70);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_80);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_90);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_100);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_110);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_120);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_130);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_140);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_150);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_160);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_170);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_180);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_190);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_10_200);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_10);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_20);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_30);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_40);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_50);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_60);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_70);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_80);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_90);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_100);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_110);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_120);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_130);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_140);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_150);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_160);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_170);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_180);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_190);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_20_200);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_10);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_20);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_30);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_40);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_50);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_60);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_70);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_80);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_90);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_100);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_110);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_120);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_130);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_140);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_150);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_160);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_170);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_180);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_190);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_200);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_210);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_220);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_230);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_240);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_30_250);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_10);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_20);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_30);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_40);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_50);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_60);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_70);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_80);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_90);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_100);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_110);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_120);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_130);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_140);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_150);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_160);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_170);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_180);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_190);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_40_200);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_10);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_20);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_30);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_40);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_50);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_60);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_70);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_80);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_90);
        appalachiaSlabs.add(AppalachiaBlocks.slab_oak_180_100);
    }

    private static void addStairs() {

        appalachiaStairs.add(AppalachiaBlocks.stairs_autumn_grey);

        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_10);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_20);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_30);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_40);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_50);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_60);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_70);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_80);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_90);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_100);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_110);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_120);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_130);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_140);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_150);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_160);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_170);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_180);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_190);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_10_200);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_10);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_20);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_30);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_40);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_50);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_60);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_70);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_80);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_90);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_100);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_110);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_120);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_130);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_140);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_150);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_160);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_170);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_180);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_190);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_20_200);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_10);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_20);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_30);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_40);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_50);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_60);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_70);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_80);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_90);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_100);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_110);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_120);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_130);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_140);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_150);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_160);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_170);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_180);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_190);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_200);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_210);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_220);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_230);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_240);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_30_250);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_10);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_20);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_30);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_40);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_50);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_60);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_70);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_80);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_90);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_100);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_110);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_120);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_130);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_140);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_150);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_160);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_170);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_180);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_190);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_40_200);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_10);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_20);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_30);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_40);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_50);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_60);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_70);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_80);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_90);
        appalachiaStairs.add(AppalachiaBlocks.stairs_oak_180_100);
    }

    private static void addFences() {

        appalachiaFences.add(AppalachiaBlocks.fence_autumn_grey);

        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_10);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_20);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_30);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_40);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_50);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_60);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_70);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_80);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_90);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_100);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_110);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_120);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_130);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_140);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_150);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_160);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_170);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_180);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_190);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_10_200);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_10);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_20);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_30);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_40);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_50);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_60);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_70);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_80);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_90);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_100);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_110);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_120);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_130);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_140);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_150);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_160);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_170);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_180);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_190);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_20_200);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_10);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_20);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_30);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_40);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_50);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_60);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_70);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_80);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_90);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_100);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_110);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_120);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_130);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_140);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_150);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_160);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_170);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_180);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_190);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_200);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_210);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_220);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_230);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_240);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_30_250);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_10);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_20);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_30);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_40);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_50);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_60);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_70);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_80);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_90);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_100);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_110);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_120);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_130);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_140);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_150);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_160);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_170);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_180);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_190);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_40_200);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_10);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_20);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_30);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_40);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_50);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_60);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_70);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_80);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_90);
        appalachiaFences.add(AppalachiaBlocks.fence_oak_180_100);
    }

    private static void addFenceGates() {

        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_autumn_grey);

        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_10);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_20);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_30);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_40);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_50);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_60);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_70);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_80);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_90);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_100);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_110);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_120);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_130);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_140);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_150);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_160);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_170);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_180);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_190);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_10_200);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_10);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_20);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_30);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_40);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_50);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_60);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_70);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_80);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_90);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_100);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_110);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_120);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_130);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_140);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_150);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_160);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_170);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_180);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_190);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_20_200);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_10);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_20);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_30);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_40);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_50);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_60);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_70);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_80);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_90);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_100);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_110);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_120);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_130);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_140);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_150);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_160);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_170);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_180);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_190);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_200);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_210);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_220);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_230);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_240);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_30_250);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_10);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_20);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_30);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_40);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_50);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_60);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_70);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_80);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_90);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_100);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_110);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_120);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_130);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_140);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_150);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_160);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_170);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_180);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_190);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_40_200);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_10);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_20);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_30);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_40);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_50);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_60);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_70);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_80);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_90);
        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_oak_180_100);
    }

    private static void addLeaves() {

        appalachiaLeaves.add(AppalachiaBlocks.leaves_autumn_orange);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_autumn_red);
        appalachiaLeaves.add(AppalachiaBlocks.leaves_autumn_yellow);
    }

    private static void addFallenLeaves() {

        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_oak_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_autumn_orange_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_autumn_red_fallen);
        appalachiaLeavesFallen.add(AppalachiaBlocks.leaves_autumn_yellow_fallen);
    }

    private static void addSaplings() {

        appalachiaSaplings.add(AppalachiaBlocks.sapling_quercus_robur);
    }

    private static void addAppalachiaBlocks() {

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

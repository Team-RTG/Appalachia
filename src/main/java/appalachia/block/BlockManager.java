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
import appalachia.block.fencegates.AppalachiaBlockFenceGate;
import appalachia.block.fencegates.BlockFenceGateAutumnGrey;
import appalachia.block.fences.AppalachiaBlockFence;
import appalachia.block.fences.BlockFenceAutumnGrey;
import appalachia.block.leaves.AppalachiaBlockLeaves;
import appalachia.block.leaves.BlockLeavesAutumnOrange;
import appalachia.block.leaves.BlockLeavesAutumnRed;
import appalachia.block.leaves.BlockLeavesAutumnYellow;
import appalachia.block.leaves.fallen.*;
import appalachia.block.logs.AppalachiaBlockLog;
import appalachia.block.logs.BlockLogAutumnGrey;
import appalachia.block.planks.AppalachiaBlockPlanks;
import appalachia.block.planks.BlockPlanksAutumnGrey;
import appalachia.block.saplings.AppalachiaBlockSapling;
import appalachia.block.saplings.BlockSaplingQuercusRobur;
import appalachia.block.slabs.AppalachiaBlockSlab;
import appalachia.block.slabs.BlockSlabAutumnGrey;
import appalachia.block.stairs.AppalachiaBlockStairs;
import appalachia.block.stairs.BlockStairsAutumnGrey;
import appalachia.item.ItemManager;
import appalachia.item.leaves.fallen.AppalachiaItemLeavesFallen;
import appalachia.item.slabs.AppalachiaItemSlab;
import static appalachia.api.AppalachiaBlocks.slab_autumn_grey;

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
        addLogs();

        //Planks.
        AppalachiaBlocks.planks_autumn_grey = new BlockPlanksAutumnGrey();
        addPlanks();

        //Slabs.
        slab_autumn_grey = new BlockSlabAutumnGrey();
        addSlabs();

        //Stairs.
        AppalachiaBlocks.stairs_autumn_grey = new BlockStairsAutumnGrey();
        addStairs();

        //Fences.
        AppalachiaBlocks.fence_autumn_grey = new BlockFenceAutumnGrey();
        addFences();

        //Fence gates.
        AppalachiaBlocks.fence_gate_autumn_grey = new BlockFenceGateAutumnGrey();
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
    }

    private static void addPlanks() {

        appalachiaPlanks.add(AppalachiaBlocks.planks_autumn_grey);
    }

    private static void addSlabs() {

        appalachiaSlabs.add(slab_autumn_grey);
    }

    private static void addStairs() {

        appalachiaStairs.add(AppalachiaBlocks.stairs_autumn_grey);
    }

    private static void addFences() {

        appalachiaFences.add(AppalachiaBlocks.fence_autumn_grey);
    }

    private static void addFenceGates() {

        appalachiaFenceGates.add(AppalachiaBlocks.fence_gate_autumn_grey);
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

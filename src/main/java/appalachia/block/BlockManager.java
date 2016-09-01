package appalachia.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.fences.BlockFenceAutumnGrey;
import appalachia.block.fencegates.BlockFenceGateAutumnGrey;
import appalachia.block.leaves.BlockLeavesAutumnOrange;
import appalachia.block.leaves.BlockLeavesAutumnRed;
import appalachia.block.leaves.BlockLeavesAutumnYellow;
import appalachia.block.logs.BlockLogAutumnGrey;
import appalachia.block.planks.BlockSugiWood;
import appalachia.block.saplings.BlockSugiSapling;
import appalachia.block.slabs.BlockSugiWoodSlab;
import appalachia.block.stairs.BlockSugiStairs;
import appalachia.item.ItemManager;
import appalachia.item.ItemSugiWoodSlab;
import static appalachia.api.AppalachiaBlocks.*;

public class BlockManager {

    public static void registerBlocks()
    {
        AppalachiaBlocks.log_autumn_grey = new BlockLogAutumnGrey();
        AppalachiaBlocks.leaves_autumn_red = new BlockLeavesAutumnRed();
        AppalachiaBlocks.leaves_autumn_orange = new BlockLeavesAutumnOrange();
        AppalachiaBlocks.leaves_autumn_yellow = new BlockLeavesAutumnYellow();
        AppalachiaBlocks.sugi_sapling = new BlockSugiSapling();
        AppalachiaBlocks.sugi_planks = new BlockSugiWood();
        AppalachiaBlocks.sugi_slab = new BlockSugiWoodSlab();
        AppalachiaBlocks.sugi_stairs = new BlockSugiStairs();
        AppalachiaBlocks.fence_autumn_grey = new BlockFenceAutumnGrey();
        AppalachiaBlocks.fence_gate_autumn_grey = new BlockFenceGateAutumnGrey();

        log_autumn_grey.setRegistryName("log_autumn_grey");
        leaves_autumn_red.setRegistryName("leaves_autumn_red");
        leaves_autumn_orange.setRegistryName("leaves_autumn_orange");
        leaves_autumn_yellow.setRegistryName("leaves_autumn_yellow");
        sugi_sapling.setRegistryName("sugi_sapling");
        sugi_planks.setRegistryName("sugi_planks");
        sugi_slab.setRegistryName("sugi_slab");
        sugi_stairs.setRegistryName("sugi_stairs");
        fence_autumn_grey.setRegistryName("fence_autumn_grey");
        fence_gate_autumn_grey.setRegistryName("fence_gate_autumn_grey");

        GameRegistry.register(log_autumn_grey);
        GameRegistry.register(new ItemBlock(log_autumn_grey), log_autumn_grey.getRegistryName());

        GameRegistry.register(leaves_autumn_red);
        GameRegistry.register(new ItemBlock(leaves_autumn_red), leaves_autumn_red.getRegistryName());

        GameRegistry.register(leaves_autumn_orange);
        GameRegistry.register(new ItemBlock(leaves_autumn_orange), leaves_autumn_orange.getRegistryName());

        GameRegistry.register(leaves_autumn_yellow);
        GameRegistry.register(new ItemBlock(leaves_autumn_yellow), leaves_autumn_yellow.getRegistryName());

        GameRegistry.register(sugi_sapling);
        GameRegistry.register(new ItemBlock(sugi_sapling), sugi_sapling.getRegistryName());

        GameRegistry.register(sugi_planks);
        GameRegistry.register(new ItemBlock(sugi_planks), sugi_planks.getRegistryName());

        GameRegistry.register(sugi_slab);
        GameRegistry.register(new ItemSugiWoodSlab(sugi_slab), sugi_slab.getRegistryName());

        GameRegistry.register(sugi_stairs);
        GameRegistry.register(new ItemBlock(sugi_stairs), sugi_stairs.getRegistryName());

        GameRegistry.register(fence_autumn_grey);
        GameRegistry.register(new ItemBlock(fence_autumn_grey), fence_autumn_grey.getRegistryName());

        GameRegistry.register(fence_gate_autumn_grey);
        GameRegistry.register(new ItemBlock(fence_gate_autumn_grey), fence_gate_autumn_grey.getRegistryName());

        OreDictionary.registerOre("logWood", new ItemStack(log_autumn_grey, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeLeaves", new ItemStack(leaves_autumn_red, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeLeaves", new ItemStack(leaves_autumn_orange, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeLeaves", new ItemStack(leaves_autumn_yellow, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeSapling", new ItemStack(sugi_sapling, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("plankWood", new ItemStack(sugi_planks, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("slabWood", new ItemStack(sugi_slab, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stairWood", new ItemStack(sugi_stairs, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceWood", new ItemStack(fence_autumn_grey, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceGateWood", new ItemStack(fence_gate_autumn_grey, 1, OreDictionary.WILDCARD_VALUE));

        Blocks.FIRE.setFireInfo(log_autumn_grey, 5, 5);
        Blocks.FIRE.setFireInfo(leaves_autumn_red, 30, 60);
        Blocks.FIRE.setFireInfo(leaves_autumn_orange, 30, 60);
        Blocks.FIRE.setFireInfo(leaves_autumn_yellow, 30, 60);
        Blocks.FIRE.setFireInfo(sugi_sapling, 20, 60);
        Blocks.FIRE.setFireInfo(sugi_planks, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_slab, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_stairs, 5, 20);
        Blocks.FIRE.setFireInfo(fence_autumn_grey, 5, 20);
        Blocks.FIRE.setFireInfo(fence_gate_autumn_grey, 5, 20);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels()
    {
        registerModel(log_autumn_grey);
        registerModel(leaves_autumn_red);
        registerModel(leaves_autumn_orange);
        registerModel(leaves_autumn_yellow);
        registerModel(sugi_sapling);
        registerModel(sugi_planks);
        registerModel(sugi_slab);
        registerModel(sugi_stairs);
        registerModel(fence_autumn_grey);
        registerModel(fence_gate_autumn_grey);

        ModelLoader.setCustomStateMapper(log_autumn_grey, new StateMap.Builder().ignore(BlockLogAutumnGrey.VARIANT).build());
        ModelLoader.setCustomStateMapper(leaves_autumn_red, new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        ModelLoader.setCustomStateMapper(leaves_autumn_orange, new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        ModelLoader.setCustomStateMapper(leaves_autumn_yellow, new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        ModelLoader.setCustomStateMapper(sugi_sapling, new StateMap.Builder().ignore(BlockSapling.TYPE, BlockSapling.STAGE).build());
        ModelLoader.setCustomStateMapper(sugi_planks, new StateMap.Builder().ignore(BlockSugiWood.DOUBLE).build());
        ModelLoader.setCustomStateMapper(fence_gate_autumn_grey, new StateMap.Builder().ignore(BlockFenceGate.POWERED).build());
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Block block, String modelName)
    {
        ItemManager.registerModel(Item.getItemFromBlock(block), modelName);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Block block)
    {
        ItemManager.registerModel(Item.getItemFromBlock(block));
    }

    @SideOnly(Side.CLIENT)
    public static void registerModelWithMeta(Block block, String... modelName)
    {
        ItemManager.registerModelWithMeta(Item.getItemFromBlock(block), modelName);
    }
}

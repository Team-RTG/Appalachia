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
import appalachia.item.ItemManager;
import appalachia.item.ItemSugiWoodSlab;
import static appalachia.api.AppalachiaBlocks.*;

public class BlockManager {

    public static void registerBlocks()
    {
        AppalachiaBlocks.sugi_log = new BlockSugiLog();
        AppalachiaBlocks.leaves_autumn_red = new BlockLeavesAutumnRed();
        AppalachiaBlocks.sugi_sapling = new BlockSugiSapling();
        AppalachiaBlocks.sugi_planks = new BlockSugiWood();
        AppalachiaBlocks.sugi_slab = new BlockSugiWoodSlab();
        AppalachiaBlocks.sugi_stairs = new BlockSugiStairs();
        AppalachiaBlocks.sugi_fence = new BlockSugiFence();
        AppalachiaBlocks.sugi_fence_gate = new BlockSugiFenceGate();

        sugi_log.setRegistryName("sugi_log");
        leaves_autumn_red.setRegistryName("leaves_autumn_red");
        sugi_sapling.setRegistryName("sugi_sapling");
        sugi_planks.setRegistryName("sugi_planks");
        sugi_slab.setRegistryName("sugi_slab");
        sugi_stairs.setRegistryName("sugi_stairs");
        sugi_fence.setRegistryName("sugi_fence");
        sugi_fence_gate.setRegistryName("sugi_fence_gate");

        GameRegistry.register(sugi_log);
        GameRegistry.register(new ItemBlock(sugi_log), sugi_log.getRegistryName());

        GameRegistry.register(leaves_autumn_red);
        GameRegistry.register(new ItemBlock(leaves_autumn_red), leaves_autumn_red.getRegistryName());

        GameRegistry.register(sugi_sapling);
        GameRegistry.register(new ItemBlock(sugi_sapling), sugi_sapling.getRegistryName());

        GameRegistry.register(sugi_planks);
        GameRegistry.register(new ItemBlock(sugi_planks), sugi_planks.getRegistryName());

        GameRegistry.register(sugi_slab);
        GameRegistry.register(new ItemSugiWoodSlab(sugi_slab), sugi_slab.getRegistryName());

        GameRegistry.register(sugi_stairs);
        GameRegistry.register(new ItemBlock(sugi_stairs), sugi_stairs.getRegistryName());

        GameRegistry.register(sugi_fence);
        GameRegistry.register(new ItemBlock(sugi_fence), sugi_fence.getRegistryName());

        GameRegistry.register(sugi_fence_gate);
        GameRegistry.register(new ItemBlock(sugi_fence_gate), sugi_fence_gate.getRegistryName());

        OreDictionary.registerOre("logWood", new ItemStack(sugi_log, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeLeaves", new ItemStack(leaves_autumn_red, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("treeSapling", new ItemStack(sugi_sapling, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("plankWood", new ItemStack(sugi_planks, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("slabWood", new ItemStack(sugi_slab, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stairWood", new ItemStack(sugi_stairs, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceWood", new ItemStack(sugi_fence, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceGateWood", new ItemStack(sugi_fence_gate, 1, OreDictionary.WILDCARD_VALUE));

        Blocks.FIRE.setFireInfo(sugi_log, 5, 5);
        Blocks.FIRE.setFireInfo(leaves_autumn_red, 30, 60);
        Blocks.FIRE.setFireInfo(sugi_sapling, 20, 60);
        Blocks.FIRE.setFireInfo(sugi_planks, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_slab, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_stairs, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_fence, 5, 20);
        Blocks.FIRE.setFireInfo(sugi_fence_gate, 5, 20);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels()
    {
        registerModel(sugi_log);
        registerModel(leaves_autumn_red);
        registerModel(sugi_sapling);
        registerModel(sugi_planks);
        registerModel(sugi_slab);
        registerModel(sugi_stairs);
        registerModel(sugi_fence);
        registerModel(sugi_fence_gate);

        ModelLoader.setCustomStateMapper(sugi_log, new StateMap.Builder().ignore(BlockSugiLog.VARIANT).build());
        ModelLoader.setCustomStateMapper(leaves_autumn_red, new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        ModelLoader.setCustomStateMapper(sugi_sapling, new StateMap.Builder().ignore(BlockSapling.TYPE, BlockSapling.STAGE).build());
        ModelLoader.setCustomStateMapper(sugi_planks, new StateMap.Builder().ignore(BlockSugiWood.DOUBLE).build());
        ModelLoader.setCustomStateMapper(sugi_fence_gate, new StateMap.Builder().ignore(BlockFenceGate.POWERED).build());
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

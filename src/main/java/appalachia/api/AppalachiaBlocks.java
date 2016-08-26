package appalachia.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
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

import appalachia.block.BlockSugiLog;
import appalachia.block.BlockSugiWood;
import appalachia.item.ItemSugiWoodSlab;

public class AppalachiaBlocks {

	public static Block autumnForest_Log;
	public static Block autumnForest_Leaves;
    public static Block autumnForest_Planks;
    public static Block autumnForest_Sapling;

    public static Block sugi_log;
    public static Block sugi_leaves;
    public static Block sugi_sapling;
    public static Block sugi_planks;
    public static Block sugi_slab;
    public static Block sugi_stairs;
    public static Block sugi_fence;
    public static Block sugi_fence_gate;

    public static void registerBlocks()
    {
        sugi_log.setRegistryName("sugi_log");
        sugi_leaves.setRegistryName("sugi_leaves");
        sugi_sapling.setRegistryName("sugi_sapling");
        sugi_planks.setRegistryName("sugi_planks");
        sugi_slab.setRegistryName("sugi_slab");
        sugi_stairs.setRegistryName("sugi_stairs");
        sugi_fence.setRegistryName("sugi_fence");
        sugi_fence_gate.setRegistryName("sugi_fence_gate");

        GameRegistry.register(sugi_log);
        GameRegistry.register(new ItemBlock(sugi_log), sugi_log.getRegistryName());

        GameRegistry.register(sugi_leaves);
        GameRegistry.register(new ItemBlock(sugi_leaves), sugi_leaves.getRegistryName());

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
        OreDictionary.registerOre("woodSugi", sugi_log);
        OreDictionary.registerOre("treeLeaves", new ItemStack(sugi_leaves, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("leavesSugi", sugi_leaves);
        OreDictionary.registerOre("treeSapling", new ItemStack(sugi_sapling, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("saplingSugi", sugi_sapling);
        OreDictionary.registerOre("plankWood", new ItemStack(sugi_planks, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("planksSugi", sugi_planks);
        OreDictionary.registerOre("slabWood", new ItemStack(sugi_slab, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("woodSlabSugi", sugi_slab);
        OreDictionary.registerOre("stairWood", new ItemStack(sugi_stairs, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("stairsWoodSugi", sugi_stairs);
        OreDictionary.registerOre("fenceWood", new ItemStack(sugi_fence, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceSugi", sugi_fence);
        OreDictionary.registerOre("fenceGateWood", new ItemStack(sugi_fence_gate, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("fenceGateSugi", sugi_fence_gate);

        Blocks.FIRE.setFireInfo(sugi_log, 5, 5);
        Blocks.FIRE.setFireInfo(sugi_leaves, 30, 60);
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
        registerModel(sugi_leaves);
        registerModel(sugi_sapling);
        registerModel(sugi_planks);
        registerModel(sugi_slab);
        registerModel(sugi_stairs);
        registerModel(sugi_fence);
        registerModel(sugi_fence_gate);

        ModelLoader.setCustomStateMapper(sugi_log, new StateMap.Builder().ignore(BlockSugiLog.VARIANT).build());
        ModelLoader.setCustomStateMapper(sugi_leaves, new StateMap.Builder().ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
        ModelLoader.setCustomStateMapper(sugi_sapling, new StateMap.Builder().ignore(BlockSapling.TYPE, BlockSapling.STAGE).build());
        ModelLoader.setCustomStateMapper(sugi_planks, new StateMap.Builder().ignore(BlockSugiWood.DOUBLE).build());
        ModelLoader.setCustomStateMapper(sugi_fence_gate, new StateMap.Builder().ignore(BlockFenceGate.POWERED).build());
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Block block, String modelName)
    {
        AppalachiaItems.registerModel(Item.getItemFromBlock(block), modelName);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Block block)
    {
        AppalachiaItems.registerModel(Item.getItemFromBlock(block));
    }

    @SideOnly(Side.CLIENT)
    public static void registerModelWithMeta(Block block, String... modelName)
    {
        AppalachiaItems.registerModelWithMeta(Item.getItemFromBlock(block), modelName);
    }

    public static void registerRecipes()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK), new ItemStack(sugi_sapling));

        GameRegistry.addShapelessRecipe(new ItemStack(sugi_planks, 4), new ItemStack(sugi_log, 1, OreDictionary.WILDCARD_VALUE));

        GameRegistry.addRecipe(new ItemStack(sugi_slab, 6), "###", '#', sugi_planks);

        GameRegistry.addRecipe(new ItemStack(sugi_stairs, 4), "  #", " ##", "###", '#', sugi_planks);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(sugi_fence, 3), "#S#", "#S#", 'S', "stickWood", '#', sugi_planks));
        GameRegistry.addRecipe(new ShapedOreRecipe(sugi_fence_gate, "S#S", "S#S", 'S', "stickWood", '#', sugi_planks));

        GameRegistry.addSmelting(sugi_log, new ItemStack(Items.COAL, 1, 1), 0.15F);
    }
}
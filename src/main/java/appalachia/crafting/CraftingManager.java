package appalachia.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import static appalachia.api.AppalachiaBlocks.*;

public class CraftingManager {

	public static void addRecipes()
	{
        addShapedRecipes();
        addShapelessRecipes();
        addSmeltingRecipes();
	}

    private static void addShapedRecipes() {

        GameRegistry.addRecipe(new ItemStack(sugi_slab, 6), "###", '#', sugi_planks);

        GameRegistry.addRecipe(new ItemStack(sugi_stairs, 4), "  #", " ##", "###", '#', sugi_planks);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(sugi_fence, 3), "#S#", "#S#", 'S', "stickWood", '#', sugi_planks));
        GameRegistry.addRecipe(new ShapedOreRecipe(fence_gate_autumn_grey, "S#S", "S#S", 'S', "stickWood", '#', sugi_planks));

        //GameRegistry.addRecipe(new ItemStack(AppalachiaBlocks.autumnForest_Planks, 4), new Object[] {"%", '%', AppalachiaBlocks.autumnForest_Log});
    }

    private static void addShapelessRecipes() {

        GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK), new ItemStack(sugi_sapling));
        GameRegistry.addShapelessRecipe(new ItemStack(sugi_planks, 4), new ItemStack(log_autumn_grey, 1, OreDictionary.WILDCARD_VALUE));
    }

    private static void addSmeltingRecipes() {

        GameRegistry.addSmelting(log_autumn_grey, new ItemStack(Items.COAL, 1, 1), 0.15F);
    }
}

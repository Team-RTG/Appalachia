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

        GameRegistry.addRecipe(new ItemStack(slab_autumn_grey, 6), "###", '#', planks_autumn_grey);

        GameRegistry.addRecipe(new ItemStack(stairs_autumn_grey, 4), "  #", " ##", "###", '#', planks_autumn_grey);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(fence_autumn_grey, 3), "#S#", "#S#", 'S', "stickWood", '#', planks_autumn_grey));
        GameRegistry.addRecipe(new ShapedOreRecipe(fence_gate_autumn_grey, "S#S", "S#S", 'S', "stickWood", '#', planks_autumn_grey));
    }

    private static void addShapelessRecipes() {

        GameRegistry.addShapelessRecipe(new ItemStack(Items.STICK), new ItemStack(sapling_quercus_robur));
        GameRegistry.addShapelessRecipe(new ItemStack(planks_autumn_grey, 4), new ItemStack(log_autumn_grey, 1, OreDictionary.WILDCARD_VALUE));
    }

    private static void addSmeltingRecipes() {

        GameRegistry.addSmelting(log_autumn_grey, new ItemStack(Items.COAL, 1, 1), 0.15F);
    }
}

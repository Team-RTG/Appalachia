package appalachia.item.crafting;

import appalachia.api.AppalachiaItems;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;
import java.util.Map;

public class CraftingManager {

    public static void registerRecipes() {

        GameRegistry.addRecipe(new ItemStack(AppalachiaItems.woodenPitchfork, 1), new Object[] { "# #", "#X#", " X ", '#', Blocks.PLANKS, 'X', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(AppalachiaItems.stonePitchfork, 1), new Object[] { "# #", "#X#", " X ", '#', Blocks.COBBLESTONE, 'X', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(AppalachiaItems.ironPitchfork, 1), new Object[] { "# #", "#X#", " X ", '#', Items.IRON_INGOT, 'X', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(AppalachiaItems.diamondPitchfork, 1), new Object[] { "# #", "#X#", " X ", '#', Items.DIAMOND, 'X', Items.STICK});
        GameRegistry.addRecipe(new ItemStack(AppalachiaItems.goldPitchfork, 1), new Object[] { "# #", "#X#", " X ", '#', Items.GOLD_INGOT, 'X', Items.STICK});

    }
}

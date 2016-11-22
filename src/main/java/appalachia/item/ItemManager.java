package appalachia.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaItems;
import appalachia.gui.AppalachiaTabs;
import appalachia.reference.ModInfo;
import com.google.common.collect.Lists;

public class ItemManager {

    public static ArrayList<Item> appalachiaItems = new ArrayList<>();

    public static void registerItems() {
        AppalachiaItems.rawBear = new ItemFood(4, 0.3f, false);
        AppalachiaItems.rawBear.setRegistryName(ModInfo.MOD_ID, "raw_bear");
        AppalachiaItems.rawBear.setUnlocalizedName(AppalachiaItems.rawBear.getRegistryName().toString());
        AppalachiaItems.rawBear.setCreativeTab(AppalachiaTabs.tabItem);

        AppalachiaItems.cookedBear = new ItemFood(10, 0.9f, false);
        AppalachiaItems.cookedBear.setRegistryName(ModInfo.MOD_ID, "cooked_bear");
        AppalachiaItems.cookedBear.setUnlocalizedName(AppalachiaItems.cookedBear.getRegistryName().toString());
        AppalachiaItems.cookedBear.setCreativeTab(AppalachiaTabs.tabItem);

        addFoodItems();
        registerModels();
        cookFood();
    }

    public static void addFoodItems() {
        appalachiaItems.add(AppalachiaItems.rawBear);
        appalachiaItems.add(AppalachiaItems.cookedBear);

        appalachiaItems.forEach(GameRegistry::register);
    }

    public static void cookFood() {
        GameRegistry.addSmelting(AppalachiaItems.rawBear, new ItemStack(AppalachiaItems.cookedBear, 1), 0.1f);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        appalachiaItems.forEach(ItemManager::registerModel);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item, String modelName) {

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + modelName, "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item) {

        registerModel(item, item.getRegistryName().getResourcePath());
    }

    @SideOnly(Side.CLIENT)
    public static void registerModelWithMeta(Item item, String... modelName) {

        List<ModelResourceLocation> models = Lists.newArrayList();

        for (String model : modelName) {
            models.add(new ModelResourceLocation(ModInfo.MOD_ID + ":" + model, "inventory"));
        }

        ModelBakery.registerItemVariants(item, models.toArray(new ResourceLocation[models.size()]));

        for (int i = 0; i < models.size(); ++i) {
            ModelLoader.setCustomModelResourceLocation(item, i, models.get(i));
        }
    }
}

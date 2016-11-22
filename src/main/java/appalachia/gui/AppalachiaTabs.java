package appalachia.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.api.AppalachiaItems;

public class AppalachiaTabs {

    public static final CreativeTabs tabBlock = new CreativeTabs("appalachiablocks") {

        @Override
        public Item getTabIconItem() {

            return Item.getItemFromBlock(AppalachiaBlocks.log_red_oak_01);
        }
    };

    public static final CreativeTabs tabDecoration = new CreativeTabs("appalachiadecorations") {

        @Override
        public Item getTabIconItem() {

            return Item.getItemFromBlock(AppalachiaBlocks.leaves_red_oak_01);
        }
    };

    public static final CreativeTabs tabItem = new CreativeTabs("appalachiaitems") {

        @Override
        public Item getTabIconItem() {

            return AppalachiaItems.rawBear;
        }
    };
}

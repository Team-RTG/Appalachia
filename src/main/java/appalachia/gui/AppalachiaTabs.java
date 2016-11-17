package appalachia.gui;

import appalachia.api.AppalachiaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;

public class AppalachiaTabs {

    public static final CreativeTabs tabBlock = new CreativeTabs("appalachiablocks") {

        @Override
        public Item getTabIconItem() {

            return Item.getItemFromBlock(AppalachiaBlocks.log_autumn_grey);
        }
    };

    public static final CreativeTabs tabDecoration = new CreativeTabs("appalachiadecorations") {

        @Override
        public Item getTabIconItem() {

            return Item.getItemFromBlock(AppalachiaBlocks.leaves_autumn_red);
        }
    };

    public static final CreativeTabs tabItem = new CreativeTabs("appalachiaitems") {

        @Override
        public Item getTabIconItem() {

            return AppalachiaItems.rawBear;
        }
    };
}

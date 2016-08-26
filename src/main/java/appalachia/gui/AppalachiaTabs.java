package appalachia.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;

public class AppalachiaTabs {

	public static final CreativeTabs tabBlock = new CreativeTabs("appalachiablocks"){

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AppalachiaBlocks.sugi_log);
		}
	};

	public static final CreativeTabs tabDecoration = new CreativeTabs("appalachiadecorations"){

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(AppalachiaBlocks.sugi_leaves);
		}
	};
}

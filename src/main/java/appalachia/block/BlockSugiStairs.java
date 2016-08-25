package appalachia.block;

import net.minecraft.block.BlockStairs;

import appalachia.api.block.AppalachiaBlocks;
import appalachia.gui.AppalachiaTabs;

public class BlockSugiStairs extends BlockStairs
{
	public BlockSugiStairs()
	{
		super(AppalachiaBlocks.sugi_planks.getDefaultState());
		this.setUnlocalizedName("stairs.sugi");
		this.setHarvestLevel("axe", 0);
		this.setCreativeTab(AppalachiaTabs.tabBlock);
		this.useNeighborBrightness = true;
	}
}
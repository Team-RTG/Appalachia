package appalachia.block.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import appalachia.gui.AppalachiaTabs;

public class BlockSugiFence extends BlockFence
{
	public BlockSugiFence()
	{
		super(Material.WOOD, BlockPlanks.EnumType.BIRCH.getMapColor());
		this.setUnlocalizedName("fence.sugi");
		this.setHardness(1.75F);
		this.setResistance(4.75F);
		this.setSoundType(SoundType.WOOD);
		this.setHarvestLevel("axe", 0);
		this.setCreativeTab(AppalachiaTabs.tabBlock);
	}
}
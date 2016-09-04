package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAutumnCharcoal;

public class ItemSlabAutumnCharcoal extends AppalachiaItemSlab
{
	public ItemSlabAutumnCharcoal(Block block)
	{
		super(block);
	}

	@Override
	protected IBlockState getFullBlock()
	{
		return AppalachiaBlocks.planks_autumn_charcoal.getDefaultState().withProperty(BlockPlanksAutumnCharcoal.DOUBLE, Boolean.valueOf(true));
	}
}
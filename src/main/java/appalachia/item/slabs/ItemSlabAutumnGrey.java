package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAutumnGrey;

public class ItemSlabAutumnGrey extends AppalachiaItemSlab
{
	public ItemSlabAutumnGrey(Block block)
	{
		super(block);
	}

	@Override
	protected IBlockState getFullBlock()
	{
		return AppalachiaBlocks.planks_autumn_grey.getDefaultState().withProperty(BlockPlanksAutumnGrey.DOUBLE, Boolean.valueOf(true));
	}
}
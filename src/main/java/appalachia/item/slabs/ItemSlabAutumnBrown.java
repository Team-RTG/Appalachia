package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAutumnBrown;

public class ItemSlabAutumnBrown extends AppalachiaItemSlab
{
	public ItemSlabAutumnBrown(Block block)
	{
		super(block);
	}

	@Override
	protected IBlockState getFullBlock()
	{
		return AppalachiaBlocks.planks_autumn_brown.getDefaultState().withProperty(BlockPlanksAutumnBrown.DOUBLE, Boolean.valueOf(true));
	}
}
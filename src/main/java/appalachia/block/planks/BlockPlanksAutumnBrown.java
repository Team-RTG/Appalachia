package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksAutumnBrown extends AppalachiaBlockPlanks implements IAppalachiaBlock
{
	public BlockPlanksAutumnBrown()
	{
		super("planks.autumn.brown");
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_autumn_brown : this);
	}

	@Override
	public String registryName() {
		return super.registryName();
	}
}
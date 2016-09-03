package appalachia.block.stairs;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockStairsAutumnCoffee extends AppalachiaBlockStairs implements IAppalachiaBlock
{
	public BlockStairsAutumnCoffee()
	{
		super("stairs.autumn.coffee", AppalachiaBlocks.planks_autumn_coffee.getDefaultState());
	}

	@Override
	public String registryName() {
		return super.registryName();
	}
}
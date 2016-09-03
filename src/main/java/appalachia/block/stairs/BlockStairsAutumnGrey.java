package appalachia.block.stairs;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockStairsAutumnGrey extends AppalachiaBlockStairs implements IAppalachiaBlock
{
	public BlockStairsAutumnGrey()
	{
		super("stairs.autumn.grey", AppalachiaBlocks.planks_autumn_grey.getDefaultState());
	}

	@Override
	public String registryName() {
		return super.registryName();
	}
}
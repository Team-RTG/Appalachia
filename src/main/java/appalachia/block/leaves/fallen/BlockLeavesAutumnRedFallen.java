package appalachia.block.leaves.fallen;

import net.minecraftforge.common.IShearable;

import appalachia.block.IAppalachiaBlock;

public class BlockLeavesAutumnRedFallen extends AppalachiaBlockLeavesFallen implements IAppalachiaBlock, IShearable
{
	public BlockLeavesAutumnRedFallen()
	{
		super("leaves.autumn.red.fallen");
	}

	@Override
	public String registryName() {
		return super.registryName();
	}
}
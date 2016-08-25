package appalachia.block;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.IStringSerializable;

import appalachia.gui.AppalachiaTabs;

public class BlockSugiLog extends BlockLog
{
	public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create("variant", EnumType.class);

	public BlockSugiLog()
	{
		super();
		this.setUnlocalizedName("log.sugi");
		this.setHarvestLevel("axe", 0);
		this.setDefaultState(blockState.getBaseState().withProperty(VARIANT, EnumType.NORMAL).withProperty(LOG_AXIS, EnumAxis.Y));
		this.setCreativeTab(AppalachiaTabs.tabBlock);
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT, LOG_AXIS});
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState state = getDefaultState().withProperty(VARIANT, (meta & 3) % 4 == 1 ? EnumType.MYST : EnumType.NORMAL);

		switch (meta & 12)
		{
			case 0:
				state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
				break;
			case 4:
				state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
				break;
			case 8:
				state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
				break;
			default:
				state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
		}

		return state;
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		int meta = 0;

		meta = meta | state.getValue(VARIANT).getMetadata();

		switch (state.getValue(LOG_AXIS))
		{
			case X:
				meta |= 4;
				break;
			case Z:
				meta |= 8;
				break;
			case NONE:
				meta |= 12;
				break;
			default:
		}

		return meta;
	}

	@Override
	public MapColor getMapColor(IBlockState state)
	{
		return BlockPlanks.EnumType.BIRCH.getMapColor();
	}

	@Override
	public int getLightValue(IBlockState state)
	{
		switch (state.getValue(VARIANT))
		{
			case MYST:
				return 5;
			default:
		}

		return super.getLightValue(state);
	}

	public enum EnumType implements IStringSerializable
	{
		NORMAL(0, "normal"),
		MYST(1, "myst");

		private static final EnumType[] META_LOOKUP = new EnumType[values().length];

		private final int meta;
		private final String name;

		private EnumType(int meta, String name)
		{
			this.meta = meta;
			this.name = name;
		}

		public int getMetadata()
		{
			return meta;
		}

		@Override
		public String getName()
		{
			return name;
		}

		@Override
		public String toString()
		{
			return name;
		}

		public static EnumType byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
			{
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		static
		{
			for (EnumType type : values())
			{
				META_LOOKUP[type.getMetadata()] = type;
			}
		}
	}
}
package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockPlanks extends BlockPlanks
{
    public static final PropertyBool DOUBLE = PropertyBool.create("double");

    public AppalachiaBlockPlanks(String unlocalizedName)
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(1.75F);
        this.setResistance(4.75F);
        this.setSoundType(SoundType.WOOD);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabBlock);
        this.setDefaultState(blockState.getBaseState().withProperty(DOUBLE, Boolean.valueOf(false)));
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {DOUBLE});
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(DOUBLE, Boolean.valueOf(meta == 1));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(DOUBLE).booleanValue() ? 1 : 0;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.sugi_slab : this);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, Random random)
    {
        return state.getValue(DOUBLE).booleanValue() ? 2 : 1;
    }
}

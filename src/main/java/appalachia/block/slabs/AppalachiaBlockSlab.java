package appalachia.block.slabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockSlab extends BlockSlab
{
    public AppalachiaBlockSlab(String unlocalizedName)
    {
        super(Material.WOOD);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(1.75F);
        this.setResistance(4.75F);
        this.setSoundType(SoundType.WOOD);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabBlock);
        this.setDefaultState(blockState.getBaseState().withProperty(HALF, EnumBlockHalf.BOTTOM));
        this.useNeighborBrightness = true;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {HALF});
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(HALF, meta == 0 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(HALF) == EnumBlockHalf.TOP ? 1 : 0;
    }

    @Override
    public String getUnlocalizedName(int meta)
    {
        return getUnlocalizedName();
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return null;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return null;
    }
}
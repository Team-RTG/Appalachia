package appalachia.block.stairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockStairs extends BlockStairs
{
    public AppalachiaBlockStairs(String unlocalizedName, IBlockState blockstate)
    {
        super(blockstate);
        this.setUnlocalizedName(unlocalizedName);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabBlock);
        this.useNeighborBrightness = true;
    }
}
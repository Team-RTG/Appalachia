package appalachia.block.stairs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockStairs extends BlockStairs implements IAppalachiaBlock
{
    private String slug;

    public AppalachiaBlockStairs(String unlocalizedName, IBlockState blockstate)
    {
        super(blockstate);
        this.setUnlocalizedName(unlocalizedName);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabBlock);
        this.useNeighborBrightness = true;
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {
        return String.join("_", this.slug.split("\\."));
    }
}
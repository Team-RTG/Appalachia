package appalachia.block.fences;

import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockFence extends BlockFence implements IAppalachiaBlock
{
    private String slug;

    public AppalachiaBlockFence(String unlocalizedName)
    {
        super(Material.WOOD, BlockPlanks.EnumType.BIRCH.getMapColor());
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(1.75F);
        this.setResistance(4.75F);
        this.setSoundType(SoundType.WOOD);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(AppalachiaTabs.tabBlock);
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {
        return String.join("_", this.slug.split("\\."));
    }
}
package appalachia.block.saplings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSapling;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.event.terraingen.TerrainGen;

import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;

public abstract class AppalachiaBlockSapling extends BlockSapling implements IAppalachiaBlock, IAppalachiaBlockSapling {

    private String slug;

    public AppalachiaBlockSapling(String unlocalizedName) {

        this.setUnlocalizedName(unlocalizedName);
        this.setSoundType(SoundType.PLANT);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
    }

    public void growTree(World world, BlockPos pos, IBlockState state, Random random)
    {
        if (!TerrainGen.saplingGrowTree(world, random, pos)) {
            return;
        }

        ArrayList<AppalachiaTree> aplTrees = this.getTrees();

        if (aplTrees.size() > 0) {

            world.setBlockState(pos, Blocks.AIR.getDefaultState(), 1);
            if (!aplTrees.get(random.nextInt(aplTrees.size())).generate(world, random, pos)) {
                world.setBlockState(pos, getDefaultState(), 4);
            }
        }
    }

    @Override
    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (state.getValue(STAGE).intValue() == 0)
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        else
            growTree(worldIn, pos, state, rand);
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        list.add(new ItemStack(itemIn, 1, 0));
    }
}
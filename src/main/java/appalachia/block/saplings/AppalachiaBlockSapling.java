package appalachia.block.saplings;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.biome.AppalachiaBiome;
import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;

public class AppalachiaBlockSapling extends BlockBush implements IGrowable, IAppalachiaBlock {

    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

    private String slug;

    public AppalachiaBlockSapling(String unlocalizedName) {

        this.setUnlocalizedName(unlocalizedName);
        this.setSoundType(SoundType.PLANT);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, Integer.valueOf(0)));
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

        return SAPLING_AABB;
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (!worldIn.isRemote) {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0) {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (((Integer)state.getValue(STAGE)).intValue() == 0) {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {

        if (!TerrainGen.saplingGrowTree(worldIn, rand, pos)) {
            return;
        }

        Biome biomeIn = worldIn.getBiome(pos);

        if (biomeIn instanceof AppalachiaBiome) {

            AppalachiaBiome biome = (AppalachiaBiome)biomeIn;

            if (biome.appalachiaTrees.size() > 0) {

                AppalachiaTree tree = biome.appalachiaTrees.get(rand.nextInt(biome.appalachiaTrees.size()));

                if (tree.getSaplingBlock().getBlock() == state.getBlock()) {

                    IBlockState iblockstate2 = Blocks.AIR.getDefaultState();
                    worldIn.setBlockState(pos, iblockstate2, 4);

                    tree.generateFromSapling = true;
                    if (!tree.generate(worldIn, rand, pos)) {
                        worldIn.setBlockState(pos, state, 4);
                    }
                    tree.generateFromSapling = false;
                }
            }
        }
    }

    @Override
    public int damageDropped(IBlockState state) {

        return 0;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {

        list.add(new ItemStack(itemIn));
    }

    @Override
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {

        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {

        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {

        this.grow(worldIn, pos, state, rand);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {

        return this.getDefaultState().withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }

    @Override
    public int getMetaFromState(IBlockState state) {

        int i = 0;
        i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState() {

        return new BlockStateContainer(this, new IProperty[]{STAGE});
    }
}
package appalachia.block.plants;

import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class AppalachiaBlockPlants extends BlockBush implements IAppalachiaBlock {

    private String slug;

    public AppalachiaBlockPlants(String unlocalizedName) {

        this.setUnlocalizedName(unlocalizedName);
        this.setSoundType(SoundType.PLANT);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
    }

    @Override
    public int damageDropped(IBlockState state) {

        return 0;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab,List<ItemStack> list) {

        list.add(new ItemStack(itemIn));
    }

    @SideOnly(Side.CLIENT)
    public static class ColourHandler implements IBlockColor {

        public ColourHandler() {

        }

        @Override
        public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex) {
            if (worldIn != null && pos != null) {
                return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
            }
            else {
                return 4028928;
            }
        }
    }
}

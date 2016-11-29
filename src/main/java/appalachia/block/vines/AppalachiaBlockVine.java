package appalachia.block.vines;


import net.minecraft.block.BlockVine;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.block.IAppalachiaBlock;
import appalachia.gui.AppalachiaTabs;

public class AppalachiaBlockVine extends BlockVine implements IAppalachiaBlock {

    private String slug;

    public AppalachiaBlockVine(String unlocalizedName) {

        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(AppalachiaTabs.tabDecoration);
        this.slug = unlocalizedName;
    }

    @Override
    public String registryName() {

        return String.join("_", this.slug.split("\\."));
    }

    private boolean canAttachVineOn(IBlockState state)
    {
        return state.isFullCube() && state.getMaterial().blocksMovement();
    }

    private boolean recheckGrownSides(World worldIn, BlockPos pos, IBlockState state)
    {
        IBlockState iblockstate = state;

        for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL)
        {
            PropertyBool propertybool = getPropertyFor(enumfacing);

            if (((Boolean)state.getValue(propertybool)).booleanValue() && !this.canAttachVineOn(worldIn.getBlockState(pos.offset(enumfacing))))
            {
                IBlockState iblockstate1 = worldIn.getBlockState(pos.up());

                if (iblockstate1.getBlock() != this || !((Boolean)iblockstate1.getValue(propertybool)).booleanValue())
                {
                    state = state.withProperty(propertybool, Boolean.valueOf(false));
                }
            }
        }

        if (getNumGrownFaces(state) == 0)
        {
            return false;
        }
        else
        {
            if (iblockstate != state)
            {
                worldIn.setBlockState(pos, state, 2);
            }

            return true;
        }
    }
}

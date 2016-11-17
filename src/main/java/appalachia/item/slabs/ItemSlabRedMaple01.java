package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksRedMaple01;

public class ItemSlabRedMaple01 extends AppalachiaItemSlab {

    public ItemSlabRedMaple01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_red_maple_01.getDefaultState().withProperty(BlockPlanksRedMaple01.DOUBLE, Boolean.valueOf(true));
    }
}
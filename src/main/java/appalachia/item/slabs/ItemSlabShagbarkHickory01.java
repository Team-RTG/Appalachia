package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksShagbarkHickory01;

public class ItemSlabShagbarkHickory01 extends AppalachiaItemSlab {

    public ItemSlabShagbarkHickory01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_shagbark_hickory_01.getDefaultState().withProperty(BlockPlanksShagbarkHickory01.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksBlackWalnut01;

public class ItemSlabBlackWalnut01 extends AppalachiaItemSlab {

    public ItemSlabBlackWalnut01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_black_walnut_01.getDefaultState().withProperty(BlockPlanksBlackWalnut01.DOUBLE, Boolean.valueOf(true));
    }
}
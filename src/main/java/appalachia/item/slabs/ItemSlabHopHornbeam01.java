package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksHopHornbeam01;

public class ItemSlabHopHornbeam01 extends AppalachiaItemSlab {

    public ItemSlabHopHornbeam01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_hop_hornbeam_01.getDefaultState().withProperty(BlockPlanksHopHornbeam01.DOUBLE, Boolean.valueOf(true));
    }
}
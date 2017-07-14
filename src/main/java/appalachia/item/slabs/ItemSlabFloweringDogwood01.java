package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksFloweringDogwood01;

public class ItemSlabFloweringDogwood01 extends AppalachiaItemSlab {

    public ItemSlabFloweringDogwood01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_flowering_dogwood_01.getDefaultState().withProperty(BlockPlanksFloweringDogwood01.DOUBLE, Boolean.valueOf(true));
    }
}
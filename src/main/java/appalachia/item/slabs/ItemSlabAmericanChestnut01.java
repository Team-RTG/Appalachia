package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksAmericanChestnut01;

public class ItemSlabAmericanChestnut01 extends AppalachiaItemSlab {

    public ItemSlabAmericanChestnut01(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_american_chestnut_01.getDefaultState().withProperty(BlockPlanksAmericanChestnut01.DOUBLE, Boolean.valueOf(true));
    }
}
package appalachia.api.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IPitchforkHarvestable {

    boolean canPitchforkHarvest(World world, BlockPos pos, ItemStack stack);

    boolean hasSpecialPitchforkHarvest(World world, BlockPos pos, ItemStack stack);

    void harvestByPitchfork(World world, BlockPos pos, ItemStack stack);
}

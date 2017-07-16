package appalachia.rtg.world.gen.feature;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import rtg.api.util.WorldUtil;

public class WorldGenPlantsAPL extends WorldGenerator {

    private ArrayList<IBlockState> plants;

    public WorldGenPlantsAPL(ArrayList<IBlockState> plants) {

        this.plants = plants;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {

        if (plants.size() > 0) {

            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();

            IBlockState plant = plants.get(rand.nextInt(plants.size()));

            int i1 = x;// + rand.nextInt(8) - rand.nextInt(8);
            int j1 = y;// + rand.nextInt(4) - rand.nextInt(4);
            int k1 = z;// + rand.nextInt(8) - rand.nextInt(8);

            BlockPos plantPos = new BlockPos(i1, j1, k1);
            WorldUtil worldUtil = new WorldUtil(world);

            if (world.isAirBlock(plantPos)
                && (!world.provider.hasNoSky() || j1 < 254)
                && plant.getBlock().canPlaceBlockAt(world, plantPos)) {

                world.setBlockState(plantPos, plant, 2);
            }

            return true;
        }

        return false;
    }
}
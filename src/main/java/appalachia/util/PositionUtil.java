package appalachia.util;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PositionUtil {
    public static int getRotationAwayFromEntity(BlockPos me, BlockPos bad) {
        double distanceX = (bad.getX() - me.getX());
        double distanceZ = (bad.getY() - me.getY());

        return (int) Math.toDegrees(Math.atan2(distanceZ, distanceX)) + 90;
    }

    public static boolean isNotSolid(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        AxisAlignedBB boundingBox = state.getCollisionBoundingBox(world, pos);

        return boundingBox == null || boundingBox.equals(Block.NULL_AABB);
    }

    public static BlockPos nextSolidBlock(World world, BlockPos start) {
        while (isNotSolid(world, start)) {
            start = start.down();
        }

        return start;
    }
}

package appalachia.util;

import net.minecraft.util.math.BlockPos;

public class EntityUtil {
    public static int getRotationAwayFromEntity(BlockPos me, BlockPos bad) {
        double distanceX = (bad.getX() - me.getX());
        double distanceZ = (bad.getY() - me.getY());

        return (int) Math.toDegrees(Math.atan2(distanceZ, distanceX)) + 90;
    }
}

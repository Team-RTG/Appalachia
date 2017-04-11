package appalachia.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerUtil {
    public static boolean isCreativeMode(Entity entity) {
        return (entity instanceof EntityPlayer && ((EntityPlayer) entity).capabilities.isCreativeMode);
    }
}

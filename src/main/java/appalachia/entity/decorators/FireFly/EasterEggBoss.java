package appalachia.entity.decorators.FireFly;

import javax.annotation.Nonnull;

import appalachia.entity.decorators.EntityDecorator;
import appalachia.entity.passive.EntityFireFly;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfo.Overlay;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.WorldServer;

public class EasterEggBoss implements EntityDecorator<EntityFireFly> {
    EntityFireFly fireFly;
    private final BossInfoServer bossInfo = new BossInfoServer(getBossName("BossFly™"), BossInfo.Color.YELLOW, Overlay.PROGRESS);

    public EasterEggBoss(@Nonnull EntityFireFly fireFly) {
        this.fireFly = fireFly;
        fireFly.setIsBossMode(true);
        bossInfo.setName(getBossName(fireFly.getName()));

        if(!fireFly.worldObj.isRemote) {
            for (EntityPlayer player : ((WorldServer) fireFly.getEntityWorld()).getEntityTracker().getTrackingPlayers(fireFly)) {
                bossInfo.addPlayer((EntityPlayerMP) player);
            }
        }
    }

    @Override
    public void removeDecorator() {
        fireFly.setIsBossMode(false);

        if(!fireFly.worldObj.isRemote) {
            for (EntityPlayer player : ((WorldServer) fireFly.getEntityWorld()).getEntityTracker().getTrackingPlayers(fireFly)) {
                bossInfo.removePlayer((EntityPlayerMP) player);
            }
        }
    }

    @Override
    public float entityGotAttacked(float damage, DamageSource source) {
        if(fireFly.getHealth() - damage < 1 && source != DamageSource.outOfWorld) {
            if(fireFly.getHealth() > 1) {
                fireFly.setHealth(1);
                return 0;
            } else {
                fireFly.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(fireFly.getMaxHealth() + 1);
                fireFly.setHealth(fireFly.getMaxHealth());
                return 0;
            }
        } else {
            return damage;
        }
    }

    @Override
    public void setHealth(float oldHealth, float newHealth) {
        bossInfo.setPercent(newHealth / fireFly.getMaxHealth());
    }

    @Override
    public void newTrackingPlayer(@Nonnull EntityPlayerMP player) {
        bossInfo.addPlayer(player);
    }

    @Override
    public void removeTrackingPlayer(@Nonnull EntityPlayerMP player) {
        bossInfo.removePlayer(player);
    }

    private static ITextComponent getBossName(@Nonnull String name) {
        return new TextComponentString(name).setStyle(new Style().setColor(TextFormatting.YELLOW));
    }
}

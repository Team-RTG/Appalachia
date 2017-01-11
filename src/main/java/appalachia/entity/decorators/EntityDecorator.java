package appalachia.entity.decorators;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;

public interface EntityDecorator<T extends EntityLiving> {
    /**
     * Gets called when the Entity decides it no longer needs the Decorator. Clean up and revert here.
     */
    void removeDecorator();

    // Event-Driven methods, Feel Free to extend as needed. Please implement Method Calls to the entities.
    /**
     * Gets called every tick the in the onLivingUpdate()
     */
    default void onUpdate() {}

    /**
     * Gets Called when the entity gets attacked.
     * It is not possible to completely cancel the event, but you can change the damage value.
     * @param damage The damage taken
     * @param source The source of the damage
     * @return The damage which should actually be applied to the entity
     */
    default float entityGotAttacked(float damage, DamageSource source) {
        return damage;
    }

    /**
     * Gets called when the live of the entity changes. Used for the BossFly to update the boss bar.
     * @param oldHealth The Health before the update
     * @param newHealth The Health which the entity has after the update
     */
    default void setHealth(float oldHealth, float newHealth) {}

    /**
     * Gets called when a player starts tracking the entity
     * @param player The player which starts tracking
     */
    default void newTrackingPlayer(EntityPlayerMP player) {}

    /**
     * Gets called when a player stops tracking the entity
     * @param player The player which stops tracking
     */
    default void removeTrackingPlayer(EntityPlayerMP player) {}
}
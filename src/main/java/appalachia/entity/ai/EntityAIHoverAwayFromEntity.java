package appalachia.entity.ai;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import appalachia.util.EntityUtil;

import rtg.api.util.RandomUtil;

public class EntityAIHoverAwayFromEntity extends EntityAIHoverBase {

    protected Class<? extends Entity> living;
    protected float defaultRange;
    protected float derivation;

    private float maxRange;

    public EntityAIHoverAwayFromEntity(EntityFlying entity, Class<? extends Entity> living, float defaultRange, float maxRange, float speedModifier) {
        super(entity, speedModifier);
        this.living = living;
        this.defaultRange = defaultRange;
        this.maxRange = maxRange;
    }

    @Override
    public boolean shouldExecute() {
        @Nonnull BlockPos pos = new BlockPos(entity);
        return entity.ticksExisted % 10 == 0 && entityNearby(pos, RandomUtil.weightedRandomFactor2(entity.ticksExisted, 2, 6));
    }

    private boolean entityNearby(@Nonnull BlockPos spot, float range) {
        return getEntityWithin(spot, range) != null;
    }

    @Nullable
    private Entity getEntityWithin(@Nonnull BlockPos spot, float range) {
        return entity.worldObj.findNearestEntityWithinAABB(living, new AxisAlignedBB(spot.add(-range, -range, -range), spot.add(range, range, range)), entity);
    }

    @Override
    protected int getRotation(@Nonnull BlockPos spot) {
        @Nullable Entity nearest = getEntityWithin(spot, maxRange);

        if (nearest == null) {
            return super.getRotation(spot);
        }

        return EntityUtil.getRotationAwayFromEntity(spot, new BlockPos(nearest));
    }

    @Override
    protected boolean stopCondition(@Nonnull BlockPos spot) {
        return entityNearby(spot, maxRange);
    }

    @Override
    protected boolean isSpotGood(BlockPos spot) {
        return false;
    }
}

package appalachia.entity.ai;

import appalachia.util.PositionUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class FlyAwayFromEntity extends FlyRandomly {
    protected Class<? extends Entity> living;
    protected float defaultRange;
    protected float derivation;

    private float maxRange;

    public FlyAwayFromEntity(EntityFlying entity, Class<? extends Entity> living, float defaultRange, float distribution, float speedModifier) {
        super(entity, speedModifier);
        this.living = living;
        this.defaultRange = defaultRange;
        this.derivation = distribution;

        this.maxRange = defaultRange + distribution * 4;
    }

    @Override
    public boolean shouldExecute() {
        BlockPos pos = new BlockPos(entity);
        return entity.ticksExisted % 7 == 0 && entityNearby(pos, defaultRange + (float) Math.abs(entity.getRNG().nextGaussian()) * derivation);
    }

    @Override
    protected int getRotation(BlockPos spot) {
        Entity nearest = getEntityWithin(spot, maxRange);

        if (nearest == null) {
            return super.getRotation(spot);
        }

        return PositionUtil.getRotationAwayFromEntity(spot, new BlockPos(nearest));
    }

    @Override
    protected boolean stopCondition(BlockPos spot) {
        return entityNearby(spot, maxRange);
    }

    private boolean entityNearby(BlockPos spot, float range) {
        return getEntityWithin(spot, range) != null;
    }

    private Entity getEntityWithin(BlockPos spot, float range) {
        return entity.worldObj.findNearestEntityWithinAABB(living, new AxisAlignedBB(spot.add(-range, -range, -range), spot.add(range, range, range)), entity);
    }
}

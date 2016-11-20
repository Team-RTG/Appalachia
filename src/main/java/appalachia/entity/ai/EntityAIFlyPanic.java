package appalachia.entity.ai;

import appalachia.util.EntityUtil;
import appalachia.util.MathUtil;
import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.BlockPos;

public class EntityAIFlyPanic extends EntityAIFlyRandomly {
    private int until;

    public EntityAIFlyPanic(EntityFlying entity, float speedModifier) {
        super(entity, speedModifier);
        setMutexBits(4);
    }

    @Override
    public boolean shouldExecute() {
        return entity.getAITarget() != null &&
            entity.getAITarget().isEntityAlive();
    }

    @Override
    protected int getRotation(BlockPos spot) {
        if (entity.getAITarget() != null && entity.getAITarget().isEntityAlive()) {
            return EntityUtil.getRotationAwayFromEntity(spot, new BlockPos(entity.getAITarget()));
        } else {
            return super.getRotation(spot);
        }
    }

    @Override
    protected boolean stopCondition(BlockPos spot) {
        return entity.ticksExisted >= until;
    }

    @Override
    protected void additionalSetup() {
        until = entity.ticksExisted + (int) MathUtil.weightedRandom(entity.getRNG(), 60, 100);
    }
}

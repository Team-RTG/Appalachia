package appalachia.entity.ai;

import appalachia.util.EntityUtil;
import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.BlockPos;

public class EntityAIHoverPanic extends EntityAIHoverBase {

    private int until;

    public EntityAIHoverPanic(EntityFlying entity, float speedModifier) {
        super(entity, speedModifier);
        setMutexBits(4);
    }

    @Override
    public boolean shouldExecute() {
        return entity.getAITarget() != null && entity.getAITarget().isEntityAlive();
    }

    @Override
    public void startExecuting() {
        until = entity.ticksExisted + 80;
        super.startExecuting();
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
    protected boolean isSpotGood(BlockPos spot) {
        return false;
    }
}

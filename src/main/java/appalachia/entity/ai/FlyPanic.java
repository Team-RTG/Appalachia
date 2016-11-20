package appalachia.entity.ai;

import appalachia.util.PositionUtil;
import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.BlockPos;

public class FlyPanic extends FlyRandomly {
    public FlyPanic(EntityFlying entity, float speedModifier) {
        super(entity, speedModifier);
        setMutexBits(4);
    }

    @Override
    public boolean shouldExecute() {
        return entity.getLastAttackerTime() != 0 &&
            entity.getLastAttacker() != null &&
            entity.getLastAttacker().isEntityAlive() &&
            entity.getLastAttackerTime() - entity.ticksExisted < 10;
    }

    @Override
    protected int getRotation(BlockPos spot) {
        if(entity.getLastAttacker() != null && entity.getLastAttacker().isEntityAlive()) {
            return PositionUtil.getRotationAwayFromEntity(spot, new BlockPos(entity.getLastAttacker()));
        } else {
            return super.getRotation(spot);
        }
    }

    @Override
    protected boolean stopCondition(BlockPos spot) {
        return entity.getLastAttackerTime() - entity.ticksExisted > 80;
    }
}

package appalachia.entity.ai;

import javax.annotation.Nonnull;

import appalachia.util.RandomUtil;
import appalachia.util.WorldUtil;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public abstract class EntityAIHoverBase extends EntityAIBase {

    protected EntityFlying entity;
    protected int hoverHeight;
    protected Action action;

    private Vec3d lastPosition;
    private float speedModifier;

    public EntityAIHoverBase(EntityFlying entity, float speedModifier) {
        this.entity = entity;
        this.speedModifier = speedModifier;
        setMutexBits(1);
    }

    @Override
    public boolean continueExecuting() {
        if (action == null || (entity.ticksExisted % 7 == 0 && action != Action.END)) {
            @Nonnull BlockPos spot = new BlockPos(entity);

            float height = hoverHeight;

            if (action != Action.FLY || !heightCouldMatch()) {
                height = getHeight();
            }

            entity.motionX = entity.motionY = entity.motionZ = 0;

            if (stopCondition(spot)) {
                return false;
            } else if (endCondition(spot, height)) {
                endActionOnce();
                action = Action.END;
            } else if (gainHeightCondition(height)) {
                gainHeightActionOnce();
                action = Action.GAIN_HEIGHT;
            } else if (loseHeightCondition(height)) {
                loseHeightActionOnce();
                action = Action.LOSE_HEIGHT;
            } else {
                flyActionOnce();
                action = Action.FLY;
            }
        }

        switch (action) {
            case END:
                return endAction();
            case GAIN_HEIGHT:
                return gainHeightAction();
            case LOSE_HEIGHT:
                return loseHeightAction();
            case FLY:
                return flyAction();
        }

        return true;
    }

    @Override
    public void startExecuting() {
        int currentHeight = getHeight();
        hoverHeight = getHoverHeight(currentHeight);

        entity.rotationYawHead = entity.rotationYaw = getRotation(new BlockPos(entity));

        lastPosition = new Vec3d(0, -10, 0);

        action = Action.GAIN_HEIGHT;
    }

    protected int getHoverHeight(int currentHeight) {
        return currentHeight > 2 ? currentHeight : RandomUtil.weightedRandomFactor2(entity.ticksExisted, 1, 4);
    }



    protected int getRotation(BlockPos spot) {
        return entity.getRNG().nextInt(360);
    }

    protected boolean heightCouldMatch() {
        @Nonnull BlockPos pos = new BlockPos(entity);
        int tolerance = (int) (getSpeed(0.8F) * 14 /* 2 (Blocks to tolerate) * 7 (Task Update Interval) */) + 1;

        BlockPos shouldAir = pos.down(Math.max(1, hoverHeight - tolerance));
        return entity.getEntityWorld().isAirBlock(shouldAir) && !entity.getEntityWorld().isAirBlock(shouldAir.down(tolerance));
    }

    protected int getHeight() {
        @Nonnull BlockPos pos = new BlockPos(entity);
        BlockPos nextBlock = WorldUtil.nextSolidBlock(entity.worldObj, pos, EnumFacing.DOWN);

        return (int) entity.posY - nextBlock.getY();
    }

    protected boolean stopCondition(BlockPos spot) {
        return false;
    }

    protected boolean endCondition(BlockPos spot, float height) {
        return isBlocked() || entity.getRNG().nextInt(32) == 0 && isSpotGood(spot);
    }

    protected boolean gainHeightCondition(float height) {
        return height < hoverHeight;
    }

    protected boolean loseHeightCondition(float height) {
        return height > hoverHeight + getSpeed(0.9F) * 14 /* 2 (Blocks to tolerate) * 7 (Task Update Interval) */;
    }

    protected void endActionOnce() {}

    protected boolean endAction() {
        if (entity.onGround) {
            entity.motionY = -0.5;
            entity.motionX = entity.motionZ = 0;
            return false;
        } else if (entity.ticksExisted % 4 == 0 && getHeight() < 0.1) {
            entity.setPosition(entity.posX, (int) entity.posY, entity.posZ);
            entity.motionY = -0.5;
            entity.motionX = entity.motionZ = 0;
            return false;
        } else {
            entity.motionY = getSpeed(-0.55F);
        }

        return true;
    }

    protected void gainHeightActionOnce() {}

    protected boolean gainHeightAction() {
        entity.motionY = getSpeed(0.6F);
        return true;
    }

    protected void loseHeightActionOnce() {}

    protected boolean loseHeightAction() {
        entity.motionY = getSpeed(-0.7F);
        return true;
    }

    protected void flyActionOnce() {
        if (entity.ticksExisted % 10 == 0 && entity.getRNG().nextInt(5) == 0) {
            int difference = (int) (entity.getRNG().nextGaussian() * 20);
            entity.rotationYaw += difference;
            entity.rotationYawHead += difference;
        }
    }

    protected boolean flyAction() {
        entity.moveRelative(0, getSpeed(1), 0.1F);

        if (entity.ticksExisted % 3 == 0) {
            entity.motionX += entity.getRNG().nextGaussian() * getSpeed(0.2F);
            entity.motionY += entity.getRNG().nextGaussian() * getSpeed(0.2F);
            entity.motionZ += entity.getRNG().nextGaussian() * getSpeed(0.2F);
        }

        return true;
    }

    private boolean isBlocked() {
        @Nonnull Vec3d entityPos = new Vec3d(entity.posX, entity.posY, entity.posZ);

        if (entityPos.distanceTo(lastPosition) < getSpeed(0.1F)) {
            return true;
        } else {
            lastPosition = entityPos;
            return false;
        }
    }

    protected abstract boolean isSpotGood(BlockPos spot);

    private float getSpeed(float times) {
        return entity.getAIMoveSpeed() * speedModifier * times;
    }

    protected enum Action {
        GAIN_HEIGHT, LOSE_HEIGHT, FLY, END
    }
}

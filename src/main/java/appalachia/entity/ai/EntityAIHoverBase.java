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
    protected float flyHeight;
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
        if (action == null || (entity.ticksExisted % 5 == 0 && action != Action.END)) {
            @Nonnull BlockPos spot = new BlockPos(entity);

            float height = getHeight();
            entity.motionX = entity.motionY = entity.motionZ = 0;

            if (stopCondition(spot)) {
                return false;
            } else if (endCondition(spot, height)) {
                action = Action.END;
            } else if (gainHeightCondition(spot, height)) {
                action = Action.GAIN_HEIGHT;
            } else if (loseHeightCondition(spot, height)) {
                action = Action.LOSE_HEIGHT;
            } else {
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
        float currentHeight = getHeight();
        flyHeight = getHoverHeight(currentHeight);

        entity.rotationYaw = getRotation(new BlockPos(entity));
        entity.rotationYawHead = entity.rotationYaw;

        lastPosition = new Vec3d(0, -10, 0);

        action = Action.GAIN_HEIGHT;
    }

    protected float getHoverHeight(float currentHeight) {
        return currentHeight > 2 ? currentHeight : (float) RandomUtil.weightedRandom(entity.getRNG(), 1, 0.75F) + entity.getRNG().nextFloat();
    }

    protected int getRotation(BlockPos spot) {
        return entity.getRNG().nextInt(360);
    }

    protected float getHeight() {
        @Nonnull BlockPos pos = new BlockPos(entity);
        BlockPos nextBlock = WorldUtil.nextSolidBlock(entity.worldObj, pos, EnumFacing.DOWN);

        return (float) (entity.posY - nextBlock.getY());
    }

    protected boolean stopCondition(BlockPos spot) {
        return false;
    }

    protected boolean endCondition(BlockPos spot, float height) {
        return isBlocked() || entity.getRNG().nextInt(40) == 0 && isSpotGood(spot);
    }

    protected boolean gainHeightCondition(BlockPos spot, float height) {
        return height > flyHeight + 1;
    }

    protected boolean loseHeightCondition(BlockPos spot, float height) {
        return height < flyHeight;
    }

    protected boolean endAction() {
        if (entity.onGround) {
            entity.motionY = -0.5;
            entity.motionX = entity.motionZ = 0;
            return false;
        } else if (getHeight() < 0.1) {
            entity.setPosition(entity.posX, (int) entity.posY, entity.posZ);
            return false;
        } else {
            entity.motionY = getSpeed(-0.55F);
        }

        return true;
    }

    protected boolean gainHeightAction() {
        if (getHeight() >= flyHeight) {
            entity.motionY = 0;
            action = Action.FLY;
        } else {
            entity.moveRelative(0, getSpeed(0.2F), 0.1F);
            entity.motionY = getSpeed(0.6F);
        }

        return true;
    }

    protected boolean loseHeightAction() {
        if (getHeight() < flyHeight + 0.5) {
            entity.motionY = 0;
            action = Action.FLY;
        } else {
            entity.motionY = getSpeed(-0.7F);
        }

        return true;
    }

    protected boolean flyAction() {
        entity.moveRelative(0, getSpeed(1), 0.1F);

        if (entity.ticksExisted % 3 == 0) {
            entity.motionX += entity.getRNG().nextGaussian() * getSpeed(0.5F);
            entity.motionY += entity.getRNG().nextGaussian() * getSpeed(0.5F);
            entity.motionZ += entity.getRNG().nextGaussian() * getSpeed(0.5F);
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

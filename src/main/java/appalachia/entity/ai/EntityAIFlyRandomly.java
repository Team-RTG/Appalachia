package appalachia.entity.ai;

import appalachia.entity.passive.EntityFireFly;
import appalachia.util.EntityUtil;
import appalachia.util.MathUtil;
import appalachia.util.WorldUtil;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class EntityAIFlyRandomly extends EntityAIBase {
    protected EntityFlying entity;
    protected float flyHeight;
    protected Action action;

    private Vec3d lastPosition;
    private float speedModifier;

    public EntityAIFlyRandomly(EntityFlying entity, float speedModifier) {
        this.entity = entity;
        this.speedModifier = speedModifier;
        setMutexBits(1);
    }

    @Override
    public boolean shouldExecute() {
        return (entity.getRNG().nextInt(40) == 1 && entity.worldObj.getLightFromNeighbors(new BlockPos(entity)) < 8) || getHeight() > 1.3;
    }

    @Override
    public boolean continueExecuting() {
        if (action == null || (entity.ticksExisted % 5 == 0 && action != Action.END)) {
            BlockPos spot = new BlockPos(entity);

            float height = getHeight();
            entity.motionX = entity.motionY = entity.motionZ = 0;

            if (stopCondition(spot)) {
                return false;
            } else if (isBlocked()) {
                action = Action.END;
            } else if (endCondition(spot)) {
                action = Action.END;
            } else if (height < flyHeight) {
                action = Action.GAIN_HEIGHT;
            } else if (height > flyHeight + 2) {
                action = Action.LOSE_HEIGHT;
            } else {
                action = Action.FLY;
            }
        }

        switch (action) {
            case END:
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

                break;
            case GAIN_HEIGHT:
                if (getHeight() >= flyHeight) {
                    entity.motionY = 0;
                    action = Action.FLY;
                } else {
                    entity.moveRelative(0, getSpeed(0.2F), 0.1F);
                    entity.motionY = getSpeed(0.6F);
                }

                break;
            case LOSE_HEIGHT:
                if (getHeight() < flyHeight + 0.5) {
                    entity.motionY = 0;
                    action = Action.FLY;
                } else {
                    entity.motionY = getSpeed(-0.7F);
                }

                break;
            case FLY:
                entity.moveRelative(0, getSpeed(1), 0.1F);
                entity.motionX += entity.getRNG().nextGaussian() * getSpeed(0.5F);
                entity.motionY += entity.getRNG().nextGaussian() * getSpeed(0.5F);
                entity.motionZ += entity.getRNG().nextGaussian() * getSpeed(0.5F);

                break;
        }

        return true;
    }

    @Override
    public void startExecuting() {
        additionalSetup();

        float currentHeight = getHeight();
        flyHeight = currentHeight > 2 ? currentHeight : (float) MathUtil.weightedRandom(entity.getRNG(), 1, 0.75F) + entity.getRNG().nextFloat();
        entity.rotationYaw = getRotation(new BlockPos(entity));
        entity.rotationYawHead = entity.rotationYaw;

        lastPosition = new Vec3d(0, -10, 0);

        action = Action.GAIN_HEIGHT;
    }

    protected void additionalSetup() { /* For overriding */ }

    protected int getRotation(BlockPos spot) {
        return entity.getRNG().nextInt(360);
    }

    protected boolean stopCondition(BlockPos spot) {
        return false;
    }

    private boolean isBlocked() {
        Vec3d entityPos = new Vec3d(entity.posX, entity.posY, entity.posZ);

        if (entityPos.distanceTo(lastPosition) < getSpeed(0.1F)) {
            return true;
        } else {
            lastPosition = entityPos;
            return false;
        }
    }
    protected boolean endCondition(BlockPos spot) {
        return entity.getRNG().nextInt(40) == 0 && isSpotGood(spot);
    }

    private float getSpeed(float times) {
        return entity.getAIMoveSpeed() * speedModifier * times;
    }

    protected boolean isSpotGood(BlockPos spot) {
        return EntityFireFly.isSpotViable(entity.worldObj, spot) && entity.worldObj.getNearestPlayerNotCreative(entity, 5.5F) == null;
    }

    protected float getHeight() {
        BlockPos pos = new BlockPos(entity);
        BlockPos nextBlock = WorldUtil.nextSolidBlock(entity.worldObj, pos, EnumFacing.DOWN);

        return (float) (entity.posY - nextBlock.getY());
    }

    protected enum Action {
        GAIN_HEIGHT, LOSE_HEIGHT, FLY, END
    }
}

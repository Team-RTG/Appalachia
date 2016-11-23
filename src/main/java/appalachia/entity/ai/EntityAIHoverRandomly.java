package appalachia.entity.ai;

import net.minecraft.entity.EntityFlying;
import net.minecraft.util.math.BlockPos;

public class EntityAIHoverRandomly extends EntityAIHoverBase {

    public EntityAIHoverRandomly(EntityFlying entity, float speedModifier) {

        super(entity, speedModifier);
    }

    @Override
    protected boolean isSpotGood(BlockPos spot) {

        return entity.ticksExisted % 50 == 0 && entity.getCanSpawnHere();
    }

    @Override
    public boolean shouldExecute() {

        return (entity.getRNG().nextInt(40) == 1 && entity.worldObj.getLightFromNeighbors(new BlockPos(entity)) < 8) || getHeight() > 1.3;
    }
}

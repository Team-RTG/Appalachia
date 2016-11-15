package appalachia.entity.monster;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaSounds;

public class EntityBlackBear extends EntityAnimal
{
    private static final DataParameter<Boolean> IS_STANDING = EntityDataManager.<Boolean>createKey(EntityBlackBear.class, DataSerializers.BOOLEAN);
    private float clientSideStandAnimation0;
    private float clientSideStandAnimation;
    private int warningSoundTicks;

    public EntityBlackBear(World worldIn)
    {
        super(worldIn);
        this.setSize(1.3F, 1.4F);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable)
    {
        return new EntityBlackBear(this.worldObj);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
        return false;
    }

    @Override
    protected void initEntityAI()
    {
        super.initEntityAI();
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityBlackBear.AIMeleeAttack());
        this.tasks.addTask(1, new EntityBlackBear.AIPanic());
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityBlackBear.AIHurtByTarget());
        this.targetTasks.addTask(2, new EntityBlackBear.AIAttackPlayer());
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        if (this.isChild()) {
            return AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_baby_idle);
        }
        else {
            return AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_idle);
        }
    }

    @Override
    protected SoundEvent getHurtSound()
    {
        return AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_hurt);
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_death);
    }

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_step), 0.15F, 1.0F);
    }

    protected void playWarningSound()
    {
        if (this.warningSoundTicks <= 0)
        {
            this.playSound(AppalachiaSounds.getRandomSound(AppalachiaSounds.entity_blackbear_warning), 1.0F, 1.0F);
            this.warningSoundTicks = 40;
        }
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_POLAR_BEAR;
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(IS_STANDING, Boolean.valueOf(false));
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (this.worldObj.isRemote)
        {
            this.clientSideStandAnimation0 = this.clientSideStandAnimation;

            if (this.isStanding())
            {
                this.clientSideStandAnimation = MathHelper.clamp_float(this.clientSideStandAnimation + 1.0F, 0.0F, 6.0F);
            }
            else
            {
                this.clientSideStandAnimation = MathHelper.clamp_float(this.clientSideStandAnimation - 1.0F, 0.0F, 6.0F);
            }
        }

        if (this.warningSoundTicks > 0)
        {
            --this.warningSoundTicks;
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }

    public boolean isStanding()
    {
        return ((Boolean)this.dataManager.get(IS_STANDING)).booleanValue();
    }

    public void setStanding(boolean standing)
    {
        this.dataManager.set(IS_STANDING, Boolean.valueOf(standing));
    }

    @SideOnly(Side.CLIENT)
    public float getStandingAnimationScale(float p_189795_1_)
    {
        return (this.clientSideStandAnimation0 + (this.clientSideStandAnimation - this.clientSideStandAnimation0) * p_189795_1_) / 6.0F;
    }

    @Override
    protected float getWaterSlowDown()
    {
        return 0.98F;
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata)
    {
        if (livingdata instanceof EntityBlackBear.GroupData)
        {
            if (((EntityBlackBear.GroupData)livingdata).madeParent)
            {
                this.setGrowingAge(-24000);
            }
        }
        else
        {
            EntityBlackBear.GroupData entityblackbear$groupdata = new EntityBlackBear.GroupData();
            entityblackbear$groupdata.madeParent = true;
            livingdata = entityblackbear$groupdata;
        }

        return (IEntityLivingData)livingdata;
    }

    class AIAttackPlayer extends EntityAINearestAttackableTarget<EntityPlayer>
    {
        public AIAttackPlayer()
        {
            super(EntityBlackBear.this, EntityPlayer.class, 20, true, true, null);
        }

        @Override
        public boolean shouldExecute()
        {
            if (EntityBlackBear.this.isChild())
            {
                return false;
            }
            else
            {
                if (super.shouldExecute())
                {
                    for (EntityBlackBear entityblackbear : EntityBlackBear.this.worldObj.getEntitiesWithinAABB(EntityBlackBear.class, EntityBlackBear.this.getEntityBoundingBox().expand(8.0D, 4.0D, 8.0D)))
                    {
                        if (entityblackbear.isChild())
                        {
                            return true;
                        }
                    }
                }

                EntityBlackBear.this.setAttackTarget((EntityLivingBase)null);
                return false;
            }
        }

        @Override
        protected double getTargetDistance()
        {
            return super.getTargetDistance() * 0.5D;
        }
    }

    class AIHurtByTarget extends EntityAIHurtByTarget
    {
        public AIHurtByTarget()
        {
            super(EntityBlackBear.this, false, new Class[0]);
        }

        @Override
        public void startExecuting()
        {
            super.startExecuting();

            if (EntityBlackBear.this.isChild())
            {
                this.alertOthers();
                this.resetTask();
            }
        }

        @Override
        protected void setEntityAttackTarget(EntityCreature creatureIn, EntityLivingBase entityLivingBaseIn)
        {
            if (creatureIn instanceof EntityBlackBear && !((EntityBlackBear)creatureIn).isChild())
            {
                super.setEntityAttackTarget(creatureIn, entityLivingBaseIn);
            }
        }
    }

    class AIMeleeAttack extends EntityAIAttackMelee
    {
        public AIMeleeAttack()
        {
            super(EntityBlackBear.this, 1.25D, true);
        }

        @Override
        protected void checkAndPerformAttack(EntityLivingBase p_190102_1_, double p_190102_2_)
        {
            double d0 = this.getAttackReachSqr(p_190102_1_);

            if (p_190102_2_ <= d0 && this.attackTick <= 0)
            {
                this.attackTick = 20;
                this.attacker.attackEntityAsMob(p_190102_1_);
                EntityBlackBear.this.setStanding(false);
            }
            else if (p_190102_2_ <= d0 * 2.0D)
            {
                if (this.attackTick <= 0)
                {
                    EntityBlackBear.this.setStanding(false);
                    this.attackTick = 20;
                }

                if (this.attackTick <= 10)
                {
                    EntityBlackBear.this.setStanding(true);
                    EntityBlackBear.this.playWarningSound();
                }
            }
            else
            {
                this.attackTick = 20;
                EntityBlackBear.this.setStanding(false);
            }
        }

        @Override
        public void resetTask()
        {
            EntityBlackBear.this.setStanding(false);
            super.resetTask();
        }

        @Override
        protected double getAttackReachSqr(EntityLivingBase attackTarget)
        {
            return (double)(4.0F + attackTarget.width);
        }
    }

    class AIPanic extends EntityAIPanic
    {
        public AIPanic()
        {
            super(EntityBlackBear.this, 2.0D);
        }

        @Override
        public boolean shouldExecute()
        {
            return !EntityBlackBear.this.isChild() && !EntityBlackBear.this.isBurning() ? false : super.shouldExecute();
        }
    }

    static class GroupData implements IEntityLivingData
    {
        public boolean madeParent;

        private GroupData()
        {
        }
    }
}
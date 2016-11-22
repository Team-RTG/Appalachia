package appalachia.entity.passive;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import appalachia.entity.ai.EntityAIFlyAwayFromEntity;
import appalachia.entity.ai.EntityAIFlyPanic;
import appalachia.entity.ai.EntityAIFlyRandomly;
import appalachia.loot.LootManager;
import appalachia.util.WorldUtil;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityFireFly extends EntityFlying {

    private static final DataParameter<Byte> color = EntityDataManager.createKey(EntityFireFly.class, DataSerializers.BYTE);
    private static final DataParameter<Boolean> flashStatus = EntityDataManager.createKey(EntityFireFly.class, DataSerializers.BOOLEAN);

    private boolean doFlash;
    private boolean sync;
    private int noFlashStatusChangeBefore;

    public EntityFireFly(World worldIn) {
        super(worldIn);
        this.setSize(0.15F, 0.15F);
        this.setAIMoveSpeed(0.125F);

        doFlash = true;
        setFlashStatus(false);
        sync = false;
    }

    public void setFlashStatus(boolean flashStatus) {
        if (isFlashing() != flashStatus) {
            dataManager.set(EntityFireFly.flashStatus, flashStatus);
        }
    }

    public boolean isFlashing() {
        return this.dataManager.get(flashStatus);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAIFlyPanic(this, 3));
        this.tasks.addTask(1, new EntityAIFlyAwayFromEntity(this, EntityPlayer.class, 2, 0.874F, 1.25F));
        this.tasks.addTask(2, new EntityAIFlyRandomly(this, 1));
        this.tasks.addTask(99, new EntityAILookIdle(this));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(-10.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.3);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(flashStatus, false);
        this.dataManager.register(color, (byte) Color.ERROR.ordinal());
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        if(isFlashing()) {
            return LootManager.FIREFLY_FLASHING;
        } else {
            return LootManager.FIREFLY;
        }
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (!worldObj.isRemote) {
            BlockPos pos = new BlockPos(this);

            if (ticksExisted % 30 == 0 && worldObj.getLightFromNeighbors(pos) > 9) {
                this.setHealth(this.getHealth() - 0.5F); // Entities will disappear in the sun to save performance, but only if they are grounded.
            }

            if (doFlash && getHealth() != 0 && worldObj.getLightFromNeighbors(pos) < 9) {
                if (sync) {
                    if (worldObj.getWorldTime() % 40 == 0) {
                        setFlashStatus(true);
                    } else if (worldObj.getWorldTime() % 40 == 10) {
                        setFlashStatus(false);
                    }
                } else if (ticksExisted > noFlashStatusChangeBefore) {
                    setFlashStatus(!isFlashing());
                    if (isFlashing()) {
                        noFlashStatusChangeBefore = ticksExisted + 5 + worldObj.rand.nextInt(10);
                    } else {
                        noFlashStatusChangeBefore = ticksExisted + 10 + worldObj.rand.nextInt(30);
                    }
                }
            }
        }
    }

    // Fire Flies only spawn on blocks that are "dirty".
    @Override
    public boolean getCanSpawnHere() {
        return isSpotViable(worldObj, new BlockPos(this));
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
        if (!worldObj.isRemote) {
            updateVariant();
        }

        noFlashStatusChangeBefore = worldObj.rand.nextInt(100);

        return super.onInitialSpawn(difficulty, livingdata);
    }

    @Override
    public boolean canBeLeashedTo(EntityPlayer player) {
        return false;
    }

    private void updateVariant() {
        Color color = Color.DEFAULT;

        BlockPos pos = WorldUtil.nextSolidBlock(worldObj, new BlockPos(this), EnumFacing.DOWN);
        IBlockState block = worldObj.getBlockState(pos);

        if (block.getBlock().equals(Blocks.DIRT) && block.getBlock().getMetaFromState(block) == 0) {
            color = Color.DIRT;
        } else if (block.getMaterial().equals(Material.GROUND)) {
            color = Color.PODZOL;
        } else if (block.getBlock().equals(Blocks.GRASS)) {
            color = Color.GRASS;
        } else if (block.getBlock().equals(Blocks.MYCELIUM)) {
            color = Color.MYCELIUM;
        }

        if (hasCustomName()) {
            applyEasterEggs(getCustomNameTag());
        }

        setColor(color);
    }

    private void applyEasterEggs(String name) {
        switch (name) {
            case "WhichOnesPink":
                setColor(Color.MYCELIUM);
                break;
            case "lightningo7":
                doFlash = false;
                setFlashStatus(true);
                break;
            case "garantiertnicht":
                doFlash = false;
                setFlashStatus(false);
                break;
            default:
                break;
        }
    }

    public static boolean isSpotViable(World world, BlockPos pos) {
        if (world.getLightFromNeighbors(pos) > 7) {
            return false;
        }

        while (WorldUtil.isNotSolid(world, pos)) {
            pos = pos.down();
        }

        for (byte i = 1; i < 4; i++) {
            if (!WorldUtil.isNotSolid(world, pos.up(i))) {
                return false;
            }
        }

        IBlockState state = world.getBlockState(pos);
        return (state.getMaterial().equals(Material.GRASS) || state.getMaterial().equals(Material.GROUND) && state.getBlock().isReplaceable(world, pos) && !state.getBlock().hasTileEntity(state));
    }

    @Override
    @Nonnull
    public NBTTagCompound writeToNBT(@Nonnull NBTTagCompound compound) {
        compound.setByte("color", (byte) getColor().ordinal());
        compound.setBoolean("flashes", doFlash);
        compound.setBoolean("sync", sync);
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        Color color;

        try {
            color = Color.values()[compound.getInteger("color")];
        } catch (ArrayIndexOutOfBoundsException exception) {
            color = Color.DEFAULT;
        }

        doFlash = compound.getBoolean("flashes");
        sync = compound.getBoolean("sync");

        setColor(color);
        super.readFromNBT(compound);
    }

    @Override
    public void setCustomNameTag(@Nonnull String name) {
        applyEasterEggs(name);
        super.setCustomNameTag(name);
    }

    @Override
    public float getEyeHeight() {
        return 0.07F;
    }

    @Nonnull
    public Color getColor() {
        try {
            return Color.values()[this.dataManager.get(color)];
        } catch (ArrayIndexOutOfBoundsException exception) {
            return Color.ERROR;
        }
    }

    public void setColor(Color newColor) {
        this.dataManager.set(color, (byte) newColor.ordinal());
    }

    public enum Color {
        GRASS(0.2F, 0.25F, 0.1F), DIRT(0.23F, 0.13F, 0.05F), MYCELIUM(1F, 0.65F, 0.65F), PODZOL(0.15F, 0.1F, 0.05F), DEFAULT(0.3F, 0.3F, 0.3F), ERROR(1, 0, 0);

        private float red;
        private float green;
        private float blue;

        Color(float red, float green, float blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public float getRed() {
            return red;
        }

        public float getGreen() {
            return green;
        }

        public float getBlue() {
            return blue;
        }
    }
}

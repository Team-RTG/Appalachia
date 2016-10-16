package appalachia.entity;

import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.world.World;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;

import appalachia.Appalachia;
import appalachia.entity.monster.EntityBlackBear;
import appalachia.util.Logger;
import com.google.common.collect.Maps;

public class EntityManager
{

    public static final Map<Integer, EntityEggInfo> entityEggs = Maps.<Integer, EntityEggInfo>newLinkedHashMap();
    public static final Map<Integer, String> idToEntityName = Maps.<Integer, String>newLinkedHashMap();

    private static int nextEntityId = 1;

    public static void registerEntities()
    {
        registerEntityWithSpawnEgg(EntityBlackBear.class, "blackbear", 80, 3, true, 0x000000, 0x80511a);
    }

    // register an entity
    public static int registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
    {
        int entityId = nextEntityId++;
        EntityRegistry.registerModEntity(entityClass, entityName, entityId, Appalachia.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
        idToEntityName.put(entityId, entityName);
        return entityId;
    }

    // register an entity and in addition create a spawn egg for it
    public static int registerEntityWithSpawnEgg(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int eggBackgroundColor, int eggForegroundColor)
    {
        int entityId = registerEntity(entityClass, entityName, trackingRange, updateFrequency, sendsVelocityUpdates);
        entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityName, eggBackgroundColor, eggForegroundColor));
        return entityId;
    }


    public static Entity createEntityByID(int entityId, World worldIn)
    {
        Entity entity = null;
        ModContainer mc = FMLCommonHandler.instance().findContainerFor(Appalachia.instance);
        EntityRegistration er = EntityRegistry.instance().lookupModSpawn(mc, entityId);
        if (er != null)
        {
            Class<? extends Entity> clazz = er.getEntityClass();
            try
            {
                if (clazz != null)
                {
                    entity = (Entity)clazz.getConstructor(new Class[] {World.class}).newInstance(new Object[] {worldIn});
                }
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        if (entity == null)
        {
            Logger.warn("Skipping Appalachia entity with id " + entityId);
        }
        return entity;
    }


}
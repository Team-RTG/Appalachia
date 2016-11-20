package appalachia.entity;

import appalachia.client.renderer.entity.RenderFireFly;
import appalachia.entity.passive.EntityFireFly;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.Appalachia;
import appalachia.client.renderer.entity.RenderBlackBear;
import appalachia.entity.monster.EntityBlackBear;

public class EntityManager
{
    public static void registerEntities() {

        int id = 1;

        EntityRegistry.registerModEntity(EntityBlackBear.class, "BlackBear", id++, Appalachia.instance, 64, 3, true, 0x000000, 0x80511a);
        EntityRegistry.registerModEntity(EntityFireFly.class, "FireFly", id++, Appalachia.instance, 64, 3, true, 0x110000, 0xFFFF00);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        //EntityRegistry.addSpawn(EntityWeirdZombie.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);

        // This is the loot table for our mob
        //LootTableList.register(EntityPolarBear.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityBlackBear.class, RenderBlackBear.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityFireFly.class, RenderFireFly.FACTORY);
    }
}
package appalachia.client.sound;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import net.minecraftforge.fml.common.registry.GameRegistry;

import appalachia.reference.ModInfo;
import static appalachia.api.AppalachiaSounds.*;

public class SoundManager
{
    public static void registerSounds()
    {
        entity_black_bear_ambient = registerSound("entity.blackbear.ambient");
        entity_black_bear_hurt = registerSound("entity.blackbear.hurt");
        entity_black_bear_death = registerSound("entity.blackbear.death");
        entity_black_bear_step = registerSound("entity.blackbear.step");
        entity_black_bear_warning = registerSound("entity.blackbear.warning");
        entity_black_bear_baby_ambient = registerSound("entity.blackbear_baby.ambient");
    }

    private static SoundEvent registerSound(String soundName)
    {
        ResourceLocation location = new ResourceLocation(ModInfo.MOD_ID, soundName);
        SoundEvent event = new SoundEvent(location);
        GameRegistry.register(event, location);

        return event;
    }
}
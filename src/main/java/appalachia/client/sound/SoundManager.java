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
        entity_blackbear_idle1 = registerSound("entity.blackbear.idle1");
        entity_blackbear_idle2 = registerSound("entity.blackbear.idle2");
        entity_blackbear_idle3 = registerSound("entity.blackbear.idle3");
        entity_blackbear_idle4 = registerSound("entity.blackbear.idle4");
        entity_blackbear_step1 = registerSound("entity.blackbear.step1");
        entity_blackbear_step2 = registerSound("entity.blackbear.step2");
        entity_blackbear_step3 = registerSound("entity.blackbear.step3");
        entity_blackbear_step4 = registerSound("entity.blackbear.step4");
        entity_blackbear_hurt1 = registerSound("entity.blackbear.hurt1");
        entity_blackbear_hurt2 = registerSound("entity.blackbear.hurt2");
        entity_blackbear_hurt3 = registerSound("entity.blackbear.hurt3");
        entity_blackbear_hurt4 = registerSound("entity.blackbear.hurt4");
        entity_blackbear_warning1 = registerSound("entity.blackbear.warning1");
        entity_blackbear_warning2 = registerSound("entity.blackbear.warning2");
        entity_blackbear_warning3 = registerSound("entity.blackbear.warning3");
        entity_blackbear_death1 = registerSound("entity.blackbear.death1");
        entity_blackbear_death2 = registerSound("entity.blackbear.death2");
        entity_blackbear_death3 = registerSound("entity.blackbear.death3");
        entity_blackbear_baby_idle1 = registerSound("entity.blackbear_baby.idle1");
        entity_blackbear_baby_idle2 = registerSound("entity.blackbear_baby.idle2");
        entity_blackbear_baby_idle3 = registerSound("entity.blackbear_baby.idle3");
        entity_blackbear_baby_idle4 = registerSound("entity.blackbear_baby.idle4");

        entity_blackbear_idle = new SoundEvent[]{
            entity_blackbear_idle1, entity_blackbear_idle2, entity_blackbear_idle3, entity_blackbear_idle4
        };

        entity_blackbear_step = new SoundEvent[]{
            entity_blackbear_step1, entity_blackbear_step2, entity_blackbear_step3, entity_blackbear_step4
        };

        entity_blackbear_hurt = new SoundEvent[]{
            entity_blackbear_hurt1, entity_blackbear_hurt2, entity_blackbear_hurt3, entity_blackbear_hurt4
        };

        entity_blackbear_warning = new SoundEvent[]{
            entity_blackbear_warning1, entity_blackbear_warning2, entity_blackbear_warning3
        };

        entity_blackbear_death = new SoundEvent[]{
            entity_blackbear_death1, entity_blackbear_death2, entity_blackbear_death3
        };

        entity_blackbear_baby_idle = new SoundEvent[]{
            entity_blackbear_baby_idle1, entity_blackbear_baby_idle2, entity_blackbear_baby_idle3, entity_blackbear_baby_idle4
        };
    }

    private static SoundEvent registerSound(String soundName)
    {
        ResourceLocation location = new ResourceLocation(ModInfo.MOD_ID, soundName);
        SoundEvent event = new SoundEvent(location);
        GameRegistry.register(event, location);

        return event;
    }
}
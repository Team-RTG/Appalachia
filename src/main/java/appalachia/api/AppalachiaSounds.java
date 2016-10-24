package appalachia.api;

import net.minecraft.util.SoundEvent;

public class AppalachiaSounds {

    public static SoundEvent entity_blackbear_idle1;
    public static SoundEvent entity_blackbear_idle2;
    public static SoundEvent entity_blackbear_idle3;
    public static SoundEvent entity_blackbear_idle4;
    public static SoundEvent entity_blackbear_step1;
    public static SoundEvent entity_blackbear_step2;
    public static SoundEvent entity_blackbear_step3;
    public static SoundEvent entity_blackbear_step4;
    public static SoundEvent entity_blackbear_hurt1;
    public static SoundEvent entity_blackbear_hurt2;
    public static SoundEvent entity_blackbear_hurt3;
    public static SoundEvent entity_blackbear_hurt4;
    public static SoundEvent entity_blackbear_warning1;
    public static SoundEvent entity_blackbear_warning2;
    public static SoundEvent entity_blackbear_warning3;
    public static SoundEvent entity_blackbear_death1;
    public static SoundEvent entity_blackbear_death2;
    public static SoundEvent entity_blackbear_death3;
    public static SoundEvent entity_blackbear_baby_idle1;
    public static SoundEvent entity_blackbear_baby_idle2;
    public static SoundEvent entity_blackbear_baby_idle3;
    public static SoundEvent entity_blackbear_baby_idle4;

    public static SoundEvent[] entity_blackbear_idle;
    public static SoundEvent[] entity_blackbear_step;
    public static SoundEvent[] entity_blackbear_hurt;
    public static SoundEvent[] entity_blackbear_warning;
    public static SoundEvent[] entity_blackbear_death;
    public static SoundEvent[] entity_blackbear_baby_idle;

    public static SoundEvent getRandomSound(SoundEvent[] sounds) {

        if (sounds.length > 0) {
            return sounds[AppalachiaAPI.rand.nextInt(sounds.length)];
        }
        else {
            throw new RuntimeException("Can't get random sound when there are no sounds.");
        }
    }
}

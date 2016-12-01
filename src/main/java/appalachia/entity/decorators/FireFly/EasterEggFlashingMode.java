package appalachia.entity.decorators.FireFly;

import javax.annotation.Nonnull;

import appalachia.entity.decorators.EntityDecorator;
import appalachia.entity.passive.EntityFireFly;

public class EasterEggFlashingMode implements EntityDecorator<EntityFireFly> {
    boolean sync;
    boolean doesFlash;
    boolean flashStatus;

    EntityFireFly fireFly;

    public EasterEggFlashingMode(@Nonnull EntityFireFly fireFly, boolean sync, boolean doesFlash, boolean flashStatus) {
        this.sync = fireFly.isSync();
        this.doesFlash = fireFly.isDoFlash();
        this.flashStatus = fireFly.isFlashing();
        this.fireFly = fireFly;

        fireFly.setSync(sync);
        fireFly.setDoFlash(doesFlash);
        fireFly.setFlashStatus(flashStatus);
    }

    @Override
    public void removeDecorator() {
        fireFly.setSync(sync);
        fireFly.setDoFlash(doesFlash);
        fireFly.setFlashStatus(flashStatus);
    }
}

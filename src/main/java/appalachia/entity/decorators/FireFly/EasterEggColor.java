package appalachia.entity.decorators.FireFly;

import javax.annotation.Nonnull;

import appalachia.entity.decorators.EntityDecorator;
import appalachia.entity.passive.EntityFireFly;
import appalachia.entity.passive.EntityFireFly.Color;

public class EasterEggColor implements EntityDecorator<EntityFireFly> {
    EntityFireFly fireFly;
    EntityFireFly.Color oldColor;

    public EasterEggColor(@Nonnull EntityFireFly fireFly, @Nonnull Color newColor) {
        this.fireFly = fireFly;
        this.oldColor = fireFly.getColor();
        fireFly.setColor(newColor);
    }

    @Override
    public void removeDecorator() {
        fireFly.setColor(oldColor);
    }
}

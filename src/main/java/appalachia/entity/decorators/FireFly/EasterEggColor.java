package appalachia.entity.decorators.FireFly;

import appalachia.entity.decorators.EntityDecorator;
import appalachia.entity.passive.EntityFireFly;
import appalachia.entity.passive.EntityFireFly.Color;

public class EasterEggColor implements EntityDecorator<EntityFireFly> {
    EntityFireFly fireFly;
    EntityFireFly.Color oldColor;

    public EasterEggColor(EntityFireFly fireFly, Color newColor) {
        this.fireFly = fireFly;
        this.oldColor = fireFly.getColor();
        fireFly.setColor(newColor);
    }

    @Override
    public void removeDecorator() {
        fireFly.setColor(oldColor);
    }
}

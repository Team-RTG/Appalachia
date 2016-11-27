
package climateControl.biomeSettings;

import climateControl.api.BiomePackage;
import climateControl.api.BiomeSettings;
import biomesoplenty.api.biome.BOPBiomes;

/**
 *
 * @author Zeno410
 */
public class BopPackage extends BiomePackage {

    public BopPackage() {
        super("biomesoplentyInCC.cfg");
        // confirm Highlands is there.
        Class biomesClass = BOPBiomes.class;
        try {
            int throwaway = BOPBiomes.alps.hashCode();
        } catch (NullPointerException e) {
            //not yet set is fine, this is testing for the field
        }
    }

    @Override
    public BiomeSettings freshBiomeSetting() {
        return new BoPSettings();
    }

}

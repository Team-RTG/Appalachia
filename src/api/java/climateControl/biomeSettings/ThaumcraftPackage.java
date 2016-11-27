
package climateControl.biomeSettings;

import climateControl.api.BiomePackage;
import climateControl.api.BiomeSettings;

/**
 *
 * @author Zeno410
 */
public class ThaumcraftPackage extends BiomePackage {

    public ThaumcraftPackage() {
        super("ThaumcraftInCC.cfg");
        // confirm Thaumcraft is there.
        //Class nodesClass = MaterialTaint.class;
    }

    @Override
    public BiomeSettings freshBiomeSetting() {
        return new ThaumcraftBiomeSettings();
    }

}

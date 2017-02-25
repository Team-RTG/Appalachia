package appalachia.rtg.world.biome.deco;

import net.minecraft.world.gen.feature.WorldGenerator;

import rtg.api.world.deco.DecoTree;
import rtg.api.world.gen.feature.tree.rtg.TreeRTG;

/**
 * @author WhichOnesPink
 */
public class DecoAPLTree extends DecoTree {

    public DecoAPLTree() {
        super();
        this.setDefaults();
    }

    public DecoAPLTree(DecoTree source) {
        super(source);
        this.setDefaults();
    }

    public DecoAPLTree(TreeRTG tree) {
        super(tree);
        this.setDefaults();
    }

    public DecoAPLTree(WorldGenerator worldGen) {
        super(worldGen);
        this.setDefaults();
    }

    protected void setDefaults() {

        /**
         * Default values.
         * These can be overridden when configuring the Deco object in the realistic biome.
         */
        this.setTreeCondition(TreeCondition.RANDOM_CHANCE);
    }
}

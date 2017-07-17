package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Cornus Florida (Flowering Dogwood)
 * <p>
 * This tree was designed by Lentebriesje and released as part of the 'Custom Tree Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/native-trees-of-europe-template-repository-1779952/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeFloweringDogwoodSmall extends TreeFloweringDogwood {

    public TreeFloweringDogwoodSmall() {
        super();

        this.firstBlockOffsetX = 3;
        this.firstBlockOffsetZ = 3;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);

        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        ArrayList<BlockPos> groundPos = new ArrayList<BlockPos>(){};
        groundPos.add(new BlockPos(x+3, y, z+3));

        for (int i = 0; i < groundPos.size(); i++) {
            if (!isValidGroundBlock(world, rand, groundPos.get(i), 1)) {
                return false;
            }
        }

        this.spawn(world, x, y, z, this.logBlock, this.leavesBlock);

        return true;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    @Override
    protected void spawn(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y;

        this.setBlockState(new BlockPos(x+3, y+0, z+3), log);
        this.setBlockState(new BlockPos(x+3, y+1, z+3), log);
        this.setBlockState(new BlockPos(x+1, y+2, z+1), leaves);
        this.setBlockMetadataWithNotify(x+1, y+2, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+2, z+1), leaves);
        this.setBlockState(new BlockPos(x+3, y+2, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, y+2, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+2, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, y+2, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+0, y+2, z+2), leaves);
        this.setBlockMetadataWithNotify(x+0, y+2, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+2, z+2), leaves);
        this.setBlockState(new BlockPos(x+2, y+2, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, y+2, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+2, z+2), leaves);
        this.setBlockState(new BlockPos(x+4, y+2, z+2), leaves);
        this.setBlockState(new BlockPos(x+1, y+2, z+3), leaves);
        this.setBlockState(new BlockPos(x+2, y+2, z+3), leaves);
        this.setBlockMetadataWithNotify(x+2, y+2, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+2, z+3), log);
        this.setBlockState(new BlockPos(x+4, y+2, z+3), leaves);
        this.setBlockState(new BlockPos(x+5, y+2, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, y+2, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+2, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, y+2, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+2, z+4), leaves);
        this.setBlockState(new BlockPos(x+5, y+2, z+4), leaves);
        this.setBlockState(new BlockPos(x+1, y+2, z+5), leaves);
        this.setBlockMetadataWithNotify(x+1, y+2, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+2, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, y+2, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+2, z+5), leaves);
        this.setBlockState(new BlockPos(x+4, y+2, z+5), leaves);
        this.setBlockMetadataWithNotify(x+4, y+2, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+2, z+5), leaves);
        this.setBlockMetadataWithNotify(x+5, y+2, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+2, z+6), leaves);
        this.setBlockMetadataWithNotify(x+1, y+2, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+2, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, y+2, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+2, z+6), leaves);
        this.setBlockMetadataWithNotify(x+5, y+2, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+0), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+0, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+1), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+3, z+1), leaves);
        this.setBlockMetadataWithNotify(x+4, y+3, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+3, z+1), leaves);
        this.setBlockMetadataWithNotify(x+5, y+3, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+2), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+3, z+2), leaves);
        this.setBlockMetadataWithNotify(x+3, y+3, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+3, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, y+3, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+3, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, y+3, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+3, z+3), log);
        this.setBlockState(new BlockPos(x+4, y+3, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, y+3, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+3, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, y+3, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+6, y+3, z+3), leaves);
        this.setBlockMetadataWithNotify(x+6, y+3, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+0, y+3, z+4), leaves);
        this.setBlockMetadataWithNotify(x+0, y+3, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+3, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, y+3, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+3, z+4), leaves);
        this.setBlockMetadataWithNotify(x+4, y+3, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+3, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, y+3, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+3, z+5), leaves);
        this.setBlockMetadataWithNotify(x+1, y+3, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+3, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, y+3, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+3, z+6), leaves);
        this.setBlockMetadataWithNotify(x+2, y+3, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+3, z+6), leaves);
        this.setBlockMetadataWithNotify(x+3, y+3, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+3, z+6), leaves);
        this.setBlockMetadataWithNotify(x+4, y+3, z+6, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+4, z+1), leaves);
        this.setBlockMetadataWithNotify(x+3, y+4, z+1, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+4, z+2), leaves);
        this.setBlockMetadataWithNotify(x+5, y+4, z+2, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+4, z+3), leaves);
        this.setBlockMetadataWithNotify(x+1, y+4, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+4, z+3), leaves);
        this.setBlockMetadataWithNotify(x+3, y+4, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+4, y+4, z+3), leaves);
        this.setBlockMetadataWithNotify(x+4, y+4, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+4, z+3), leaves);
        this.setBlockMetadataWithNotify(x+5, y+4, z+3, 12, 12);
        this.setBlockState(new BlockPos(x+1, y+4, z+4), leaves);
        this.setBlockMetadataWithNotify(x+1, y+4, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+4, z+4), leaves);
        this.setBlockMetadataWithNotify(x+2, y+4, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+4, z+4), leaves);
        this.setBlockMetadataWithNotify(x+3, y+4, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+5, y+4, z+4), leaves);
        this.setBlockMetadataWithNotify(x+5, y+4, z+4, 12, 12);
        this.setBlockState(new BlockPos(x+2, y+4, z+5), leaves);
        this.setBlockMetadataWithNotify(x+2, y+4, z+5, 12, 12);
        this.setBlockState(new BlockPos(x+3, y+4, z+5), leaves);
        this.setBlockMetadataWithNotify(x+3, y+4, z+5, 12, 12);
        currentY++;
    }
}

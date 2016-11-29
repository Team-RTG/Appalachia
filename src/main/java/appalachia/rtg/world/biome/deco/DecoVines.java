package appalachia.rtg.world.biome.deco;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import net.minecraftforge.event.terraingen.TerrainGen;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS;

import appalachia.rtg.world.gen.feature.WorldGenVinesAPL;

import rtg.util.CellNoise;
import rtg.util.OpenSimplexNoise;
import rtg.world.biome.deco.DecoBase;
import rtg.world.biome.realistic.RealisticBiomeBase;

/**
 * @author WhichOnesPink
 */
public class DecoVines extends DecoBase {

    public int loops;
    public float strengthFactor;
    public Block vineBlock;
    public int minY;
    public int maxY;
    public PropertyBool propNorth;
    public PropertyBool propEast;
    public PropertyBool propSouth;
    public PropertyBool propWest;

    protected WorldGenerator worldGenerator;

    public DecoVines() {

        super();

        this.loops = 1;
        this.strengthFactor = 0f;
        this.minY = 63;
        this.maxY = 200;
        this.vineBlock = Blocks.VINE;
        this.propNorth = BlockVine.NORTH;
        this.propEast = BlockVine.EAST;
        this.propSouth = BlockVine.SOUTH;
        this.propWest = BlockVine.WEST;

        this.addDecoTypes(DecoType.VINE);
    }

    @Override
    public boolean properlyDefined() {

        try {
            IBlockState vineTest = this.vineBlock.getDefaultState()
                .withProperty(this.propNorth, true)
                .withProperty(this.propEast, false)
                .withProperty(this.propSouth, false)
                .withProperty(this.propWest, false);
        }
        catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public void generate(RealisticBiomeBase biome, World world, Random rand, int worldX, int worldY, OpenSimplexNoise simplex, CellNoise cell, float strength, float river, boolean hasPlacedVillageBlocks) {

        if (this.allowed) {

            if (TerrainGen.decorate(world, rand, new BlockPos(worldX, 0, worldY), GRASS)) {

                this.worldGenerator = new WorldGenVinesAPL(this.vineBlock, this.maxY, this.propNorth, this.propEast, this.propSouth, this.propWest);

                this.loops = (this.strengthFactor > 0f) ? (int) (this.strengthFactor * strength) : this.loops;
                for (int i = 0; i < this.loops; i++) {

                    int intX = worldX + rand.nextInt(16);// + 8;
                    int intZ = worldY + rand.nextInt(16);// + 8;
                    int intY = this.minY;

                    worldGenerator.generate(world, rand, new BlockPos(intX, intY, intZ));
                }
            }
        }
    }
}

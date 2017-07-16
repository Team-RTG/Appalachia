package appalachia.rtg.world.biome.deco;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;

import net.minecraftforge.event.terraingen.TerrainGen;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;

import appalachia.block.BlockManager;
import appalachia.rtg.world.gen.feature.WorldGenPlantsAPL;

import rtg.api.util.RandomUtil;
import rtg.api.world.IRTGWorld;
import rtg.api.world.biome.IRealisticBiome;
import rtg.api.world.deco.DecoBase;

/**
 * @author WhichOnesPink
 */
public class DecoPlants extends DecoBase {

    private ArrayList<IBlockState> plants;
    private float strengthFactor; // Higher = more plants.
    private int minY; // Height restriction.
    private int maxY; // Height restriction.
    private HeightType heightType; // How we determine the Y coord.
    private int chance; // Higher = more rare.
    private int notEqualsZeroChance;
    private int loops;

    public DecoPlants() {

        super();

        initPlants();

        /**
         * Default values.
         * These can be overridden when configuring the Deco object in the realistic biome.
         */
        this.setChance(1); // 100% chance of generating by default.
        this.setNotEqualsZeroChance(1);
        this.setMinY(1);
        this.setMaxY(253); // 2 below max build height to account for 2-block tall plants.
        this.setHeightType(HeightType.GET_HEIGHT_VALUE);
        this.setStrengthFactor(0f);
        this.setLoops(1);

        this.addDecoTypes(DecoType.FLOWER);
    }

    @Override
    public boolean properlyDefined() {
        return this.getPlants().size() > 0;
    }

    @Override
    public void generate(IRealisticBiome biome, IRTGWorld rtgWorld, Random rand, int worldX, int worldZ, float strength, float river, boolean hasPlacedVillageBlocks) {

        if (this.allowed) {

            if (TerrainGen.decorate(rtgWorld.world(), rand, new BlockPos(worldX, 0, worldZ), FLOWERS)) {

                WorldGenerator worldGenerator = new WorldGenPlantsAPL(this.plants);

                this.setLoops((this.strengthFactor > 0f) ? (int) (this.strengthFactor * strength) : this.loops);

                for (int i = 0; i < this.loops * 16; i++) {
                    int intX = worldX + rand.nextInt(16);// + 8;
                    int intZ = worldZ + rand.nextInt(16);// + 8;

                    int intY;
                    switch (this.heightType) {
                        case NEXT_INT:
                            intY = RandomUtil.getRandomInt(rand, this.minY, this.maxY);
                            break;

                        case GET_HEIGHT_VALUE:
                            intY = rtgWorld.world().getHeight(new BlockPos(intX, 0, intZ)).getY();
                            break;

                        default:
                            intY = rand.nextInt(this.maxY);
                            break;

                    }

                    if (this.notEqualsZeroChance > 1) {

                        if (rand.nextInt(this.notEqualsZeroChance) != 0) {

                            worldGenerator.generate(rtgWorld.world(), rand, new BlockPos(intX, intY, intZ));
                        }
                    }
                    else {

                        if (rand.nextInt(this.chance) == 0) {

                            worldGenerator.generate(rtgWorld.world(), rand, new BlockPos(intX, intY, intZ));
                        }
                    }
                }
            }
        }
    }

    public enum HeightType {
        NEXT_INT,
        GET_HEIGHT_VALUE;
    }

    public ArrayList<IBlockState> getPlants() {

        return plants;
    }

    public DecoPlants setPlants(ArrayList<IBlockState> plants) {

        this.plants = plants;
        return this;
    }

    public float getStrengthFactor() {

        return strengthFactor;
    }

    public DecoPlants setStrengthFactor(float strengthFactor) {

        this.strengthFactor = strengthFactor;
        return this;
    }

    public int getMinY() {

        return minY;
    }

    public DecoPlants setMinY(int minY) {

        this.minY = minY;
        return this;
    }

    public int getMaxY() {

        return maxY;
    }

    public DecoPlants setMaxY(int maxY) {

        this.maxY = maxY;
        return this;
    }

    public HeightType getHeightType() {

        return heightType;
    }

    public DecoPlants setHeightType(HeightType heightType) {

        this.heightType = heightType;
        return this;
    }

    public int getChance() {

        return chance;
    }

    public DecoPlants setChance(int chance) {

        this.chance = chance;
        return this;
    }

    public int getNotEqualsZeroChance() {

        return notEqualsZeroChance;
    }

    public DecoPlants setNotEqualsZeroChance(int notEqualsZeroChance) {

        this.notEqualsZeroChance = notEqualsZeroChance;
        return this;
    }

    public int getLoops() {

        return loops;
    }

    public DecoPlants setLoops(int loops) {

        this.loops = loops;
        return this;
    }

    private void initPlants() {

        this.plants = new ArrayList<IBlockState>(){};

        for (Block plant : BlockManager.appalachiaPlants) {
            this.plants.add(plant.getDefaultState());
        }
    }
}

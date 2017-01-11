
package appalachia.api.biome;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.feature.*;

import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class AppalachiaBiomeDecorator extends BiomeDecorator {

    public boolean generatePonds;

    public AppalachiaBiomeDecorator() {

        this.generateLakes = false;
        this.generatePonds = false;
    }

    @Override
    public void decorate(World worldIn, Random random, Biome biome, BlockPos pos) {

        if (this.decorating) {
            throw new RuntimeException("Already decorating");
        }
        else {
            this.chunkProviderSettings = ChunkProviderSettings.Factory.jsonToFactory(worldIn.getWorldInfo().getGeneratorOptions()).build();
            this.chunkPos = pos;
            this.dirtGen = new WorldGenMinable(Blocks.DIRT.getDefaultState(), this.chunkProviderSettings.dirtSize);
            this.gravelGen = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(), this.chunkProviderSettings.gravelSize);
            this.graniteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), this.chunkProviderSettings.graniteSize);
            this.dioriteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), this.chunkProviderSettings.dioriteSize);
            this.andesiteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), this.chunkProviderSettings.andesiteSize);
            this.coalGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(), this.chunkProviderSettings.coalSize);
            this.ironGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), this.chunkProviderSettings.ironSize);
            this.goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), this.chunkProviderSettings.goldSize);
            this.redstoneGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), this.chunkProviderSettings.redstoneSize);
            this.diamondGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), this.chunkProviderSettings.diamondSize);
            this.lapisGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), this.chunkProviderSettings.lapisSize);
            this.generateOres(worldIn, random);
            this.decorating = false;
        }
    }

    protected void generateSand(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.SAND)) {
            for (int i = 0; i < this.sandPerChunk2; ++i) {
                int j = random.nextInt(16) + 8;
                int k = random.nextInt(16) + 8;
                this.sandGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(j, 0, k)));
            }
        }
    }

    protected void generateClay(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.CLAY)) {
            for (int i1 = 0; i1 < this.clayPerChunk; ++i1) {
                int l1 = random.nextInt(16) + 8;
                int i6 = random.nextInt(16) + 8;
                this.clayGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(l1, 0, i6)));
            }
        }
    }

    protected void generateGravelAsSand(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.SAND_PASS2)) {
            for (int j1 = 0; j1 < this.sandPerChunk; ++j1) {
                int i2 = random.nextInt(16) + 8;
                int j6 = random.nextInt(16) + 8;
                this.gravelAsSandGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(i2, 0, j6)));
            }
        }
    }

    protected void generateTrees(Biome biomeIn, World worldIn, Random random) {

        int k1 = this.treesPerChunk;

        if (random.nextFloat() < this.extraTreeChance) {
            ++k1;
        }

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.TREE)) {
            for (int j2 = 0; j2 < k1; ++j2) {
                int k6 = random.nextInt(16) + 8;
                int l = random.nextInt(16) + 8;
                WorldGenAbstractTree worldgenabstracttree = biomeIn.genBigTreeChance(random);
                worldgenabstracttree.setDecorationDefaults();
                BlockPos blockpos = worldIn.getHeight(this.chunkPos.add(k6, 0, l));

                if (worldgenabstracttree.generate(worldIn, random, blockpos)) {
                    worldgenabstracttree.generateSaplings(worldIn, random, blockpos);
                }
            }
        }
    }

    protected void generateBigMushrooms(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.BIG_SHROOM)) {
            for (int k2 = 0; k2 < this.bigMushroomsPerChunk; ++k2) {
                int l6 = random.nextInt(16) + 8;
                int k10 = random.nextInt(16) + 8;
                this.bigMushroomGen.generate(worldIn, random, worldIn.getHeight(this.chunkPos.add(l6, 0, k10)));
            }
        }
    }

    protected void generateFlowers(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.FLOWERS)) {
            for (int l2 = 0; l2 < this.flowersPerChunk; ++l2) {
                int i7 = random.nextInt(16) + 8;
                int l10 = random.nextInt(16) + 8;
                int j14 = worldIn.getHeight(this.chunkPos.add(i7, 0, l10)).getY() + 32;

                if (j14 > 0) {
                    int k17 = random.nextInt(j14);
                    BlockPos blockpos1 = this.chunkPos.add(i7, k17, l10);
                    BlockFlower.EnumFlowerType blockflower$enumflowertype = biomeIn.pickRandomFlower(random, blockpos1);
                    BlockFlower blockflower = blockflower$enumflowertype.getBlockType().getBlock();

                    if (blockflower.getDefaultState().getMaterial() != Material.AIR) {
                        this.yellowFlowerGen.setGeneratedBlock(blockflower, blockflower$enumflowertype);
                        this.yellowFlowerGen.generate(worldIn, random, blockpos1);
                    }
                }
            }
        }
    }

    protected void generateGrass(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.GRASS)) {
            for (int i3 = 0; i3 < this.grassPerChunk; ++i3) {
                int j7 = random.nextInt(16) + 8;
                int i11 = random.nextInt(16) + 8;
                int k14 = worldIn.getHeight(this.chunkPos.add(j7, 0, i11)).getY() * 2;

                if (k14 > 0) {
                    int l17 = random.nextInt(k14);
                    biomeIn.getRandomWorldGenForGrass(random).generate(worldIn, random, this.chunkPos.add(j7, l17, i11));
                }
            }
        }
    }

    protected void generateDeadBushes(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.DEAD_BUSH)) {
            for (int j3 = 0; j3 < this.deadBushPerChunk; ++j3) {
                int k7 = random.nextInt(16) + 8;
                int j11 = random.nextInt(16) + 8;
                int l14 = worldIn.getHeight(this.chunkPos.add(k7, 0, j11)).getY() * 2;

                if (l14 > 0) {
                    int i18 = random.nextInt(l14);
                    (new WorldGenDeadBush()).generate(worldIn, random, this.chunkPos.add(k7, i18, j11));
                }
            }
        }
    }

    protected void generateLilypads(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.LILYPAD)) {
            for (int k3 = 0; k3 < this.waterlilyPerChunk; ++k3) {
                int l7 = random.nextInt(16) + 8;
                int k11 = random.nextInt(16) + 8;
                int i15 = worldIn.getHeight(this.chunkPos.add(l7, 0, k11)).getY() * 2;

                if (i15 > 0) {
                    int j18 = random.nextInt(i15);
                    BlockPos blockpos4;
                    BlockPos blockpos7;

                    for (blockpos4 = this.chunkPos.add(l7, j18, k11); blockpos4.getY() > 0; blockpos4 = blockpos7) {
                        blockpos7 = blockpos4.down();

                        if (!worldIn.isAirBlock(blockpos7)) {
                            break;
                        }
                    }

                    this.waterlilyGen.generate(worldIn, random, blockpos4);
                }
            }
        }
    }

    protected void generateMushrooms(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.SHROOM)) {
            for (int l3 = 0; l3 < this.mushroomsPerChunk; ++l3) {
                if (random.nextInt(4) == 0) {
                    int i8 = random.nextInt(16) + 8;
                    int l11 = random.nextInt(16) + 8;
                    BlockPos blockpos2 = worldIn.getHeight(this.chunkPos.add(i8, 0, l11));
                    this.mushroomBrownGen.generate(worldIn, random, blockpos2);
                }

                if (random.nextInt(8) == 0) {
                    int j8 = random.nextInt(16) + 8;
                    int i12 = random.nextInt(16) + 8;
                    int j15 = worldIn.getHeight(this.chunkPos.add(j8, 0, i12)).getY() * 2;

                    if (j15 > 0) {
                        int k18 = random.nextInt(j15);
                        BlockPos blockpos5 = this.chunkPos.add(j8, k18, i12);
                        this.mushroomRedGen.generate(worldIn, random, blockpos5);
                    }
                }
            }

            if (random.nextInt(4) == 0) {
                int i4 = random.nextInt(16) + 8;
                int k8 = random.nextInt(16) + 8;
                int j12 = worldIn.getHeight(this.chunkPos.add(i4, 0, k8)).getY() * 2;

                if (j12 > 0) {
                    int k15 = random.nextInt(j12);
                    this.mushroomBrownGen.generate(worldIn, random, this.chunkPos.add(i4, k15, k8));
                }
            }

            if (random.nextInt(8) == 0) {
                int j4 = random.nextInt(16) + 8;
                int l8 = random.nextInt(16) + 8;
                int k12 = worldIn.getHeight(this.chunkPos.add(j4, 0, l8)).getY() * 2;

                if (k12 > 0) {
                    int l15 = random.nextInt(k12);
                    this.mushroomRedGen.generate(worldIn, random, this.chunkPos.add(j4, l15, l8));
                }
            }
        }
    }

    protected void generateReeds(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.REED)) {
            for (int k4 = 0; k4 < this.reedsPerChunk; ++k4) {
                int i9 = random.nextInt(16) + 8;
                int l12 = random.nextInt(16) + 8;
                int i16 = worldIn.getHeight(this.chunkPos.add(i9, 0, l12)).getY() * 2;

                if (i16 > 0) {
                    int l18 = random.nextInt(i16);
                    this.reedGen.generate(worldIn, random, this.chunkPos.add(i9, l18, l12));
                }
            }

            for (int l4 = 0; l4 < 10; ++l4) {
                int j9 = random.nextInt(16) + 8;
                int i13 = random.nextInt(16) + 8;
                int j16 = worldIn.getHeight(this.chunkPos.add(j9, 0, i13)).getY() * 2;

                if (j16 > 0) {
                    int i19 = random.nextInt(j16);
                    this.reedGen.generate(worldIn, random, this.chunkPos.add(j9, i19, i13));
                }
            }
        }
    }

    protected void generatePumpkins(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.PUMPKIN)) {
            if (random.nextInt(32) == 0) {
                int i5 = random.nextInt(16) + 8;
                int k9 = random.nextInt(16) + 8;
                int j13 = worldIn.getHeight(this.chunkPos.add(i5, 0, k9)).getY() * 2;

                if (j13 > 0) {
                    int k16 = random.nextInt(j13);
                    (new WorldGenPumpkin()).generate(worldIn, random, this.chunkPos.add(i5, k16, k9));
                }
            }
        }
    }

    protected void generateCacti(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.CACTUS)) {
            for (int j5 = 0; j5 < this.cactiPerChunk; ++j5) {
                int l9 = random.nextInt(16) + 8;
                int k13 = random.nextInt(16) + 8;
                int l16 = worldIn.getHeight(this.chunkPos.add(l9, 0, k13)).getY() * 2;

                if (l16 > 0) {
                    int j19 = random.nextInt(l16);
                    this.cactusGen.generate(worldIn, random, this.chunkPos.add(l9, j19, k13));
                }
            }
        }
    }

    protected void generateLakes(Biome biomeIn, World worldIn, Random random) {

        if (this.generateLakes) {
            if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.LAKE_WATER)) {
                for (int k5 = 0; k5 < 50; ++k5) {
                    int i10 = random.nextInt(16) + 8;
                    int l13 = random.nextInt(16) + 8;
                    int i17 = random.nextInt(248) + 8;

                    if (i17 > 0) {
                        int k19 = random.nextInt(i17);
                        BlockPos blockpos6 = this.chunkPos.add(i10, k19, l13);
                        (new WorldGenLiquids(Blocks.FLOWING_WATER)).generate(worldIn, random, blockpos6);
                    }
                }
            }

            if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA)) {
                for (int l5 = 0; l5 < 20; ++l5) {
                    int j10 = random.nextInt(16) + 8;
                    int i14 = random.nextInt(16) + 8;
                    int j17 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
                    BlockPos blockpos3 = this.chunkPos.add(j10, j17, i14);
                    (new WorldGenLiquids(Blocks.FLOWING_LAVA)).generate(worldIn, random, blockpos3);
                }
            }
        }
    }
}
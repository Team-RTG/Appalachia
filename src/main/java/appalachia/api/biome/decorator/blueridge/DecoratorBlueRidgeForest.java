package appalachia.api.biome.decorator.blueridge;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

import appalachia.api.biome.decorator.AppalachiaDecorator;

public class DecoratorBlueRidgeForest extends AppalachiaDecorator {

    public DecoratorBlueRidgeForest() {

        super();
    }

    @Override
    public void decorate(World worldIn, Random random, Biome biome, BlockPos pos) {

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(worldIn, random, chunkPos));
        super.decorate(worldIn, random, biome, pos);
        //this.generateTrees(biome, worldIn, random);
        //this.generateFlowers(biome, worldIn, random);
        //this.generateGrass(biome, worldIn, random);
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(worldIn, random, chunkPos));
    }

    protected void generateTrees(Biome biomeIn, World worldIn, Random random) {

    }
}
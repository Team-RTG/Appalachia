package appalachia.rtg.world.gen.surface.appalachia;

import net.minecraft.block.state.IBlockState;

import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeHillsAutumn;

import rtg.api.biome.BiomeConfig;

public class SurfaceAPLBlueRidgeHillsAutumn extends SurfaceAPLBlueRidgeForest {

    public SurfaceAPLBlueRidgeHillsAutumn(BiomeConfig config, IBlockState top, IBlockState filler, IBlockState mix, float mixWidth, float mixHeight) {

        super(config, top, filler, mix, mixWidth, mixHeight);

        mixBlock = this.getConfigBlock(config, BiomeConfigAPLBlueRidgeHillsAutumn.surfaceMixBlockId,
            BiomeConfigAPLBlueRidgeHillsAutumn.surfaceMixBlockMetaId,
            mix);
    }
}

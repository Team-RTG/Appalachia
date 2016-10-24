package appalachia.rtg.world.gen.surface.appalachia;

import net.minecraft.block.state.IBlockState;

import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeForestAutumn;

import rtg.api.biome.BiomeConfig;

public class SurfaceAPLBlueRidgeForestAutumn extends SurfaceAPLBlueRidgeForest {

    public SurfaceAPLBlueRidgeForestAutumn(BiomeConfig config, IBlockState top, IBlockState filler, IBlockState mix, float mixWidth, float mixHeight) {

        super(config, top, filler, mix, mixWidth, mixHeight);

        mixBlock = this.getConfigBlock(config, BiomeConfigAPLBlueRidgeForestAutumn.surfaceMixBlockId,
            BiomeConfigAPLBlueRidgeForestAutumn.surfaceMixBlockMetaId,
            mix);
    }
}

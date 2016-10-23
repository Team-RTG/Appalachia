package appalachia.rtg.world.gen.surface.appalachia;

import net.minecraft.block.state.IBlockState;

import appalachia.rtg.api.biome.appalachia.config.BiomeConfigAPLBlueRidgeHills;

import rtg.api.biome.BiomeConfig;

public class SurfaceAPLBlueRidgeHills extends SurfaceAPLBlueRidgeForest {

    public SurfaceAPLBlueRidgeHills(BiomeConfig config, IBlockState top, IBlockState filler, IBlockState mix, float mixWidth, float mixHeight) {

        super(config, top, filler, mix, mixWidth, mixHeight);

        mixBlock = this.getConfigBlock(config, BiomeConfigAPLBlueRidgeHills.surfaceMixBlockId,
            BiomeConfigAPLBlueRidgeHills.surfaceMixBlockMetaId,
            mix);
    }
}

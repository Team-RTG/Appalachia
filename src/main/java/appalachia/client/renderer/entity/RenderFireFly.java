package appalachia.client.renderer.entity;

import javax.annotation.Nonnull;

import appalachia.client.model.ModelFireFly;
import appalachia.entity.passive.EntityFireFly;
import appalachia.reference.ModInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFireFly extends RenderLiving<EntityFireFly> {
    public static final Factory FACTORY = new Factory();

    public RenderFireFly(RenderManager renderer) {
        super(renderer, new ModelFireFly(), 0);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityFireFly entity) {
        return new ResourceLocation(ModInfo.MOD_ID + ":" + "textures/entity/firefly/firefly.png");
    }

    @Override
    protected void preRenderCallback(EntityFireFly entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(0.4F, 0.4F, 0.4F);
    }

    public static class Factory implements IRenderFactory<EntityFireFly> {

        @Override
        public Render<? super EntityFireFly> createRenderFor(RenderManager manager) {
            return new RenderFireFly(manager);
        }

    }
}

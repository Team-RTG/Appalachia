package appalachia.client.renderer.entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.client.model.ModelBlackBear;
import appalachia.entity.monster.EntityBlackBear;
import appalachia.reference.ModInfo;

@SideOnly(Side.CLIENT)
public class RenderBlackBear extends RenderLiving<EntityBlackBear>
{
    private ResourceLocation mobTexture = new ResourceLocation("" + ModInfo.MOD_ID + ":textures/entity/bear/blackbear.png");
    public static final Factory FACTORY = new Factory();


    public RenderBlackBear(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelBlackBear(), 0.7F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBlackBear entity) {
        return mobTexture;
    }

    @Override
    public void doRender(EntityBlackBear entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityBlackBear entitylivingbaseIn, float partialTickTime)
    {
        GlStateManager.scale(1.2F, 1.2F, 1.2F);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

    public static class Factory implements IRenderFactory<EntityBlackBear> {

        @Override
        public Render<? super EntityBlackBear> createRenderFor(RenderManager manager) {
            return new RenderBlackBear(manager);
        }

    }
}
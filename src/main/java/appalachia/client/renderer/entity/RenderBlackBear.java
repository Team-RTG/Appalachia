package appalachia.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.entity.monster.EntityBlackBear;
import appalachia.reference.ModInfo;

@SideOnly(Side.CLIENT)
public class RenderBlackBear extends RenderLiving<EntityBlackBear>
{
    private static final ResourceLocation BLACK_BEAR_TEXTURE = new ResourceLocation("" + ModInfo.MOD_ID + ":textures/entity/bear/blackbear.png");

    public RenderBlackBear(RenderManager p_i47132_1_, ModelBase p_i47132_2_, float p_i47132_3_)
    {
        super(p_i47132_1_, p_i47132_2_, p_i47132_3_);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBlackBear entity)
    {
        return BLACK_BEAR_TEXTURE;
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
}
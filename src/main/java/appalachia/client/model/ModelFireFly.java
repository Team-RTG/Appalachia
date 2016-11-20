package appalachia.client.model;

import appalachia.entity.passive.EntityFireFly;
import appalachia.entity.passive.EntityFireFly.Color;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;

public class ModelFireFly extends ModelBase {
    private ModelRenderer body;         // The big part
    private ModelRenderer light;         // The lighting thing

    public ModelFireFly() {
        this.textureHeight = 16;
        this.textureWidth = 32;

        this.body = new ModelRenderer(this, 0, 0);
        body.addBox(-2.5F, 21 - 2.5F, -2.5F, 5, 5, 5);

        ModelRenderer head = new ModelRenderer(this, 20, 0);
        head.addBox(-1.5F, 21 - 1.5F, -5F, 3, 3, 3);
        body.addChild(head);

        ModelRenderer body2 = new ModelRenderer(this, 0, 10);
        body2.addBox(-1.5F, 21 - 1.5F, 2.5F, 3, 3, 2);
        body.addChild(body2);

        this.light = new ModelRenderer(this, 12, 10);
        light.addBox(-1, 21 - 1, 4.5F, 2, 2, 1);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        EntityFireFly firefly = (EntityFireFly) entity;
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        EntityFireFly.Color color = firefly.getColor();

        if (color == null) {
            color = Color.ERROR;
        }

        GlStateManager.color(color.getRed(), color.getGreen(), color.getBlue(), 0.8F);
        body.render(scale);

        if (firefly.isFlashing()) {
            GlStateManager.disableLighting();
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240, 240);
            GlStateManager.enableLighting();
            GlStateManager.color(1, 1, 0, 0.8F);
        }

        light.render(scale);
    }
}

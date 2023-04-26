package net.airmandn.practicemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.airmandn.practicemod.entity.custom.WandererEntity;
import net.airmandn.practicemod.practicemod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WandererRenderer extends GeoEntityRenderer<WandererEntity> {
    public WandererRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WandererModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(WandererEntity instance) {
        return new ResourceLocation(practicemod.MOD_ID, "textures/entity/wanderer_texture.png");
    }

    @Override
    public RenderType getRenderType(WandererEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);



        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

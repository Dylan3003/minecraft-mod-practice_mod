package net.airmandn.practicemod.entity.client;

import net.airmandn.practicemod.entity.custom.WandererEntity;
import net.airmandn.practicemod.practicemod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WandererModel extends AnimatedGeoModel<WandererEntity> {
    @Override
    public ResourceLocation getModelResource(WandererEntity object) {
        return new ResourceLocation(practicemod.MOD_ID, "geo/wanderer.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WandererEntity object) {
        return new ResourceLocation(practicemod.MOD_ID, "textures/entity/wanderer_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WandererEntity animatable) {
        return new ResourceLocation(practicemod.MOD_ID, "animations/wanderer.animation.json");
    }
}

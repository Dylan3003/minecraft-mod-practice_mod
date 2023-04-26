package net.airmandn.practicemod.entity;

import net.airmandn.practicemod.entity.custom.WandererEntity;
import net.airmandn.practicemod.practicemod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, practicemod.MOD_ID);

    public static final RegistryObject<EntityType<WandererEntity>> WANDERER =
            ENTITY_TYPES.register("wanderer",
                    () -> EntityType.Builder.of(WandererEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(practicemod.MOD_ID, "wanderer").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

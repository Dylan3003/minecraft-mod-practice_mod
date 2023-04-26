package net.airmandn.practicemod;

import com.mojang.logging.LogUtils;
import net.airmandn.practicemod.block.ModBlocks;
import net.airmandn.practicemod.entity.ModEntityTypes;
import net.airmandn.practicemod.entity.client.WandererRenderer;
import net.airmandn.practicemod.entity.custom.WandererEntity;
import net.airmandn.practicemod.item.ModItems;
import net.airmandn.practicemod.networking.ModMessages;
import net.airmandn.practicemod.painting.ModPaintings;
import net.airmandn.practicemod.villager.ModVillagers;
import net.airmandn.practicemod.world.feature.ModConfiguredFeatures;
import net.airmandn.practicemod.world.feature.ModPlacedFeatures;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(practicemod.MOD_ID)
public class practicemod
{
    public static final String MOD_ID = "practicemod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public practicemod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModPaintings.register(modEventBus);

        ModVillagers.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModEntityTypes.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModMessages.register();
            ModVillagers.registerPOIs();
        });
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntityTypes.WANDERER.get(), WandererRenderer::new);


        }
    }
}

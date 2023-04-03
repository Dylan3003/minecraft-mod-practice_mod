package net.airmandn.practicemod.item;

import net.airmandn.practicemod.practicemod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, practicemod.MOD_ID);

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB)));
    public static final RegistryObject<Item> RAW_PIZZA = ITEMS.register("raw_pizza",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

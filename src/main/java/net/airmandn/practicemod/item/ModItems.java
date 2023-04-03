package net.airmandn.practicemod.item;

import net.airmandn.practicemod.item.custom.EightBallItem;
import net.airmandn.practicemod.practicemod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, practicemod.MOD_ID);

    public static final RegistryObject<Item> DARK_INGOT = ITEMS.register("dark_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB)));

    public static final RegistryObject<Item> RAW_DARK_ORE = ITEMS.register("raw_dark_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB)));

    public static final RegistryObject<Item> DARK_ORB = ITEMS.register("dark_orb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.PRACTICE_TAB).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

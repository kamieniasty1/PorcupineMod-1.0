package com.kamieniasty.porcupinemod.item;

import com.kamieniasty.porcupinemod.PorcupineMod;
import com.kamieniasty.porcupinemod.entity.ModEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PorcupineMod.MOD_ID);

    public static final RegistryObject<Item> PORCUPINE_SPAWN_EGG = ITEMS.register("porcupine_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PORCUPINE, 0x110E0D, 0x38251E, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

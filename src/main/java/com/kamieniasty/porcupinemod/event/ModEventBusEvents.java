package com.kamieniasty.porcupinemod.event;

import com.kamieniasty.porcupinemod.PorcupineMod;
import com.kamieniasty.porcupinemod.entity.custom.PorcupineEntity;
import com.kamieniasty.porcupinemod.entity.ModEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PorcupineMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PORCUPINE.get(), PorcupineEntity.createAttributes().build());
    }
}

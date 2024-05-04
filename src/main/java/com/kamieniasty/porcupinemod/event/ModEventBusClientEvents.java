package com.kamieniasty.porcupinemod.event;

import com.kamieniasty.porcupinemod.PorcupineMod;
import com.kamieniasty.porcupinemod.entity.client.ModModelLayers;
import com.kamieniasty.porcupinemod.entity.client.PorcupineModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PorcupineMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PORCUPINE_LAYER, PorcupineModel::createBodyLayer);
    }
}

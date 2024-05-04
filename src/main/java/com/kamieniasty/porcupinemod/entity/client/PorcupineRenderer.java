package com.kamieniasty.porcupinemod.entity.client;

import com.kamieniasty.porcupinemod.entity.custom.PorcupineEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.kamieniasty.porcupinemod.PorcupineMod;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PorcupineRenderer extends MobRenderer<PorcupineEntity, PorcupineModel<PorcupineEntity>> {
    public PorcupineRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PorcupineModel<>(pContext.bakeLayer(ModModelLayers.PORCUPINE_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PorcupineEntity pEntity) {
        return new ResourceLocation(PorcupineMod.MOD_ID, "textures/entity/porcupine.png");
    }

    @Override
    public void render(PorcupineEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}

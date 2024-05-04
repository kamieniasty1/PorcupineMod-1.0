package com.kamieniasty.porcupinemod.datagen;

import com.kamieniasty.porcupinemod.PorcupineMod;
import com.kamieniasty.porcupinemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PorcupineMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.PORCUPINE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

}

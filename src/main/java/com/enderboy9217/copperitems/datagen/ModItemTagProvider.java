package com.enderboy9217.copperitems.datagen;

import com.enderboy9217.copperitems.item.copperitems.CopperItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
            .add(CopperItems.COPPER_HELMET,
                    CopperItems.COPPER_CHESTPLATE,
                    CopperItems.COPPER_LEGGINGS,
                    CopperItems.COPPER_BOOTS);
    }
}

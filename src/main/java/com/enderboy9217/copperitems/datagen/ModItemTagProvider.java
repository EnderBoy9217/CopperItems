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
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(CopperItems.COPPER_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(CopperItems.COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(CopperItems.COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(CopperItems.COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(CopperItems.COPPER_HOE);
    }
}

package com.enderboy9217.copperitems.datagen;

import com.enderboy9217.copperitems.item.copperitems.CopperItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import java.util.List;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    private static final List<Item> handheldItems = List.of(
        CopperItems.COPPER_SWORD,
        CopperItems.COPPER_PICKAXE,
        CopperItems.COPPER_AXE,
        CopperItems.COPPER_SHOVEL,
        CopperItems.COPPER_HOE
    );

    private static final List<Item> armorItems = List.of(
        CopperItems.COPPER_HELMET,
        CopperItems.COPPER_CHESTPLATE,
        CopperItems.COPPER_LEGGINGS,
        CopperItems.COPPER_BOOTS
    );

    private static final List<Item> standardItems = List.of(
        CopperItems.COPPER_HORSE_ARMOR
    );

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : standardItems) {
            itemModelGenerator.register(item, Models.GENERATED);
        }

        for (Item item : handheldItems) {
            itemModelGenerator.register(item, Models.HANDHELD);
        }

        for (Item item : armorItems) {
            itemModelGenerator.registerArmor((ArmorItem) item);
        }

    }
}

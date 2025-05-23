package com.enderboy9217.copperitems.util;

import com.enderboy9217.copperitems.item.copperitems.CopperItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantWithLevelsLootFunction;
import net.minecraft.loot.function.SetDamageLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableModifiers {

    public static void modifyLootTables() {

        // Copper Horse Armor
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            float copper_horse_armor_chance = switch (id.toString()) {
                case "minecraft:chests/simple_dungeon" -> 0.147f;
                case "minecraft:chests/village/village_weaponsmith" -> 0.100f;
                default -> 0.0f;
            };

            LootPool.Builder poolBuilder = LootPool.builder();

            if (copper_horse_armor_chance > 0.0f) {
                poolBuilder.conditionally(RandomChanceLootCondition.builder(copper_horse_armor_chance))
                        .with(ItemEntry.builder(CopperItems.COPPER_HORSE_ARMOR));
            }

            tableBuilder.pool(poolBuilder.build());
        });
    }
}

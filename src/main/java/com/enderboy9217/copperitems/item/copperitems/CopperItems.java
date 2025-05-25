package com.enderboy9217.copperitems.item.copperitems;

import com.enderboy9217.copperitems.EndersCopperItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CopperItems {

    // Tools and Weapons
    // Attack damage += 2.0
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(CopperToolMaterials.COPPER, 4, -2.9f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
        new PickaxeItem(CopperToolMaterials.COPPER, 2, -3.1f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
        new AxeItem(CopperToolMaterials.COPPER, 7.25F, -3.3f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
        new ShovelItem(CopperToolMaterials.COPPER, 2.5F, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
        new HoeItem(CopperToolMaterials.COPPER, 0, -2.0f, new FabricItemSettings()));

    // Armor
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
        new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
        new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
        new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
        new ArmorItem(CopperArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    // Horse Armor
    public static final Item COPPER_HORSE_ARMOR = registerItem("copper_horse_armor",
        new HorseArmorItem(4, "copper", new FabricItemSettings().maxCount(1)));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(COPPER_SWORD);
        entries.add(COPPER_AXE);
        entries.add(COPPER_HELMET);
        entries.add(COPPER_CHESTPLATE);
        entries.add(COPPER_LEGGINGS);
        entries.add(COPPER_BOOTS);
        entries.add(COPPER_HORSE_ARMOR);
    }

    public static void addItemsToToolsItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_AXE);
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EndersCopperItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EndersCopperItems.LOGGER.info("Registering Copper Items for " + EndersCopperItems.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(CopperItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(CopperItems::addItemsToToolsItemGroup);
    }

}

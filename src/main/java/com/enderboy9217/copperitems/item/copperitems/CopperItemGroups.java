package com.enderboy9217.copperitems.item.copperitems;

import com.enderboy9217.copperitems.EndersCopperItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CopperItemGroups {

    public static final ItemGroup copperItems = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EndersCopperItems.MOD_ID, "copperitems"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.copperitems"))
                    .icon(() -> new ItemStack(CopperItems.COPPER_AXE)).entries((displayContext, entries) -> {
                        entries.add(CopperItems.COPPER_HORSE_ARMOR);
                        entries.add(CopperItems.COPPER_SWORD);
                        entries.add(CopperItems.COPPER_PICKAXE);
                        entries.add(CopperItems.COPPER_AXE);
                        entries.add(CopperItems.COPPER_SHOVEL);
                        entries.add(CopperItems.COPPER_HOE);
                        entries.add(CopperItems.COPPER_HELMET);
                        entries.add(CopperItems.COPPER_CHESTPLATE);
                        entries.add(CopperItems.COPPER_LEGGINGS);
                        entries.add(CopperItems.COPPER_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        EndersCopperItems.LOGGER.info("Registering Item Groups for " + EndersCopperItems.MOD_ID);
    }
}

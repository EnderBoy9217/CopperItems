package com.enderboy9217.copperitems.datagen;

import com.enderboy9217.copperitems.item.copperitems.CopperItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;

import java.util.function.Consumer;

import static com.enderboy9217.copperitems.datagen.ModCustomRecipeTypes.*;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {

        offerSwordRecipe(consumer, CopperItems.COPPER_SWORD, Items.COPPER_INGOT);
        offerPickaxeRecipe(consumer, CopperItems.COPPER_PICKAXE, Items.COPPER_INGOT);
        offerAxeRecipe(consumer, CopperItems.COPPER_AXE, Items.COPPER_INGOT);
        offerShovelRecipe(consumer, CopperItems.COPPER_SHOVEL, Items.COPPER_INGOT);
        offerHoeRecipe(consumer, CopperItems.COPPER_HOE, Items.COPPER_INGOT);

        offerHelmetRecipe(consumer, CopperItems.COPPER_HELMET, Items.COPPER_INGOT);
        offerChestplateRecipe(consumer, CopperItems.COPPER_CHESTPLATE, Items.COPPER_INGOT);
        offerLeggingsRecipe(consumer, CopperItems.COPPER_LEGGINGS, Items.COPPER_INGOT);
        offerBootsRecipe(consumer, CopperItems.COPPER_BOOTS, Items.COPPER_INGOT);
    }
}

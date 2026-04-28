package com.chinaex123.mooncake_delight.dataGen.recipe;

import com.chinaex123.mooncake_delight.init.ModItems;
import com.chinaex123.mooncake_delight.init.ModItemTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class IngredientRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public IngredientRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCookingRecipes(Consumer<FinishedRecipe> recipeOutput) {

        // ======================= 食材 =======================
        // 转换糖浆
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.INVERT_SUGAR_SYRUP_BOTTLE.get(), 1, 20 * 20,0.5F, Items.GLASS_BOTTLE)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.GLOW_BERRIES)
                .addIngredient(Items.HONEYCOMB)
                .addIngredient(Items.HONEYCOMB)
                .addIngredient(Items.HONEYCOMB)
                .unlockedBy("has_sugar",  has(ModItemTags.SUGARS))
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .save(recipeOutput);
        // 动物油
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ANIMAL_FAT.get(), 1, 20 * 30,0.5F, Items.GLASS_BOTTLE)
                .addIngredient(ModItems.TALLOW.get())
                .addIngredient(ModItems.TALLOW.get())
                .addIngredient(ModItems.TALLOW.get())
                .addIngredient(ModItems.TALLOW.get())
                .addIngredient(ModItems.TALLOW.get())
                .addIngredient(ModItems.TALLOW.get())
                .unlockedBy("has_tallow", has(ModItems.TALLOW.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .save(recipeOutput);
        // 月饼面团
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MOONCAKE_CRUST_DOUGH.get(), 1, 20 * 20,0.5F)
                .addIngredient(CommonTags.Items.BUCKETS_WATER)
                .addIngredient(ModItems.INVERT_SUGAR_SYRUP_BOTTLE.get())
                .addIngredient(ModItems.ANIMAL_FAT.get())
                .addIngredient(ModItemTags.FLOUR)
                .addIngredient(ModItemTags.FLOUR)
                .addIngredient(Items.BLAZE_POWDER)
                .unlockedBy("has_animal_fat", has(ModItems.ANIMAL_FAT.get()))
                .unlockedBy("has_flour", has(ModItems.FLOUR.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);
        // 冰皮月饼面团
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SNOW_SKIN_MOONCAKE_CRUST_DOUGH.get(), 1, 20 * 20,0.5F)
                .addIngredient(CommonTags.Items.BUCKETS_WATER)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(Items.BLUE_ICE)
                .addIngredient(ModItemTags.FLOUR)
                .addIngredient(ModItemTags.FLOUR)
                .unlockedBy("has_snow_skin_mooncake_crust_dough", has(CommonTags.Items.MILK))
                .unlockedBy("has_snow_skin_mooncake_crust_dough_blue_ice", has(Items.BLUE_ICE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .save(recipeOutput);




    }

    /**
     * 检查物品标签
     */
    protected static InventoryChangeTrigger.TriggerInstance has(TagKey<Item> tag) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(tag).build());
    }

    /**
     * 检查具体物品
     */
    protected static InventoryChangeTrigger.TriggerInstance has(Item item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }
}

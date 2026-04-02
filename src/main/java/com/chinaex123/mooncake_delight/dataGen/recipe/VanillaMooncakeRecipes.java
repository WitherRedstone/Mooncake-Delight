package com.chinaex123.mooncake_delight.dataGen.recipe;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import com.chinaex123.mooncake_delight.tags.ModItemTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.common.tag.CommonTags;

import java.util.concurrent.CompletableFuture;

public class VanillaMooncakeRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public VanillaMooncakeRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildVanillaRecipes(@NotNull RecipeOutput recipeOutput) {

        // ======================= 原版自带 =======================
        // 苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.APPLE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.APPLE)
                .addIngredient(Items.APPLE)
                .addIngredient(Items.APPLE)
                .unlockedBy("has_apple_mooncake", has(Items.APPLE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GOLDEN_APPLE_MOONCAKE.get(), 1, 20 * 20, 1.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.GOLDEN_APPLE)
                .addIngredient(Items.GOLDEN_APPLE)
                .addIngredient(Items.GOLDEN_APPLE)
                .unlockedBy("has_golden_apple_mooncake", has(Items.GOLDEN_APPLE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 附魔金苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE.get(), 1, 20 * 20, 2.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.ENCHANTED_GOLDEN_APPLE)
                .addIngredient(Items.ENCHANTED_GOLDEN_APPLE)
                .addIngredient(Items.ENCHANTED_GOLDEN_APPLE)
                .unlockedBy("has_enchanted_golden_apple_mooncake", has(Items.ENCHANTED_GOLDEN_APPLE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 浆果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SWEET_BERRIES_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.SWEET_BERRIES)
                .addIngredient(Items.SWEET_BERRIES)
                .addIngredient(Items.SWEET_BERRIES)
                .unlockedBy("has_sweet_berries_mooncake", has(Items.SWEET_BERRIES))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 发光浆果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GLOW_BERRIES_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.GLOW_BERRIES)
                .addIngredient(Items.GLOW_BERRIES)
                .addIngredient(Items.GLOW_BERRIES)
                .unlockedBy("has_glow_berries_mooncake", has(Items.GLOW_BERRIES))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 紫颂果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CHORUS_FRUIT_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.CHORUS_FRUIT)
                .addIngredient(Items.CHORUS_FRUIT)
                .addIngredient(Items.CHORUS_FRUIT)
                .unlockedBy("has_chorus_fruit_mooncake", has(Items.CHORUS_FRUIT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 胡萝卜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CARROT_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.CARROT)
                .unlockedBy("has_carrot_mooncake", has(Items.CARROT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 马铃薯月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.POTATO_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.POTATO)
                .addIngredient(Items.POTATO)
                .addIngredient(Items.POTATO)
                .unlockedBy("has_potato_mooncake", has(Items.POTATO))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 牛肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BEEF_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .unlockedBy("has_beef_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .unlockedBy("has_beef_mooncake_onion", has(CommonTags.CROPS_ONION))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 猪肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PORKCHOP_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Items.PORKCHOP)
                .addIngredient(Items.PORKCHOP)
                .unlockedBy("has_porkchop_mooncake", has(Items.PORKCHOP))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 羊肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MUTTON_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .unlockedBy("has_mutton_mooncake", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鸡肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CHICKEN_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .unlockedBy("has_chicken_mooncake", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 兔肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.RABBIT_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Items.RABBIT)
                .addIngredient(Items.RABBIT)
                .unlockedBy("has_rabbit_mooncake", has(Items.RABBIT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鳕鱼月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.COD_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get())
                .unlockedBy("has_cod_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲑鱼月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SALMON_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.SALMON_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.SALMON_SLICE.get())
                .unlockedBy("has_salmon_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.SALMON_SLICE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 腐肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ROTTEN_FLESH_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Items.ROTTEN_FLESH)
                .addIngredient(Items.ROTTEN_FLESH)
                .unlockedBy("has_rotten_flesh_mooncake", has(Items.ROTTEN_FLESH))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蜂蜜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HONEY_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.HONEYCOMB)
                .addIngredient(Items.HONEYCOMB)
                .addIngredient(Items.HONEYCOMB)
                .unlockedBy("has_honey_mooncake", has(Items.HONEYCOMB))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 咖啡月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.COFFEE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .unlockedBy("has_coffee_mooncake", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 冰皮月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SNOW_SKIN_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.SNOW_SKIN_MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.SNOWBALL)
                .addIngredient(Items.SNOWBALL)
                .addIngredient(Items.SNOWBALL)
                .unlockedBy("has_snow_skin_mooncake", has(Items.SNOW))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 流心奶黄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.LAVA_EGG_CUSTARD_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.EGGS)
                .unlockedBy("has_lava_egg_custard_mooncake", has(Tags.Items.EGGS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 流心奶双黄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(Tags.Items.EGGS)
                .unlockedBy("has_lava_double_egg_custard_mooncake", has(Tags.Items.EGGS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑松露月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BLACK_TRUFFLE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(ModItems.TRUFFLE)
                .addIngredient(ModItems.TRUFFLE)
                .addIngredient(ModItems.TRUFFLE)
                .unlockedBy("has_black_truffle_mooncake", has(ModItems.TRUFFLE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 百果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HUNDRED_FRUITS_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.SWEET_BERRIES)
                .addIngredient(Items.GOLDEN_APPLE)
                .addIngredient(Items.MELON_SLICE)
                .addIngredient(Items.CHORUS_FRUIT)
                .unlockedBy("has_hundred_fruits_mooncake", has(ModItems.MOONCAKE_CRUST_DOUGH.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲜花月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.EDIBLE_FLOWER_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.RED_TULIP)
                .addIngredient(Items.ORANGE_TULIP)
                .addIngredient(Items.WHITE_TULIP)
                .addIngredient(Items.PINK_TULIP)
                .unlockedBy("has_edible_flower_mooncake_red_tulip", has(ModItems.MOONCAKE_CRUST_DOUGH.get()))
                .unlockedBy("has_edible_flower_mooncake_orange_tulip", has(ModItems.MOONCAKE_CRUST_DOUGH.get()))
                .unlockedBy("has_edible_flower_mooncake_white_tulip", has(ModItems.MOONCAKE_CRUST_DOUGH.get()))
                .unlockedBy("has_edible_flower_mooncake_pink_tulip", has(ModItems.MOONCAKE_CRUST_DOUGH.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 玫瑰月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ROSE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Items.ROSE_BUSH)
                .addIngredient(Items.ROSE_BUSH)
                .addIngredient(Items.ROSE_BUSH)
                .unlockedBy("has_rose_mooncake", has(Items.ROSE_BUSH))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菊花月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CHRYSANTHEMUM_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Items.OXEYE_DAISY)
                .addIngredient(Items.OXEYE_DAISY)
                .addIngredient(Items.OXEYE_DAISY)
                .unlockedBy("has_chrysanthemum_mooncake", has(Items.OXEYE_DAISY))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蛋糕月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CAKE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.CAKE_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.CAKE_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.CAKE_SLICE.get())
                .unlockedBy("has_cake_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.CAKE_SLICE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 米月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.RICE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_RICE)
                .addIngredient(CommonTags.CROPS_RICE)
                .addIngredient(CommonTags.CROPS_RICE)
                .addIngredient(CommonTags.CROPS_RICE)
                .unlockedBy("has_rice_mooncake", has(CommonTags.CROPS_RICE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 莲蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.LOTUS_SEED_PASTE_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .unlockedBy("has_lotus_seed_paste_mooncake", has(ModItemTags.CROPS_LOTUS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 双黄莲蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DOUBLE_YOLK_LOTUS_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(Tags.Items.EGGS)
                .unlockedBy("has_double_lotus_seed_paste_mooncake", has(ModItemTags.CROPS_LOTUS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲜肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PORK_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .unlockedBy("has_pork_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蛋黄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.EGG_YOLK_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.EGGS)
                .unlockedBy("has_egg_yolk_mooncake", has(Tags.Items.EGGS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蛋黄鲜肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SALTED_EGG_YOLK_PORK_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .unlockedBy("has_salted_egg_yolk-pork_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HAM_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .unlockedBy("has_ham_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 云腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.YUNNAN_HAM_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Tags.Items.DRINKS_HONEY)
                .addIngredient(Items.COOKED_PORKCHOP)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .unlockedBy("has_yunnan_ham_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 南瓜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PUMPKIN_MOONCAKE.get(), 1, 20 * 20, 0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_HONEY)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get())
                .unlockedBy("has_pumpkin_mooncake", has(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 猪肉卷心菜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PORK_CABBAGE_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Items.PORKCHOP)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .unlockedBy("has_pork-cabbage_mooncake_porkchop", has(Items.PORKCHOP))
                .unlockedBy("has_pork-cabbage_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_pork-cabbage_mooncake_cabbage", has(CommonTags.CROPS_CABBAGE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 牛肉番茄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BEEF_TOMATO_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .unlockedBy("has_beef-tomato_mooncake_minced_beef", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .unlockedBy("has_beef-tomato_mooncake_tomato", has(CommonTags.CROPS_TOMATO))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鸡肉南瓜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CHICKEN_PUMPKIN_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get())
                .unlockedBy("has_chicken-pumpkin_mooncake_minced_beef", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .unlockedBy("has_chicken-pumpkin_mooncake_pumpkin_slice", has(vectorwing.farmersdelight.common.registry.ModItems.PUMPKIN_SLICE.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 火腿卷心菜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HAM_CABBAGE_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .unlockedBy("has_ham-cabbage_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_ham-cabbage_mooncake_cabbage", has(CommonTags.CROPS_CABBAGE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 海鲜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SEAFOOD_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.SALMON_SLICE.get())
                .addIngredient(Items.TROPICAL_FISH)
                .unlockedBy("has_seafood_mooncake_cod_slice", has(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get()))
                .unlockedBy("has_seafood_mooncake_salmon_slice", has(vectorwing.farmersdelight.common.registry.ModItems.SALMON_SLICE.get()))
                .unlockedBy("has_seafood_mooncake_tropical_fish", has(Items.TROPICAL_FISH))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 三鲜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.THREE_DELICACIES_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .unlockedBy("has_three_delicacies_mooncake_cod_slice", has(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get()))
                .unlockedBy("has_three_delicacies_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_three_delicacies_mooncake_cabbage", has(CommonTags.CROPS_CABBAGE))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 全家福月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.FAMILY_FEASTS_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .unlockedBy("has_family_feasts_mooncake_chicken_cuts", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .unlockedBy("has_family_feasts_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_family_feasts_mooncake_minced_beef", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 双拼肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DOUBLE_MEAT_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .unlockedBy("has_double_meat_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_double_meat_mooncake_minced_beef", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 三肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TRIPLE_MEAT_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Items.PORKCHOP)
                .addIngredient(Items.RABBIT)
                .addIngredient(Items.MUTTON)
                .unlockedBy("has_triple_meat_mooncake_porkchop", has(Items.PORKCHOP))
                .unlockedBy("has_triple_meat_mooncake_rabbit", has(Items.RABBIT))
                .unlockedBy("has_triple_meat_mooncake_mutton", has(Items.MUTTON))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 火腿培根月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.HAM_BACON_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .unlockedBy("has_ham-bacon_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_ham-bacon_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金华火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.JINHUA_HAM_MOONCAKE.get(), 1, 20 * 20, 1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.SMOKED_HAM.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.SMOKED_HAM.get())
                .unlockedBy("has_jinhua_ham_mooncake_smoked_ham", has(vectorwing.farmersdelight.common.registry.ModItems.SMOKED_HAM.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 培根洋葱月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BACON_ONION_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .unlockedBy("has_bacon-onion_mooncake_leaves", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑芝麻蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BLACK_SESAME_PASTE_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItems.BLACK_SESAME)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .unlockedBy("has_black_sesame_paste_mooncake_black_sesame", has(ModItemTags.CROPS_LOTUS))
                .unlockedBy("has_black_sesame_paste_mooncake_lotus", has(ModItemTags.CROPS_LOTUS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑芝麻蓉流心月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BLACK_SESAME_LAVA_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(ModItems.BLACK_SESAME)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .unlockedBy("has_black_sesame_lava_mooncake_black_sesame", has(ModItemTags.CROPS_LOTUS))
                .unlockedBy("has_black_sesame_lava_mooncake_lotus", has(ModItemTags.CROPS_LOTUS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑芝麻豆乳月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BLACK_SESAME_SOY_MILK_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(ModItems.BLACK_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .unlockedBy("has_black_sesame_soy_milk_mooncake_black_sesame", has(ModItems.BLACK_SESAME.get()))
                .unlockedBy("has_black_sesame_soy_milk_mooncake_cocoa_bean", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 白芝麻蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.WHITE_SESAME_PASTE_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .unlockedBy("has_white_sesame_paste_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_white_sesame_paste_mooncake_cocoa_bean", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cocoa_bean"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻蛋黄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_EGG_YOLK_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.EGGS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .unlockedBy("has_sesame_egg_yolk_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame_egg_yolk_mooncake_eggs", has(Tags.Items.EGGS))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_HAM_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .unlockedBy("has_sesame-ham_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame-ham_mooncake_eggs", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻牛肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_BEEF_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get())
                .unlockedBy("has_sesame-beef_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame-beef_mooncake_minced_beef", has(vectorwing.farmersdelight.common.registry.ModItems.MINCED_BEEF.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻培根月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_BACON_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .unlockedBy("has_sesame-beef_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame-beef_mooncake_bacon", has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻洋葱月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_ONION_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(CommonTags.CROPS_ONION)
                .unlockedBy("has_sesame-onion_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame-onion_mooncake_bacon", has(CommonTags.CROPS_ONION))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻番茄月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_TOMATO_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tomato"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tomato"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tomato"))))
                .unlockedBy("has_sesame-tomato_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .unlockedBy("has_sesame-tomato_mooncake_tomato", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tomato"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻鸡肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_CHICKEN_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .unlockedBy("has_sesame-chicken_mooncake_tomato", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_chicken"))))
                .unlockedBy("has_sesame-chicken_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻羊肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SESAME_MUTTON_MOONCAKE.get(), 1, 20 * 20,1.0F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .unlockedBy("has_sesame-mutton_mooncake_tomato", has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "foods/raw_mutton"))))
                .unlockedBy("has_sesame-mutton_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        
        
        
        

        
        
        
        
        
        
    }

    /**
     * 检查物品标签
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> tag) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(tag).build());
    }

    /**
     * 检查具体物品
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(Item item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }
}

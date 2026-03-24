package com.chinaex123.mooncake_delight.dataGen.recipe.ModCompat;

import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import com.chinaex123.mooncake_delight.tags.ModItemTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
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
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.concurrent.CompletableFuture;

public class CroptopiaItemRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public CroptopiaItemRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCroptopiaItem(@NotNull RecipeOutput recipeOutput) {

        // ======================= 作物盛景 联动 =======================
        // 香肠月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SAUSAGE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausage"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausage"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausage"))))
                .unlockedBy("has_sausage_mooncake_sugar",  has(ModItemTags.SUGARS))
                .unlockedBy("has_sausage_mooncake_sausage",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausage"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鱿鱼月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CALAMARI_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "calamari"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "calamari"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "calamari"))))
                .unlockedBy("has_calamari_mooncake_calamari",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "calamari"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .unlockedBy("has_pineapple_mooncake_pineapples",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 草莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.STRAWBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberries"))))
                .unlockedBy("has_strawberry_mooncake_strawberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .unlockedBy("has_blueberry_mooncake_blueberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .unlockedBy("has_cranberry_mooncake_cranberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACKBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .unlockedBy("has_blackberry_mooncake_blackberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椰蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.COCONUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .unlockedBy("has_coconut_paste_mooncake_blackberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JUJUBE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .unlockedBy("has_jujube_paste_mooncake_dates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 绿豆月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MUNG_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenbeans"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenbeans"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenbeans"))))
                .unlockedBy("has_mung_mooncake_greenbeans",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenbeans"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 花生月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEANUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .unlockedBy("has_peanut_mooncake_peanuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 葱油月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "olive_oils"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenonions"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenonions"))))
                .unlockedBy("has_hunan_scallion_mooncake_greenonions",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "greenonions"))))
                .unlockedBy("has_hunan_scallion_mooncake_olive_oils",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "olive_oils"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItems.PEPPER_SALT)
                .addIngredient(ModItems.PEPPER_SALT)
                .addIngredient(ModItems.PEPPER_SALT)
                .unlockedBy("has_pepper-salt_mooncake_greenonions", has(ModItems.PEPPER_SALT.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑麻椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItems.PEPPER_SALT)
                .addIngredient(ModItems.PEPPER_SALT)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "paprika"))))
                .unlockedBy("has_black_sesame_pepper-salt_mooncake_paprika",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "paprika"))))
                .unlockedBy("has_black_sesame_pepper-salt_mooncake_pepper_salt", has(ModItems.PEPPER_SALT.get()))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .unlockedBy("has_mango_mooncake_mangos",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果椰奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .unlockedBy("has_mango_coconut_mooncake_mangos",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 肉桂苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Items.APPLE)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cinnamon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cinnamon"))))
                .unlockedBy("has_cinnamon_apple_mooncake_cinnamon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cinnamon"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 热带水果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bananas"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .unlockedBy("has_tropical_fruit_mooncake_mangos",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .unlockedBy("has_tropical_fruit_mooncake_pineapples",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .unlockedBy("has_tropical_fruit_mooncake_bananas",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bananas"))))
                .unlockedBy("has_tropical_fruit_mooncake_coconuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 浆果荟萃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raspberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberry"))))
                .unlockedBy("has_berry_medley_mooncake_blackberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blackberries"))))
                .unlockedBy("has_berry_medley_mooncake_blueberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .unlockedBy("has_berry_medley_mooncake_raspberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raspberries"))))
                .unlockedBy("has_berry_medley_mooncake_strawberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "strawberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 柑橘炸弹月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemons"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "grapefruits"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "limes"))))
                .unlockedBy("has_citrus_blast_mooncake_oranges",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .unlockedBy("has_citrus_blast_mooncake_lemons",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemons"))))
                .unlockedBy("has_citrus_blast_mooncake_grapefruits",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "grapefruits"))))
                .unlockedBy("has_citrus_blast_mooncake_limes",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "limes"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 扁桃仁樱桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "almonds"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cherries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cherries"))))
                .unlockedBy("has_almond-cherry_mooncake_almonds",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "almonds"))))
                .unlockedBy("has_almond-cherry_mooncake_cherries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cherries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 腰果芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .unlockedBy("has_cashew-mango_mooncake_almonds",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mangos"))))
                .unlockedBy("has_cashew-mango_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲜虾芦笋月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "asparagus"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "asparagus"))))
                .unlockedBy("has_shrimp-asparagus_mooncake_shrimp",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .unlockedBy("has_shrimp-asparagus_mooncake_asparagus",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "asparagus"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 螃蟹玉米月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRAB_CORNS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "corn"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "corn"))))
                .unlockedBy("has_crab-corns_mooncake_crabs",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .unlockedBy("has_crab-corns_mooncake_corn",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "corn"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金枪鱼牛油果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "avocados"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "avocados"))))
                .unlockedBy("has_tuna-avocado_mooncake_tuna",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .unlockedBy("has_tuna-avocado_mooncake_avocados",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "avocados"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠菜核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_spinach-walnut_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "spinach"))))
                .unlockedBy("has_spinach-walnut_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_pineapple-ham_mooncake_pineapples",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pineapples"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_cranberry-walnut_mooncake_cranberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cranberries"))))
                .unlockedBy("has_cranberry-walnut_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓酸奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemonades"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .unlockedBy("has_blueberry_yogurt_mooncake_lemonades",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemonades"))))
                .unlockedBy("has_blueberry_yogurt_mooncake_cranberries",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "blueberries"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 海鲜总汇月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "roe"))))
                .unlockedBy("has_seafood_medley_mooncake_tuna",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .unlockedBy("has_seafood_medley_mooncake_shrimp",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .unlockedBy("has_seafood_medley_mooncake_crabs",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .unlockedBy("has_seafood_medley_mooncake_roe",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "roe"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔬菜之王月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "kale"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "vegetables"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sweetpotatos"))))
                .unlockedBy("has_king_of_veggies_mooncake_kale",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "kale"))))
                .unlockedBy("has_king_of_veggies_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "spinach"))))
                .unlockedBy("has_king_of_veggies_mooncake_vegetables",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "vegetables"))))
                .unlockedBy("has_king_of_veggies_mooncake_sweetpotatos",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sweetpotatos"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .unlockedBy("has_five_kernels_mooncake_peanuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .unlockedBy("has_five_kernels_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_five_kernels_mooncake_cashews",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .unlockedBy("has_five_kernels_mooncake_pecans",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 叉烧月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BBQ_PORK_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pepperoni"))))
                .unlockedBy("has_bbq_pork_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .unlockedBy("has_bbq_pork_mooncake_pepperoni",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pepperoni"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 叉烧五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_peanuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cashews",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_pecans",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金腿五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanuts"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cashews",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cashews"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_pecans",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pecans"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 栗蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItems.LOTUS_SEED)
                .addIngredient(ModItems.LOTUS_SEED)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "currants"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "currants"))))
                .unlockedBy("has_chestnut_paste_mooncake_lotus_seed", has(ModItems.LOTUS_SEED.get()))
                .unlockedBy("has_chestnut_paste_mooncake_currants",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "currants"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 核桃枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .unlockedBy("has_walnut-date_paste_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "walnuts"))))
                .unlockedBy("has_walnut-date_paste_mooncake_dates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 梅干菜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mustard"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mustard"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mustard"))))
                .unlockedBy("has_preserved_mustard_green_mooncake_salts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .unlockedBy("has_preserved_mustard_green_mooncake_walnuts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "mustard"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 榨菜鲜肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .unlockedBy("has_pickled_mustard-pork_mooncake_bacon",  has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_pickled_mustard-pork_mooncake_salts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 奶茶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MILK_TEA_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tea_leaves"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tea_leaves"))))
                .unlockedBy("has_milk_tea_mooncake_leaves",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tea_leaves"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 橙皮丁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .unlockedBy("has_candied_orange_peel_mooncake_oranges",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
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

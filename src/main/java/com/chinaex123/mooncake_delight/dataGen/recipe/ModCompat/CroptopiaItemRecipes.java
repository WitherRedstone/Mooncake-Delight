package com.chinaex123.mooncake_delight.dataGen.recipe.ModCompat;

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
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausages"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausages"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausages"))))
                .unlockedBy("has_sausage_mooncake_sugar",  has(ModItemTags.SUGARS))
                .unlockedBy("has_sausage_mooncake_onion",  has(CommonTags.CROPS_ONION))
                .unlockedBy("has_sausage_mooncake_sausage",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "sausages"))))
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
                .unlockedBy("has_calamari_mooncake_sugar",  has(ModItemTags.SUGARS))
                .unlockedBy("has_calamari_mooncake_onion",  has(CommonTags.CROPS_ONION))
                .unlockedBy("has_calamari_mooncake_calamari",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "calamari"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .unlockedBy("has_pineapple_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 草莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.STRAWBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .unlockedBy("has_strawberry_mooncake_strawberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .unlockedBy("has_blueberry_mooncake_blueberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .unlockedBy("has_cranberry_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACKBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .unlockedBy("has_blackberry_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椰蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.COCONUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .unlockedBy("has_coconut_paste_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "coconuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JUJUBE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .unlockedBy("has_jujube_paste_mooncake_date",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 绿豆月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MUNG_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenbean"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenbean"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenbean"))))
                .unlockedBy("has_mung_mooncake_greenbean",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenbean"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 花生月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEANUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_peanut_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "peanut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 葱油月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "olive_oils"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenonion"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenonion"))))
                .unlockedBy("has_hunan_scallion_mooncake_olive_oil",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "olive_oils"))))
                .unlockedBy("has_hunan_scallion_mooncake_greenonion",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/greenonion"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(ModItemTags.PEPPER_SALT)
                .addIngredient(ModItemTags.PEPPER_SALT)
                .addIngredient(ModItemTags.PEPPER_SALT)
                .unlockedBy("has_pepper_salt_mooncake_pepper_salt", has(ModItemTags.PEPPER_SALT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑麻椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.PEPPER_SALT)
                .addIngredient(ModItemTags.PEPPER_SALT)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "paprika"))))
                .unlockedBy("has_black_sesame_pepper_salt_mooncake_paprika",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "paprika"))))
                .unlockedBy("has_black_sesame_pepper_salt_mooncake_pepper_salt", has(ModItemTags.PEPPER_SALT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .unlockedBy("has_mango_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果椰奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .unlockedBy("has_mango_coconut_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .unlockedBy("has_mango_coconut_mooncake_coconut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 肉桂苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "apples"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cinnamon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cinnamon"))))
                .unlockedBy("has_cinnamon_apple_mooncake_apple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "apples"))))
                .unlockedBy("has_cinnamon_apple_mooncake_cinnamon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cinnamon"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 热带水果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/banana"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .unlockedBy("has_tropical_fruit_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .unlockedBy("has_tropical_fruit_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .unlockedBy("has_tropical_fruit_mooncake_banana",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/banana"))))
                .unlockedBy("has_tropical_fruit_mooncake_coconut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 浆果荟萃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/raspberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .unlockedBy("has_berry_medley_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blackberry"))))
                .unlockedBy("has_berry_medley_mooncake_blueberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .unlockedBy("has_berry_medley_mooncake_raspberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/raspberry"))))
                .unlockedBy("has_berry_medley_mooncake_strawberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/strawberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 柑橘炸弹月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/lemon"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/grapefruit"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/lime"))))
                .unlockedBy("has_citrus_blast_mooncake_orange",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .unlockedBy("has_citrus_blast_mooncake_lemon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/lemon"))))
                .unlockedBy("has_citrus_blast_mooncake_grapefruit",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/grapefruit"))))
                .unlockedBy("has_citrus_blast_mooncake_lime",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/lime"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 扁桃仁樱桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cherry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cherry"))))
                .unlockedBy("has_almond-cherry_mooncake_almond",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .unlockedBy("has_almond-cherry_mooncake_cherry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cherry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 腰果芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .unlockedBy("has_cashew-mango_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mango"))))
                .unlockedBy("has_cashew-mango_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲜虾芦笋月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/asparagus"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/asparagus"))))
                .unlockedBy("has_shrimp-asparagus_mooncake_shrimp",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shrimp"))))
                .unlockedBy("has_shrimp-asparagus_mooncake_asparagus",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/asparagus"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 螃蟹玉米月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRAB_CORNS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/corn"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/corn"))))
                .unlockedBy("has_crab-corns_mooncake_crabs",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crabs"))))
                .unlockedBy("has_crab-corns_mooncake_corn",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/corn"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金枪鱼牛油果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/avocado"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/avocado"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/avocado"))))
                .unlockedBy("has_tuna-avocado_mooncake_tuna",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tuna"))))
                .unlockedBy("has_tuna-avocado_mooncake_avocado",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/avocado"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠菜核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_spinach-walnut_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/spinach"))))
                .unlockedBy("has_spinach-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_pineapple-ham_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pineapple"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_cranberry-walnut_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cranberry"))))
                .unlockedBy("has_cranberry-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓酸奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemonades"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
                .unlockedBy("has_blueberry_yogurt_mooncake_lemonades",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "lemonades"))))
                .unlockedBy("has_blueberry_yogurt_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/blueberry"))))
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
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/kale"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/spinach"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/yam"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/sweetpotato"))))
                .unlockedBy("has_king_of_veggies_mooncake_kale",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/kale"))))
                .unlockedBy("has_king_of_veggies_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/spinach"))))
                .unlockedBy("has_king_of_veggies_mooncake_yam",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/yam"))))
                .unlockedBy("has_king_of_veggies_mooncake_sweetpotato",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/sweetpotato"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
                .unlockedBy("has_five_kernels_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .unlockedBy("has_five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
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
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cooked_bacon"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金腿五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/cashew"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/pecan"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 栗蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/currant"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/currant"))))
                .unlockedBy("has_chestnut_paste_mooncake_lotus_seed", has(ModItemTags.CROPS_LOTUS))
                .unlockedBy("has_chestnut_paste_mooncake_currant",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/currant"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 核桃枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .unlockedBy("has_walnut-date_paste_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_walnut-date_paste_mooncake_date",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/date"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 梅干菜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mustard"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mustard"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mustard"))))
                .unlockedBy("has_preserved_mustard_green_mooncake_salt",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/salt"))))
                .unlockedBy("has_preserved_mustard_green_mooncake_mustard",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/mustard"))))
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
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .unlockedBy("has_milk_tea_mooncake_leaves",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 橙皮丁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .unlockedBy("has_candied_orange_peel_mooncake_orange",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/orange"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 焦糖月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CARAMEL_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .unlockedBy("has_caramel_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 焦糖海盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .unlockedBy("has_caramel_sea_salt_mooncake_salts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salts"))))
                .unlockedBy("has_caramel_sea_salt_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝士流心月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHEESE_LAVA_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .unlockedBy("has_cheese_lava_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝士焦糖月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHEESE_CARAMEL_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .unlockedBy("has_cheese_caramel_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .unlockedBy("has_cheese_caramel_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黄油巧克力月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BUTTER_CHOCOLATE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "butters"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .unlockedBy("has_butter_chocolate_mooncake_butters",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "butters"))))
                .unlockedBy("has_butter_chocolate_mooncake_chocolates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黄油芝士月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BUTTER_CHEESE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "butters"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .unlockedBy("has_butter_cheese_mooncake_butters",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "butters"))))
                .unlockedBy("has_butter_cheese_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 流心巧克力月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .unlockedBy("has_lava_chocolate_mooncake_chocolates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chocolates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 伯爵茶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.EARL_GREY_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(Tags.Items.DRINKS_MILK)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .unlockedBy("has_earl_grey_mooncake_tea_leaves",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/tea_leaves"))))
                .unlockedBy("has_earl_grey_mooncake_oranges",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "oranges"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_sesame-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/walnut"))))
                .unlockedBy("has_sesame-walnut_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻花生月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_PEANUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_sesame-peanut_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/peanut"))))
                .unlockedBy("has_sesame-peanut_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻杏仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_ALMOND_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .unlockedBy("has_sesame-almond_mooncake_almond",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/almond"))))
                .unlockedBy("has_sesame-almond_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻芝士月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_CHEESE_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItemTags.CROPS_SESAME)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .unlockedBy("has_sesame-almond_mooncake_cheese",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "cheeses"))))
                .unlockedBy("has_sesame-almond_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑芝麻椰蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACK_SESAME_COCONUT_MOONCAKE.get(), 1, 20 * 20,0.5F, ModItems.MOONCAKE_MOLD)
                .addIngredient(ModItems.MOONCAKE_CRUST_DOUGH)
                .addIngredient(ModItemTags.SUGARS)
                .addIngredient(ModItems.BLACK_SESAME)
                .addIngredient(ModItemTags.CROPS_LOTUS)
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .addIngredient(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .unlockedBy("has_black_sesame-coconut_mooncake_cheese",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crops/coconut"))))
                .unlockedBy("has_black_sesame-coconut_mooncake_white_sesame", has(ModItemTags.CROPS_SESAME))
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

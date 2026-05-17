package com.chinaex123.mooncake_delight.dataGen.recipe.ModCompat;

import com.chinaex123.mooncake_delight.init.MDItems;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.init.MDItemTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CroptopiaItemRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public CroptopiaItemRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCroptopiaItem(Consumer<FinishedRecipe> recipeOutput) {

        // ======================= 作物盛景 联动 =======================
        // 香肠月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SAUSAGE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.CROPS_ONION)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "sausages")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "sausages")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "sausages")))
                .unlockedBy("has_sausage_mooncake_sugar",  has(MDItemTags.SUGARS))
                .unlockedBy("has_sausage_mooncake_onion",  has(CommonTags.Items.CROPS_ONION))
                .unlockedBy("has_sausage_mooncake_sausage",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "sausages"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鱿鱼月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CALAMARI_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.CROPS_ONION)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "calamari")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "calamari")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "calamari")))
                .unlockedBy("has_calamari_mooncake_sugar",  has(MDItemTags.SUGARS))
                .unlockedBy("has_calamari_mooncake_onion",  has(CommonTags.Items.CROPS_ONION))
                .unlockedBy("has_calamari_mooncake_calamari",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "calamari"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .unlockedBy("has_pineapple_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 草莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.STRAWBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry")))
                .unlockedBy("has_strawberry_mooncake_strawberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .unlockedBy("has_blueberry_mooncake_blueberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry")))
                .unlockedBy("has_cranberry_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑莓月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACKBERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry")))
                .unlockedBy("has_blackberry_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椰蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.COCONUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .unlockedBy("has_coconut_paste_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "coconuts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JUJUBE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date")))
                .unlockedBy("has_jujube_paste_mooncake_date",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 绿豆月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MUNG_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenbean")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenbean")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenbean")))
                .unlockedBy("has_mung_mooncake_greenbean",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenbean"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 花生月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEANUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .unlockedBy("has_peanut_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "peanut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 葱油月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "olive_oils")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenonion")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenonion")))
                .unlockedBy("has_hunan_scallion_mooncake_olive_oil",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "olive_oils"))))
                .unlockedBy("has_hunan_scallion_mooncake_greenonion",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/greenonion"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.CROPS_ONION)
                .addIngredient(MDItemTags.PEPPER_SALT)
                .addIngredient(MDItemTags.PEPPER_SALT)
                .addIngredient(MDItemTags.PEPPER_SALT)
                .unlockedBy("has_pepper_salt_mooncake_pepper_salt", has(MDItemTags.PEPPER_SALT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑麻椒盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.PEPPER_SALT)
                .addIngredient(MDItemTags.PEPPER_SALT)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "paprika")))
                .unlockedBy("has_black_sesame_pepper_salt_mooncake_paprika",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "paprika"))))
                .unlockedBy("has_black_sesame_pepper_salt_mooncake_pepper_salt", has(MDItemTags.PEPPER_SALT))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .unlockedBy("has_mango_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芒果椰奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .unlockedBy("has_mango_coconut_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango"))))
                .unlockedBy("has_mango_coconut_mooncake_coconut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 肉桂苹果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "apples")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cinnamon")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cinnamon")))
                .unlockedBy("has_cinnamon_apple_mooncake_apple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "apples"))))
                .unlockedBy("has_cinnamon_apple_mooncake_cinnamon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cinnamon"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 热带水果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/banana")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .unlockedBy("has_tropical_fruit_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango"))))
                .unlockedBy("has_tropical_fruit_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple"))))
                .unlockedBy("has_tropical_fruit_mooncake_banana",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/banana"))))
                .unlockedBy("has_tropical_fruit_mooncake_coconut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 浆果荟萃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/raspberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry")))
                .unlockedBy("has_berry_medley_mooncake_blackberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blackberry"))))
                .unlockedBy("has_berry_medley_mooncake_blueberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry"))))
                .unlockedBy("has_berry_medley_mooncake_raspberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/raspberry"))))
                .unlockedBy("has_berry_medley_mooncake_strawberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/strawberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 柑橘炸弹月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/lemon")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/grapefruit")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/lime")))
                .unlockedBy("has_citrus_blast_mooncake_orange",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange"))))
                .unlockedBy("has_citrus_blast_mooncake_lemon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/lemon"))))
                .unlockedBy("has_citrus_blast_mooncake_grapefruit",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/grapefruit"))))
                .unlockedBy("has_citrus_blast_mooncake_lime",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/lime"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 扁桃仁樱桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cherry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cherry")))
                .unlockedBy("has_almond-cherry_mooncake_almond",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond"))))
                .unlockedBy("has_almond-cherry_mooncake_cherry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cherry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 腰果芒果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew")))
                .unlockedBy("has_cashew-mango_mooncake_mango",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mango"))))
                .unlockedBy("has_cashew-mango_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 鲜虾芦笋月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "shrimp")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "shrimp")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/asparagus")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/asparagus")))
                .unlockedBy("has_shrimp-asparagus_mooncake_shrimp",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "shrimp"))))
                .unlockedBy("has_shrimp-asparagus_mooncake_asparagus",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/asparagus"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 螃蟹玉米月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRAB_CORNS_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crabs")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crabs")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/corn")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/corn")))
                .unlockedBy("has_crab-corns_mooncake_crabs",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crabs"))))
                .unlockedBy("has_crab-corns_mooncake_corn",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/corn"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金枪鱼牛油果月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "tuna")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/avocado")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/avocado")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/avocado")))
                .unlockedBy("has_tuna-avocado_mooncake_tuna",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "tuna"))))
                .unlockedBy("has_tuna-avocado_mooncake_avocado",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/avocado"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠菜核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/spinach")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/spinach")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .unlockedBy("has_spinach-walnut_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/spinach"))))
                .unlockedBy("has_spinach-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 菠萝火腿月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.CROPS_ONION)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple")))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_pineapple-ham_mooncake_pineapple",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pineapple"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔓越莓核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .unlockedBy("has_cranberry-walnut_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cranberry"))))
                .unlockedBy("has_cranberry-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蓝莓酸奶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "lemonades")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry")))
                .unlockedBy("has_blueberry_yogurt_mooncake_lemonades",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "lemonades"))))
                .unlockedBy("has_blueberry_yogurt_mooncake_cranberry",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/blueberry"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 海鲜总汇月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "tuna")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "shrimp")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crabs")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "roe")))
                .unlockedBy("has_seafood_medley_mooncake_tuna",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "tuna"))))
                .unlockedBy("has_seafood_medley_mooncake_shrimp",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "shrimp"))))
                .unlockedBy("has_seafood_medley_mooncake_crabs",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crabs"))))
                .unlockedBy("has_seafood_medley_mooncake_roe",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "roe"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 蔬菜之王月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/kale")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/spinach")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/yam")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/sweetpotato")))
                .unlockedBy("has_king_of_veggies_mooncake_kale",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/kale"))))
                .unlockedBy("has_king_of_veggies_mooncake_spinach",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/spinach"))))
                .unlockedBy("has_king_of_veggies_mooncake_yam",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/yam"))))
                .unlockedBy("has_king_of_veggies_mooncake_sweetpotato",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/sweetpotato"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan")))
                .unlockedBy("has_five_kernels_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut"))))
                .unlockedBy("has_five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .unlockedBy("has_five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew"))))
                .unlockedBy("has_five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 叉烧月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BBQ_PORK_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.CROPS_ONION)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cooked_bacon")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cooked_bacon")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "pepperoni")))
                .unlockedBy("has_bbq_pork_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cooked_bacon"))))
                .unlockedBy("has_bbq_pork_mooncake_pepperoni",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "pepperoni"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 叉烧五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cooked_bacon")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan")))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cooked_bacon"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew"))))
                .unlockedBy("has_bbq_pork-five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 金腿五仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan")))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_ham", has(vectorwing.farmersdelight.common.registry.ModItems.HAM.get()))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cooked_bacon",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_cashew",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/cashew"))))
                .unlockedBy("has_jinhua_ham-five_kernels_mooncake_pecan",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/pecan"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 栗蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.CROPS_LOTUS)
                .addIngredient(MDItemTags.CROPS_LOTUS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/currant")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/currant")))
                .unlockedBy("has_chestnut_paste_mooncake_lotus_seed", has(MDItemTags.CROPS_LOTUS))
                .unlockedBy("has_chestnut_paste_mooncake_currant",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/currant"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 核桃枣泥月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date")))
                .unlockedBy("has_walnut-date_paste_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .unlockedBy("has_walnut-date_paste_mooncake_date",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/date"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 梅干菜月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mustard")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mustard")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mustard")))
                .unlockedBy("has_preserved_mustard_green_mooncake_salt",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/salt"))))
                .unlockedBy("has_preserved_mustard_green_mooncake_mustard",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/mustard"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 榨菜鲜肉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.BACON.get())
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts")))
                .unlockedBy("has_pickled_mustard-pork_mooncake_bacon",  has(vectorwing.farmersdelight.common.registry.ModItems.BACON.get()))
                .unlockedBy("has_pickled_mustard-pork_mooncake_salts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 奶茶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.MILK_TEA_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves")))
                .unlockedBy("has_milk_tea_mooncake_leaves",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 橙皮丁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange")))
                .unlockedBy("has_candied_orange_peel_mooncake_orange",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/orange"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 焦糖月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CARAMEL_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .unlockedBy("has_caramel_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 焦糖海盐月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .unlockedBy("has_caramel_sea_salt_mooncake_salts",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salts"))))
                .unlockedBy("has_caramel_sea_salt_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝士流心月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHEESE_LAVA_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .unlockedBy("has_cheese_lava_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝士焦糖月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.CHEESE_CARAMEL_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel")))
                .unlockedBy("has_cheese_caramel_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses"))))
                .unlockedBy("has_cheese_caramel_mooncake_caramel",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "caramel"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黄油巧克力月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BUTTER_CHOCOLATE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "butters")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates")))
                .unlockedBy("has_butter_chocolate_mooncake_butters",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "butters"))))
                .unlockedBy("has_butter_chocolate_mooncake_chocolates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黄油芝士月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BUTTER_CHEESE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "butters")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .unlockedBy("has_butter_cheese_mooncake_butters",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "butters"))))
                .unlockedBy("has_butter_cheese_mooncake_cheeses",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 流心巧克力月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates")))
                .unlockedBy("has_lava_chocolate_mooncake_chocolates",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "chocolates"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 伯爵茶月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.EARL_GREY_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(CommonTags.Items.MILK)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "oranges")))
                .unlockedBy("has_earl_grey_mooncake_tea_leaves",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/tea_leaves"))))
                .unlockedBy("has_earl_grey_mooncake_oranges",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "oranges"))))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻核桃月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_WALNUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.CROPS_SESAME)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut")))
                .unlockedBy("has_sesame-walnut_mooncake_walnut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/walnut"))))
                .unlockedBy("has_sesame-walnut_mooncake_white_sesame", has(MDItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻花生月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_PEANUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.CROPS_SESAME)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut")))
                .unlockedBy("has_sesame-peanut_mooncake_peanut",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/peanut"))))
                .unlockedBy("has_sesame-peanut_mooncake_white_sesame", has(MDItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻杏仁月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_ALMOND_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.CROPS_SESAME)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond")))
                .unlockedBy("has_sesame-almond_mooncake_almond",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/almond"))))
                .unlockedBy("has_sesame-almond_mooncake_white_sesame", has(MDItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 芝麻芝士月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.SESAME_CHEESE_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItemTags.CROPS_SESAME)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses")))
                .unlockedBy("has_sesame-almond_mooncake_cheese",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "cheeses"))))
                .unlockedBy("has_sesame-almond_mooncake_white_sesame", has(MDItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .save(recipeOutput);
        // 黑芝麻椰蓉月饼
        CookingPotRecipeBuilder.cookingPotRecipe(CroptopiaItems.BLACK_SESAME_COCONUT_MOONCAKE.get(), 1, 20 * 20,0.5F, MDItems.MOONCAKE_MOLD.get())
                .addIngredient(MDItems.MOONCAKE_CRUST_DOUGH.get())
                .addIngredient(MDItemTags.SUGARS)
                .addIngredient(MDItems.BLACK_SESAME.get())
                .addIngredient(MDItemTags.CROPS_LOTUS)
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .addIngredient(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut")))
                .unlockedBy("has_black_sesame-coconut_mooncake_cheese",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "crops/coconut"))))
                .unlockedBy("has_black_sesame-coconut_mooncake_white_sesame", has(MDItemTags.CROPS_SESAME))
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
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

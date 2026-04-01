package com.chinaex123.mooncake_delight.dataGen.recipe;

import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import com.chinaex123.mooncake_delight.tags.ModItemTags;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModCraftingRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public ModCraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCraftingRecipes(@NotNull RecipeOutput recipeOutput) {
        // ==================== 有序合成 ====================
        // 油浸刀
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.OILED_KNIFE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', ModTags.KNIVES)
                .define('B', ModItems.TALLOW)
                .unlockedBy("has_oiled_knife", has(ModItems.TALLOW.get()))
                .save(recipeOutput);
        // 月饼模具
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MOONCAKE_MOLD.get())
                .pattern(" CA")
                .pattern(" CC")
                .pattern("B  ")
                .define('A', ModItemTags.FLOURS)
                .define('B', Tags.Items.RODS_WOODEN)
                .define('C', ItemTags.PLANKS)
                .unlockedBy("has_mooncake_mold", has(vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get()))
                .save(recipeOutput);
        // 动物油脂
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.TALLOW.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TALLOW_CRUMBS)
                .unlockedBy("has_tallow_crumbs", has(ModItems.TALLOW_CRUMBS.get()))
                .save(recipeOutput);
        // 面团
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get(),3)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', Tags.Items.BUCKETS_WATER)
                .define('B', ModItems.FLOUR)
                .unlockedBy("has_wheat_dough", has(vectorwing.farmersdelight.common.registry.ModItems.WHEAT_DOUGH.get()))
                .save(recipeOutput);

        // ==================== 无形状合成 ====================
        // 动物油脂碎
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.TALLOW_CRUMBS.get(),9)
                .requires(ModItems.TALLOW)
                .unlockedBy("has_tallow", has(ModItems.TALLOW.get()))
                .save(recipeOutput);

        // ======================= 作物盛景 联动 =======================
        // 胡椒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CroptopiaItems.PEPPER_SALT.get(), 2)
                .requires(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pepper"))), 1)
                .requires(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salt"))), 1)
                .unlockedBy("has_sugar_pepper",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "pepper"))))
                .unlockedBy("has_sugar_salt",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "salt"))))
                .save(recipeOutput);




        //.requires(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("croptopia", "pepper")))
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

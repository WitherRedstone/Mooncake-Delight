package com.chinaex123.mooncake_delight.dataGen.recipe;

import com.chinaex123.mooncake_delight.init.MDItems;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.init.MDItemTags;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModCraftingRecipes {

    private final PackOutput output;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public ModCraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        this.output = output;
        this.registries = registries;
    }

    public void buildCraftingRecipes(Consumer<FinishedRecipe> recipeOutput) {
        // ==================== 有序合成 ====================
        // 油浸刀
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MDItems.OILED_KNIFE.get())
                .pattern(" B ")
                .pattern("BAB")
                .pattern(" B ")
                .define('A', ModTags.Items.KNIVES)
                .define('B', MDItems.TALLOW.get())
                .unlockedBy("has_oiled_knife", has(MDItems.TALLOW.get()))
                .save(recipeOutput);
        // 月饼模具
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, MDItems.MOONCAKE_MOLD.get())
                .pattern(" CA")
                .pattern(" CC")
                .pattern("B  ")
                .define('A', MDItemTags.FLOUR)
                .define('B', Tags.Items.RODS_WOODEN)
                .define('C', ItemTags.PLANKS)
                .unlockedBy("has_mooncake_mold", has(ModItems.WHEAT_DOUGH.get()))
                .save(recipeOutput);
        // 动物油脂
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, MDItems.TALLOW.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', MDItems.TALLOW_CRUMBS.get())
                .unlockedBy("has_tallow_crumbs", has(MDItems.TALLOW_CRUMBS.get()))
                .save(recipeOutput);
        // 面团
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.WHEAT_DOUGH.get(),3)
                .pattern("BBB")
                .pattern("BAB")
                .pattern("BBB")
                .define('A', CommonTags.Items.BUCKETS_WATER)
                .define('B', MDItemTags.FLOUR)
                .unlockedBy("has_wheat_dough", has(ModItems.WHEAT_DOUGH.get()))
                .save(recipeOutput);

        // ==================== 无形状合成 ====================
        // 动物油脂碎
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MDItems.TALLOW_CRUMBS.get(),9)
                .requires(MDItems.TALLOW.get())
                .unlockedBy("has_tallow", has(MDItems.TALLOW.get()))
                .save(recipeOutput);

        // ======================= 作物盛景 联动 =======================
        // 胡椒
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, CroptopiaItems.PEPPER_SALT.get(), 2)
                .requires(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "pepper"))), 1)
                .requires(Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salt"))), 1)
                .unlockedBy("has_sugar_pepper",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "pepper"))))
                .unlockedBy("has_sugar_salt",  has(ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "salt"))))
                .save(recipeOutput);




        //.requires(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("croptopia", "pepper")))
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

//package com.chinaex123.mooncake_delight.dataGen;
//
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.*;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.tags.ItemTags;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.neoforged.neoforge.common.Tags;
//import net.neoforged.neoforge.common.conditions.IConditionBuilder;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.concurrent.CompletableFuture;
//
//public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
//    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
//        super(output, registries);
//    }
//
//    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
//
//        // ==================== 基础工具 ====================
//        // 木锤
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
//                        ModItems.WOOD_HAMMER.get())
//                .pattern(" BA")
//                .pattern(" AB")
//                .pattern("A  ")
//                .define('A', Tags.Items.RODS_WOODEN)
//                .define('B', ItemTags.LOGS)
//                .unlockedBy("has_wood_hammer", has(ItemTags.LOGS))
//                .save(recipeOutput);
//    }
//}

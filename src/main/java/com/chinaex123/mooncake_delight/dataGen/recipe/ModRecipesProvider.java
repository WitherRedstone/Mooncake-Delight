package com.chinaex123.mooncake_delight.dataGen.recipe;

import com.chinaex123.mooncake_delight.dataGen.recipe.ModCompat.CroptopiaItemRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider {

    private final ModCraftingRecipes craftingRecipes;
    private final IngredientRecipes IngredientRecipes;
    private final VanillaMooncakeRecipes VanillaMooncake;

    // ======================= 作物盛景 联动 =======================
    private final CroptopiaItemRecipes CroptopiaItem;

    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output);

        // 初始化各个配方类
        this.craftingRecipes = new ModCraftingRecipes(output, registries);
        this.IngredientRecipes = new IngredientRecipes(output, registries);
        this.VanillaMooncake = new VanillaMooncakeRecipes(output, registries);

        // ======================= 作物盛景 联动 =======================
        this.CroptopiaItem = new CroptopiaItemRecipes(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipeOutput) {
        // 调用各个配方类的注册方法
        craftingRecipes.buildCraftingRecipes(recipeOutput);
        IngredientRecipes.buildCookingRecipes(recipeOutput);
        VanillaMooncake.buildVanillaRecipes(recipeOutput);

        // ======================= 作物盛景 联动 =======================
        CroptopiaItem.buildCroptopiaItem(recipeOutput);
    }
}

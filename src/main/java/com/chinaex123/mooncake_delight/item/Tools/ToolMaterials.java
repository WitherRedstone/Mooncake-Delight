package com.chinaex123.mooncake_delight.item.Tools;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ToolMaterials implements Tier {

    OILED_KNIFE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 128, 2F, 1.5F, -2.4F, 12, () -> Ingredient.of(ItemTags.PLANKS));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final float attackSpeed;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ToolMaterials(TagKey<Block> incorrectBlocksForDrops, int uses, float speed, float damage, float attackSpeed, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    public float getAttackSpeed() {
        return this.attackSpeed;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

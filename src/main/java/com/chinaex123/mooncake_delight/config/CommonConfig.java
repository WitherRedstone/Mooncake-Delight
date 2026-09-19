package com.chinaex123.mooncake_delight.config;


import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.DoubleValue GRASS_WHITE_SESAME_DROP_CHANCE;
    public static final ForgeConfigSpec.DoubleValue END_CITY_BEDROCK_MOONCAKE_CHANCE;
    public static final ForgeConfigSpec.DoubleValue BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE;
    public static final ForgeConfigSpec.DoubleValue DESERT_PYRAMID_TNT_MOONCAKE_CHANCE;
    public static final ForgeConfigSpec.DoubleValue BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE;
    public static final ForgeConfigSpec.DoubleValue ENDER_DRAGON_ENCHANTED_GOLDEN_APPLE_MOONCAKE_CHANCE;
    public static final ForgeConfigSpec.DoubleValue BURNT_ANIMAL_TALLOW_CRUMBS_CHANCE;
    public static final ForgeConfigSpec.DoubleValue OILED_KNIFE_BURNT_TALLOW_CRUMBS_CHANCE;
    public static final ForgeConfigSpec.DoubleValue OILED_KNIFE_BURNT_TALLOW_CHANCE;
    public static final ForgeConfigSpec.BooleanValue ANVIL_DROP_RECIPE_ENABLED;

    public static final ForgeConfigSpec SPEC;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("通用配置").push("Common Config");
        ANVIL_DROP_RECIPE_ENABLED = builder
                .comment("启用铁砧掉落配方功能")
                .comment("Enable anvil drop recipe feature")
                .define("anvilDropRecipeEnabled", true);
        builder.pop();

        builder.comment("方块战利品").push("Block Loot");
        GRASS_WHITE_SESAME_DROP_CHANCE = builder
                .comment("白芝麻从草丛掉落的概率（%）")
                .comment("Chance for white sesame to drop from grass (%)")
                .defineInRange("grassWhiteSesameDropChance", 0.05, 0.0, 1.0);
        builder.pop();

        builder.comment("宝箱战利品").push("Chest Loot");
        END_CITY_BEDROCK_MOONCAKE_CHANCE = builder
                .comment("末地城宝藏箱子中出现基岩月饼的概率（%）")
                .comment("Chance for Bedrock Mooncake to appear in End City treasure chests (%)")
                .defineInRange("endCityBedrockMooncakeChance", 0.01, 0.0, 1.0);
        BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE = builder
                .comment("堡垒遗迹宝藏室箱子中出现残骸月饼的概率（%）")
                .comment("Chance for debris Mooncake to appear in Bastion treasure chests (%)")
                .defineInRange("bastionTreasureDebrisMooncakeChance", 0.10, 0.0, 1.0);
        BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE = builder
                .comment("堡垒遗迹疣猪兽棚箱子中出现流心月饼的概率（%）")
                .comment("Chance for Lava-filled Mooncake to appear in Bastion Remnant hoglin stable chests (%)")
                .defineInRange("bastionHoglinLavaMooncakeChance", 0.10, 0.0, 1.0);
        DESERT_PYRAMID_TNT_MOONCAKE_CHANCE = builder
                .comment("沙漠神殿箱子中出现TNT月饼的概率（%）")
                .comment("Chance for TNT Mooncake to appear in Desert Temple chests (%)")
                .defineInRange("desertPyramidTntMooncakeChance", 0.10, 0.0, 1.0);
        builder.pop();

        builder.comment("实体战利品").push("Entity Loot");
        ENDER_DRAGON_ENCHANTED_GOLDEN_APPLE_MOONCAKE_CHANCE = builder
                .comment("末影龙掉落附魔金苹果月饼的概率（%）")
                .comment("Chance for Enchanted Golden Apple Mooncake to drop from the Ender Dragon (%)")
                .defineInRange("enderDragonEnchantedGoldenAppleMooncakeChance", 0.25, 0.0, 1.0);
        BURNT_ANIMAL_TALLOW_CRUMBS_CHANCE = builder
                .comment("着火的动物掉落动物油脂碎的概率（%）")
                .comment("Chance for burnt tallow crumbs from pig/cow/sheep/goat when on fire (%)")
                .defineInRange("burntAnimalTallowCrumbsChance", 0.50, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CRUMBS_CHANCE = builder
                .comment("使用油浸刀击杀着火动物时掉落动物油脂碎的概率（%）")
                .comment("Chance for burnt tallow crumbs with oiled knife when animal is on fire (%)")
                .defineInRange("oiledKnifeBurntTallowCrumbsChance", 0.75, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CHANCE = builder
                .comment("使用油浸刀击杀着火动物时掉落动物油脂的概率（%）")
                .comment("Chance for burnt tallow with oiled knife when animal is on fire (%)")
                .defineInRange("oiledKnifeBurntTallowChance", 0.25, 0.0, 1.0);
        builder.pop();

        SPEC = builder.build();
    }
}

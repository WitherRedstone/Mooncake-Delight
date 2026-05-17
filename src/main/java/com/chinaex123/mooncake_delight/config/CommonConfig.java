package com.chinaex123.mooncake_delight.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfig {
    public static final ModConfigSpec.DoubleValue GRASS_WHITE_SESAME_DROP_CHANCE;
    public static final ModConfigSpec.DoubleValue END_CITY_BEDROCK_MOONCAKE_CHANCE;
    public static final ModConfigSpec.DoubleValue BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE;
    public static final ModConfigSpec.DoubleValue DESERT_PYRAMID_TNT_MOONCAKE_CHANCE;
    public static final ModConfigSpec.DoubleValue BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE;
    public static final ModConfigSpec.DoubleValue ENDER_DRAGON_ENCHANTED_GOLDEN_APPLE_MOONCAKE_CHANCE;
    public static final ModConfigSpec.DoubleValue BURNT_ANIMAL_TALLOW_CRUMBS_CHANCE;
    public static final ModConfigSpec.DoubleValue OILED_KNIFE_BURNT_TALLOW_CRUMBS_CHANCE;
    public static final ModConfigSpec.DoubleValue OILED_KNIFE_BURNT_TALLOW_CHANCE;
    public static final ModConfigSpec.BooleanValue ANVIL_DROP_RECIPE_ENABLED;

    public static final ModConfigSpec SPEC;

    static {
        ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

        builder.push("Common Config");

        builder.push("Block Loot");
        GRASS_WHITE_SESAME_DROP_CHANCE = builder
                .comment(
                        "Chance for white sesame to drop from grass (0.0 - 1.0)",
                        "白芝麻从草丛掉落的概率 (0.0 - 1.0)"
                )
                .defineInRange("grassWhiteSesameDropChance", 0.05, 0.0, 1.0);
        builder.pop();

        builder.push("Chest Loot");
        END_CITY_BEDROCK_MOONCAKE_CHANCE = builder
                .comment(
                        "Chance for bedrock mooncake in end city treasure chest (0.0 - 1.0, 0 to disable)",
                        "末地城宝藏箱子中基岩月饼的掉落概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("endCityBedrockMooncakeChance", 0.01, 0.0, 1.0);
        BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE = builder
                .comment(
                        "Chance for debris mooncake in bastion treasure chest (0.0 - 1.0, 0 to disable)",
                        "堡垒遗迹宝藏室箱子中残骸月饼的掉落概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("bastionTreasureDebrisMooncakeChance", 0.10, 0.0, 1.0);
        DESERT_PYRAMID_TNT_MOONCAKE_CHANCE = builder
                .comment(
                        "Chance for tnt mooncake in desert pyramid chest (0.0 - 1.0, 0 to disable)",
                        "沙漠神殿箱子中TNT月饼的掉落概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("desertPyramidTntMooncakeChance", 0.10, 0.0, 1.0);
        BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE = builder
                .comment(
                        "Chance for lava mooncake in bastion hoglin stable chest (0.0 - 1.0, 0 to disable)",
                        "堡垒遗迹疣猪兽棚箱子中流心月饼的掉落概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("bastionHoglinLavaMooncakeChance", 0.10, 0.0, 1.0);
        builder.pop();

        builder.push("Entity Loot");

        ENDER_DRAGON_ENCHANTED_GOLDEN_APPLE_MOONCAKE_CHANCE = builder
                .comment(
                        "Chance for enchanted golden apple mooncake from ender dragon (0.0 - 1.0, 0 to disable)",
                        "末影龙掉落附魔金苹果月饼的概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("enderDragonEnchantedGoldenAppleMooncakeChance", 0.25, 0.0, 1.0);
        BURNT_ANIMAL_TALLOW_CRUMBS_CHANCE = builder
                .comment(
                        "Chance for burnt tallow crumbs from pig/cow/sheep/goat when on fire (0.0 - 1.0, 0 to disable)",
                        "着火的猪/牛/羊/山羊掉落动物油脂碎的概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("burntAnimalTallowCrumbsChance", 0.50, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CRUMBS_CHANCE = builder
                .comment(
                        "Chance for burnt tallow crumbs with oiled knife when animal is on fire (0.0 - 1.0, 0 to disable)",
                        "使用油浸刀击杀着火动物时掉落动物油脂碎的概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("oiledKnifeBurntTallowCrumbsChance", 0.75, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CHANCE = builder
                .comment(
                        "Chance for burnt tallow with oiled knife when animal is on fire (0.0 - 1.0, 0 to disable)",
                        "使用油浸刀击杀着火动物时掉落动物油脂的概率 (0.0 - 1.0, 0 为禁用)"
                )
                .defineInRange("oiledKnifeBurntTallowChance", 0.25, 0.0, 1.0);

        builder.pop();

        builder.push("Game Mechanics");

        ANVIL_DROP_RECIPE_ENABLED = builder
                .comment(
                        "Enable anvil drop recipe feature",
                        "启用铁砧掉落配方功能"
                )
                .define("anvilDropRecipeEnabled", true);

        builder.pop();

        SPEC = builder.build();
    }
}

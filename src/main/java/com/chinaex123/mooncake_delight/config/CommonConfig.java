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

        builder.push("block_loot");
        GRASS_WHITE_SESAME_DROP_CHANCE = builder
                .comment("Chance for white sesame to drop from grass (0.0 - 1.0)")
                .defineInRange("grassWhiteSesameDropChance", 0.05, 0.0, 1.0);
        builder.pop();

        builder.push("chest_loot");
        END_CITY_BEDROCK_MOONCAKE_CHANCE = builder
                .comment("Chance for bedrock mooncake in end city treasure chest (0.0 - 1.0, 0 to disable)")
                .defineInRange("endCityBedrockMooncakeChance", 0.01, 0.0, 1.0);
        BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE = builder
                .comment("Chance for debris mooncake in bastion treasure chest (0.0 - 1.0, 0 to disable)")
                .defineInRange("bastionTreasureDebrisMooncakeChance", 0.10, 0.0, 1.0);
        BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE = builder
                .comment("Chance for lava mooncake in bastion hoglin stable chest (0.0 - 1.0, 0 to disable)")
                .defineInRange("bastionHoglinLavaMooncakeChance", 0.10, 0.0, 1.0);
        DESERT_PYRAMID_TNT_MOONCAKE_CHANCE = builder
                .comment("Chance for tnt mooncake in desert pyramid chest (0.0 - 1.0, 0 to disable)")
                .defineInRange("desertPyramidTntMooncakeChance", 0.10, 0.0, 1.0);
        builder.pop();

        builder.push("entity_loot");
        ENDER_DRAGON_ENCHANTED_GOLDEN_APPLE_MOONCAKE_CHANCE = builder
                .comment("Chance for enchanted golden apple mooncake from ender dragon (0.0 - 1.0, 0 to disable)")
                .defineInRange("enderDragonEnchantedGoldenAppleMooncakeChance", 0.25, 0.0, 1.0);
        BURNT_ANIMAL_TALLOW_CRUMBS_CHANCE = builder
                .comment("Chance for burnt tallow crumbs from pig/cow/sheep/goat when on fire (0.0 - 1.0, 0 to disable)")
                .defineInRange("burntAnimalTallowCrumbsChance", 0.50, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CRUMBS_CHANCE = builder
                .comment("Chance for burnt tallow crumbs with oiled knife when animal is on fire (0.0 - 1.0, 0 to disable)")
                .defineInRange("oiledKnifeBurntTallowCrumbsChance", 0.75, 0.0, 1.0);
        OILED_KNIFE_BURNT_TALLOW_CHANCE = builder
                .comment("Chance for burnt tallow with oiled knife when animal is on fire (0.0 - 1.0, 0 to disable)")
                .defineInRange("oiledKnifeBurntTallowChance", 0.25, 0.0, 1.0);
        builder.pop();

        builder.push("anvil_recipe");
        ANVIL_DROP_RECIPE_ENABLED = builder
                .comment("Enable anvil drop recipe feature")
                .define("anvilDropRecipeEnabled", true);

        builder.pop();

        SPEC = builder.build();
    }
}

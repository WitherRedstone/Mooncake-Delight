package com.chinaex123.mooncake_delight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    // ======================= 流体桶 =======================
    public static final FoodProperties INVERT_SUGAR_SYRUP_BOTTLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build(); // 转换糖浆
    public static final FoodProperties MAPLE_SYRUP_BOTTLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.3f).build(); // 枫糖浆

    // ======================= 食材 =======================
    public static final FoodProperties TALLOW_CRUMBS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build(); // 动物油脂碎
    public static final FoodProperties TALLOW = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build(); // 动物油脂
    public static final FoodProperties LOTUS_SEED = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2f).build(); // 莲子
    public static final FoodProperties ANIMAL_FAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.2f).build(); // 动物油
    public static final FoodProperties MOONCAKE_CRUST_DOUGH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 20 * 5, 0), 1.0f) // 饥饿
            .alwaysEdible().build(); // 月饼面团
    public static final FoodProperties SNOW_SKIN_MOONCAKE_CRUST_DOUGH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 20 * 5, 0), 1.0f) // 饥饿
            .alwaysEdible().build();// 冰皮月饼面团

    // ======================= 作物 =======================
    public static final FoodProperties WHITE_SESAME = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();// 白芝麻
    public static final FoodProperties BLACK_SESAME = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 30, 1), 1.0f) // 幸运
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 45, 3), 0.25f) // 幸运
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 60, 4), 0.05f) // 幸运
            .alwaysEdible().build();// 黑芝麻

    // ======================= 原版自带 =======================
    public static final FoodProperties APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 苹果月饼
    public static final FoodProperties GOLDEN_APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 3, 3), 1.0f) // 伤害吸收
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 30, 1), 1.0f) // 生命恢复
            .alwaysEdible().build(); // 金苹果月饼
    public static final FoodProperties ENCHANTED_GOLDEN_APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 4, 4), 1.0f) // 伤害吸收
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 60 * 2, 2), 1.0f) // 生命恢复
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 60 * 5, 0), 1.0f) // 抗火
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 60 * 5, 1), 1.0f) // 抗性提升
            .alwaysEdible().build(); // 附魔金苹果月饼
    public static final FoodProperties SWEET_BERRIES_MOONCAKE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.4f).build(); // 甜浆果月饼
    public static final FoodProperties GLOW_BERRIES_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 发光浆果月饼
    public static final FoodProperties CHORUS_FRUIT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 紫颂果月饼
    public static final FoodProperties CARROT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 胡萝卜月饼
    public static final FoodProperties POTATO_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 马铃薯月饼
    public static final FoodProperties BEEF_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f).build(); // 牛肉月饼
    public static final FoodProperties PORKCHOP_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f).build(); // 猪肉月饼
    public static final FoodProperties MUTTON_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f).build(); // 羊肉月饼
    public static final FoodProperties CHICKEN_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f).build(); // 鸡肉月饼
    public static final FoodProperties RABBIT_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f).build(); // 兔肉月饼
    public static final FoodProperties COD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鳕鱼月饼
    public static final FoodProperties SALMON_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鲑鱼月饼
    public static final FoodProperties ROTTEN_FLESH_MOONCAKE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 20 * 15, 4), 1.0f) // 饥饿
            .alwaysEdible().build();// 腐肉月饼
    public static final FoodProperties HONEY_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.2f).build(); // 蜂蜜月饼
    public static final FoodProperties COFFEE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.2f).build(); // 咖啡月饼
    public static final FoodProperties SNOW_SKIN_MOONCAKE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.2f).build(); // 冰皮月饼
    public static final FoodProperties PUMPKIN_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 南瓜月饼
    public static final FoodProperties LAVA_EGG_CUSTARD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心奶黄月饼
    public static final FoodProperties LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心奶双黄月饼
    public static final FoodProperties BLACK_TRUFFLE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f).build(); // 黑松露月饼
    public static final FoodProperties HUNDRED_FRUITS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 百果月饼
    public static final FoodProperties EDIBLE_FLOWER_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鲜花月饼
    public static final FoodProperties ROSE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 玫瑰月饼
    public static final FoodProperties CHRYSANTHEMUM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 菊花月饼
    public static final FoodProperties CAKE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蛋糕月饼
    public static final FoodProperties RICE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f).build(); // 米月饼
    public static final FoodProperties LOTUS_SEED_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f).build(); // 莲蓉月饼
    public static final FoodProperties DOUBLE_YOLK_LOTUS_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.5f).build(); // 双黄莲蓉月饼
    public static final FoodProperties PORK_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f).build(); // 鲜肉月饼
    public static final FoodProperties EGG_YOLK_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蛋黄月饼
    public static final FoodProperties SALTED_EGG_YOLK_PORK_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build(); // 蛋黄鲜肉月饼
    public static final FoodProperties HAM_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build(); // 火腿月饼
    public static final FoodProperties YUNNAN_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build(); // 云腿月饼
    public static final FoodProperties PORK_CABBAGE_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build();  // 猪肉卷心菜月饼
    public static final FoodProperties BEEF_TOMATO_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 10, 0), 1.0f) // 生命恢复
            .alwaysEdible().build();  // 牛肉番茄月饼
    public static final FoodProperties CHICKEN_PUMPKIN_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 20 * 10, 0), 1.0f) // 跳跃提升
            .alwaysEdible().build();  // 鸡肉南瓜月饼
    public static final FoodProperties HAM_CABBAGE_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build();  // 火腿卷心菜月饼
    public static final FoodProperties SEAFOOD_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 20 * 12, 0), 1.0f) // 水下呼吸
            .alwaysEdible().build();  // 海鲜月饼
    public static final FoodProperties THREE_DELICACIES_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 20, 1), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 20, 0), 1.0f) // 抗性提升
            .alwaysEdible().build();  // 三鲜月饼
    public static final FoodProperties FAMILY_FEASTS_MOONCAKE = new FoodProperties.Builder().nutrition(18).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 30, 1), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 30, 0), 1.0f) // 抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 30, 1), 1.0f) // 速度
            .alwaysEdible().build();  // 全家福月饼
    public static final FoodProperties DOUBLE_MEAT_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 1), 1.0f) // 力量
            .alwaysEdible().build();  // 双拼肉月饼
    public static final FoodProperties TRIPLE_MEAT_MOONCAKE = new FoodProperties.Builder().nutrition(18).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 2), 1.0f) // 力量
            .alwaysEdible().build();  // 三肉月饼
    public static final FoodProperties HAM_BACON_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 20 * 10, 1), 1.0f) // 急迫
            .alwaysEdible().build();  // 火腿培根月饼
    public static final FoodProperties JINHUA_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .alwaysEdible().build(); // 金华火腿月饼
    public static final FoodProperties BACON_ONION_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 10, 0), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 20 * 4, 0), 0.8f) // 反胃
            .alwaysEdible().build();  // 培根洋葱月饼
    public static final FoodProperties BLACK_SESAME_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 90, 1), 1.0f) // 幸运
            .alwaysEdible().build(); // 黑芝麻蓉月饼
    public static final FoodProperties BLACK_SESAME_LAVA_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 90, 1), 1.0f) // 幸运
            .alwaysEdible().build(); // 黑芝麻蓉流心月饼
    public static final FoodProperties BLACK_SESAME_SOY_MILK_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 90, 1), 1.0f) // 幸运
            .alwaysEdible().build(); // 黑芝麻豆乳月饼
    public static final FoodProperties WHITE_SESAME_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 白芝麻蓉月饼
    public static final FoodProperties SESAME_EGG_YOLK_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 芝麻蛋黄月饼
    public static final FoodProperties SESAME_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻火腿月饼
    public static final FoodProperties SESAME_BEEF_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻牛肉月饼
    public static final FoodProperties SESAME_BACON_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻培根月饼
    public static final FoodProperties SESAME_ONION_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻洋葱月饼
    public static final FoodProperties SESAME_TOMATO_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻番茄月饼
    public static final FoodProperties SESAME_CHICKEN_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻鸡肉月饼
    public static final FoodProperties SESAME_MUTTON_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 芝麻羊肉月饼

    // ======================= 特殊/彩蛋物品 =======================
    public static final FoodProperties LAVA_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 10, 1), 1.0f) // 防火
            .alwaysEdible().build(); // 流心月饼
    public static final FoodProperties TNT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.5f).build(); // TNT 月饼
    public static final FoodProperties DEBRIS_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.5f).build(); // 残骸月饼
    public static final FoodProperties BEDROCK_MOONCAKE = new FoodProperties.Builder().nutrition(20).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 60 * 5, 3), 1.0f) // 抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 60 * 5, 0), 1.0f) // 防火
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 5, 4), 1.0f) // 伤害吸收
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 20 * 60 * 5, 2), 1.0f) // 急迫
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 60 * 5, 2), 1.0f) // 生命恢复
            .alwaysEdible().build(); // 基岩月饼
}

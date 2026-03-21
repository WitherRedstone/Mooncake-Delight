package com.chinaex123.mooncake_delight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    // ======================= 食材 =======================
    public static final FoodProperties TALLOW_CRUMBS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build(); // 动物油脂碎
    public static final FoodProperties TALLOW = new FoodProperties.Builder().nutrition(4).saturationModifier(0.1f).build(); // 动物油脂
    public static final FoodProperties LOTUS_SEED = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build(); // 莲子
    
    // ======================= 原版自带 =======================
    public static final FoodProperties APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 苹果月饼
    public static final FoodProperties GOLDEN_APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0f) // 伤害吸收
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 2), 1.0f) // 生命恢复
            .alwaysEdible().build(); // 金苹果月饼
    public static final FoodProperties ENCHANTED_GOLDEN_APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 5), 1.0f) // 伤害吸收
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 800, 2), 1.0f) // 生命恢复
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 1), 1.0f) // 抗火
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1.0f) // 抗性提升
            .alwaysEdible().build(); // 附魔金苹果月饼
    public static final FoodProperties SWEET_BERRIES_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 甜浆果月饼
    public static final FoodProperties GLOW_BERRIES_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 发光浆果月饼
    public static final FoodProperties CHORUS_FRUIT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 紫颂果月饼
    public static final FoodProperties CARROT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 胡萝卜月饼
    public static final FoodProperties POTATO_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 马铃薯月饼
    public static final FoodProperties BEEF_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 牛肉月饼
    public static final FoodProperties PORKCHOP_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 猪肉月饼
    public static final FoodProperties MUTTON_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 羊肉月饼
    public static final FoodProperties CHICKEN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鸡肉月饼
    public static final FoodProperties RABBIT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 兔肉月饼
    public static final FoodProperties COD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鳕鱼月饼
    public static final FoodProperties SALMON_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鲑鱼月饼
    public static final FoodProperties ROTTEN_FLESH_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 腐肉月饼
    public static final FoodProperties HONEY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蜂蜜月饼
    public static final FoodProperties COFFEE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 咖啡月饼
    public static final FoodProperties SNOW_SKIN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 冰皮月饼
    public static final FoodProperties PUMPKIN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 南瓜月饼
    public static final FoodProperties LAVA_EGG_CUSTARD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心奶黄月饼
    public static final FoodProperties LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心奶双黄月饼
    public static final FoodProperties BLACK_TRUFFLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 黑松露月饼
    public static final FoodProperties HUNDRED_FRUITS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 百果月饼
    public static final FoodProperties EDIBLE_FLOWER_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鲜花月饼
    public static final FoodProperties ROSE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 玫瑰月饼
    public static final FoodProperties CHRYSANTHEMUM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 菊花月饼
    public static final FoodProperties CAKE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蛋糕月饼
    public static final FoodProperties RICE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 米月饼
    public static final FoodProperties LOTUS_SEED_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 莲蓉月饼
    public static final FoodProperties DOUBLE_YOLK_LOTUS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 莲蓉月饼
    public static final FoodProperties PORK_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鲜肉月饼
    public static final FoodProperties EGG_YOLK_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蛋黄月饼
    public static final FoodProperties SALTED_EGG_YOLK_PORK_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蛋黄鲜肉月饼
    public static final FoodProperties HAM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 火腿月饼
    public static final FoodProperties YUNNAN_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1), 1.0f) // 力量
            .alwaysEdible().build(); // 云腿月饼
    public static final FoodProperties PORK_CABBAGE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1), 1.0f) // 力量
            .alwaysEdible().build();  // 猪肉卷心菜月饼
    public static final FoodProperties BEEF_TOMATO_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0f) // 生命恢复
            .alwaysEdible().build();  // 牛肉番茄月饼
    public static final FoodProperties CHICKEN_PUMPKIN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 1.0f) // 跳跃提升
            .alwaysEdible().build();  // 鸡肉南瓜月饼
    public static final FoodProperties HAM_CABBAGE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1), 1.0f) // 力量
            .alwaysEdible().build();  // 火腿卷心菜月饼
    public static final FoodProperties SEAFOOD_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 1), 1.0f) // 水下呼吸
            .alwaysEdible().build();  // 海鲜月饼
    public static final FoodProperties THREE_DELICACIES_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1), 1.0f) // 抗性提升
            .alwaysEdible().build();  // 三鲜月饼
    public static final FoodProperties FAMILY_FEASTS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1), 1.0f) // 抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 2), 1.0f) // 速度
            .alwaysEdible().build();  // 全家福月饼
    public static final FoodProperties DOUBLE_MEAT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 2), 1.0f) // 力量
            .alwaysEdible().build();  // 双拼肉月饼
    public static final FoodProperties TRIPLE_MEAT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 3), 0.8f) // 力量
            .alwaysEdible().build();  // 三肉月饼
    public static final FoodProperties HAM_BACON_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 2), 0.8f) // 急迫
            .alwaysEdible().build();  // 火腿培根月饼
    public static final FoodProperties JINHUA_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 金华火腿月饼


    // ======================= 特殊/彩蛋物品 =======================
    public static final FoodProperties LAVA_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心月饼
    public static final FoodProperties TNT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // TNT 月饼
    public static final FoodProperties DEBRIS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 残骸月饼
    public static final FoodProperties BEDROCK_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 基岩月饼
}

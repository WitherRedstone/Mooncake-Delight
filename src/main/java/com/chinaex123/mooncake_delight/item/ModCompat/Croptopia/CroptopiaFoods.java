package com.chinaex123.mooncake_delight.item.ModCompat.Croptopia;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class CroptopiaFoods {

    public static final FoodProperties SAUSAGE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 香肠月饼
    public static final FoodProperties CALAMARI_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 鱿鱼月饼
    public static final FoodProperties PINEAPPLE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 菠萝月饼
    public static final FoodProperties STRAWBERRY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 草莓月饼
    public static final FoodProperties BLUEBERRY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蓝莓月饼
    public static final FoodProperties CRANBERRY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 蔓越莓月饼
    public static final FoodProperties BLACKBERRY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 黑莓月饼
    public static final FoodProperties COCONUT_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 椰蓉月饼
    public static final FoodProperties JUJUBE_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 枣泥月饼
    public static final FoodProperties MUNG_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 绿豆月饼
    public static final FoodProperties PEANUT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 花生月饼
    public static final FoodProperties HUNAN_SCALLION_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 葱油月饼
    public static final FoodProperties PEPPER_SALT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 椒盐月饼
    public static final FoodProperties BLACK_SESAME_PEPPER_SALT_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 黑麻椒盐月饼
    public static final FoodProperties MANGO_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芒果月饼
    public static final FoodProperties MANGO_COCONUT_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 芒果椰奶月饼
    public static final FoodProperties CINNAMON_APPLE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 肉桂苹果月饼
    public static final FoodProperties TROPICAL_FRUIT_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60 * 20, 2), 1.0f) // 速度
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 20 * 60 * 20, 2), 1.0f) // 跳跃提升
            .alwaysEdible().build(); // 热带水果月饼
    public static final FoodProperties BERRY_MEDLEY_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 60 * 20, 2), 1.0f) // 生命恢复
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 20 * 60 * 20), 1.0f) // 夜视
            .alwaysEdible().build(); // 浆果荟萃月饼
    public static final FoodProperties CITRUS_BLAST_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60 * 20, 2), 1.0f) // 速度
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 60 * 20), 1.0f) // 抗火
            .alwaysEdible().build(); // 柑橘炸弹月饼
    public static final FoodProperties ALMOND_CHERRY_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 20 * 60 * 10, 2), 1.0f) // 跳跃提升
            .alwaysEdible().build(); // 扁桃仁樱桃月饼
    public static final FoodProperties CASHEW_MANGO_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60 * 10, 2), 1.0f) // 速度
            .alwaysEdible().build(); // 腰果芒果月饼
    public static final FoodProperties SHRIMP_ASPARAGUS_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 60 * 10, 2), 1.0f) // 速度
            .alwaysEdible().build();  // 鲜虾芦笋月饼
    public static final FoodProperties CRAB_CORNS_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 60 * 10, 2), 1.0f) // 力量
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 20 * 60 * 10, 2), 0.5f) // 急迫
            .alwaysEdible().build(); // 螃蟹玉米月饼
    public static final FoodProperties TUNA_AVOCADO_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 10, 2), 1.0f) // 伤害吸收
            .alwaysEdible().build(); // 金枪鱼牛油果月饼
    public static final FoodProperties SPINACHE_WALNUT_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20 * 60 * 10, 2), 1.0f) // 力量
            .alwaysEdible().build(); // 菠菜核桃月饼
    public static final FoodProperties PINEAPPLE_HAM_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 60 * 10, 2), 1.0f) // 生命恢复
            .alwaysEdible().build(); // 菠萝火腿月饼
    public static final FoodProperties CRANBERRY_WALNUT_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 60 * 10, 2), 0.5f) // 幸运
            .alwaysEdible().build(); // 蔓越莓核桃月饼
    public static final FoodProperties BLUEBERRY_YOGURT_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 20 * 60, 2), 0.5f) // 缓降
            .alwaysEdible().build(); // 蓝莓酸奶月饼
    public static final FoodProperties SEAFOOD_MEDLEY_MOONCAKE = new FoodProperties.Builder().nutrition(18).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 20 * 60, 2), 1.0f) // 水下呼吸
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 20 * 60, 1), 1.0f) // 夜视
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 60, 1), 0.5f) // 抗性提升
            .alwaysEdible().build(); // 海鲜总汇月饼
    public static final FoodProperties KING_OF_VEGGIES_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 60, 1), 1.0f) // 抗性提升
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 20 * 60, 2), 1.0f) // 生命恢复
            .alwaysEdible().build(); // 蔬菜之王月饼
    public static final FoodProperties FIVE_KERNELS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 60, 1), 1.0f) // 幸运
            .alwaysEdible().build(); // 五仁月饼
    public static final FoodProperties BBQ_PORK_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 10, 2), 1.0f) // 速度
            .alwaysEdible().build(); // 叉烧月饼
    public static final FoodProperties BBQ_PORK_FIVE_KERNELS_MOONCAKE = new FoodProperties.Builder().nutrition(14).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 60, 1), 1.0f) // 幸运
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20 * 10, 2), 1.0f) // 速度
            .alwaysEdible().build(); // 叉烧五仁月饼
    public static final FoodProperties JINHUA_HAM_FIVE_KERNELS_MOONCAKE = new FoodProperties.Builder().nutrition(16).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 20 * 60, 1), 1.0f) // 幸运
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 20 * 10, 1), 1.0f) // 急迫
            .alwaysEdible().build(); // 金腿五仁月饼
    public static final FoodProperties CHESTNUT_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 栗蓉月饼
    public static final FoodProperties WALNUT_DATE_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 核桃枣泥月饼
    public static final FoodProperties PRESERVED_MUSTARD_GREEN_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 梅干菜月饼
    public static final FoodProperties PICKLED_MUSTARD_PORK_MOONCAKE = new FoodProperties.Builder().nutrition(12).saturationModifier(0.4f).build(); // 榨菜鲜肉月饼
    public static final FoodProperties MILK_TEA_MOONCAKE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.4f).build(); // 奶茶月饼
    public static final FoodProperties CANDIED_ORANGE_PEEL_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 橙皮丁月饼
    public static final FoodProperties CARAMEL_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 焦糖月饼
    public static final FoodProperties CARAMEL_SEA_SALT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 焦糖海盐月饼
    public static final FoodProperties CHEESE_LAVA_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芝士流心月饼
    public static final FoodProperties CHEESE_CARAMEL_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芝士焦糖月饼
    public static final FoodProperties BUTTER_CHOCOLATE_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.3f).build(); // 黄油巧克力月饼
    public static final FoodProperties BUTTER_CHEESE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 黄油芝士月饼
    public static final FoodProperties LAVA_CHOCOLATE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心巧克力月饼
    public static final FoodProperties EARL_GREY_MOONCAKE = new FoodProperties.Builder().nutrition(10).saturationModifier(0.4f).build(); // 伯爵茶月饼




















//    public static final FoodProperties RED_BEAN_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 红豆沙月饼
//    public static final FoodProperties SESAME_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芝麻月饼
//    public static final FoodProperties MATCHA_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 抹茶月饼
//    public static final FoodProperties EARL_GREY_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 伯爵茶月饼
//    public static final FoodProperties SEVEN_STARS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 七星伴月月饼
//    public static final FoodProperties TARO_PASTE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芋泥月饼
//    public static final FoodProperties OSMANTHUS_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 桂花月饼
//    public static final FoodProperties DURIAN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 榴莲月饼
//    public static final FoodProperties DURIAN_SNOW_SKIN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 榴莲冰皮月饼
//    public static final FoodProperties PURPLE_SWEET_POTATO_YAM_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 紫薯山药月饼
//    public static final FoodProperties MATCHA_RED_BEAN_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 抹茶红豆月饼
//    public static final FoodProperties CARAMEL_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 焦糖月饼
//    public static final FoodProperties CARAMEL_SEA_SALT_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 焦糖海盐月饼
//    public static final FoodProperties CHEESE_LAVA_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 芝士流心月饼
//    public static final FoodProperties LAVA_CHOCOLATE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 流心巧克力月饼
//    public static final FoodProperties WHITE_CHOCOLATE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 白巧克力月饼
//    public static final FoodProperties BLACK_CHOCOLATE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 黑巧克力月饼
//    public static final FoodProperties UBE_MOONCAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.4f).build(); // 香芋月饼
}

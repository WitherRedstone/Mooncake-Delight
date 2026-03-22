package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MooncakeDelight.MOD_ID);

    public static final Supplier<CreativeModeTab> MOONCAKE_DELIGHT_TAB =
            CREATIVE_MODE_TAB.register("mooncake_delight_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BEDROCK_MOONCAKE.get()))
                    .title(Component.translatable("itemGroup.mooncake_delight_tab"))
                    .displayItems((parameters, output) -> {

                        // ======================= 食材 =======================
                        output.accept(ModItems.INVERT_SUGAR_SYRUP_BUCKET.get()); // 转换糖浆桶

                        output.accept(ModItems.SUGAR_CUBE.get()); // 方糖
                        output.accept(ModItems.TURTLE.get()); // 松露
                        output.accept(ModItems.TALLOW_CRUMBS.get()); // 动物油脂碎
                        output.accept(ModItems.TALLOW.get()); // 动物油脂
                        output.accept(ModItems.LOTUS_SEED.get()); // 莲子 配方：破坏睡莲有概率获得

                        // ======================= 原版自带 =======================
                        output.accept(ModItems.APPLE_MOONCAKE.get()); // 苹果月饼
                        output.accept(ModItems.GOLDEN_APPLE_MOONCAKE.get()); // 金苹果月饼
                        output.accept(ModItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE.get()); // 附魔金苹果月饼
                        output.accept(ModItems.SWEET_BERRIES_MOONCAKE.get()); // 甜浆果月饼
                        output.accept(ModItems.GLOW_BERRIES_MOONCAKE.get()); // 发光浆果月饼
                        output.accept(ModItems.CHORUS_FRUIT_MOONCAKE.get()); // 紫颂果月饼
                        output.accept(ModItems.CARROT_MOONCAKE.get()); // 胡萝卜月饼
                        output.accept(ModItems.POTATO_MOONCAKE.get()); // 马铃薯月饼
                        output.accept(ModItems.BEEF_MOONCAKE.get()); // 牛肉月饼 配方：牛肉馅2 + 洋葱 + 酥皮
                        output.accept(ModItems.PORKCHOP_MOONCAKE.get()); // 猪肉月饼
                        output.accept(ModItems.MUTTON_MOONCAKE.get()); // 羊肉月饼 配方：生羊排2 + 洋葱 + 酥皮
                        output.accept(ModItems.CHICKEN_MOONCAKE.get()); // 鸡肉月饼 配方：生鸡肉丁2 + 洋葱 + 酥皮
                        output.accept(ModItems.RABBIT_MOONCAKE.get()); // 兔肉月饼
                        output.accept(ModItems.COD_MOONCAKE.get()); // 鳕鱼月饼 配方：生鳕鱼片2 + 洋葱 + 酥皮
                        output.accept(ModItems.SALMON_MOONCAKE.get()); // 鲑鱼月饼 配方：生鲑鱼片2 + 洋葱 + 酥皮
                        output.accept(ModItems.ROTTEN_FLESH_MOONCAKE.get()); // 腐肉月饼
                        output.accept(ModItems.HONEY_MOONCAKE.get()); // 蜂蜜月饼
                        output.accept(ModItems.COFFEE_MOONCAKE.get()); // 咖啡月饼
                        output.accept(ModItems.SNOW_SKIN_MOONCAKE.get()); // 冰皮月饼
                        output.accept(ModItems.LAVA_EGG_CUSTARD_MOONCAKE.get()); // 流心奶黄月饼
                        output.accept(ModItems.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE.get()); // 流心奶双黄月饼
                        output.accept(ModItems.BLACK_TRUFFLE_MOONCAKE.get()); // 黑松露月饼
                        output.accept(ModItems.HUNDRED_FRUITS_MOONCAKE.get()); // 百果月饼 配方：任意5种不同的水果（浆果/苹果/西瓜等）+ 月饼皮
                        output.accept(ModItems.EDIBLE_FLOWER_MOONCAKE.get()); // 鲜花月饼 配方：虞美人/绒球葱/滨菊/兰花（任意MC花朵）+ 糖 + 月饼皮
                        output.accept(ModItems.ROSE_MOONCAKE.get()); // 玫瑰月饼
                        output.accept(ModItems.CHRYSANTHEMUM_MOONCAKE.get()); // 菊花月饼 配方：滨菊 + 糖 + 月饼皮
                        output.accept(ModItems.CAKE_MOONCAKE.get()); // 蛋糕月饼
                        output.accept(ModItems.RICE_MOONCAKE.get()); // 米月饼
                        output.accept(ModItems.LOTUS_SEED_PASTE_MOONCAKE.get()); // 莲蓉月饼
                        output.accept(ModItems.DOUBLE_YOLK_LOTUS_MOONCAKE.get()); // 双黄莲蓉月饼
                        output.accept(ModItems.PORK_MOONCAKE.get()); // 鲜肉月饼 配方：生培根2 + 小麦 + 月饼皮
                        output.accept(ModItems.EGG_YOLK_MOONCAKE.get()); // 蛋黄月饼
                        output.accept(ModItems.SALTED_EGG_YOLK_PORK_MOONCAKE.get()); // 蛋黄鲜肉月饼 配方：生培根2 + 小麦 + 蛋黄 + 月饼皮
                        output.accept(ModItems.HAM_MOONCAKE.get()); // 火腿月饼 配方：火腿 + 月饼皮
                        output.accept(ModItems.YUNNAN_HAM_MOONCAKE.get()); // 云腿月饼 配方：熟猪排 + 蜂蜜 + 面粉 + 月饼皮
                        output.accept(ModItems.PUMPKIN_MOONCAKE.get()); // 南瓜月饼
                        output.accept(ModItems.PORK_CABBAGE_MOONCAKE.get()); // 猪肉卷心菜月饼 配方：生培根2 + 卷心菜2 + 酥皮
                        output.accept(ModItems.BEEF_TOMATO_MOONCAKE.get()); // 牛肉番茄月饼 配方：牛肉馅2 + 番茄2 + 酥皮
                        output.accept(ModItems.CHICKEN_PUMPKIN_MOONCAKE.get()); // 鸡肉南瓜月饼 配方：生鸡肉丁2 + 南瓜片2 + 酥皮
                        output.accept(ModItems.HAM_CABBAGE_MOONCAKE.get()); // 火腿卷心菜月饼 配方：火腿2 + 卷心菜2 + 酥皮
                        output.accept(ModItems.SEAFOOD_MOONCAKE.get()); // 海鲜月饼 配方：生鳕鱼片 + 生鲑鱼片 + 洋葱 + 酥皮
                        output.accept(ModItems.THREE_DELICACIES_MOONCAKE.get()); // 三鲜月饼 配方：生培根 + 生鳕鱼片 + 卷心菜 + 酥皮
                        output.accept(ModItems.FAMILY_FEASTS_MOONCAKE.get()); // 全家福月饼 配方：牛肉馅 + 生培根 + 生鸡肉丁 + 洋葱 + 酥皮
                        output.accept(ModItems.DOUBLE_MEAT_MOONCAKE.get()); // 双拼肉月饼 配方：牛肉馅2 + 生培根2 + 酥皮
                        output.accept(ModItems.TRIPLE_MEAT_MOONCAKE.get()); // 三肉月饼 配方：猪肉 + 兔肉 + 羊肉 + 洋葱 + 酥皮
                        output.accept(ModItems.HAM_BACON_MOONCAKE.get()); // 火腿培根月饼 配方：火腿2 + 生培根2 + 酥皮
                        output.accept(ModItems.JINHUA_HAM_MOONCAKE.get()); // 金华火腿月饼 配方：烟熏火腿 + 糖

                        // ======================= 作物盛景 联动 =======================
                        if (ModList.get().isLoaded("croptopia")) {
                            output.accept(CroptopiaItems.PEPPER_SALT.get()); // 椒盐 配方：胡椒 + 盐

                            output.accept(CroptopiaItems.SAUSAGE_MOONCAKE.get()); // 香肠月饼
                            output.accept(CroptopiaItems.CALAMARI_MOONCAKE.get()); // 鱿鱼月饼
                            output.accept(CroptopiaItems.PINEAPPLE_MOONCAKE.get()); // 菠萝月饼
                            output.accept(CroptopiaItems.STRAWBERRY_MOONCAKE.get()); // 草莓月饼
                            output.accept(CroptopiaItems.BLUEBERRY_MOONCAKE.get()); // 蓝莓月饼
                            output.accept(CroptopiaItems.CRANBERRY_MOONCAKE.get()); // 蔓越莓月饼
                            output.accept(CroptopiaItems.BLACKBERRY_MOONCAKE.get()); // 黑莓月饼
                            output.accept(CroptopiaItems.COCONUT_PASTE_MOONCAKE.get()); // 椰蓉月饼
                            output.accept(CroptopiaItems.JUJUBE_PASTE_MOONCAKE.get()); // 枣泥月饼
                            output.accept(CroptopiaItems.MUNG_MOONCAKE.get()); // 绿豆月饼
                            output.accept(CroptopiaItems.PEANUT_MOONCAKE.get()); // 花生月饼
                            output.accept(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get()); // 葱油月饼 配方：葱 + 油 + 糖 + 月饼皮
                            output.accept(CroptopiaItems.PEPPER_SALT_MOONCAKE.get()); // 椒盐月饼 配方：胡椒/盐 + 芝麻 + 月饼皮
                            output.accept(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get()); // 黑麻椒盐月饼 配方：芝麻 + 胡椒/盐 + 月饼皮
                            output.accept(CroptopiaItems.MANGO_MOONCAKE.get()); // 芒果月饼
                            output.accept(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get()); // 芒果椰奶月饼 配方：芒果+ 椰子/牛奶 + 糖 + 月饼皮
                            output.accept(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get()); // 肉桂苹果月饼 配方：苹果 + 肉桂+ 糖 + 月饼皮
                            output.accept(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get()); // 热带水果月饼 配方：芒果 + 菠萝 + 香蕉 + 椰子 + 糖浆皮
                            output.accept(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get()); // 浆果荟萃月饼 配方：黑莓 + 蓝莓 + 树莓 + 草莓 + 糖浆皮
                            output.accept(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get()); // 柑橘炸弹月饼 配方：橙子 + 柠檬 + 葡萄柚 + 青柠 + 糖浆皮
                            output.accept(CroptopiaItems.WALNUT_DATE_MOONCAKE.get()); // 核桃枣泥月饼 配方：核桃2 + 枣椰3 + 酥皮
                            output.accept(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get()); // 扁桃仁樱桃月饼 配方：扁桃仁2 + 樱桃3 + 酥皮
                            output.accept(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get()); // 腰果芒果月饼 配方：腰果2 + 芒果3 + 酥皮
                            output.accept(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get()); // 鲜虾芦笋月饼 配方：虾2 + 芦笋2 + 酥皮
                            output.accept(CroptopiaItems.CRAB_CORNS_MOONCAKE.get()); // 螃蟹玉米月饼 配方：螃蟹2 + 玉米2 + 酥皮
                            output.accept(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get()); // 金枪鱼牛油果月饼 配方：金枪鱼2 + 牛油果2 + 酥皮
                            output.accept(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get()); // 菠菜核桃月饼 配方：菠菜2 + 核桃2 + 酥皮
                            output.accept(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get()); // 菠萝火腿月饼 配方：菠萝3 + 猪排 + 酥皮
                            output.accept(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get()); // 蔓越莓核桃月饼 配方：蔓越莓3 + 核桃2 + 酥皮
                            output.accept(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get()); // 蓝莓酸奶月饼 配方：蓝莓3 + 牛奶 + 糖 + 冰皮
                            output.accept(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE.get()); // 海鲜总汇月饼 配方：金枪鱼 + 虾 + 螃蟹 + 牡蛎 + 鱼子 + 酥皮
                            output.accept(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE.get()); // 蔬菜之王月饼 配方：羽衣甘蓝 + 菠菜 + 西兰花 + 红薯 + 牛油果 + 酥皮
                            output.accept(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get()); // 五仁月饼 配方：任意5种坚果各1个（花生/核桃/扁桃仁/腰果/碧根果等）+ 酥皮
                            output.accept(CroptopiaItems.BBQ_PORK_MOONCAKE.get()); // 叉烧月饼 配方：叉烧 + 糖
                            output.accept(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE.get()); // 叉烧五仁月饼 配方：叉烧 + 五仁月饼 + 糖
                            output.accept(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get()); // 金腿五仁月饼 配方：烟熏火腿 + 五仁月饼 + 糖
                            output.accept(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get()); // 栗蓉月饼 配方：醋栗 + 莲子
                            output.accept(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get()); // 核桃枣泥月饼 配方：核桃 + 枣椰
                            output.accept(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get()); // 梅干菜月饼 配方：芥菜 + 盐 + 月饼皮 + 少量肉末
                            output.accept(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE.get()); // 榨菜鲜肉月饼 配方：生培根2 + 芥菜 + 月饼皮
                            output.accept(CroptopiaItems.MILK_TEA_MOONCAKE.get()); // 奶茶月饼 配方：牛奶 + 茶叶 + 糖 + 月饼皮
                            output.accept(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get()); // 橙皮丁月饼 配方：橙子 + 糖 + 月饼皮
                            output.accept(CroptopiaItems.BACON_ONION_MOONCAKE.get()); // 培根洋葱月饼 配方：生培根2 + 洋葱2 + 酥皮
                        }


//                        output.accept(CroptopiaItems.RED_BEAN_PASTE_MOONCAKE.get()); // 红豆沙月饼
//                        output.accept(CroptopiaItems.SESAME_MOONCAKE.get()); // 芝麻月饼
//                        output.accept(CroptopiaItems.MATCHA_MOONCAKE.get()); // 抹茶月饼
//                        output.accept(CroptopiaItems.EARL_GREY_MOONCAKE.get()); // 伯爵茶月饼 配方：茶叶 + 橙子 + 糖 + 月饼皮
//                        output.accept(CroptopiaItems.SEVEN_STARS_MOONCAKE.get()); // 七星伴月月饼
//                        output.accept(CroptopiaItems.TARO_PASTE_MOONCAKE.get()); // 芋泥月饼
//                        output.accept(CroptopiaItems.OSMANTHUS_MOONCAKE.get()); // 桂花月饼
//                        output.accept(CroptopiaItems.DURIAN_MOONCAKE.get()); // 榴莲月饼
//                        output.accept(CroptopiaItems.DURIAN_SNOW_SKIN_MOONCAKE.get()); // 榴莲冰皮月饼
//                        output.accept(CroptopiaItems.PURPLE_SWEET_POTATO_YAM_MOONCAKE.get()); // 紫薯山药月饼
//                        output.accept(CroptopiaItems.MATCHA_RED_BEAN_MOONCAKE.get()); // 抹茶红豆月饼
//                        output.accept(CroptopiaItems.CARAMEL_MOONCAKE.get()); // 焦糖月饼
//                        output.accept(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE.get()); // 焦糖海盐月饼
//                        output.accept(CroptopiaItems.CHEESE_LAVA_MOONCAKE.get()); // 芝士流心月饼
//                        output.accept(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE.get()); // 流心巧克力月饼
//                        output.accept(CroptopiaItems.WHITE_CHOCOLATE_MOONCAKE.get()); // 白巧克力月饼
//                        output.accept(CroptopiaItems.BLACK_CHOCOLATE_MOONCAKE.get()); // 黑巧克力月饼
//                        output.accept(CroptopiaItems.UBE_MOONCAKE.get()); // 香芋月饼

                        // ======================= 特殊/彩蛋物品 =======================
                        output.accept(ModItems.LAVA_MOONCAKE.get()); // 流心月饼
                        output.accept(ModItems.TNT_MOONCAKE.get()); // TNT 月饼
                        output.accept(ModItems.DEBRIS_MOONCAKE.get()); // 残骸月饼
                        output.accept(ModItems.BEDROCK_MOONCAKE.get()); // 基岩月饼
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

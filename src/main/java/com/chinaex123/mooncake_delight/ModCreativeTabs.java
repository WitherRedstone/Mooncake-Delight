package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;

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
                        output.accept(ModItems.INVERT_SUGAR_SYRUP_BUCKET.get()); // 转换糖浆 桶
                        output.accept(ModItems.MAPLE_SYRUP_BUCKET.get()); // 枫糖浆 桶

                        output.accept(ModItems.INVERT_SUGAR_SYRUP_BOTTLE.get()); // 转换糖浆
                        output.accept(ModItems.MAPLE_SYRUP_BOTTLE.get()); // 枫糖浆
                        output.accept(ModItems.ANIMAL_FAT.get()); // 动物油

                        output.accept(ModItems.OILED_KNIFE.get()); // 油浸刀
                        output.accept(ModItems.MOONCAKE_MOLD.get()); // 月饼模具
                        output.accept(ModItems.SUGAR_CUBE.get()); // 方糖
                        output.accept(ModItems.TRUFFLE.get()); // 松露
                        output.accept(ModItems.TALLOW.get()); // 动物油脂
                        output.accept(ModItems.TALLOW_CRUMBS.get()); // 动物油脂碎
                        output.accept(ModItems.LOTUS_SEED.get()); // 莲子
                        output.accept(ModItems.FLOUR.get()); // 面粉
                        output.accept(ModItems.MOONCAKE_CRUST_DOUGH.get()); // 月饼面团
                        output.accept(ModItems.SNOW_SKIN_MOONCAKE_CRUST_DOUGH.get()); // 冰皮月饼面团
                        output.accept(CroptopiaItems.PEPPER_SALT.get()); // 椒盐

                        // ======================= 作物 =======================
                        output.accept(ModItems.WHITE_SESAME.get()); // 白芝麻
                        output.accept(ModItems.BLACK_SESAME.get()); // 黑芝麻

                        // ======================= 原版自带 =======================
                        output.accept(ModItems.APPLE_MOONCAKE.get()); // 苹果月饼
                        output.accept(ModItems.GOLDEN_APPLE_MOONCAKE.get()); // 金苹果月饼
                        output.accept(ModItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE.get()); // 附魔金苹果月饼
                        output.accept(ModItems.SWEET_BERRIES_MOONCAKE.get()); // 甜浆果月饼
                        output.accept(ModItems.GLOW_BERRIES_MOONCAKE.get()); // 发光浆果月饼
                        output.accept(ModItems.CHORUS_FRUIT_MOONCAKE.get()); // 紫颂果月饼
                        output.accept(ModItems.CARROT_MOONCAKE.get()); // 胡萝卜月饼
                        output.accept(ModItems.POTATO_MOONCAKE.get()); // 马铃薯月饼
                        output.accept(ModItems.BEEF_MOONCAKE.get()); // 牛肉月饼
                        output.accept(ModItems.PORKCHOP_MOONCAKE.get()); // 猪肉月饼
                        output.accept(ModItems.MUTTON_MOONCAKE.get()); // 羊肉月饼
                        output.accept(ModItems.CHICKEN_MOONCAKE.get()); // 鸡肉月饼
                        output.accept(ModItems.RABBIT_MOONCAKE.get()); // 兔肉月饼
                        output.accept(ModItems.COD_MOONCAKE.get()); // 鳕鱼月饼
                        output.accept(ModItems.SALMON_MOONCAKE.get()); // 鲑鱼月饼
                        output.accept(ModItems.ROTTEN_FLESH_MOONCAKE.get()); // 腐肉月饼
                        output.accept(ModItems.HONEY_MOONCAKE.get()); // 蜂蜜月饼
                        output.accept(ModItems.COFFEE_MOONCAKE.get()); // 咖啡月饼
                        output.accept(ModItems.SNOW_SKIN_MOONCAKE.get()); // 冰皮月饼
                        output.accept(ModItems.LAVA_EGG_CUSTARD_MOONCAKE.get()); // 流心奶黄月饼
                        output.accept(ModItems.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE.get()); // 流心奶双黄月饼
                        output.accept(ModItems.BLACK_TRUFFLE_MOONCAKE.get()); // 黑松露月饼
                        output.accept(ModItems.HUNDRED_FRUITS_MOONCAKE.get()); // 百果月饼
                        output.accept(ModItems.EDIBLE_FLOWER_MOONCAKE.get()); // 鲜花月饼
                        output.accept(ModItems.ROSE_MOONCAKE.get()); // 玫瑰月饼
                        output.accept(ModItems.CHRYSANTHEMUM_MOONCAKE.get()); // 菊花月饼
                        output.accept(ModItems.CAKE_MOONCAKE.get()); // 蛋糕月饼
                        output.accept(ModItems.RICE_MOONCAKE.get()); // 米月饼
                        output.accept(ModItems.LOTUS_SEED_PASTE_MOONCAKE.get()); // 莲蓉月饼
                        output.accept(ModItems.DOUBLE_YOLK_LOTUS_MOONCAKE.get()); // 双黄莲蓉月饼
                        output.accept(ModItems.PORK_MOONCAKE.get()); // 鲜肉月饼
                        output.accept(ModItems.EGG_YOLK_MOONCAKE.get()); // 蛋黄月饼
                        output.accept(ModItems.SALTED_EGG_YOLK_PORK_MOONCAKE.get()); // 蛋黄鲜肉月饼
                        output.accept(ModItems.HAM_MOONCAKE.get()); // 火腿月饼
                        output.accept(ModItems.YUNNAN_HAM_MOONCAKE.get()); // 云腿月饼
                        output.accept(ModItems.PUMPKIN_MOONCAKE.get()); // 南瓜月饼
                        output.accept(ModItems.PORK_CABBAGE_MOONCAKE.get()); // 猪肉卷心菜月饼
                        output.accept(ModItems.BEEF_TOMATO_MOONCAKE.get()); // 牛肉番茄月饼
                        output.accept(ModItems.CHICKEN_PUMPKIN_MOONCAKE.get()); // 鸡肉南瓜月饼
                        output.accept(ModItems.HAM_CABBAGE_MOONCAKE.get()); // 火腿卷心菜月饼
                        output.accept(ModItems.SEAFOOD_MOONCAKE.get()); // 海鲜月饼
                        output.accept(ModItems.THREE_DELICACIES_MOONCAKE.get()); // 三鲜月饼
                        output.accept(ModItems.FAMILY_FEASTS_MOONCAKE.get()); // 全家福月饼
                        output.accept(ModItems.DOUBLE_MEAT_MOONCAKE.get()); // 双拼肉月饼
                        output.accept(ModItems.TRIPLE_MEAT_MOONCAKE.get()); // 三肉月饼
                        output.accept(ModItems.HAM_BACON_MOONCAKE.get()); // 火腿培根月饼
                        output.accept(ModItems.JINHUA_HAM_MOONCAKE.get()); // 金华火腿月饼
                        output.accept(ModItems.BACON_ONION_MOONCAKE.get()); // 培根洋葱月饼
                        output.accept(ModItems.BLACK_SESAME_PASTE_MOONCAKE.get()); // 黑芝麻蓉月饼
                        output.accept(ModItems.BLACK_SESAME_LAVA_MOONCAKE.get()); // 黑芝麻蓉流心月饼
                        output.accept(ModItems.BLACK_SESAME_SOY_MILK_MOONCAKE.get()); // 黑芝麻豆乳月饼
                        output.accept(ModItems.WHITE_SESAME_PASTE_MOONCAKE.get()); // 白芝麻蓉月饼
                        output.accept(ModItems.SESAME_EGG_YOLK_MOONCAKE.get()); // 芝麻蛋黄月饼
                        output.accept(ModItems.SESAME_HAM_MOONCAKE.get()); // 芝麻火腿月饼
                        output.accept(ModItems.SESAME_BEEF_MOONCAKE.get()); // 芝麻牛肉月饼 配方：牛肉馅+洋葱+番茄酱+芝麻
                        output.accept(ModItems.SESAME_BACON_MOONCAKE.get()); // 芝麻培根月饼
                        output.accept(ModItems.SESAME_ONION_MOONCAKE.get()); // 芝麻洋葱月饼 配方：洋葱+焦糖+芝麻
                        output.accept(ModItems.SESAME_TOMATO_MOONCAKE.get()); // 芝麻番茄月饼
                        output.accept(ModItems.SESAME_CHICKEN_MOONCAKE.get()); // 芝麻鸡肉月饼
                        output.accept(ModItems.SESAME_MUTTON_MOONCAKE.get()); // 芝麻羊肉月饼

                        // ======================= 作物盛景 联动 =======================
                        if (ModList.get().isLoaded("croptopia")) {
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
                            output.accept(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get()); // 葱油月饼
                            output.accept(CroptopiaItems.PEPPER_SALT_MOONCAKE.get()); // 椒盐月饼
                            output.accept(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get()); // 黑麻椒盐月饼
                            output.accept(CroptopiaItems.MANGO_MOONCAKE.get()); // 芒果月饼
                            output.accept(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get()); // 芒果椰奶月饼
                            output.accept(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get()); // 肉桂苹果月饼
                            output.accept(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get()); // 热带水果月饼
                            output.accept(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get()); // 浆果荟萃月饼
                            output.accept(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get()); // 柑橘炸弹月饼
                            output.accept(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get()); // 扁桃仁樱桃月饼
                            output.accept(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get()); // 腰果芒果月饼
                            output.accept(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get()); // 鲜虾芦笋月饼
                            output.accept(CroptopiaItems.CRAB_CORNS_MOONCAKE.get()); // 螃蟹玉米月饼
                            output.accept(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get()); // 金枪鱼牛油果月饼
                            output.accept(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get()); // 菠菜核桃月饼
                            output.accept(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get()); // 菠萝火腿月饼
                            output.accept(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get()); // 蔓越莓核桃月饼
                            output.accept(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get()); // 蓝莓酸奶月饼
                            output.accept(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE.get()); // 海鲜总汇月饼
                            output.accept(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE.get()); // 蔬菜之王月饼
                            output.accept(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get()); // 五仁月饼
                            output.accept(CroptopiaItems.BBQ_PORK_MOONCAKE.get()); // 叉烧月饼
                            output.accept(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE.get()); // 叉烧五仁月饼
                            output.accept(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get()); // 金腿五仁月饼
                            output.accept(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get()); // 栗蓉月饼
                            output.accept(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get()); // 核桃枣泥月饼
                            output.accept(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get()); // 梅干菜月饼
                            output.accept(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE.get()); // 榨菜鲜肉月饼
                            output.accept(CroptopiaItems.MILK_TEA_MOONCAKE.get()); // 奶茶月饼
                            output.accept(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get()); // 橙皮丁月饼
                            output.accept(CroptopiaItems.CARAMEL_MOONCAKE.get()); // 焦糖月饼
                            output.accept(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE.get()); // 焦糖海盐月饼
                            output.accept(CroptopiaItems.CHEESE_LAVA_MOONCAKE.get()); // 芝士流心月饼
                            output.accept(CroptopiaItems.CHEESE_CARAMEL_MOONCAKE.get()); // 芝士焦糖月饼
                            output.accept(CroptopiaItems.BUTTER_CHOCOLATE_MOONCAKE.get()); // 黄油巧克力月饼
                            output.accept(CroptopiaItems.BUTTER_CHEESE_MOONCAKE.get()); // 黄油芝士月饼
                            output.accept(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE.get()); // 流心巧克力月饼
                            output.accept(CroptopiaItems.EARL_GREY_MOONCAKE.get()); // 伯爵茶月饼
                            output.accept(CroptopiaItems.SESAME_WALNUT_MOONCAKE.get()); // 芝麻核桃月饼
                            output.accept(CroptopiaItems.SESAME_PEANUT_MOONCAKE.get()); // 芝麻花生月饼
                            output.accept(CroptopiaItems.SESAME_ALMOND_MOONCAKE.get()); // 芝麻杏仁月饼
                            output.accept(CroptopiaItems.SESAME_CHEESE_MOONCAKE.get()); // 芝麻芝士月饼
                            output.accept(CroptopiaItems.BLACK_SESAME_COCONUT_MOONCAKE.get()); // 黑芝麻椰蓉月饼
                        }

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

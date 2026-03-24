package com.chinaex123.mooncake_delight.item.ModCompat.Croptopia;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModFoods;
import com.chinaex123.mooncake_delight.util.FoodTooltipItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CroptopiaItems {
    public static final DeferredRegister.Items ITEMS_REGISTER =
            DeferredRegister.createItems(MooncakeDelight.MOD_ID);

    public static final DeferredItem<Item> PEPPER_SALT = ITEMS_REGISTER.register("pepper_salt", () -> new Item(new Item.Properties())); // 胡椒
    public static final DeferredItem<Item> SAUSAGE_MOONCAKE = ITEMS_REGISTER.register("sausage_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SAUSAGE_MOONCAKE))); // 香肠月饼
    public static final DeferredItem<Item> CALAMARI_MOONCAKE = ITEMS_REGISTER.register("calamari_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CALAMARI_MOONCAKE))); // 鱿鱼月饼
    public static final DeferredItem<Item> PINEAPPLE_MOONCAKE = ITEMS_REGISTER.register("pineapple_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PINEAPPLE_MOONCAKE))); // 菠萝月饼
    public static final DeferredItem<Item> STRAWBERRY_MOONCAKE = ITEMS_REGISTER.register("strawberry_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.STRAWBERRY_MOONCAKE))); // 草莓月饼
    public static final DeferredItem<Item> BLUEBERRY_MOONCAKE = ITEMS_REGISTER.register("blueberry_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BLUEBERRY_MOONCAKE))); // 蓝莓月饼
    public static final DeferredItem<Item> CRANBERRY_MOONCAKE = ITEMS_REGISTER.register("cranberry_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CRANBERRY_MOONCAKE))); // 蔓越莓月饼
    public static final DeferredItem<Item> BLACKBERRY_MOONCAKE = ITEMS_REGISTER.register("blackberry_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BLACKBERRY_MOONCAKE))); // 黑莓月饼
    public static final DeferredItem<Item> COCONUT_PASTE_MOONCAKE = ITEMS_REGISTER.register("coconut_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.COCONUT_PASTE_MOONCAKE))); // 椰蓉月饼
    public static final DeferredItem<Item> JUJUBE_PASTE_MOONCAKE = ITEMS_REGISTER.register("jujube_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.JUJUBE_PASTE_MOONCAKE))); // 枣泥月饼
    public static final DeferredItem<Item> MUNG_MOONCAKE = ITEMS_REGISTER.register("mung_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MUNG_MOONCAKE))); // 绿豆月饼
    public static final DeferredItem<Item> PEANUT_MOONCAKE = ITEMS_REGISTER.register("peanut_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PEANUT_MOONCAKE))); // 花生月饼
    public static final DeferredItem<Item> HUNAN_SCALLION_MOONCAKE = ITEMS_REGISTER.register("hunan_scallion_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.HUNAN_SCALLION_MOONCAKE))); // 葱油月饼
    public static final DeferredItem<Item> PEPPER_SALT_MOONCAKE = ITEMS_REGISTER.register("pepper-salt_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PEPPER_SALT_MOONCAKE))); // 椒盐月饼
    public static final DeferredItem<Item> BLACK_SESAME_PEPPER_SALT_MOONCAKE = ITEMS_REGISTER.register("black_sesame_pepper-salt_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BLACK_SESAME_PEPPER_SALT_MOONCAKE))); // 黑麻椒盐月饼
    public static final DeferredItem<Item> MANGO_MOONCAKE = ITEMS_REGISTER.register("mango_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MANGO_MOONCAKE))); // 芒果月饼
    public static final DeferredItem<Item> MANGO_COCONUT_MOONCAKE = ITEMS_REGISTER.register("mango_coconut_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MANGO_COCONUT_MOONCAKE))); // 芒果椰奶月饼
    public static final DeferredItem<Item> CINNAMON_APPLE_MOONCAKE = ITEMS_REGISTER.register("cinnamon_apple_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CINNAMON_APPLE_MOONCAKE))); // 肉桂苹果月饼
    public static final DeferredItem<FoodTooltipItem> TROPICAL_FRUIT_MOONCAKE = FoodWithTooltip("tropical_fruit_mooncake", CroptopiaFoods.TROPICAL_FRUIT_MOONCAKE); // 热带水果月饼
    public static final DeferredItem<FoodTooltipItem> BERRY_MEDLEY_MOONCAKE = FoodWithTooltip("berry_medley_mooncake", CroptopiaFoods.BERRY_MEDLEY_MOONCAKE); // 浆果荟萃月饼
    public static final DeferredItem<FoodTooltipItem> CITRUS_BLAST_MOONCAKE = FoodWithTooltip("citrus_blast_mooncake", CroptopiaFoods.CITRUS_BLAST_MOONCAKE); // 柑橘炸弹月饼
    public static final DeferredItem<FoodTooltipItem> ALMOND_CHERRY_MOONCAKE = FoodWithTooltip("almond-cherry_mooncake", CroptopiaFoods.ALMOND_CHERRY_MOONCAKE); // 扁桃仁樱桃月饼
    public static final DeferredItem<FoodTooltipItem> CASHEW_MANGO_MOONCAKE = FoodWithTooltip("cashew-mango_mooncake", CroptopiaFoods.CASHEW_MANGO_MOONCAKE); // 腰果芒果月饼
    public static final DeferredItem<FoodTooltipItem> SHRIMP_ASPARAGUS_MOONCAKE = FoodWithTooltip("shrimp-asparagus_mooncake", CroptopiaFoods.SHRIMP_ASPARAGUS_MOONCAKE); // 鲜虾芦笋月饼
    public static final DeferredItem<FoodTooltipItem> CRAB_CORNS_MOONCAKE = FoodWithTooltip("crab-corns_mooncake", CroptopiaFoods.CRAB_CORNS_MOONCAKE); // 螃蟹玉米月饼
    public static final DeferredItem<FoodTooltipItem> TUNA_AVOCADO_MOONCAKE = FoodWithTooltip("tuna-avocado_mooncake", CroptopiaFoods.TUNA_AVOCADO_MOONCAKE); // 金枪鱼牛油果月饼
    public static final DeferredItem<FoodTooltipItem> SPINACHE_WALNUT_MOONCAKE = FoodWithTooltip("spinach-walnut_mooncake", CroptopiaFoods.SPINACHE_WALNUT_MOONCAKE); // 菠菜核桃月饼
    public static final DeferredItem<FoodTooltipItem> PINEAPPLE_HAM_MOONCAKE = FoodWithTooltip("pineapple-ham_mooncake", CroptopiaFoods.PINEAPPLE_HAM_MOONCAKE); // 菠萝火腿月饼
    public static final DeferredItem<FoodTooltipItem> CRANBERRY_WALNUT_MOONCAKE = FoodWithTooltip("cranberry-walnut_mooncake", CroptopiaFoods.CRANBERRY_WALNUT_MOONCAKE); // 蔓越莓核桃月饼
    public static final DeferredItem<FoodTooltipItem> BLUEBERRY_YOGURT_MOONCAKE = FoodWithTooltip("blueberry_yogurt_mooncake", CroptopiaFoods.BLUEBERRY_YOGURT_MOONCAKE); // 蓝莓酸奶月饼
    public static final DeferredItem<FoodTooltipItem> SEAFOOD_MEDLEY_MOONCAKE = FoodWithTooltip("seafood_medley_mooncake", CroptopiaFoods.SEAFOOD_MEDLEY_MOONCAKE); // 海鲜总汇月饼
    public static final DeferredItem<FoodTooltipItem> KING_OF_VEGGIES_MOONCAKE = FoodWithTooltip("king_of_veggies_mooncake", CroptopiaFoods.KING_OF_VEGGIES_MOONCAKE); // 蔬菜之王月饼
    public static final DeferredItem<FoodTooltipItem> FIVE_KERNELS_MOONCAKE = FoodWithTooltip("five_kernels_mooncake", CroptopiaFoods.FIVE_KERNELS_MOONCAKE); // 五仁月饼
    public static final DeferredItem<FoodTooltipItem> BBQ_PORK_MOONCAKE = FoodWithTooltip("bbq_pork_mooncake", CroptopiaFoods.BBQ_PORK_MOONCAKE); // 叉烧月饼
    public static final DeferredItem<FoodTooltipItem> BBQ_PORK_FIVE_KERNELS_MOONCAKE = FoodWithTooltip("bbq_pork-five_kernels_mooncake", CroptopiaFoods.BBQ_PORK_FIVE_KERNELS_MOONCAKE); // 叉烧五仁月饼
    public static final DeferredItem<FoodTooltipItem> JINHUA_HAM_FIVE_KERNELS_MOONCAKE = FoodWithTooltip("jinhua_ham-five_kernels_mooncake", CroptopiaFoods.JINHUA_HAM_FIVE_KERNELS_MOONCAKE); // 金腿五仁月饼
    public static final DeferredItem<Item> CHESTNUT_PASTE_MOONCAKE = ITEMS_REGISTER.register("chestnut_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CHESTNUT_PASTE_MOONCAKE))); // 栗蓉月饼
    public static final DeferredItem<Item> WALNUT_DATE_PASTE_MOONCAKE = ITEMS_REGISTER.register("walnut-date_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.WALNUT_DATE_PASTE_MOONCAKE))); // 核桃枣泥月饼
    public static final DeferredItem<Item> PRESERVED_MUSTARD_GREEN_MOONCAKE = ITEMS_REGISTER.register("preserved_mustard_green_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PRESERVED_MUSTARD_GREEN_MOONCAKE))); // 梅干菜月饼
    public static final DeferredItem<Item> PICKLED_MUSTARD_PORK_MOONCAKE = ITEMS_REGISTER.register("pickled_mustard-pork_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PICKLED_MUSTARD_PORK_MOONCAKE))); // 榨菜鲜肉月饼
    public static final DeferredItem<Item> MILK_TEA_MOONCAKE = ITEMS_REGISTER.register("milk_tea_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MILK_TEA_MOONCAKE))); // 奶茶月饼
    public static final DeferredItem<Item> CANDIED_ORANGE_PEEL_MOONCAKE = ITEMS_REGISTER.register("candied_orange_peel_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CANDIED_ORANGE_PEEL_MOONCAKE))); // 橙皮丁月饼

//
//    public static final DeferredItem<Item> RED_BEAN_PASTE_MOONCAKE = ITEMS_REGISTER.register("red_bean_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.RED_BEAN_PASTE_MOONCAKE))); // 红豆沙月饼
//    public static final DeferredItem<Item> SESAME_MOONCAKE = ITEMS_REGISTER.register("sesame_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SESAME_MOONCAKE))); // 芝麻月饼
//    public static final DeferredItem<Item> MATCHA_MOONCAKE = ITEMS_REGISTER.register("matcha_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MATCHA_MOONCAKE))); // 抹茶月饼
//    public static final DeferredItem<Item> EARL_GREY_MOONCAKE = ITEMS_REGISTER.register("earl_grey_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.EARL_GREY_MOONCAKE))); // 伯爵茶月饼
//    public static final DeferredItem<Item> SEVEN_STARS_MOONCAKE = ITEMS_REGISTER.register("seven_stars_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SEVEN_STARS_MOONCAKE))); // 七星伴月月饼
//    public static final DeferredItem<Item> TARO_PASTE_MOONCAKE = ITEMS_REGISTER.register("taro_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.TARO_PASTE_MOONCAKE))); // 芋泥月饼
//    public static final DeferredItem<Item> OSMANTHUS_MOONCAKE = ITEMS_REGISTER.register("osmanthus_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.OSMANTHUS_MOONCAKE))); // 桂花月饼
//    public static final DeferredItem<Item> DURIAN_MOONCAKE = ITEMS_REGISTER.register("durian_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.DURIAN_MOONCAKE))); // 榴莲月饼
//    public static final DeferredItem<Item> DURIAN_SNOW_SKIN_MOONCAKE = ITEMS_REGISTER.register("durian_snow_skin_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.DURIAN_SNOW_SKIN_MOONCAKE))); // 榴莲冰皮月饼
//    public static final DeferredItem<Item> PURPLE_SWEET_POTATO_YAM_MOONCAKE = ITEMS_REGISTER.register("purple_sweet_potato-yam_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PURPLE_SWEET_POTATO_YAM_MOONCAKE))); // 紫薯山药月饼
//    public static final DeferredItem<Item> MATCHA_RED_BEAN_MOONCAKE = ITEMS_REGISTER.register("matcha_red_bean_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MATCHA_RED_BEAN_MOONCAKE))); // 抹茶红豆月饼
//    public static final DeferredItem<Item> CARAMEL_MOONCAKE = ITEMS_REGISTER.register("caramel_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CARAMEL_MOONCAKE))); // 焦糖月饼
//    public static final DeferredItem<Item> CARAMEL_SEA_SALT_MOONCAKE = ITEMS_REGISTER.register("caramel_sea_salt_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CARAMEL_SEA_SALT_MOONCAKE))); // 焦糖海盐月饼
//    public static final DeferredItem<Item> CHEESE_LAVA_MOONCAKE = ITEMS_REGISTER.register("cheese_lava_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CHEESE_LAVA_MOONCAKE))); // 芝士流心月饼
//    public static final DeferredItem<Item> LAVA_CHOCOLATE_MOONCAKE = ITEMS_REGISTER.register("lava_chocolate_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.LAVA_CHOCOLATE_MOONCAKE))); // 流心巧克力月饼
//    public static final DeferredItem<Item> WHITE_CHOCOLATE_MOONCAKE = ITEMS_REGISTER.register("white_chocolate_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.WHITE_CHOCOLATE_MOONCAKE))); // 白巧克力月饼
//    public static final DeferredItem<Item> BLACK_CHOCOLATE_MOONCAKE = ITEMS_REGISTER.register("black_chocolate_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BLACK_CHOCOLATE_MOONCAKE))); // 黑巧克力月饼
//    public static final DeferredItem<Item> UBE_MOONCAKE = ITEMS_REGISTER.register("ube_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.UBE_MOONCAKE))); // 香芋月饼


    /**
     * 自动显示 Effect 的 Tooltip（无附魔光效）
     */
    private static DeferredItem<FoodTooltipItem> FoodWithTooltip(String name, FoodProperties food) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food), food, false));
    }

    /**
     * 自动显示 Effect 的 Tooltip（带稀有度，无附魔光效）
     */
    private static DeferredItem<FoodTooltipItem> FoodWithTooltip(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food).rarity(rarity), food, false));
    }

    /**
     * 自动显示 Effect 的 Tooltip（带稀有度和附魔光效）
     */
    private static DeferredItem<FoodTooltipItem> FoodWithTooltipAndFoil(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food).rarity(rarity), food, true));
    }

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}

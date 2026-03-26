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
    public static final DeferredItem<Item> TROPICAL_FRUIT_MOONCAKE = ITEMS_REGISTER.register("tropical_fruit_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.TROPICAL_FRUIT_MOONCAKE))); // 热带水果月饼
    public static final DeferredItem<Item> BERRY_MEDLEY_MOONCAKE = ITEMS_REGISTER.register("berry_medley_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BERRY_MEDLEY_MOONCAKE))); // 浆果荟萃月饼
    public static final DeferredItem<Item> CITRUS_BLAST_MOONCAKE = ITEMS_REGISTER.register("citrus_blast_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CITRUS_BLAST_MOONCAKE))); // 柑橘炸弹月饼
    public static final DeferredItem<Item> ALMOND_CHERRY_MOONCAKE = ITEMS_REGISTER.register("almond-cherry_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.ALMOND_CHERRY_MOONCAKE))); // 扁桃仁樱桃月饼
    public static final DeferredItem<Item> CASHEW_MANGO_MOONCAKE = ITEMS_REGISTER.register("cashew-mango_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CASHEW_MANGO_MOONCAKE))); // 腰果芒果月饼
    public static final DeferredItem<Item> SHRIMP_ASPARAGUS_MOONCAKE = ITEMS_REGISTER.register("shrimp-asparagus_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SHRIMP_ASPARAGUS_MOONCAKE))); // 鲜虾芦笋月饼
    public static final DeferredItem<Item> CRAB_CORNS_MOONCAKE = ITEMS_REGISTER.register("crab-corns_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CRAB_CORNS_MOONCAKE))); // 螃蟹玉米月饼
    public static final DeferredItem<Item> TUNA_AVOCADO_MOONCAKE = ITEMS_REGISTER.register("tuna-avocado_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.TUNA_AVOCADO_MOONCAKE))); // 金枪鱼牛油果月饼
    public static final DeferredItem<Item> SPINACHE_WALNUT_MOONCAKE = ITEMS_REGISTER.register("spinach-walnut_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SPINACHE_WALNUT_MOONCAKE))); // 菠菜核桃月饼
    public static final DeferredItem<Item> PINEAPPLE_HAM_MOONCAKE = ITEMS_REGISTER.register("pineapple-ham_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PINEAPPLE_HAM_MOONCAKE))); // 菠萝火腿月饼
    public static final DeferredItem<Item> CRANBERRY_WALNUT_MOONCAKE = ITEMS_REGISTER.register("cranberry-walnut_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CRANBERRY_WALNUT_MOONCAKE))); // 蔓越莓核桃月饼
    public static final DeferredItem<Item> BLUEBERRY_YOGURT_MOONCAKE = ITEMS_REGISTER.register("blueberry_yogurt_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BLUEBERRY_YOGURT_MOONCAKE))); // 蓝莓酸奶月饼
    public static final DeferredItem<Item> SEAFOOD_MEDLEY_MOONCAKE = ITEMS_REGISTER.register("seafood_medley_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.SEAFOOD_MEDLEY_MOONCAKE))); // 海鲜总汇月饼
    public static final DeferredItem<Item> KING_OF_VEGGIES_MOONCAKE = ITEMS_REGISTER.register("king_of_veggies_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.KING_OF_VEGGIES_MOONCAKE))); // 蔬菜之王月饼
    public static final DeferredItem<Item> FIVE_KERNELS_MOONCAKE = ITEMS_REGISTER.register("five_kernels_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.FIVE_KERNELS_MOONCAKE))); // 五仁月饼
    public static final DeferredItem<Item> BBQ_PORK_MOONCAKE = ITEMS_REGISTER.register("bbq_pork_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BBQ_PORK_MOONCAKE))); // 叉烧月饼
    public static final DeferredItem<Item> BBQ_PORK_FIVE_KERNELS_MOONCAKE = ITEMS_REGISTER.register("bbq_pork-five_kernels_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BBQ_PORK_FIVE_KERNELS_MOONCAKE))); // 叉烧五仁月饼
    public static final DeferredItem<Item> JINHUA_HAM_FIVE_KERNELS_MOONCAKE = ITEMS_REGISTER.register("jinhua_ham-five_kernels_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.JINHUA_HAM_FIVE_KERNELS_MOONCAKE))); // 金腿五仁月饼
    public static final DeferredItem<Item> CHESTNUT_PASTE_MOONCAKE = ITEMS_REGISTER.register("chestnut_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CHESTNUT_PASTE_MOONCAKE))); // 栗蓉月饼
    public static final DeferredItem<Item> WALNUT_DATE_PASTE_MOONCAKE = ITEMS_REGISTER.register("walnut-date_paste_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.WALNUT_DATE_PASTE_MOONCAKE))); // 核桃枣泥月饼
    public static final DeferredItem<Item> PRESERVED_MUSTARD_GREEN_MOONCAKE = ITEMS_REGISTER.register("preserved_mustard_green_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PRESERVED_MUSTARD_GREEN_MOONCAKE))); // 梅干菜月饼
    public static final DeferredItem<Item> PICKLED_MUSTARD_PORK_MOONCAKE = ITEMS_REGISTER.register("pickled_mustard-pork_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.PICKLED_MUSTARD_PORK_MOONCAKE))); // 榨菜鲜肉月饼
    public static final DeferredItem<Item> MILK_TEA_MOONCAKE = ITEMS_REGISTER.register("milk_tea_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.MILK_TEA_MOONCAKE))); // 奶茶月饼
    public static final DeferredItem<Item> CANDIED_ORANGE_PEEL_MOONCAKE = ITEMS_REGISTER.register("candied_orange_peel_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CANDIED_ORANGE_PEEL_MOONCAKE))); // 橙皮丁月饼
    public static final DeferredItem<Item> CARAMEL_MOONCAKE = ITEMS_REGISTER.register("caramel_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CARAMEL_MOONCAKE))); // 焦糖月饼
    public static final DeferredItem<Item> CARAMEL_SEA_SALT_MOONCAKE = ITEMS_REGISTER.register("caramel_sea_salt_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CARAMEL_SEA_SALT_MOONCAKE))); // 焦糖海盐月饼
    public static final DeferredItem<Item> CHEESE_LAVA_MOONCAKE = ITEMS_REGISTER.register("cheese_lava_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CHEESE_LAVA_MOONCAKE))); // 芝士流心月饼
    public static final DeferredItem<Item> CHEESE_CARAMEL_MOONCAKE = ITEMS_REGISTER.register("cheese_caramel_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.CHEESE_CARAMEL_MOONCAKE))); // 芝士焦糖月饼
    public static final DeferredItem<Item> BUTTER_CHOCOLATE_MOONCAKE = ITEMS_REGISTER.register("butter_chocolate_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BUTTER_CHOCOLATE_MOONCAKE))); // 黄油巧克力月饼
    public static final DeferredItem<Item> BUTTER_CHEESE_MOONCAKE = ITEMS_REGISTER.register("butter_cheese_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.BUTTER_CHEESE_MOONCAKE))); // 黄油芝士月饼
    public static final DeferredItem<Item> LAVA_CHOCOLATE_MOONCAKE = ITEMS_REGISTER.register("lava_chocolate_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.LAVA_CHOCOLATE_MOONCAKE))); // 流心巧克力月饼
    public static final DeferredItem<Item> EARL_GREY_MOONCAKE = ITEMS_REGISTER.register("earl_grey_mooncake", () -> new Item(new Item.Properties().food(CroptopiaFoods.EARL_GREY_MOONCAKE))); // 伯爵茶月饼

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

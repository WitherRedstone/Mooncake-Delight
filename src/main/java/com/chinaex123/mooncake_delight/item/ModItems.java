package com.chinaex123.mooncake_delight.item;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import com.chinaex123.mooncake_delight.item.Tools.Knife.OiledKnife;
import com.chinaex123.mooncake_delight.util.FoodTooltipItem;
import com.chinaex123.mooncake_delight.util.SyrupItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS_REGISTER =
            DeferredRegister.createItems(MooncakeDelight.MOD_ID);

    // ======================= 流体桶 =======================
    public static final DeferredItem<Item> INVERT_SUGAR_SYRUP_BUCKET = ITEMS_REGISTER.register("invert_sugar_syrup_bucket", () ->
            new BucketItem(ModFluids.INVERT_SUGAR_SYRUP.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))); // 转换糖浆 桶
    public static final DeferredItem<Item> MAPLE_SYRUP_BUCKET = ITEMS_REGISTER.register("maple_syrup_bucket", () ->
            new BucketItem(ModFluids.MAPLE_SYRUP.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))); // 枫糖浆 桶

    public static final DeferredItem<Item> INVERT_SUGAR_SYRUP = ITEMS_REGISTER.register("invert_sugar_syrup", () -> new SyrupItem(ModFoods.INVERT_SUGAR_SYRUP)); // 转换糖浆
    public static final DeferredItem<Item> MAPLE_SYRUP = ITEMS_REGISTER.register("maple_syrup", () -> new SyrupItem(ModFoods.MAPLE_SYRUP)); // 枫糖浆
    public static final DeferredItem<Item> ANIMAL_FAT = ITEMS_REGISTER.register("animal_fat", () -> new SyrupItem(ModFoods.ANIMAL_FAT)); // 动物油

    // ======================= 食材 =======================
    public static final DeferredItem<Item> SUGAR_CUBE = ITEMS_REGISTER.register("sugar_cube", () -> new Item(new Item.Properties())); // 方糖
    public static final DeferredItem<Item> TRUFFLE = ITEMS_REGISTER.register("truffle", () -> new Item(new Item.Properties())); // 松露
    public static final DeferredItem<Item> PEPPER_SALT = ITEMS_REGISTER.register("pepper_salt", () -> new Item(new Item.Properties())); // 椒盐
    public static final DeferredItem<Item> FLOUR = ITEMS_REGISTER.register("flour", () -> new Item(new Item.Properties())); // 面粉
    public static final DeferredItem<FoodTooltipItem> MOONCAKE_CRUST_DOUGH = FoodWithTooltip("mooncake_crust_dough", ModFoods.MOONCAKE_CRUST_DOUGH); // 月饼面团
    public static final DeferredItem<FoodTooltipItem> SNOW_SKIN_MOONCAKE_CRUST_DOUGH = FoodWithTooltip("snow_skin_mooncake_crust_dough", ModFoods.SNOW_SKIN_MOONCAKE_CRUST_DOUGH); // 冰皮月饼面团
    public static final DeferredItem<Item> TALLOW = ITEMS_REGISTER.register("tallow", () -> new Item(new Item.Properties().food(ModFoods.TALLOW))); // 动物油脂
    public static final DeferredItem<Item> TALLOW_CRUMBS = ITEMS_REGISTER.register("tallow_crumbs", () -> new Item(new Item.Properties().food(ModFoods.TALLOW_CRUMBS))); // 动物油脂碎
    public static final DeferredItem<Item> LOTUS_SEED = ITEMS_REGISTER.register("lotus_seed", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED))); // 莲子

    // 实际饱和度 ≈ nutrition × saturationModifier × 2
    // ======================= 原版自带 =======================
    public static final DeferredItem<Item> APPLE_MOONCAKE = ITEMS_REGISTER.register("apple_mooncake", () -> new Item(new Item.Properties().food(ModFoods.APPLE_MOONCAKE))); // 苹果月饼
    public static final DeferredItem<FoodTooltipItem> GOLDEN_APPLE_MOONCAKE = FoodWithTooltip("golden_apple_mooncake", ModFoods.GOLDEN_APPLE_MOONCAKE, Rarity.RARE); // 金苹果月饼
    public static final DeferredItem<FoodTooltipItem> ENCHANTED_GOLDEN_APPLE_MOONCAKE = FoodWithTooltipAndFoil("enchanted_golden_apple_mooncake", ModFoods.ENCHANTED_GOLDEN_APPLE_MOONCAKE, Rarity.EPIC); // 附魔苹果月饼
    public static final DeferredItem<Item> SWEET_BERRIES_MOONCAKE = ITEMS_REGISTER.register("sweet_berries_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SWEET_BERRIES_MOONCAKE))); // 甜浆果月饼
    public static final DeferredItem<Item> GLOW_BERRIES_MOONCAKE = ITEMS_REGISTER.register("glow_berries_mooncake", () -> new Item(new Item.Properties().food(ModFoods.GLOW_BERRIES_MOONCAKE))); // 发光浆果月饼
    public static final DeferredItem<Item> CHORUS_FRUIT_MOONCAKE = ITEMS_REGISTER.register("chorus_fruit_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHORUS_FRUIT_MOONCAKE))); // 紫颂果月饼
    public static final DeferredItem<Item> CARROT_MOONCAKE = ITEMS_REGISTER.register("carrot_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CARROT_MOONCAKE))); // 胡萝卜月饼
    public static final DeferredItem<Item> POTATO_MOONCAKE = ITEMS_REGISTER.register("potato_mooncake", () -> new Item(new Item.Properties().food(ModFoods.POTATO_MOONCAKE))); // 马铃薯月饼
    public static final DeferredItem<Item> BEEF_MOONCAKE = ITEMS_REGISTER.register("beef_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BEEF_MOONCAKE))); // 牛肉月饼
    public static final DeferredItem<Item> PORKCHOP_MOONCAKE = ITEMS_REGISTER.register("porkchop_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PORKCHOP_MOONCAKE))); // 猪肉月饼
    public static final DeferredItem<Item> MUTTON_MOONCAKE = ITEMS_REGISTER.register("mutton_mooncake", () -> new Item(new Item.Properties().food(ModFoods.MUTTON_MOONCAKE))); // 羊肉月饼
    public static final DeferredItem<Item> CHICKEN_MOONCAKE = ITEMS_REGISTER.register("chicken_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_MOONCAKE))); // 鸡肉月饼
    public static final DeferredItem<Item> RABBIT_MOONCAKE = ITEMS_REGISTER.register("rabbit_mooncake", () -> new Item(new Item.Properties().food(ModFoods.RABBIT_MOONCAKE))); // 兔肉月饼
    public static final DeferredItem<Item> COD_MOONCAKE = ITEMS_REGISTER.register("cod_mooncake", () -> new Item(new Item.Properties().food(ModFoods.COD_MOONCAKE))); // 鳕鱼月饼
    public static final DeferredItem<Item> SALMON_MOONCAKE = ITEMS_REGISTER.register("salmon_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SALMON_MOONCAKE))); // 鲑鱼月饼
    public static final DeferredItem<FoodTooltipItem> ROTTEN_FLESH_MOONCAKE = FoodWithTooltip("rotten_flesh_mooncake", ModFoods.ROTTEN_FLESH_MOONCAKE); // 腐肉月饼
    public static final DeferredItem<Item> HONEY_MOONCAKE = ITEMS_REGISTER.register("honey_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HONEY_MOONCAKE))); // 蜂蜜月饼
    public static final DeferredItem<Item> COFFEE_MOONCAKE = ITEMS_REGISTER.register("coffee_mooncake", () -> new Item(new Item.Properties().food(ModFoods.COFFEE_MOONCAKE))); // 咖啡月饼
    public static final DeferredItem<Item> SNOW_SKIN_MOONCAKE = ITEMS_REGISTER.register("snow_skin_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SNOW_SKIN_MOONCAKE))); // 冰皮月饼
    public static final DeferredItem<Item> LAVA_EGG_CUSTARD_MOONCAKE = ITEMS_REGISTER.register("lava_egg_custard_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LAVA_EGG_CUSTARD_MOONCAKE))); // 流心奶黄月饼
    public static final DeferredItem<Item> LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE = ITEMS_REGISTER.register("lava_double_egg_custard_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE))); // 流心奶双黄月饼
    public static final DeferredItem<Item> BLACK_TRUFFLE_MOONCAKE = ITEMS_REGISTER.register("black_truffle_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BLACK_TRUFFLE_MOONCAKE))); // 黑松露月饼
    public static final DeferredItem<Item> HUNDRED_FRUITS_MOONCAKE = ITEMS_REGISTER.register("hundred_fruits_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HUNDRED_FRUITS_MOONCAKE))); // 百果月饼
    public static final DeferredItem<Item> EDIBLE_FLOWER_MOONCAKE = ITEMS_REGISTER.register("edible_flower_mooncake", () -> new Item(new Item.Properties().food(ModFoods.EDIBLE_FLOWER_MOONCAKE))); // 鲜花月饼
    public static final DeferredItem<Item> ROSE_MOONCAKE = ITEMS_REGISTER.register("rose_mooncake", () -> new Item(new Item.Properties().food(ModFoods.ROSE_MOONCAKE))); // 玫瑰月饼
    public static final DeferredItem<Item> CHRYSANTHEMUM_MOONCAKE = ITEMS_REGISTER.register("chrysanthemum_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHRYSANTHEMUM_MOONCAKE))); // 菊花月饼
    public static final DeferredItem<Item> CAKE_MOONCAKE = ITEMS_REGISTER.register("cake_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CAKE_MOONCAKE))); // 蛋糕月饼
    public static final DeferredItem<Item> RICE_MOONCAKE = ITEMS_REGISTER.register("rice_mooncake", () -> new Item(new Item.Properties().food(ModFoods.RICE_MOONCAKE))); // 米月饼
    public static final DeferredItem<Item> LOTUS_SEED_PASTE_MOONCAKE = ITEMS_REGISTER.register("lotus_seed_paste_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED_PASTE_MOONCAKE))); // 莲蓉月饼
    public static final DeferredItem<Item> DOUBLE_YOLK_LOTUS_MOONCAKE = ITEMS_REGISTER.register("double_yolk_lotus_mooncake", () -> new Item(new Item.Properties().food(ModFoods.DOUBLE_YOLK_LOTUS_MOONCAKE))); // 双黄莲蓉月饼
    public static final DeferredItem<Item> PORK_MOONCAKE = ITEMS_REGISTER.register("pork_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PORK_MOONCAKE))); // 鲜肉月饼
    public static final DeferredItem<Item> EGG_YOLK_MOONCAKE = ITEMS_REGISTER.register("egg_yolk_mooncake", () -> new Item(new Item.Properties().food(ModFoods.EGG_YOLK_MOONCAKE))); // 蛋黄月饼
    public static final DeferredItem<Item> SALTED_EGG_YOLK_PORK_MOONCAKE = ITEMS_REGISTER.register("salted_egg_yolk-pork_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SALTED_EGG_YOLK_PORK_MOONCAKE))); // 蛋黄鲜肉月饼
    public static final DeferredItem<FoodTooltipItem> HAM_MOONCAKE = FoodWithTooltip("ham_mooncake", ModFoods.HAM_MOONCAKE); // 火腿月饼
    public static final DeferredItem<FoodTooltipItem> YUNNAN_HAM_MOONCAKE = FoodWithTooltip("yunnan_ham_mooncake", ModFoods.YUNNAN_HAM_MOONCAKE); // 云腿月饼
    public static final DeferredItem<Item> PUMPKIN_MOONCAKE = ITEMS_REGISTER.register("pumpkin_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PUMPKIN_MOONCAKE))); // 南瓜月饼
    public static final DeferredItem<FoodTooltipItem> PORK_CABBAGE_MOONCAKE = FoodWithTooltip("pork-cabbage_mooncake", ModFoods.PORK_CABBAGE_MOONCAKE); // 猪肉卷心菜月饼
    public static final DeferredItem<FoodTooltipItem> BEEF_TOMATO_MOONCAKE = FoodWithTooltip("beef-tomato_mooncake", ModFoods.BEEF_TOMATO_MOONCAKE); // 牛肉番茄月饼
    public static final DeferredItem<FoodTooltipItem> CHICKEN_PUMPKIN_MOONCAKE = FoodWithTooltip("chicken-pumpkin_mooncake", ModFoods.CHICKEN_PUMPKIN_MOONCAKE); // 鸡肉南瓜月饼
    public static final DeferredItem<FoodTooltipItem> HAM_CABBAGE_MOONCAKE = FoodWithTooltip("ham-cabbage_mooncake", ModFoods.HAM_CABBAGE_MOONCAKE); // 火腿卷心菜月饼
    public static final DeferredItem<FoodTooltipItem> SEAFOOD_MOONCAKE = FoodWithTooltip("seafood_mooncake", ModFoods.SEAFOOD_MOONCAKE); // 海鲜月饼
    public static final DeferredItem<FoodTooltipItem> THREE_DELICACIES_MOONCAKE = FoodWithTooltip("three_delicacies_mooncake", ModFoods.THREE_DELICACIES_MOONCAKE); // 三鲜月饼
    public static final DeferredItem<FoodTooltipItem> FAMILY_FEASTS_MOONCAKE = FoodWithTooltip("family_feasts_mooncake", ModFoods.FAMILY_FEASTS_MOONCAKE); // 全家福月饼
    public static final DeferredItem<FoodTooltipItem> DOUBLE_MEAT_MOONCAKE = FoodWithTooltip("double_meat_mooncake", ModFoods.DOUBLE_MEAT_MOONCAKE); // 双拼肉月饼
    public static final DeferredItem<FoodTooltipItem> TRIPLE_MEAT_MOONCAKE = FoodWithTooltip("triple_meat_mooncake", ModFoods.TRIPLE_MEAT_MOONCAKE); // 三肉月饼
    public static final DeferredItem<FoodTooltipItem> HAM_BACON_MOONCAKE = FoodWithTooltip("ham-bacon_mooncake", ModFoods.HAM_BACON_MOONCAKE); // 火腿培根月饼
    public static final DeferredItem<FoodTooltipItem> JINHUA_HAM_MOONCAKE = FoodWithTooltip("jinhua_ham_mooncake", ModFoods.JINHUA_HAM_MOONCAKE); // 金华火腿月饼
    public static final DeferredItem<FoodTooltipItem> BACON_ONION_MOONCAKE = FoodWithTooltip("bacon-onion_mooncake", ModFoods.BACON_ONION_MOONCAKE); // 培根洋葱月饼

    // ======================= 特殊/彩蛋物品 =======================
    public static final DeferredItem<FoodTooltipItem> LAVA_MOONCAKE = FoodWithTooltip("lava_mooncake", ModFoods.LAVA_MOONCAKE, Rarity.EPIC); // 流心月饼
    public static final DeferredItem<Item> TNT_MOONCAKE = ITEMS_REGISTER.register("tnt_mooncake", () -> new Item(new Item.Properties().food(ModFoods.TNT_MOONCAKE).rarity(Rarity.EPIC))); // TNT 月饼
    public static final DeferredItem<Item> DEBRIS_MOONCAKE = ITEMS_REGISTER.register("debris_mooncake", () -> new Item(new Item.Properties().food(ModFoods.DEBRIS_MOONCAKE).rarity(Rarity.EPIC))); // 残骸月饼
    public static final DeferredItem<FoodTooltipItem> BEDROCK_MOONCAKE = FoodWithTooltip("bedrock_mooncake", ModFoods.BEDROCK_MOONCAKE, Rarity.EPIC); // 基岩月饼

    // ======================= 工具 =======================
    public static final DeferredItem<Item> MOONCAKE_MOLD = ITEMS_REGISTER.register("mooncake_mold", () -> new Item(new Item.Properties())); // 月饼模具
    public static final DeferredItem<Item> OILED_KNIFE = ITEMS_REGISTER.register("oiled_knife", OiledKnife::new); // 油浸刀

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

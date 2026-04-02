package com.chinaex123.mooncake_delight.item;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.block.ModBlocks;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import com.chinaex123.mooncake_delight.item.Tools.Knife.OiledKnife;
import com.chinaex123.mooncake_delight.util.FoodTooltipItem;
import com.chinaex123.mooncake_delight.util.SyrupItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS_REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, MooncakeDelight.MOD_ID);

    // ======================= 流体桶 =======================
    public static final RegistryObject<Item> INVERT_SUGAR_SYRUP_BUCKET = ITEMS_REGISTER.register("invert_sugar_syrup_bucket", () ->
            new BucketItem(ModFluids.INVERT_SUGAR_SYRUP, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))); // 转换糖浆 桶
    public static final RegistryObject<Item> MAPLE_SYRUP_BUCKET = ITEMS_REGISTER.register("maple_syrup_bucket", () ->
            new BucketItem(ModFluids.MAPLE_SYRUP, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET))); // 枫糖浆 桶

    // ======================= 物品 =======================
    public static final RegistryObject<Item> INVERT_SUGAR_SYRUP_BOTTLE = ITEMS_REGISTER.register("invert_sugar_syrup_bottle", () -> new SyrupItem(ModFoods.INVERT_SUGAR_SYRUP_BOTTLE)); // 转换糖浆瓶
    public static final RegistryObject<Item> MAPLE_SYRUP_BOTTLE = ITEMS_REGISTER.register("maple_syrup_bottle", () -> new SyrupItem(ModFoods.MAPLE_SYRUP_BOTTLE)); // 枫糖浆瓶
    public static final RegistryObject<Item> ANIMAL_FAT = ITEMS_REGISTER.register("animal_fat", () -> new SyrupItem(ModFoods.ANIMAL_FAT)); // 动物油

    // ======================= 食材 =======================
    public static final RegistryObject<Item> SUGAR_CUBE = ITEMS_REGISTER.register("sugar_cube", () -> new Item(new Item.Properties())); // 方糖
    public static final RegistryObject<Item> TRUFFLE = ITEMS_REGISTER.register("truffle", () -> new Item(new Item.Properties())); // 松露
    public static final RegistryObject<Item> FLOUR = ITEMS_REGISTER.register("flour", () -> new Item(new Item.Properties())); // 面粉
    public static final RegistryObject<Item> MOONCAKE_CRUST_DOUGH = ITEMS_REGISTER.register("mooncake_crust_dough", () -> new Item(new Item.Properties().food(ModFoods.MOONCAKE_CRUST_DOUGH))); // 月饼面团
    public static final RegistryObject<Item> SNOW_SKIN_MOONCAKE_CRUST_DOUGH = ITEMS_REGISTER.register("snow_skin_mooncake_crust_dough", () -> new Item(new Item.Properties().food(ModFoods.SNOW_SKIN_MOONCAKE_CRUST_DOUGH))); // 冰皮月饼面团
    public static final RegistryObject<Item> TALLOW = ITEMS_REGISTER.register("tallow", () -> new Item(new Item.Properties().food(ModFoods.TALLOW))); // 动物油脂
    public static final RegistryObject<Item> TALLOW_CRUMBS = ITEMS_REGISTER.register("tallow_crumbs", () -> new Item(new Item.Properties().food(ModFoods.TALLOW_CRUMBS))); // 动物油脂碎
    public static final RegistryObject<Item> LOTUS_SEED = ITEMS_REGISTER.register("lotus_seed", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED))); // 莲子

    // ======================= 作物 =======================
    public static final RegistryObject<Item> WHITE_SESAME = ITEMS_REGISTER.register("white_sesame", () -> new ItemNameBlockItem(ModBlocks.SESAME_CROP.get(), new Item.Properties().food(ModFoods.WHITE_SESAME))); // 白芝麻
    public static final RegistryObject<Item> BLACK_SESAME = ITEMS_REGISTER.register("black_sesame", () -> new Item(new Item.Properties().food(ModFoods.BLACK_SESAME).rarity(Rarity.RARE))); // 黑芝麻

    // 实际饱和度 ≈ nutrition × saturationModifier × 2
    // ======================= 原版自带 =======================
    public static final RegistryObject<Item> APPLE_MOONCAKE = ITEMS_REGISTER.register("apple_mooncake", () -> new Item(new Item.Properties().food(ModFoods.APPLE_MOONCAKE))); // 苹果月饼
    public static final RegistryObject<Item> GOLDEN_APPLE_MOONCAKE = ITEMS_REGISTER.register("golden_apple_mooncake", () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_APPLE_MOONCAKE).rarity(Rarity.RARE))); // 金苹果月饼
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE_MOONCAKE = createEnchantedItem("enchanted_golden_apple_mooncake", ModFoods.ENCHANTED_GOLDEN_APPLE_MOONCAKE, Rarity.EPIC); // 附魔苹果月饼
    public static final RegistryObject<Item> SWEET_BERRIES_MOONCAKE = ITEMS_REGISTER.register("sweet_berries_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SWEET_BERRIES_MOONCAKE))); // 甜浆果月饼
    public static final RegistryObject<Item> GLOW_BERRIES_MOONCAKE = ITEMS_REGISTER.register("glow_berries_mooncake", () -> new Item(new Item.Properties().food(ModFoods.GLOW_BERRIES_MOONCAKE))); // 发光浆果月饼
    public static final RegistryObject<Item> CHORUS_FRUIT_MOONCAKE = ITEMS_REGISTER.register("chorus_fruit_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHORUS_FRUIT_MOONCAKE))); // 紫颂果月饼
    public static final RegistryObject<Item> CARROT_MOONCAKE = ITEMS_REGISTER.register("carrot_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CARROT_MOONCAKE))); // 胡萝卜月饼
    public static final RegistryObject<Item> POTATO_MOONCAKE = ITEMS_REGISTER.register("potato_mooncake", () -> new Item(new Item.Properties().food(ModFoods.POTATO_MOONCAKE))); // 马铃薯月饼
    public static final RegistryObject<Item> BEEF_MOONCAKE = ITEMS_REGISTER.register("beef_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BEEF_MOONCAKE))); // 牛肉月饼
    public static final RegistryObject<Item> PORKCHOP_MOONCAKE = ITEMS_REGISTER.register("porkchop_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PORKCHOP_MOONCAKE))); // 猪肉月饼
    public static final RegistryObject<Item> MUTTON_MOONCAKE = ITEMS_REGISTER.register("mutton_mooncake", () -> new Item(new Item.Properties().food(ModFoods.MUTTON_MOONCAKE))); // 羊肉月饼
    public static final RegistryObject<Item> CHICKEN_MOONCAKE = ITEMS_REGISTER.register("chicken_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_MOONCAKE))); // 鸡肉月饼
    public static final RegistryObject<Item> RABBIT_MOONCAKE = ITEMS_REGISTER.register("rabbit_mooncake", () -> new Item(new Item.Properties().food(ModFoods.RABBIT_MOONCAKE))); // 兔肉月饼
    public static final RegistryObject<Item> COD_MOONCAKE = ITEMS_REGISTER.register("cod_mooncake", () -> new Item(new Item.Properties().food(ModFoods.COD_MOONCAKE))); // 鳕鱼月饼
    public static final RegistryObject<Item> SALMON_MOONCAKE = ITEMS_REGISTER.register("salmon_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SALMON_MOONCAKE))); // 鲑鱼月饼
    public static final RegistryObject<Item> ROTTEN_FLESH_MOONCAKE = ITEMS_REGISTER.register("rotten_flesh_mooncake", () -> new Item(new Item.Properties().food(ModFoods.ROTTEN_FLESH_MOONCAKE))); // 腐肉月饼
    public static final RegistryObject<Item> HONEY_MOONCAKE = ITEMS_REGISTER.register("honey_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HONEY_MOONCAKE))); // 蜂蜜月饼
    public static final RegistryObject<Item> COFFEE_MOONCAKE = ITEMS_REGISTER.register("coffee_mooncake", () -> new Item(new Item.Properties().food(ModFoods.COFFEE_MOONCAKE))); // 咖啡月饼
    public static final RegistryObject<Item> SNOW_SKIN_MOONCAKE = ITEMS_REGISTER.register("snow_skin_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SNOW_SKIN_MOONCAKE))); // 冰皮月饼
    public static final RegistryObject<Item> LAVA_EGG_CUSTARD_MOONCAKE = ITEMS_REGISTER.register("lava_egg_custard_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LAVA_EGG_CUSTARD_MOONCAKE))); // 流心奶黄月饼
    public static final RegistryObject<Item> LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE = ITEMS_REGISTER.register("lava_double_egg_custard_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE))); // 流心奶双黄月饼
    public static final RegistryObject<Item> BLACK_TRUFFLE_MOONCAKE = ITEMS_REGISTER.register("black_truffle_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BLACK_TRUFFLE_MOONCAKE))); // 黑松露月饼
    public static final RegistryObject<Item> HUNDRED_FRUITS_MOONCAKE = ITEMS_REGISTER.register("hundred_fruits_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HUNDRED_FRUITS_MOONCAKE))); // 百果月饼
    public static final RegistryObject<Item> EDIBLE_FLOWER_MOONCAKE = ITEMS_REGISTER.register("edible_flower_mooncake", () -> new Item(new Item.Properties().food(ModFoods.EDIBLE_FLOWER_MOONCAKE))); // 鲜花月饼
    public static final RegistryObject<Item> ROSE_MOONCAKE = ITEMS_REGISTER.register("rose_mooncake", () -> new Item(new Item.Properties().food(ModFoods.ROSE_MOONCAKE))); // 玫瑰月饼
    public static final RegistryObject<Item> CHRYSANTHEMUM_MOONCAKE = ITEMS_REGISTER.register("chrysanthemum_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHRYSANTHEMUM_MOONCAKE))); // 菊花月饼
    public static final RegistryObject<Item> CAKE_MOONCAKE = ITEMS_REGISTER.register("cake_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CAKE_MOONCAKE))); // 蛋糕月饼
    public static final RegistryObject<Item> RICE_MOONCAKE = ITEMS_REGISTER.register("rice_mooncake", () -> new Item(new Item.Properties().food(ModFoods.RICE_MOONCAKE))); // 米月饼
    public static final RegistryObject<Item> LOTUS_SEED_PASTE_MOONCAKE = ITEMS_REGISTER.register("lotus_seed_paste_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED_PASTE_MOONCAKE))); // 莲蓉月饼
    public static final RegistryObject<Item> DOUBLE_YOLK_LOTUS_MOONCAKE = ITEMS_REGISTER.register("double_yolk_lotus_mooncake", () -> new Item(new Item.Properties().food(ModFoods.DOUBLE_YOLK_LOTUS_MOONCAKE))); // 双黄莲蓉月饼
    public static final RegistryObject<Item> PORK_MOONCAKE = ITEMS_REGISTER.register("pork_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PORK_MOONCAKE))); // 鲜肉月饼
    public static final RegistryObject<Item> EGG_YOLK_MOONCAKE = ITEMS_REGISTER.register("egg_yolk_mooncake", () -> new Item(new Item.Properties().food(ModFoods.EGG_YOLK_MOONCAKE))); // 蛋黄月饼
    public static final RegistryObject<Item> SALTED_EGG_YOLK_PORK_MOONCAKE = ITEMS_REGISTER.register("salted_egg_yolk-pork_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SALTED_EGG_YOLK_PORK_MOONCAKE))); // 蛋黄鲜肉月饼
    public static final RegistryObject<Item> HAM_MOONCAKE = ITEMS_REGISTER.register("ham_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HAM_MOONCAKE))); // 火腿月饼
    public static final RegistryObject<Item> YUNNAN_HAM_MOONCAKE = ITEMS_REGISTER.register("yunnan_ham_mooncake", () -> new Item(new Item.Properties().food(ModFoods.YUNNAN_HAM_MOONCAKE))); // 云腿月饼
    public static final RegistryObject<Item> PUMPKIN_MOONCAKE = ITEMS_REGISTER.register("pumpkin_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PUMPKIN_MOONCAKE))); // 南瓜月饼
    public static final RegistryObject<Item> PORK_CABBAGE_MOONCAKE = ITEMS_REGISTER.register("pork-cabbage_mooncake", () -> new Item(new Item.Properties().food(ModFoods.PORK_CABBAGE_MOONCAKE))); // 猪肉卷心菜月饼
    public static final RegistryObject<Item> BEEF_TOMATO_MOONCAKE = ITEMS_REGISTER.register("beef-tomato_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BEEF_TOMATO_MOONCAKE))); // 牛肉番茄月饼
    public static final RegistryObject<Item> CHICKEN_PUMPKIN_MOONCAKE = ITEMS_REGISTER.register("chicken-pumpkin_mooncake", () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_PUMPKIN_MOONCAKE))); // 鸡肉南瓜月饼
    public static final RegistryObject<Item> HAM_CABBAGE_MOONCAKE = ITEMS_REGISTER.register("ham-cabbage_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HAM_CABBAGE_MOONCAKE))); // 火腿卷心菜月饼
    public static final RegistryObject<Item> SEAFOOD_MOONCAKE = ITEMS_REGISTER.register("seafood_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SEAFOOD_MOONCAKE))); // 海鲜月饼
    public static final RegistryObject<Item> THREE_DELICACIES_MOONCAKE = ITEMS_REGISTER.register("three_delicacies_mooncake", () -> new Item(new Item.Properties().food(ModFoods.THREE_DELICACIES_MOONCAKE))); // 三鲜月饼
    public static final RegistryObject<Item> FAMILY_FEASTS_MOONCAKE = ITEMS_REGISTER.register("family_feasts_mooncake", () -> new Item(new Item.Properties().food(ModFoods.FAMILY_FEASTS_MOONCAKE))); // 全家福月饼
    public static final RegistryObject<Item> DOUBLE_MEAT_MOONCAKE = ITEMS_REGISTER.register("double_meat_mooncake", () -> new Item(new Item.Properties().food(ModFoods.DOUBLE_MEAT_MOONCAKE))); // 双拼肉月饼
    public static final RegistryObject<Item> TRIPLE_MEAT_MOONCAKE = ITEMS_REGISTER.register("triple_meat_mooncake", () -> new Item(new Item.Properties().food(ModFoods.TRIPLE_MEAT_MOONCAKE))); // 三肉月饼
    public static final RegistryObject<Item> HAM_BACON_MOONCAKE = ITEMS_REGISTER.register("ham-bacon_mooncake", () -> new Item(new Item.Properties().food(ModFoods.HAM_BACON_MOONCAKE))); // 火腿培根月饼
    public static final RegistryObject<Item> JINHUA_HAM_MOONCAKE = ITEMS_REGISTER.register("jinhua_ham_mooncake", () -> new Item(new Item.Properties().food(ModFoods.JINHUA_HAM_MOONCAKE))); // 金华火腿月饼
    public static final RegistryObject<Item> BACON_ONION_MOONCAKE = ITEMS_REGISTER.register("bacon-onion_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BACON_ONION_MOONCAKE))); // 培根洋葱月饼
    public static final RegistryObject<Item> BLACK_SESAME_PASTE_MOONCAKE = ITEMS_REGISTER.register("black_sesame_paste_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BLACK_SESAME_PASTE_MOONCAKE))); // 黑芝麻蓉月饼
    public static final RegistryObject<Item> BLACK_SESAME_LAVA_MOONCAKE = ITEMS_REGISTER.register("black_sesame_lava_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BLACK_SESAME_LAVA_MOONCAKE))); // 黑芝麻蓉流心月饼
    public static final RegistryObject<Item> BLACK_SESAME_SOY_MILK_MOONCAKE = ITEMS_REGISTER.register("black_sesame_soy_milk_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BLACK_SESAME_SOY_MILK_MOONCAKE))); // 黑芝麻豆乳月饼
    public static final RegistryObject<Item> WHITE_SESAME_PASTE_MOONCAKE = ITEMS_REGISTER.register("white_sesame_paste_mooncake", () -> new Item(new Item.Properties().food(ModFoods.WHITE_SESAME_PASTE_MOONCAKE))); // 白芝麻蓉月饼
    public static final RegistryObject<Item> SESAME_EGG_YOLK_MOONCAKE = ITEMS_REGISTER.register("sesame_egg_yolk_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_EGG_YOLK_MOONCAKE))); // 芝麻蛋黄月饼
    public static final RegistryObject<Item> SESAME_HAM_MOONCAKE = ITEMS_REGISTER.register("sesame-ham_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_HAM_MOONCAKE))); // 芝麻火腿月饼
    public static final RegistryObject<Item> SESAME_BEEF_MOONCAKE = ITEMS_REGISTER.register("sesame-beef_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_BEEF_MOONCAKE))); // 芝麻牛肉月饼
    public static final RegistryObject<Item> SESAME_BACON_MOONCAKE = ITEMS_REGISTER.register("sesame-bacon_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_BACON_MOONCAKE))); // 芝麻培根月饼
    public static final RegistryObject<Item> SESAME_ONION_MOONCAKE = ITEMS_REGISTER.register("sesame-onion_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_ONION_MOONCAKE))); // 芝麻洋葱月饼
    public static final RegistryObject<Item> SESAME_TOMATO_MOONCAKE = ITEMS_REGISTER.register("sesame-tomato_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_TOMATO_MOONCAKE))); // 芝麻番茄月饼
    public static final RegistryObject<Item> SESAME_CHICKEN_MOONCAKE = ITEMS_REGISTER.register("sesame-chicken_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_CHICKEN_MOONCAKE))); // 芝麻鸡肉月饼
    public static final RegistryObject<Item> SESAME_MUTTON_MOONCAKE = ITEMS_REGISTER.register("sesame-mutton_mooncake", () -> new Item(new Item.Properties().food(ModFoods.SESAME_MUTTON_MOONCAKE))); // 芝麻羊肉月饼

    // ======================= 特殊/彩蛋物品 =======================
    public static final RegistryObject<Item> LAVA_MOONCAKE = ITEMS_REGISTER.register("lava_mooncake", () -> new Item(new Item.Properties().food(ModFoods.LAVA_MOONCAKE).rarity(Rarity.EPIC))); // 流心月饼
    public static final RegistryObject<Item> TNT_MOONCAKE = ITEMS_REGISTER.register("tnt_mooncake", () -> new Item(new Item.Properties().food(ModFoods.TNT_MOONCAKE).rarity(Rarity.EPIC))); // TNT 月饼
    public static final RegistryObject<Item> DEBRIS_MOONCAKE = ITEMS_REGISTER.register("debris_mooncake", () -> new Item(new Item.Properties().food(ModFoods.DEBRIS_MOONCAKE).rarity(Rarity.EPIC))); // 残骸月饼
    public static final RegistryObject<Item> BEDROCK_MOONCAKE = ITEMS_REGISTER.register("bedrock_mooncake", () -> new Item(new Item.Properties().food(ModFoods.BEDROCK_MOONCAKE).rarity(Rarity.EPIC))); // 基岩月饼

    // ======================= 工具 =======================
    public static final RegistryObject<Item> MOONCAKE_MOLD = ITEMS_REGISTER.register("mooncake_mold", () -> new Item(new Item.Properties())); // 月饼模具
    public static final RegistryObject<Item> OILED_KNIFE = ITEMS_REGISTER.register("oiled_knife", OiledKnife::new); // 油浸刀

    /**
     * 创建带有附魔光效的物品
     */
    private static RegistryObject<Item> createEnchantedItem(String name, FoodProperties food) {
        return ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().food(food)) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    /**
     * 创建带有附魔光效和稀有度的物品
     */
    private static RegistryObject<Item> createEnchantedItem(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().food(food).rarity(rarity)) {
            @Override
            public boolean isFoil(ItemStack stack) {
                return true;
            }
        });
    }

    /**
     * 自动显示 Effect 的 Tooltip（无附魔光效）
     */
    private static RegistryObject<FoodTooltipItem> FoodWithTooltip(String name, FoodProperties food) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food), food, false));
    }

    /**
     * 自动显示 Effect 的 Tooltip（带稀有度，无附魔光效）
     */
    private static RegistryObject<FoodTooltipItem> FoodWithTooltip(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food).rarity(rarity), food, false));
    }

    /**
     * 自动显示 Effect 的 Tooltip（带稀有度和附魔光效）
     */
    private static RegistryObject<FoodTooltipItem> FoodWithTooltipAndFoil(String name, FoodProperties food, Rarity rarity) {
        return ITEMS_REGISTER.register(name, () -> new FoodTooltipItem(new Item.Properties().food(food).rarity(rarity), food, true));
    }

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}

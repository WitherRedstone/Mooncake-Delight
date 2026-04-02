package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MooncakeDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // ======================= 流体桶 =======================
        basicItem(ModItems.INVERT_SUGAR_SYRUP_BUCKET.get()); // 转换糖浆 桶
        basicItem(ModItems.MAPLE_SYRUP_BUCKET.get()); // 枫糖浆 桶

        // ======================= 食材 =======================
        basicItem(ModItems.OILED_KNIFE.get()); // 油刀
        basicItem(ModItems.MOONCAKE_MOLD.get()); // 月饼模具
        basicItem(ModItems.SUGAR_CUBE.get()); // 方糖
        basicItem(ModItems.TRUFFLE.get()); // 松露
        basicItem(ModItems.TALLOW_CRUMBS.get()); // 动物油脂碎
        basicItem(ModItems.TALLOW.get()); // 动物油脂
        basicItem(ModItems.ANIMAL_FAT.get()); // 动物油
        basicItem(ModItems.LOTUS_SEED.get()); // 莲子
        basicItem(ModItems.FLOUR.get()); // 面粉
        basicItem(ModItems.MOONCAKE_CRUST_DOUGH.get()); // 月饼面团
        basicItem(ModItems.SNOW_SKIN_MOONCAKE_CRUST_DOUGH.get()); // 冰皮月饼面团
        basicItem(ModItems.INVERT_SUGAR_SYRUP_BOTTLE.get()); // 转换糖浆
        basicItem(ModItems.MAPLE_SYRUP_BOTTLE.get()); // 枫糖浆

        // ======================= 原版自带 =======================
        basicItem(ModItems.WHITE_SESAME.get()); // 白芝麻
        basicItem(ModItems.BLACK_SESAME.get()); // 黑芝麻
        
        // ======================= 原版自带 =======================
        basicFoodItem(ModItems.APPLE_MOONCAKE); // 苹果月饼
        enchantedFoodItem(ModItems.GOLDEN_APPLE_MOONCAKE, ModItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE);
        basicFoodItem(ModItems.SWEET_BERRIES_MOONCAKE); // 甜浆果月饼
        basicFoodItem(ModItems.GLOW_BERRIES_MOONCAKE); // 发光浆果月饼
        basicFoodItem(ModItems.CHORUS_FRUIT_MOONCAKE); // 紫颂果月饼
        basicFoodItem(ModItems.CARROT_MOONCAKE); // 胡萝卜月饼
        basicFoodItem(ModItems.POTATO_MOONCAKE); // 马铃薯月饼
        basicFoodItem(ModItems.BEEF_MOONCAKE); // 牛肉月饼
        basicFoodItem(ModItems.PORKCHOP_MOONCAKE); // 猪肉月饼
        basicFoodItem(ModItems.MUTTON_MOONCAKE); // 羊肉月饼
        basicFoodItem(ModItems.CHICKEN_MOONCAKE); // 鸡肉月饼
        basicFoodItem(ModItems.RABBIT_MOONCAKE); // 兔肉月饼
        basicFoodItem(ModItems.COD_MOONCAKE); // 鳕鱼月饼
        basicFoodItem(ModItems.SALMON_MOONCAKE); // 鲑鱼月饼
        basicFoodItem(ModItems.ROTTEN_FLESH_MOONCAKE); // 腐肉月饼
        basicFoodItem(ModItems.HONEY_MOONCAKE); // 蜂蜜月饼
        basicFoodItem(ModItems.COFFEE_MOONCAKE); // 咖啡月饼
        basicFoodItem(ModItems.SNOW_SKIN_MOONCAKE); // 冰皮月饼
        basicFoodItem(ModItems.LAVA_EGG_CUSTARD_MOONCAKE); // 流心奶黄月饼
        basicFoodItem(ModItems.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE); // 流心奶双黄月饼
        basicFoodItem(ModItems.BLACK_TRUFFLE_MOONCAKE); // 黑松露月饼
        basicFoodItem(ModItems.HUNDRED_FRUITS_MOONCAKE); // 百果月饼
        basicFoodItem(ModItems.EDIBLE_FLOWER_MOONCAKE); // 鲜花月饼
        basicFoodItem(ModItems.ROSE_MOONCAKE); // 玫瑰月饼
        basicFoodItem(ModItems.CHRYSANTHEMUM_MOONCAKE); // 菊花月饼
        basicFoodItem(ModItems.CAKE_MOONCAKE); // 蛋糕月饼
        basicFoodItem(ModItems.RICE_MOONCAKE); // 米月饼
        basicFoodItem(ModItems.LOTUS_SEED_PASTE_MOONCAKE); // 莲蓉月饼
        basicFoodItem(ModItems.DOUBLE_YOLK_LOTUS_MOONCAKE); // 双黄莲蓉月饼
        basicFoodItem(ModItems.PORK_MOONCAKE); // 鲜肉月饼
        basicFoodItem(ModItems.EGG_YOLK_MOONCAKE); // 蛋黄月饼
        basicFoodItem(ModItems.SALTED_EGG_YOLK_PORK_MOONCAKE); // 蛋黄鲜肉月饼
        basicFoodItem(ModItems.HAM_MOONCAKE); // 火腿月饼
        basicFoodItem(ModItems.YUNNAN_HAM_MOONCAKE); // 云腿月饼
        basicFoodItem(ModItems.PUMPKIN_MOONCAKE); // 南瓜月饼
        basicFoodItem(ModItems.PORK_CABBAGE_MOONCAKE); // 猪肉卷心菜月饼
        basicFoodItem(ModItems.BEEF_TOMATO_MOONCAKE); // 牛肉番茄月饼
        basicFoodItem(ModItems.CHICKEN_PUMPKIN_MOONCAKE); // 鸡肉南瓜月饼
        basicFoodItem(ModItems.HAM_CABBAGE_MOONCAKE); // 火腿卷心菜月饼
        basicFoodItem(ModItems.SEAFOOD_MOONCAKE); // 海鲜月饼
        basicFoodItem(ModItems.THREE_DELICACIES_MOONCAKE); // 三鲜月饼
        basicFoodItem(ModItems.FAMILY_FEASTS_MOONCAKE); // 全家福月饼
        basicFoodItem(ModItems.DOUBLE_MEAT_MOONCAKE); // 双拼肉月饼
        basicFoodItem(ModItems.TRIPLE_MEAT_MOONCAKE); // 三肉月饼
        basicFoodItem(ModItems.HAM_BACON_MOONCAKE); // 火腿培根月饼
        basicFoodItem(ModItems.JINHUA_HAM_MOONCAKE); // 金华火腿月饼
        basicFoodItem(ModItems.BACON_ONION_MOONCAKE); // 培根洋葱月饼
        basicFoodItem(ModItems.BLACK_SESAME_PASTE_MOONCAKE); // 黑芝麻蓉月饼
        basicFoodItem(ModItems.BLACK_SESAME_LAVA_MOONCAKE); // 黑芝麻蓉流心月饼
        basicFoodItem(ModItems.BLACK_SESAME_SOY_MILK_MOONCAKE); // 黑芝麻豆乳月饼
        basicFoodItem(ModItems.WHITE_SESAME_PASTE_MOONCAKE); // 白芝麻蓉月饼
        basicFoodItem(ModItems.SESAME_EGG_YOLK_MOONCAKE); // 芝麻蛋黄月饼
        basicFoodItem(ModItems.SESAME_HAM_MOONCAKE); // 芝麻火腿月饼
        basicFoodItem(ModItems.SESAME_BEEF_MOONCAKE); // 芝麻牛肉月饼
        basicFoodItem(ModItems.SESAME_BACON_MOONCAKE); // 芝麻培根月饼
        basicFoodItem(ModItems.SESAME_ONION_MOONCAKE); // 芝麻洋葱月饼
        basicFoodItem(ModItems.SESAME_TOMATO_MOONCAKE); // 芝麻番茄月饼
        basicFoodItem(ModItems.SESAME_CHICKEN_MOONCAKE); // 芝麻鸡肉月饼
        basicFoodItem(ModItems.SESAME_MUTTON_MOONCAKE); // 芝麻羊肉月饼

        // ======================= 作物盛景 联动 =======================
        basicCroptopiaItem(CroptopiaItems.PEPPER_SALT); // 椒盐
        basicCroptopiaItem(CroptopiaItems.SAUSAGE_MOONCAKE); // 香肠月饼
        basicCroptopiaItem(CroptopiaItems.CALAMARI_MOONCAKE); // 鱿鱼月饼
        basicCroptopiaItem(CroptopiaItems.PINEAPPLE_MOONCAKE); // 菠萝月饼
        basicCroptopiaItem(CroptopiaItems.STRAWBERRY_MOONCAKE); // 草莓月饼
        basicCroptopiaItem(CroptopiaItems.BLUEBERRY_MOONCAKE); // 蓝莓月饼
        basicCroptopiaItem(CroptopiaItems.CRANBERRY_MOONCAKE); // 蔓越莓月饼
        basicCroptopiaItem(CroptopiaItems.BLACKBERRY_MOONCAKE); // 黑莓月饼
        basicCroptopiaItem(CroptopiaItems.COCONUT_PASTE_MOONCAKE); // 椰蓉月饼
        basicCroptopiaItem(CroptopiaItems.JUJUBE_PASTE_MOONCAKE); // 枣泥月饼
        basicCroptopiaItem(CroptopiaItems.MUNG_MOONCAKE); // 绿豆月饼
        basicCroptopiaItem(CroptopiaItems.PEANUT_MOONCAKE); // 花生月饼
        basicCroptopiaItem(CroptopiaItems.HUNAN_SCALLION_MOONCAKE); // 葱油月饼
        basicCroptopiaItem(CroptopiaItems.PEPPER_SALT_MOONCAKE); // 椒盐月饼
        basicCroptopiaItem(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE); // 黑麻椒盐月饼
        basicCroptopiaItem(CroptopiaItems.MANGO_MOONCAKE); // 芒果月饼
        basicCroptopiaItem(CroptopiaItems.MANGO_COCONUT_MOONCAKE); // 芒果椰奶月饼
        basicCroptopiaItem(CroptopiaItems.CINNAMON_APPLE_MOONCAKE); // 肉桂苹果月饼
        basicCroptopiaItem(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE); // 热带水果月饼
        basicCroptopiaItem(CroptopiaItems.BERRY_MEDLEY_MOONCAKE); // 浆果荟萃月饼
        basicCroptopiaItem(CroptopiaItems.CITRUS_BLAST_MOONCAKE); // 柑橘炸弹月饼
        basicCroptopiaItem(CroptopiaItems.ALMOND_CHERRY_MOONCAKE); // 扁桃仁樱桃月饼
        basicCroptopiaItem(CroptopiaItems.CASHEW_MANGO_MOONCAKE); // 腰果芒果月饼
        basicCroptopiaItem(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE); // 鲜虾芦笋月饼
        basicCroptopiaItem(CroptopiaItems.CRAB_CORNS_MOONCAKE); // 螃蟹玉米月饼
        basicCroptopiaItem(CroptopiaItems.TUNA_AVOCADO_MOONCAKE); // 金枪鱼牛油果月饼
        basicCroptopiaItem(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE); // 菠菜核桃月饼
        basicCroptopiaItem(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE); // 菠萝火腿月饼
        basicCroptopiaItem(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE); // 蔓越莓核桃月饼
        basicCroptopiaItem(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE); // 蓝莓酸奶月饼
        basicCroptopiaItem(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE); // 海鲜总汇月饼
        basicCroptopiaItem(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE); // 蔬菜之王月饼
        basicCroptopiaItem(CroptopiaItems.FIVE_KERNELS_MOONCAKE); // 五仁月饼
        basicCroptopiaItem(CroptopiaItems.BBQ_PORK_MOONCAKE); // 叉烧月饼
        basicCroptopiaItem(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE); // 叉烧五仁月饼
        basicCroptopiaItem(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE); // 金腿五仁月饼
        basicCroptopiaItem(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE); // 栗蓉月饼
        basicCroptopiaItem(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE); // 核桃枣泥月饼
        basicCroptopiaItem(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE); // 梅干菜月饼
        basicCroptopiaItem(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE); // 榨菜鲜肉月饼
        basicCroptopiaItem(CroptopiaItems.MILK_TEA_MOONCAKE); // 奶茶月饼
        basicCroptopiaItem(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE); // 橙皮丁月饼
        basicCroptopiaItem(CroptopiaItems.CARAMEL_MOONCAKE); // 焦糖月饼
        basicCroptopiaItem(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE); // 焦糖海盐月饼
        basicCroptopiaItem(CroptopiaItems.CHEESE_LAVA_MOONCAKE); // 芝士流心月饼
        basicCroptopiaItem(CroptopiaItems.CHEESE_CARAMEL_MOONCAKE); // 芝士焦糖月饼
        basicCroptopiaItem(CroptopiaItems.BUTTER_CHOCOLATE_MOONCAKE); // 黄油巧克力月饼
        basicCroptopiaItem(CroptopiaItems.BUTTER_CHEESE_MOONCAKE); // 黄油芝士月饼
        basicCroptopiaItem(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE); // 流心巧克力月饼
        basicCroptopiaItem(CroptopiaItems.EARL_GREY_MOONCAKE); // 伯爵茶月饼
        basicCroptopiaItem(CroptopiaItems.SESAME_WALNUT_MOONCAKE); // 芝麻核桃月饼
        basicCroptopiaItem(CroptopiaItems.SESAME_PEANUT_MOONCAKE); // 芝麻花生月饼
        basicCroptopiaItem(CroptopiaItems.SESAME_ALMOND_MOONCAKE); // 芝麻杏仁月饼
        basicCroptopiaItem(CroptopiaItems.SESAME_CHEESE_MOONCAKE); // 芝麻芝士月饼
        basicCroptopiaItem(CroptopiaItems.BLACK_SESAME_COCONUT_MOONCAKE); // 黑芝麻椰蓉月饼

        // ======================= 特殊/彩蛋物品 =======================
        specialEasterEggItem(ModItems.LAVA_MOONCAKE); // 流心月饼
        specialEasterEggItem(ModItems.TNT_MOONCAKE); // TNT 月饼
        specialEasterEggItem(ModItems.DEBRIS_MOONCAKE); // 残骸月饼
        specialEasterEggItem(ModItems.BEDROCK_MOONCAKE); // 基岩月饼
    }

    /**
     * 基础食物物品模型（路径：textures/item/food）
     */
    private void basicFoodItem(RegistryObject<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "item/food/" + itemName));
    }

    /**
     * 附魔物品模型（使用相同纹理，但带有附魔光效）
     * @param baseItem 基础物品（提供纹理）
     * @param enchantedItem 附魔物品（使用基础物品的纹理）
     */
    private void enchantedFoodItem(RegistryObject<?> baseItem, RegistryObject<?> enchantedItem) {
        String baseItemName = baseItem.getId().getPath();
        String enchantedItemName = enchantedItem.getId().getPath();
        
        // 基础物品使用自己的纹理
        ItemModelBuilder baseBuilder = withExistingParent(baseItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        baseBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "item/food/" + baseItemName));
        
        // 附魔物品使用基础物品的纹理
        ItemModelBuilder enchantedBuilder = withExistingParent(enchantedItemName, ResourceLocation.withDefaultNamespace("item/generated"));
        enchantedBuilder.texture("layer0", ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "item/food/" + baseItemName));
    }

    /**
     * Croptopia 联动物品模型（路径：textures/item/food/croptopia）
     */
    private void basicCroptopiaItem(RegistryObject<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "item/food/croptopia/" + itemName));
    }

    /**
     * 特殊/彩蛋物品模型（路径：textures/item/food/special_easter_egg）
     */
    private void specialEasterEggItem(RegistryObject<?> item) {
        String itemName = item.getId().getPath();
        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "item/food/special_easter_egg/" + itemName));
    }
}

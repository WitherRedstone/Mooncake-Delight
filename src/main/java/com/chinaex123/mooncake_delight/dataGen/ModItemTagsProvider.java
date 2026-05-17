package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.init.MDItems;
import com.chinaex123.mooncake_delight.init.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.init.MDItemTags;
import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MooncakeDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // 油浸刀
        this.tag(ModTags.Items.KNIVES).add(MDItems.OILED_KNIFE.get()); // farmersdelight:tools/knives
        this.tag(ModTags.Items.KNIFE_ENCHANTABLE).add(MDItems.OILED_KNIFE.get()); // farmersdelight:enchantable/knife

        // c:sugars
        this.tag(MDItemTags.SUGARS)
                .add(Items.SUGAR) // 糖
                .add(MDItems.SUGAR_CUBE.get()); // 方糖
        // 椒盐
        this.tag(MDItemTags.PEPPER_SALT).add(CroptopiaItems.PEPPER_SALT.get()); // c:pepper_salt

        // 转换糖浆
        this.tag(MDItemTags.SYRUPS_INVERT_SUGAR_SYRUP).add(MDItems.INVERT_SUGAR_SYRUP_BOTTLE.get());// c:syrups/invert_sugar_syrup
        // 枫糖浆
        this.tag(MDItemTags.SYRUPS_MAPLE_SYRUP).add(MDItems.MAPLE_SYRUP_BOTTLE.get()); // c:syrups/maple_syrup

        // 面粉
        this.tag(MDItemTags.FLOURS).add(MDItems.FLOUR.get());// c:flours
        this.tag(MDItemTags.FLOUR).add(MDItems.FLOUR.get());// c:flour
        this.tag(MDItemTags.FLOURS_WHEAT).add(MDItems.FLOUR.get());// c:flours/wheat

        // 莲子
        this.tag(MDItemTags.LOTUS).add(MDItems.LOTUS_SEED.get()); // c:lotus
        this.tag(MDItemTags.CROPS_LOTUS).add(MDItems.LOTUS_SEED.get()); // c:crops/lotus

        // c:sesames
        this.tag(MDItemTags.SESAMES)
                .add(MDItems.WHITE_SESAME.get()) // 白芝麻
                .add(MDItems.BLACK_SESAME.get()); // 黑芝麻
        // c:crops/sesame
        this.tag(MDItemTags.CROPS_SESAME)
                .add(MDItems.WHITE_SESAME.get());  // 白芝麻

        // c:crops/spring
        this.tag(MDItemTags.CROPS_SPRING).add(MDItems.WHITE_SESAME.get());  // 白芝麻
        // c:crops/summer
        this.tag(MDItemTags.CROPS_SUMMER).add(MDItems.WHITE_SESAME.get());  // 白芝麻

        // mooncake_delight:mooncake
        this.tag(MDItemTags.MOONCAKE)
                // ======================= 原版自带 =======================
                .add(MDItems.APPLE_MOONCAKE.get()) // 苹果月饼
                .add(MDItems.GOLDEN_APPLE_MOONCAKE.get()) // 金苹果月饼
                .add(MDItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE.get()) // 附魔苹果月饼
                .add(MDItems.SWEET_BERRIES_MOONCAKE.get()) // 甜浆果月饼
                .add(MDItems.GLOW_BERRIES_MOONCAKE.get()) // 发光浆果月饼
                .add(MDItems.CHORUS_FRUIT_MOONCAKE.get()) // 紫颂果月饼
                .add(MDItems.CARROT_MOONCAKE.get()) // 胡萝卜月饼
                .add(MDItems.POTATO_MOONCAKE.get()) // 马铃薯月饼
                .add(MDItems.BEEF_MOONCAKE.get()) // 牛肉月饼
                .add(MDItems.PORKCHOP_MOONCAKE.get()) // 猪肉月饼
                .add(MDItems.MUTTON_MOONCAKE.get()) // 羊肉月饼
                .add(MDItems.CHICKEN_MOONCAKE.get()) // 鸡肉月饼
                .add(MDItems.RABBIT_MOONCAKE.get()) // 兔肉月饼
                .add(MDItems.COD_MOONCAKE.get()) // 鳕鱼月饼
                .add(MDItems.SALMON_MOONCAKE.get()) // 鲑鱼月饼
                .add(MDItems.ROTTEN_FLESH_MOONCAKE.get()) // 腐肉月饼
                .add(MDItems.HONEY_MOONCAKE.get()) // 蜂蜜月饼
                .add(MDItems.COFFEE_MOONCAKE.get()) // 咖啡月饼
                .add(MDItems.SNOW_SKIN_MOONCAKE.get()) // 冰皮月饼
                .add(MDItems.LAVA_EGG_CUSTARD_MOONCAKE.get()) // 流心奶黄月饼
                .add(MDItems.LAVA_DOUBLE_EGG_CUSTARD_MOONCAKE.get()) // 流心奶双黄月饼
                .add(MDItems.BLACK_TRUFFLE_MOONCAKE.get()) // 黑松露月饼
                .add(MDItems.HUNDRED_FRUITS_MOONCAKE.get()) // 百果月饼
                .add(MDItems.EDIBLE_FLOWER_MOONCAKE.get()) // 鲜花月饼
                .add(MDItems.ROSE_MOONCAKE.get()) // 玫瑰月饼
                .add(MDItems.CHRYSANTHEMUM_MOONCAKE.get()) // 菊花月饼
                .add(MDItems.CAKE_MOONCAKE.get()) // 蛋糕月饼
                .add(MDItems.RICE_MOONCAKE.get()) // 米月饼
                .add(MDItems.LOTUS_SEED_PASTE_MOONCAKE.get()) // 莲蓉月饼
                .add(MDItems.DOUBLE_YOLK_LOTUS_MOONCAKE.get()) // 双黄莲蓉月饼
                .add(MDItems.PORK_MOONCAKE.get()) // 鲜肉月饼
                .add(MDItems.EGG_YOLK_MOONCAKE.get()) // 蛋黄月饼
                .add(MDItems.SALTED_EGG_YOLK_PORK_MOONCAKE.get()) // 蛋黄鲜肉月饼
                .add(MDItems.HAM_MOONCAKE.get()) // 火腿月饼
                .add(MDItems.YUNNAN_HAM_MOONCAKE.get()) // 云腿月饼
                .add(MDItems.PUMPKIN_MOONCAKE.get()) // 南瓜月饼
                .add(MDItems.PORK_CABBAGE_MOONCAKE.get()) // 猪肉卷心菜月饼
                .add(MDItems.BEEF_TOMATO_MOONCAKE.get()) // 牛肉番茄月饼
                .add(MDItems.CHICKEN_PUMPKIN_MOONCAKE.get()) // 鸡肉南瓜月饼
                .add(MDItems.HAM_CABBAGE_MOONCAKE.get()) // 火腿卷心菜月饼
                .add(MDItems.SEAFOOD_MOONCAKE.get()) // 海鲜月饼
                .add(MDItems.THREE_DELICACIES_MOONCAKE.get()) // 三鲜月饼
                .add(MDItems.FAMILY_FEASTS_MOONCAKE.get()) // 全家福月饼
                .add(MDItems.DOUBLE_MEAT_MOONCAKE.get()) // 双拼肉月饼
                .add(MDItems.TRIPLE_MEAT_MOONCAKE.get()) // 三肉月饼
                .add(MDItems.HAM_BACON_MOONCAKE.get()) // 火腿培根月饼
                .add(MDItems.JINHUA_HAM_MOONCAKE.get()) // 金华火腿月饼
                .add(MDItems.BACON_ONION_MOONCAKE.get()) // 培根洋葱月饼
                .add(MDItems.BLACK_SESAME_PASTE_MOONCAKE.get()) // 黑芝麻蓉月饼
                .add(MDItems.BLACK_SESAME_LAVA_MOONCAKE.get()) // 黑芝麻蓉流心月饼
                .add(MDItems.BLACK_SESAME_SOY_MILK_MOONCAKE.get()) // 黑芝麻豆乳月饼
                .add(MDItems.WHITE_SESAME_PASTE_MOONCAKE.get()) // 白芝麻蓉月饼
                .add(MDItems.SESAME_EGG_YOLK_MOONCAKE.get()) // 芝麻蛋黄月饼
                .add(MDItems.SESAME_HAM_MOONCAKE.get()) // 芝麻火腿月饼
                .add(MDItems.SESAME_BEEF_MOONCAKE.get()) // 芝麻牛肉月饼
                .add(MDItems.SESAME_BACON_MOONCAKE.get()) // 芝麻培根月饼
                .add(MDItems.SESAME_ONION_MOONCAKE.get()) // 芝麻洋葱月饼
                .add(MDItems.SESAME_TOMATO_MOONCAKE.get()) // 芝麻番茄月饼
                .add(MDItems.SESAME_CHICKEN_MOONCAKE.get()) // 芝麻鸡肉月饼
                .add(MDItems.SESAME_MUTTON_MOONCAKE.get()) // 芝麻羊肉月饼

                // ======================= Croptopia 联动 =======================
                .add(CroptopiaItems.SAUSAGE_MOONCAKE.get()) // 香肠月饼
                .add(CroptopiaItems.CALAMARI_MOONCAKE.get()) // 鱿鱼月饼
                .add(CroptopiaItems.PINEAPPLE_MOONCAKE.get()) // 菠萝月饼
                .add(CroptopiaItems.STRAWBERRY_MOONCAKE.get()) // 草莓月饼
                .add(CroptopiaItems.BLUEBERRY_MOONCAKE.get()) // 蓝莓月饼
                .add(CroptopiaItems.CRANBERRY_MOONCAKE.get()) // 蔓越莓月饼
                .add(CroptopiaItems.BLACKBERRY_MOONCAKE.get()) // 黑莓月饼
                .add(CroptopiaItems.COCONUT_PASTE_MOONCAKE.get()) // 椰蓉月饼
                .add(CroptopiaItems.JUJUBE_PASTE_MOONCAKE.get()) // 枣泥月饼
                .add(CroptopiaItems.MUNG_MOONCAKE.get()) // 绿豆月饼
                .add(CroptopiaItems.PEANUT_MOONCAKE.get()) // 花生月饼
                .add(CroptopiaItems.HUNAN_SCALLION_MOONCAKE.get()) // 葱油月饼
                .add(CroptopiaItems.PEPPER_SALT_MOONCAKE.get()) // 椒盐月饼
                .add(CroptopiaItems.BLACK_SESAME_PEPPER_SALT_MOONCAKE.get()) // 黑麻椒盐月饼
                .add(CroptopiaItems.MANGO_MOONCAKE.get()) // 芒果月饼
                .add(CroptopiaItems.MANGO_COCONUT_MOONCAKE.get()) // 芒果椰奶月饼
                .add(CroptopiaItems.CINNAMON_APPLE_MOONCAKE.get()) // 肉桂苹果月饼
                .add(CroptopiaItems.TROPICAL_FRUIT_MOONCAKE.get()) // 热带水果月饼
                .add(CroptopiaItems.BERRY_MEDLEY_MOONCAKE.get()) // 浆果荟萃月饼
                .add(CroptopiaItems.CITRUS_BLAST_MOONCAKE.get()) // 柑橘炸弹月饼
                .add(CroptopiaItems.ALMOND_CHERRY_MOONCAKE.get()) // 扁桃仁樱桃月饼
                .add(CroptopiaItems.CASHEW_MANGO_MOONCAKE.get()) // 腰果芒果月饼
                .add(CroptopiaItems.SHRIMP_ASPARAGUS_MOONCAKE.get()) // 鲜虾芦笋月饼
                .add(CroptopiaItems.CRAB_CORNS_MOONCAKE.get()) // 螃蟹玉米月饼
                .add(CroptopiaItems.TUNA_AVOCADO_MOONCAKE.get()) // 金枪鱼牛油果月饼
                .add(CroptopiaItems.SPINACHE_WALNUT_MOONCAKE.get()) // 菠菜核桃月饼
                .add(CroptopiaItems.PINEAPPLE_HAM_MOONCAKE.get()) // 菠萝火腿月饼
                .add(CroptopiaItems.CRANBERRY_WALNUT_MOONCAKE.get()) // 蔓越莓核桃月饼
                .add(CroptopiaItems.BLUEBERRY_YOGURT_MOONCAKE.get()) // 蓝莓酸奶月饼
                .add(CroptopiaItems.SEAFOOD_MEDLEY_MOONCAKE.get()) // 海鲜总汇月饼
                .add(CroptopiaItems.KING_OF_VEGGIES_MOONCAKE.get()) // 蔬菜之王月饼
                .add(CroptopiaItems.FIVE_KERNELS_MOONCAKE.get()) // 五仁月饼
                .add(CroptopiaItems.BBQ_PORK_MOONCAKE.get()) // 叉烧月饼
                .add(CroptopiaItems.BBQ_PORK_FIVE_KERNELS_MOONCAKE.get()) // 叉烧五仁月饼
                .add(CroptopiaItems.JINHUA_HAM_FIVE_KERNELS_MOONCAKE.get()) // 金腿五仁月饼
                .add(CroptopiaItems.CHESTNUT_PASTE_MOONCAKE.get()) // 栗蓉月饼
                .add(CroptopiaItems.WALNUT_DATE_PASTE_MOONCAKE.get()) // 核桃枣泥月饼
                .add(CroptopiaItems.PRESERVED_MUSTARD_GREEN_MOONCAKE.get()) // 梅干菜月饼
                .add(CroptopiaItems.PICKLED_MUSTARD_PORK_MOONCAKE.get()) // 榨菜鲜肉月饼
                .add(CroptopiaItems.MILK_TEA_MOONCAKE.get()) // 奶茶月饼
                .add(CroptopiaItems.CANDIED_ORANGE_PEEL_MOONCAKE.get()) // 橙皮丁月饼
                .add(CroptopiaItems.CARAMEL_MOONCAKE.get()) // 焦糖月饼
                .add(CroptopiaItems.CARAMEL_SEA_SALT_MOONCAKE.get()) // 焦糖海盐月饼
                .add(CroptopiaItems.CHEESE_LAVA_MOONCAKE.get()) // 芝士流心月饼
                .add(CroptopiaItems.CHEESE_CARAMEL_MOONCAKE.get()) // 芝士焦糖月饼
                .add(CroptopiaItems.BUTTER_CHOCOLATE_MOONCAKE.get()) // 黄油巧克力月饼
                .add(CroptopiaItems.BUTTER_CHEESE_MOONCAKE.get()) // 黄油芝士月饼
                .add(CroptopiaItems.LAVA_CHOCOLATE_MOONCAKE.get()) // 流心巧克力月饼
                .add(CroptopiaItems.EARL_GREY_MOONCAKE.get()) // 伯爵茶月饼
                .add(CroptopiaItems.SESAME_WALNUT_MOONCAKE.get()) // 芝麻核桃月饼
                .add(CroptopiaItems.SESAME_PEANUT_MOONCAKE.get()) // 芝麻花生月饼
                .add(CroptopiaItems.SESAME_ALMOND_MOONCAKE.get()) // 芝麻杏仁月饼
                .add(CroptopiaItems.SESAME_CHEESE_MOONCAKE.get()) // 芝麻芝士月饼
                .add(CroptopiaItems.BLACK_SESAME_COCONUT_MOONCAKE.get()) // 黑芝麻椰蓉月饼

                // ======================= 特殊/彩蛋物品 =======================
                .add(MDItems.LAVA_MOONCAKE.get()) // 流心月饼
                .add(MDItems.TNT_MOONCAKE.get()) // TNT 月饼
                .add(MDItems.DEBRIS_MOONCAKE.get()) // 残骸月饼
                .add(MDItems.BEDROCK_MOONCAKE.get()); // 基岩月饼
    }
}

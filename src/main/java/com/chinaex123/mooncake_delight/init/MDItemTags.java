package com.chinaex123.mooncake_delight.init;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface MDItemTags {

    // 所有月饼
    TagKey<Item> MOONCAKE = bind("mooncake");

    // 糖
    TagKey<Item> SUGARS = neoforgeItemTag("sugars"); // c:sugars
    // 椒盐
    TagKey<Item> PEPPER_SALT = neoforgeItemTag("pepper_salt"); // c:pepper_salt

    // 糖浆
    TagKey<Item> SYRUPS_MAPLE_SYRUP = neoforgeItemTag("syrups/maple_syrup"); // c:syrups/maple_syrup
    TagKey<Item> SYRUPS_INVERT_SUGAR_SYRUP = neoforgeItemTag("syrups/invert_sugar_syrup"); // c:syrups/invert_sugar_syrup

    // 面粉
    TagKey<Item> FLOUR = neoforgeItemTag("flour"); // c:flour
    TagKey<Item> FLOURS = neoforgeItemTag("flours"); // c:flours
    TagKey<Item> FLOURS_WHEAT = neoforgeItemTag("flours/wheat"); // c:flours/wheat

    // 莲子
    TagKey<Item> LOTUS = neoforgeItemTag("lotus"); // c:lotus
    TagKey<Item> CROPS_LOTUS = neoforgeItemTag("crops/lotus"); // c:crops/lotus

    // 芝麻
    TagKey<Item> SESAMES = neoforgeItemTag("sesames"); // c:sesames
    TagKey<Item> CROPS_SESAME = neoforgeItemTag("crops/sesame"); // c:crops/sesame

    // 静谧四季
    TagKey<Item> CROPS_SPRING = seasonsItemTag("spring_crops");
    TagKey<Item> CROPS_SUMMER = seasonsItemTag("summer_crops");
    TagKey<Item> CROPS_AUTUMN = seasonsItemTag("autumn_crops");
    TagKey<Item> CROPS_WINTER = seasonsItemTag("winter_crops");
    TagKey<Block> CROPS_SPRING_BLOCK = seasonsBlockTag("spring_crops");
    TagKey<Block> CROPS_SUMMER_BLOCK = seasonsBlockTag("summer_crops");
    TagKey<Block> CROPS_AUTUMN_BLOCK = seasonsBlockTag("autumn_crops");
    TagKey<Block> CROPS_WINTER_BLOCK = seasonsBlockTag("winter_crops");

    // 节气
    TagKey<Block> CROPS_SPRING_SUMMER = eclipticSeasonsTag("crops/summer"); // 春夏
    TagKey<Block> CROPS_DRY_AVERAGE = eclipticSeasonsTag("crops/dry_average"); // 干燥
    TagKey<Block> CROPS_AVERAGE_MOIST = eclipticSeasonsTag("crops/average_moist"); // 一般
    TagKey<Block> CROPS_MOIST_HUMID = eclipticSeasonsTag("crops/moist_humid"); // 湿润
    TagKey<Block> CROPS_HUMID_HUMID = eclipticSeasonsTag("crops/humid_humid"); // 潮湿

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, name));
    }

    private static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }

    static TagKey<Item> seasonsItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("sereneseasons", name));
    }

    static TagKey<Block> seasonsBlockTag(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("sereneseasons", name));
    }

    static TagKey<Block> eclipticSeasonsTag(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("eclipticseasons", name));
    }
}

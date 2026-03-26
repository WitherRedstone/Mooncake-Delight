package com.chinaex123.mooncake_delight.tags;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> MOONCAKE = bind("mooncake");

    // 糖
    public static final TagKey<Item> SUGARS = createSimpleNeoforgeTag("sugars"); // c:sugars
    // 椒盐
    public static final TagKey<Item> PEPPER_SALT = createSimpleNeoforgeTag("pepper_salt"); // c:pepper_salt

    // 糖浆
    public static final TagKey<Item> INVERT_SUGAR_SYRUP = createNeoforgeTag("syrups", "invert_sugar_syrup"); // c:syrups/invert_sugar_syrup
    public static final TagKey<Item> MAPLE_SYRUP = createNeoforgeTag("syrups", "maple_syrup"); // c:syrups/maple_syrup

    // 面粉
    public static final TagKey<Item> FLOURS = createSimpleNeoforgeTag("flours"); // c:flours
    public static final TagKey<Item> FLOUR_SIMPLE = createSimpleNeoforgeTag("flour"); // c:flour
    public static final TagKey<Item> WHEAT_IN_FLOURS = createNeoforgeTag("flours", "wheat"); // c:flours/wheat


    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, name));
    }

    /**
     * 创建 NeoForge 通用标签（c:xxx/name）
     * @param prefix 前缀（如 flours, milks, eggs）
     * @param name 物品名
     */
    private static TagKey<Item> createNeoforgeTag(String prefix, String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", prefix + "/" + name));
    }
    
    /**
     * 创建 NeoForge 通用标签（简化版，自动加 s）
     * @param name 物品名（会自动加上 s 作为前缀）
     */
    private static TagKey<Item> createNeoforgeTag(String name) {
        // 自动将单数变为复数形式
        String plural = name.endsWith("s") ? name : name + "s";
        return createNeoforgeTag(plural, name);
    }
    
    /**
     * 创建 NeoForge 通用标签（无前缀，直接 c:name）
     * @param name 物品名
     */
    private static TagKey<Item> createSimpleNeoforgeTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
}

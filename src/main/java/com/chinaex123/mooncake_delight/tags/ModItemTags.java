package com.chinaex123.mooncake_delight.tags;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> MOONCAKE = bind("mooncake");
    public static final TagKey<Item> SUGARS = createForgeTag("sugars");

    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, name));
    }

    private static TagKey<Item> createForgeTag(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
}

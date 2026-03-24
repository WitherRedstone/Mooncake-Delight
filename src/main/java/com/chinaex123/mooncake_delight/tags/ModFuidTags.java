package com.chinaex123.mooncake_delight.tags;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class ModFuidTags {

    public static final TagKey<Fluid> FLUIDS = createNeoforgeTag("fluid");
    public static final TagKey<Fluid> FLUID_MAPLE_SYRUP = createNeoforgeTag("maple_syrup");
    public static final TagKey<Fluid> FLUID_INVERT_SUGAR_SYRUP = createNeoforgeTag("invert_sugar_syrup");

    private static TagKey<Fluid> bind(String name) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, name));
    }

    private static TagKey<Fluid> createNeoforgeTag(String name) {
        if (name.isEmpty()) {
            return FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
        return FluidTags.create(ResourceLocation.fromNamespaceAndPath("c", "fluid/" + name));
    }
}

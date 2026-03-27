package com.chinaex123.mooncake_delight.tags;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public interface ModFluidTags {

    TagKey<Fluid> FLUIDS = neoforgeTag("fluid");
    TagKey<Fluid> FLUID_MAPLE_SYRUP = neoforgeTag("fluid/maple_syrup");
    TagKey<Fluid> FLUID_INVERT_SUGAR_SYRUP = neoforgeTag("fluid/invert_sugar_syrup");

    private static TagKey<Fluid> bind(String name) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, name));
    }

    static TagKey<Fluid> neoforgeTag(String name) {
        return TagKey.create(Registries.FLUID, ResourceLocation.fromNamespaceAndPath("c", name));
    }
}

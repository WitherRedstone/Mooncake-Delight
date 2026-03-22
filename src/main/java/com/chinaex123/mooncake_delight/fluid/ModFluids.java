package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> REGISTRY;
    public static final Supplier<FlowingFluid> INVERT_SUGAR_SYRUP;
    public static final Supplier<FlowingFluid> FLOWING_INVERT_SUGAR_SYRUP;

    static {
        REGISTRY = DeferredRegister.create(Registries.FLUID, MooncakeDelight.MOD_ID);
        INVERT_SUGAR_SYRUP = REGISTRY.register("invert_sugar_syrup", InvertSugarSyrupFluid.Source::new); // 转换糖浆
        FLOWING_INVERT_SUGAR_SYRUP = REGISTRY.register("flowing_invert_sugar_syrup", InvertSugarSyrupFluid.Flowing::new);  // 流动转换糖浆
    }
}

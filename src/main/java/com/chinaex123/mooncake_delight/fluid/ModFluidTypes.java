package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY;
    public static final Supplier<FluidType> INVERT_SUGAR_SYRUP_TYPE;

    static {
        REGISTRY = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, MooncakeDelight.MOD_ID);

        INVERT_SUGAR_SYRUP_TYPE = REGISTRY.register("invert_sugar_syrup", InvertSugarSyrupFluidType::new); // 转换糖浆 类型
    }
}

package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPE_REGISTRY;

    public static final Supplier<FluidType> INVERT_SUGAR_SYRUP_TYPE; // 转换糖浆
    public static final Supplier<FluidType> MAPLE_SYRUP_TYPE; // 枫糖浆

    static {
        FLUID_TYPE_REGISTRY = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, MooncakeDelight.MOD_ID);

        INVERT_SUGAR_SYRUP_TYPE = FLUID_TYPE_REGISTRY.register("invert_sugar_syrup_type", InvertSugarSyrupFluidType::new); // 转换糖浆 类型
        MAPLE_SYRUP_TYPE = FLUID_TYPE_REGISTRY.register("maple_syrup_type", MapleSyrupFluidType::new); // 枫糖浆 类型
    }
}

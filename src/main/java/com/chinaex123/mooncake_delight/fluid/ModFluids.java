package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUID_REGISTRY;

    public static final Supplier<FlowingFluid> INVERT_SUGAR_SYRUP;  // 转换糖浆
    public static final Supplier<FlowingFluid> FLOWING_INVERT_SUGAR_SYRUP;   // 流动 转换糖浆
    public static final Supplier<FlowingFluid> MAPLE_SYRUP; // 枫糖浆
    public static final Supplier<FlowingFluid> FLOWING_MAPLE_SYRUP; // 流动 枫糖浆

    static {
        FLUID_REGISTRY = DeferredRegister.create(Registries.FLUID, MooncakeDelight.MOD_ID);

        INVERT_SUGAR_SYRUP = FLUID_REGISTRY.register("invert_sugar_syrup", InvertSugarSyrupFluid.Source::new); // 转换糖浆
        FLOWING_INVERT_SUGAR_SYRUP = FLUID_REGISTRY.register("flowing_invert_sugar_syrup", InvertSugarSyrupFluid.Flowing::new);  // 流动转换糖浆
        MAPLE_SYRUP = FLUID_REGISTRY.register("maple_syrup", MapleSyrupFluid.Source::new); // 枫糖浆
        FLOWING_MAPLE_SYRUP = FLUID_REGISTRY.register("flowing_maple_syrup", MapleSyrupFluid.Flowing::new);  // 流动 枫糖浆
    }
}

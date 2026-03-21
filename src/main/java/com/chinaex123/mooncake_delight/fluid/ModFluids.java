package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.block.ModFluidBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS_REGISTER =
            DeferredRegister.create(BuiltInRegistries.FLUID, MooncakeDelight.MOD_ID);

    private static BaseFlowingFluid.Properties INVERT_SUGAR_SYRUP_PROPERTIES; // 使用静态字段来存储 Properties，延迟设置 block

    public static final Supplier<BaseFlowingFluid.Source> INVERT_SUGAR_SYRUP =
            FLUIDS_REGISTER.register("invert_sugar_syrup",
                    () -> new BaseFlowingFluid.Source(INVERT_SUGAR_SYRUP_PROPERTIES));

    public static final Supplier<BaseFlowingFluid.Flowing> INVERT_SUGAR_SYRUP_FLOWING =
            FLUIDS_REGISTER.register("flowing_invert_sugar_syrup",
                    () -> new BaseFlowingFluid.Flowing(INVERT_SUGAR_SYRUP_PROPERTIES));

    static {
        INVERT_SUGAR_SYRUP_PROPERTIES = new BaseFlowingFluid.Properties(
                ModFluidTypes.INVERT_SUGAR_SYRUP_TYPE,
                INVERT_SUGAR_SYRUP,
                INVERT_SUGAR_SYRUP_FLOWING)
                .bucket(ModFluidBlocks.INVERT_SUGAR_SYRUP_BUCKET);
    }

    // 添加一个方法，在 Blocks 注册后调用，用于设置 block
    public static void setFluidBlocks() {
        INVERT_SUGAR_SYRUP_PROPERTIES.block(ModFluidBlocks.INVERT_SUGAR_SYRUP);
    }

    public static void register(IEventBus eventBus) {
        FLUIDS_REGISTER.register(eventBus);
    }
}

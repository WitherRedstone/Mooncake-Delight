package com.chinaex123.mooncake_delight.init;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MooncakeDelight.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, MooncakeDelight.MOD_ID);

    public static ResourceLocation id(String name) {
        return ResourceLocation.tryBuild(MooncakeDelight.MOD_ID, name);
    }

    // -------------------- 流体ID --------------------
    // 转换糖浆
    public static final ResourceLocation INVERT_SUGAR_SYRUP_ID = ModFluids.id("invert_sugar_syrup");
    public static final ResourceLocation FLOWING_INVERT_SUGAR_SYRUP_ID = ModFluids.id("flowing_invert_sugar_syrup");
    // 枫糖浆
    public static final ResourceLocation MAPLE_SYRUP_ID = ModFluids.id("maple_syrup");
    public static final ResourceLocation FLOWING_MAPLE_SYRUP_ID = ModFluids.id("flowing_maple_syrup");

    // -------------------- 流体属性 --------------------
    // 参数：流体 ID，掉落伤害，光亮等级，滋润耕地，无限生成
    // 转换糖浆
    public static final Supplier<FluidType> INVERT_SUGAR_SYRUP_TYPE =
            FLUID_TYPES.register("invert_sugar_syrup", () -> new ModFluidTypes(INVERT_SUGAR_SYRUP_ID, 0.4F, 0, false, false));
    // 枫糖浆
    public static final Supplier<FluidType> MAPLE_SYRUP_TYPE =
            FLUID_TYPES.register("maple_syrup", () -> new ModFluidTypes(MAPLE_SYRUP_ID, 0.2F, 0, false, false));

    // -------------------- 流体 Properties --------------------
    public static BaseFlowingFluid.Properties INVERT_SUGAR_SYRUP_PROPERTIES; // 转换糖浆
    public static BaseFlowingFluid.Properties MAPLE_SYRUP_PROPERTIES; // 枫糖浆

    // -------------------- 流体 --------------------
    // 转换糖浆
    public static final Supplier<BaseFlowingFluid.Source> INVERT_SUGAR_SYRUP =
            FLUIDS.register("invert_sugar_syrup", () -> new BaseFlowingFluid.Source(ModFluids.INVERT_SUGAR_SYRUP_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_INVERT_SUGAR_SYRUP =
            FLUIDS.register("flowing_invert_sugar_syrup", () -> new BaseFlowingFluid.Flowing(ModFluids.INVERT_SUGAR_SYRUP_PROPERTIES));
    // 枫糖浆
    public static final Supplier<BaseFlowingFluid.Source> MAPLE_SYRUP =
            FLUIDS.register("maple_syrup", () -> new BaseFlowingFluid.Source(ModFluids.MAPLE_SYRUP_PROPERTIES));
    public static final Supplier<BaseFlowingFluid.Flowing> FLOWING_MAPLE_SYRUP =
            FLUIDS.register("flowing_maple_syrup", () -> new BaseFlowingFluid.Flowing(ModFluids.MAPLE_SYRUP_PROPERTIES));

    static {
        // 转换糖浆
        INVERT_SUGAR_SYRUP_PROPERTIES = new BaseFlowingFluid.Properties(
                INVERT_SUGAR_SYRUP_TYPE,
                INVERT_SUGAR_SYRUP,
                FLOWING_INVERT_SUGAR_SYRUP
        ).bucket(ModItems.INVERT_SUGAR_SYRUP_BUCKET)
                .block(ModBlocks.INVERT_SUGAR_SYRUP_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
        // 枫糖浆
        MAPLE_SYRUP_PROPERTIES = new BaseFlowingFluid.Properties(
                MAPLE_SYRUP_TYPE,
                MAPLE_SYRUP,
                FLOWING_MAPLE_SYRUP
        ).bucket(ModItems.MAPLE_SYRUP_BUCKET)
                .block(ModBlocks.MAPLE_SYRUP_BLOCK)
                .explosionResistance(100.0F) // 抗爆性
                .slopeFindDistance(4) // 流动查找距离
                .levelDecreasePerBlock(1) // 液面下降等级
                .tickRate(10); // 流动速度
    }
}

package com.chinaex123.mooncake_delight.init;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid.Flowing;
import net.minecraftforge.fluids.ForgeFlowingFluid.Properties;
import net.minecraftforge.fluids.ForgeFlowingFluid.Source;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.FLUIDS;
import static net.minecraftforge.registries.ForgeRegistries.Keys.FLUID_TYPES;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFluids {
    // -------------------- 流体 ID --------------------
    // 转换糖浆
    public static final ResourceLocation INVERT_SUGAR_SYRUP_ID = modLoc("invert_sugar_syrup");
    public static final ResourceLocation FLOWING_INVERT_SUGAR_SYRUP_ID = modLoc("flowing_invert_sugar_syrup");
    // 枫糖浆
    public static final ResourceLocation MAPLE_SYRUP_ID = modLoc("maple_syrup");
    public static final ResourceLocation FLOWING_MAPLE_SYRUP_ID = modLoc("flowing_maple_syrup");

    // -------------------- FluidType --------------------
    public static final RegistryObject<net.minecraftforge.fluids.FluidType> INVERT_SUGAR_SYRUP_TYPE = RegistryObject.create(INVERT_SUGAR_SYRUP_ID, FLUID_TYPES.location(), MooncakeDelight.MOD_ID);
    public static final RegistryObject<net.minecraftforge.fluids.FluidType> MAPLE_SYRUP_TYPE = RegistryObject.create(MAPLE_SYRUP_ID, FLUID_TYPES.location(), MooncakeDelight.MOD_ID);

    // -------------------- Fluid --------------------
    public static final RegistryObject<Fluid> INVERT_SUGAR_SYRUP = RegistryObject.create(INVERT_SUGAR_SYRUP_ID, FLUIDS);
    public static final RegistryObject<Fluid> FLOWING_INVERT_SUGAR_SYRUP = RegistryObject.create(FLOWING_INVERT_SUGAR_SYRUP_ID, FLUIDS);
    public static final RegistryObject<Fluid> MAPLE_SYRUP = RegistryObject.create(MAPLE_SYRUP_ID, FLUIDS);
    public static final RegistryObject<Fluid> FLOWING_MAPLE_SYRUP = RegistryObject.create(FLOWING_MAPLE_SYRUP_ID, FLUIDS);

    @SubscribeEvent
    public static void register(RegisterEvent event) {
        event.register(FLUID_TYPES, helper -> {
            helper.register(INVERT_SUGAR_SYRUP_ID, new ModFluidTypes(INVERT_SUGAR_SYRUP_ID, 0.4F, 0, false, false));
            helper.register(MAPLE_SYRUP_ID, new ModFluidTypes(MAPLE_SYRUP_ID, 0.2F, 0, false, false));
        });
        event.register(ForgeRegistries.Keys.FLUIDS, helper -> {
            Properties invertSugarSyrup = new Properties(INVERT_SUGAR_SYRUP_TYPE, INVERT_SUGAR_SYRUP, FLOWING_INVERT_SUGAR_SYRUP)
                    .bucket(ModItems.INVERT_SUGAR_SYRUP_BUCKET)
                    .block(ModBlocks.INVERT_SUGAR_SYRUP_BLOCK)
                    .explosionResistance(100.0F)
                    .slopeFindDistance(4)
                    .levelDecreasePerBlock(1)
                    .tickRate(10);

            Properties mapleSyrup = new Properties(MAPLE_SYRUP_TYPE, MAPLE_SYRUP, FLOWING_MAPLE_SYRUP)
                    .bucket(ModItems.MAPLE_SYRUP_BUCKET)
                    .block(ModBlocks.MAPLE_SYRUP_BLOCK)
                    .explosionResistance(100.0F)
                    .slopeFindDistance(4)
                    .levelDecreasePerBlock(1)
                    .tickRate(10);

            helper.register(INVERT_SUGAR_SYRUP.getId(), new Source(invertSugarSyrup));
            helper.register(FLOWING_INVERT_SUGAR_SYRUP.getId(), new Flowing(invertSugarSyrup));

            helper.register(MAPLE_SYRUP.getId(), new Source(mapleSyrup));
            helper.register(FLOWING_MAPLE_SYRUP.getId(), new Flowing(mapleSyrup));
        });
    }

    public static ResourceLocation modLoc(String name) {
        return ResourceLocation.tryBuild(MooncakeDelight.MOD_ID, name);
    }
}

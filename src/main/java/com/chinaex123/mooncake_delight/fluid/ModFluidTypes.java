package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.pathfinder.PathType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES_REGISTER =
            DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MooncakeDelight.MOD_ID);

    public static final Supplier<FluidType> INVERT_SUGAR_SYRUP_TYPE = FLUID_TYPES_REGISTER.register("invert_sugar_syrup",
            () -> new InvertSugarSyrupFluidType(
                    ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "invert_sugar_syrup"),
                    0 // 光照等级
            ));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES_REGISTER.register(eventBus);
    }

    /**
     * 转化糖浆流体类型
     */
    public static class InvertSugarSyrupFluidType extends FluidType {
        private final ResourceLocation id;
        private final ResourceLocation stillTexture;
        private final ResourceLocation flowingTexture;

        public InvertSugarSyrupFluidType(ResourceLocation id, int lightLevel) {
            super(FluidType.Properties.create()
                    .descriptionId(Util.makeDescriptionId("fluid", id))
                    .density(1500)  // 密度
                    .viscosity(2000)    // 粘度
                    .temperature(300)   // 温度
                    .lightLevel(lightLevel) // 光照等级
                    .canConvertToSource(false)  // 不能无限生成
                    .canHydrate(false)  // 不滋润耕地
                    .canDrown(true) // 可以淹死生物
                    .canPushEntity(true)    // 可以推动实体
                    .canSwim(true)  // 可以游泳
                    .canExtinguish(true)    // 可以灭火
                    .supportsBoating(false) // 不支持划船
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            );
            this.id = id;
            // 纹理路径：assets/mooncake_delight/textures/fluid/invert_sugar_syrup_still.png 和 flow.png
            this.stillTexture = ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "fluid/%s_still".formatted(id.getPath()));
            this.flowingTexture = ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "fluid/%s_flow".formatted(id.getPath()));
        }

        @Override
        @Nullable
        public PathType getBlockPathType(FluidState state, BlockGetter level, BlockPos pos,
                                         @Nullable Mob mob, boolean canFluidLog) {
            return null; // 糖浆太粘了，不会形成正常的路径点
        }

        @Override
        @SuppressWarnings("removal")
        public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
            consumer.accept(new IClientFluidTypeExtensions() {
                @Override
                public ResourceLocation getStillTexture() {
                    return stillTexture;
                }

                @Override
                public ResourceLocation getFlowingTexture() {
                    return flowingTexture;
                }

                @Override
                public int getTintColor() {
                    return 0xFFE4C4; // 浅橙色/琥珀色（转化糖浆的颜色）
                }
            });
        }
    }
}

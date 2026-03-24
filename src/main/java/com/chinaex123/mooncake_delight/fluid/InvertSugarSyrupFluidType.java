package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.mojang.blaze3d.shaders.FogShape;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.function.Consumer;

// 流体类型 - 交互行为
public class InvertSugarSyrupFluidType extends FluidType {
    public InvertSugarSyrupFluidType() {
        super(Properties.create()
                .density(3000)  // 密度
                .viscosity(16000) // 粘度
                .temperature(300) // 温度
                .lightLevel(0) // 光照等级
                .motionScale(0.005) // 运动阻力系数
                .fallDistanceModifier(0.2F) // 掉落伤害修正
                .canConvertToSource(false)  // 无限生成
                .canHydrate(false)  // 滋润耕地
                .canDrown(true) // 可以淹死生物
                .canPushEntity(true) // 可以推动实体
                .canSwim(true)  // 可以游泳
                .canExtinguish(false) // 可以灭火
                .supportsBoating(false) // 划船
                .sound(SoundActions.BUCKET_FILL, SoundEvents.HONEY_DRINK) // 用桶装流体
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.HONEY_DRINK) // 倒出流体
                .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH) // 流体蒸发
                .sound(SoundActions.CAULDRON_DRIP, SoundEvents.HONEY_DRINK) // 流体蒸发
        );
    }

    @Override
    @SuppressWarnings("removal")
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL_TEXTURE = ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/invert_sugar_syrup_still");
            private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/invert_sugar_syrup_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() {
                return STILL_TEXTURE;
            }

            @Override
            public @NotNull ResourceLocation getFlowingTexture() {
                return FLOWING_TEXTURE;
            }

            @Override
            public @NotNull Vector3f modifyFogColor(@NotNull Camera camera, float partialTick, @NotNull ClientLevel level,
                                                    int renderDistance, float darkenWorldAmount, @NotNull Vector3f fluidFogColor) {
                return new Vector3f(0.62F, 0.31F, 0.00F);
            }

            @Override
            public void modifyFogRender(@NotNull Camera camera, FogRenderer.@NotNull FogMode mode,
                                        float renderDistance, float partialTick, float nearDistance, float farDistance, @NotNull FogShape shape) {
                // 设置雾的起始和结束距离（值越小雾越浓）
                IClientFluidTypeExtensions.super.modifyFogRender(
                        camera, mode, renderDistance, partialTick,
                        Math.max(nearDistance, 2.5F),  // 雾起始距离
                        Math.min(farDistance, 6.0F),   // 雾结束距离
                        shape
                );
            }
        });
    }
}

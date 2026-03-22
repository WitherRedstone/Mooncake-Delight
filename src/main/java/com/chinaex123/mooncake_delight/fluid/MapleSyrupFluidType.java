package com.chinaex123.mooncake_delight.fluid;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

// 流体类型 - 交互行为
public class MapleSyrupFluidType extends FluidType {
    public MapleSyrupFluidType() {
        super(Properties.create()
                .density(3000)  // 密度
                .viscosity(16000) // 粘度
                .temperature(300) // 温度
                .lightLevel(0) // 光照等级
                .motionScale(0.003) // 运动阻力系数
                .fallDistanceModifier(0.5F) // 掉落伤害修正
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
            private static final ResourceLocation STILL_TEXTURE = ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/maple_syrup_still");
            private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "block/maple_syrup_flow");

            public @NotNull ResourceLocation getStillTexture() {
                return STILL_TEXTURE;
            }

            public @NotNull ResourceLocation getFlowingTexture() {
                return FLOWING_TEXTURE;
            }
        });
    }
}

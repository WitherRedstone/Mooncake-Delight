package com.chinaex123.mooncake_delight.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class FoodTooltipItem extends Item {
    private final FoodProperties foodProperties;
    private final boolean hasFoil;

    public FoodTooltipItem(Properties properties, FoodProperties foodProperties) {
        this(properties, foodProperties, false);
    }

    public FoodTooltipItem(Properties properties, FoodProperties foodProperties, boolean hasFoil) {
        super(properties.food(foodProperties));
        this.foodProperties = foodProperties;
        this.hasFoil = hasFoil;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        // 显示状态效果信息
        if (foodProperties != null && !foodProperties.effects().isEmpty()) {
            tooltip.add(Component.translatable("tooltip.mooncake_delight.effects").withStyle(ChatFormatting.YELLOW));

            foodProperties.effects().forEach(effect -> {
                MobEffectInstance effectInstance = effect.effect();
                float chance = effect.probability();

                String effectName = effectInstance.getEffect().value().getDisplayName().getString();
                int durationTicks = effectInstance.getDuration();
                int durationSeconds = durationTicks / 20;
                int amplifier = effectInstance.getAmplifier() + 1;
                int chancePercent = (int)(chance * 100);

                // 格式化持续时间并根据时间单位选择正确的翻译键
                Component effectComponent;
                if (durationSeconds >= 3600) {
                    // 超过 1 小时
                    int hours = durationSeconds / 3600;
                    int minutes = (durationSeconds % 3600) / 60;
                    effectComponent = Component.translatable(
                            "tooltip.mooncake_delight.effect_hours",
                            effectName,
                            toRomanNumeral(amplifier),
                            hours,
                            minutes,
                            chancePercent
                    ).withStyle(ChatFormatting.GRAY);
                } else if (durationSeconds >= 60) {
                    // 超过 1 分钟
                    int minutes = durationSeconds / 60;
                    int seconds = durationSeconds % 60;
                    effectComponent = Component.translatable(
                            "tooltip.mooncake_delight.effect_minutes",
                            effectName,
                            toRomanNumeral(amplifier),
                            minutes,
                            seconds,
                            chancePercent
                    ).withStyle(ChatFormatting.GRAY);
                } else {
                    // 不到 1 分钟
                    effectComponent = Component.translatable(
                            "tooltip.mooncake_delight.effect_seconds",
                            effectName,
                            toRomanNumeral(amplifier),
                            durationSeconds,
                            chancePercent
                    ).withStyle(ChatFormatting.GRAY);
                }

                tooltip.add(effectComponent);
            });
        }
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return hasFoil || super.isFoil(stack);
    }

    // 将数字转换为罗马数字（用于显示效果等级）
    private String toRomanNumeral(int number) {
        if (number <= 0 || number > 10) {
            return String.valueOf(number);
        }

        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanNumerals[number - 1];
    }
}

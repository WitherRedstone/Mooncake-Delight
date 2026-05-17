package com.chinaex123.mooncake_delight.tooltop;

import com.chinaex123.mooncake_delight.init.MDItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import java.util.List;

@EventBusSubscriber(modid = "mooncake_delight")
public class ModTooltop {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();

        // 松露
        if (stack.getItem() == MDItems.TRUFFLE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.truffle.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // 莲子
        if (stack.getItem() == MDItems.LOTUS_SEED.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.lotus_seed.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // 面粉
        if (stack.getItem() == MDItems.FLOUR.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.flour.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // TNT月饼
        if (stack.getItem() == MDItems.TNT_MOONCAKE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.tnt_mooncake.tooltip")
                    .withStyle(ChatFormatting.RED));
        }
        // 流心月饼
        if (stack.getItem() == MDItems.LAVA_MOONCAKE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.lava_mooncake.tooltip")
                    .withStyle(ChatFormatting.RED));
        }
        // 黑芝麻
        if (stack.getItem() == MDItems.BLACK_SESAME.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.black_sesame.tooltip")
                    .withStyle(ChatFormatting.GOLD));
        }
    }
}

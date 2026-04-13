package com.chinaex123.mooncake_delight.tooltop;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = "mooncake_delight")
public class ModTooltop {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        List<Component> tooltip = event.getToolTip();

        // 松露
        if (stack.getItem() == ModItems.TRUFFLE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.truffle.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // 莲子
        if (stack.getItem() == ModItems.LOTUS_SEED.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.lotus_seed.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // 面粉
        if (stack.getItem() == ModItems.FLOUR.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.flour.tooltip")
                    .withStyle(ChatFormatting.GREEN));
        }
        // TNT月饼
        if (stack.getItem() == ModItems.TNT_MOONCAKE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.tnt_mooncake.tooltip")
                    .withStyle(ChatFormatting.RED));
        }
        // 流心月饼
        if (stack.getItem() == ModItems.LAVA_MOONCAKE.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.lava_mooncake.tooltip")
                    .withStyle(ChatFormatting.RED));
        }
        // 黑芝麻
        if (stack.getItem() == ModItems.BLACK_SESAME.get()) {
            tooltip.add(Component.translatable("item.mooncake_delight.black_sesame.tooltip")
                    .withStyle(ChatFormatting.GOLD));
        }
    }
}

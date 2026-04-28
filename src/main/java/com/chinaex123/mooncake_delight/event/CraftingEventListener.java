package com.chinaex123.mooncake_delight.event;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import vectorwing.farmersdelight.common.tag.ModTags;

@EventBusSubscriber(modid = "mooncake_delight")
public class CraftingEventListener {

    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
        ItemStack result = event.getCrafting();

        // 检查输出是否为油浸刀
        if (!result.is(ModItems.OILED_KNIFE.get())) {
            return;
        }

        var container = event.getInventory();

        for (int i = 0; i < container.getContainerSize(); i++) {
            ItemStack ingredient = container.getItem(i);

            // 找到刀具标签中的物品
            if (ingredient.is(ModTags.Items.KNIVES)) {
                // 直接复制所有组件数据
                result.applyComponents(ingredient.getComponents());
                break;
            }
        }
    }
}
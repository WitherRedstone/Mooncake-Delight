package com.chinaex123.mooncake_delight.event;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import vectorwing.farmersdelight.common.tag.ModTags;

@Mod.EventBusSubscriber(modid = "mooncake_delight")
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
                // 复制所有 NBT 数据
                if (ingredient.hasTag()) {
                    CompoundTag tag = ingredient.getTag().copy();
                    result.setTag(tag);
                }
                break;
            }
        }
    }
}
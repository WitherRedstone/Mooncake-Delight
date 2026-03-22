package com.chinaex123.mooncake_delight.util;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class SyrupHandler {

    /**
     * 处理饮用糖浆后的返还物品逻辑
     * @param stack 当前物品堆
     * @param entity 饮用实体
     * @param level 世界等级
     * @return 处理后的物品堆
     */
    public static ItemStack onSyrupConsumed(ItemStack stack, LivingEntity entity, Level level) {
        if (!level.isClientSide()) {
            // 播放蜂蜜饮用声音
            level.playSound(null, entity.blockPosition(),
                    net.minecraft.sounds.SoundEvents.HONEY_DRINK,
                    entity.getSoundSource(), 1.0F, 1.0F);

            // 创造模式不消耗物品，不给玻璃瓶
            if (entity instanceof Player player && player.isCreative()) {
                return stack;
            }

            // 消耗并返还玻璃瓶
            stack.shrink(1);
            ItemStack bottle = new ItemStack(Items.GLASS_BOTTLE);

            // 如果是玩家，尝试放入物品栏
            if (entity instanceof Player player) {
                if (!player.getInventory().add(bottle)) {
                    // 物品栏满了就掉落在地上
                    player.spawnAtLocation(bottle);
                }
            } else {
                // 非玩家实体直接掉落
                entity.spawnAtLocation(bottle);
            }
        }
        return stack;
    }
}

package com.chinaex123.mooncake_delight.item.Foods;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

@EventBusSubscriber(modid = "mooncake_delight")
public class DebrisMooncake {

    @SubscribeEvent
    public static void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        LivingEntity entity = event.getEntity();
        ItemStack stack = event.getItem();

        // 检查是否是残骸月饼
        if (stack.getItem() != ModItems.DEBRIS_MOONCAKE.get()) {
            return;
        }

        // 只在服务端执行
        if (entity.level().isClientSide()) {
            return;
        }

        // 随机给予远古残骸相关物品
        giveRandomDebrisItem(entity);
    }

    /**
     * 给予随机的远古残骸相关物品
     */
    private static void giveRandomDebrisItem(LivingEntity entity) {
        // 随机选择奖励类型：0=远古残骸，1=下界合金碎片，2=下界合金锭
        int randomType = entity.level().getRandom().nextInt(3);

        ItemStack reward;
        int amount;

        switch (randomType) {
            case 0 -> {
                // 远古残骸（1-3 个）
                amount = 1 + entity.level().getRandom().nextInt(3);
                reward = new ItemStack(Items.ANCIENT_DEBRIS, amount);
            }
            case 1 -> {
                // 下界合金碎片（1-5 个）
                amount = 1 + entity.level().getRandom().nextInt(5);
                reward = new ItemStack(Items.NETHERITE_SCRAP, amount);
            }
            case 2 -> {
                // 下界合金锭（1-2 个）
                amount = 1 + entity.level().getRandom().nextInt(2);
                reward = new ItemStack(Items.NETHERITE_INGOT, amount);
            }
            default -> {
                reward = new ItemStack(Items.ANCIENT_DEBRIS, 1);
            }
        }

        // 如果是玩家，尝试放入物品栏
        if (entity instanceof Player player) {
            if (!player.getInventory().add(reward)) {
                // 物品栏满了就掉落在地上
                player.spawnAtLocation(reward);
            }
        } else {
            // 非玩家实体直接掉落
            entity.spawnAtLocation(reward);
        }
    }
}

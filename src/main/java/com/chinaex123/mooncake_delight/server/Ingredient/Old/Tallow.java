//package com.chinaex123.mooncake_delight.server.Ingredient;
//
//import com.chinaex123.mooncake_delight.item.ModItems;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.animal.*;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
//
//@EventBusSubscriber(modid = "mooncake_delight")
//public class Tallow {
//    @SubscribeEvent
//    public static void onLivingDeath(LivingDeathEvent event) {
//        Entity entity = event.getEntity();
//        Entity source = event.getSource().getEntity();
//
//        // 必须是玩家击杀
//        if (!(source instanceof Player player)) {
//            return;
//        }
//
//        // 检查是否是猪/牛/羊
//        if (!(entity instanceof Pig || entity instanceof Cow || entity instanceof Sheep)) {
//            return;
//        }
//
//        // 检查是否着火状态
//        if (!entity.isOnFire()) {
//            return;
//        }
//
//        // 检查玩家手持的物品是否是油浸刀
//        ItemStack mainHandItem = player.getMainHandItem();
//        boolean hasOiledKnife = mainHandItem.getItem() == ModItems.OILED_KNIFE.get();
//
//        // 计算掉落概率
//        double crumbsChance = hasOiledKnife ? 0.9 : 0.5;
//        double tallowChance = hasOiledKnife ? 0.25 : 0.05;
//        int minCrumbs = 1;
//        int maxCrumbs = hasOiledKnife ? 3 : 2;
//
//        // 随机数生成
//        double random = entity.level().random.nextDouble();
//
//        // 掉落动物油脂碎
//        if (random < crumbsChance) {
//            int crumbsAmount = minCrumbs + entity.level().random.nextInt(maxCrumbs - minCrumbs + 1);
//            for (int i = 0; i < crumbsAmount; i++) {
//                entity.spawnAtLocation(ModItems.TALLOW_CRUMBS.get());
//            }
//        }
//
//        // 掉落动物油脂
//        if (entity.level().random.nextDouble() < tallowChance) {
//            entity.spawnAtLocation(ModItems.TALLOW.get());
//        }
//    }
//}

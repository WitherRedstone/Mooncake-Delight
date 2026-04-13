//package com.chinaex123.mooncake_delight.server.Ingredient;
//
//import com.chinaex123.mooncake_delight.init.ModItems;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.enchantment.EnchantmentHelper;
//import net.minecraft.world.item.enchantment.Enchantments;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.event.level.BlockDropsEvent;
//
//@EventBusSubscriber(modid = "mooncake_delight")
//public class LotusSeed {
//
//    @SubscribeEvent
//    public static void onBlockDrops(BlockDropsEvent event) {
//        if (!(event.getBreaker() instanceof Player player)) {
//            return;
//        }
//
//        String blockName = event.getState().getBlock().toString();
//
//        // 检查是否是睡莲
//        if (!blockName.contains("lily_pad")) {
//            return;
//        }
//
//        // 检查是否精准采集
//        ItemStack tool = player.getMainHandItem();
//        if (tool.isEnchanted()) {
//            var silkTouchHolder = player.level().registryAccess().registryOrThrow(Registries.ENCHANTMENT)
//                    .getHolderOrThrow(Enchantments.SILK_TOUCH);
//            int silkTouch = EnchantmentHelper.getTagEnchantmentLevel(silkTouchHolder, tool);
//            if (silkTouch > 0) {
//                return; // 精准采集不掉落
//            }
//        }
//
//        // 基础概率 2.5%
//        float baseChance = 0.025f;
//        var fortuneHolder = player.level().registryAccess().registryOrThrow(Registries.ENCHANTMENT)
//                .getHolderOrThrow(Enchantments.FORTUNE);
//        int fortuneLevel = EnchantmentHelper.getTagEnchantmentLevel(fortuneHolder, tool);
//
//        // 时运加成：每级 +1%，最多 +5%（总 7.5%）
//        float bonusChance = Math.min(fortuneLevel * 0.01f, 0.05f);
//        float totalChance = baseChance + bonusChance;
//
//        if (player.getRandom().nextFloat() < totalChance) {
//            // 清空原有掉落物
//            event.getDrops().clear();
//
//            // 基础数量 1 个，时运每级额外增加 1-3 个
//            int amount = 1;
//            if (fortuneLevel > 0) {
//                amount += fortuneLevel + player.getRandom().nextInt(fortuneLevel * 2);
//            }
//
//            for (int i = 0; i < amount; i++) {
//                net.minecraft.world.entity.item.ItemEntity lotusEntity = new net.minecraft.world.entity.item.ItemEntity(
//                        player.level(),
//                        event.getPos().getX() + 0.5,
//                        event.getPos().getY() + 0.5,
//                        event.getPos().getZ() + 0.5,
//                        new ItemStack(ModItems.LOTUS_SEED.get()));
//                event.getDrops().add(lotusEntity);
//            }
//        }
//    }
//}

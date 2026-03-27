//package com.chinaex123.mooncake_delight.loot;
//
//import com.chinaex123.mooncake_delight.MooncakeDelight;
//import com.chinaex123.mooncake_delight.block.Crops.SesameCrop;
//import com.chinaex123.mooncake_delight.block.ModBlocks;
//import com.chinaex123.mooncake_delight.item.ModItems;
//import net.minecraft.advancements.critereon.StatePropertiesPredicate;
//import net.minecraft.resources.ResourceLocation;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.neoforge.event.LootTableLoadEvent;
//import net.minecraft.world.level.storage.loot.LootPool;
//import net.minecraft.world.level.storage.loot.entries.LootItem;
//import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
//import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
//import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
//import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
//
//public class BlockLootInjector  {
//
//    @SubscribeEvent
//    public static void onLootTableLoad(LootTableLoadEvent event) {
//        ResourceLocation tableId = event.getName();
//
//        // 芝麻作物掉落表
//        if (tableId.equals(ResourceLocation.fromNamespaceAndPath(MooncakeDelight.MOD_ID, "blocks/sesame_crop"))) {
//            // 添加黑芝麻掉落池（2% 概率，成熟时）
//            LootPool bonusPool = LootPool.lootPool()
//                    .setRolls(ConstantValue.exactly(1.0f))
//                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.SESAME_CROP.get())
//                            .setProperties(StatePropertiesPredicate.Builder.properties()
//                                    .hasProperty(SesameCrop.AGE, 4)))
//                    .when(LootItemRandomChanceCondition.randomChance(0.5f))
//                    .add(LootItem.lootTableItem(ModItems.BLACK_SESAME.get()))
//                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
//                    .name("mooncake_delight:black_sesame_bonus")
//                    .build();
//            event.getTable().addPool(bonusPool);
//        }
//    }
//}

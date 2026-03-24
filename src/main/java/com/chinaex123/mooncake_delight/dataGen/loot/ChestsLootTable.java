//package com.chinaex123.mooncake_delight.dataGen.loot;
//
//import com.chinaex123.mooncake_delight.item.ModItems;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.storage.loot.LootPool;
//import net.minecraft.world.level.storage.loot.LootTable;
//import net.minecraft.world.level.storage.loot.entries.LootItem;
//import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
//import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
//import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.function.BiConsumer;
//
//public class ChestsLootTable {
//
//    private final CompletableFuture<HolderLookup.Provider> registries;
//
//    public ChestsLootTable(CompletableFuture<HolderLookup.Provider> registries) {
//        this.registries = registries;
//    }
//
//    /**
//     * 生成箱子战利品表
//     */
//    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
//        addItemToChest(consumer, ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace("chests/end_city_treasure")), // 末地城里的箱子
//                ModItems.BEDROCK_MOONCAKE.get(), 0.01f, 1, 1); // 基岩月饼
//
//        addItemToChest(consumer, ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace("chests/bastion_treasure")), // 堡垒遗迹宝藏室中的箱子
//                ModItems.DEBRIS_MOONCAKE.get(), 0.10f, 1, 2); // 残骸月饼
//    }
//
//    /**
//     * 向指定箱子添加物品
//     * @param consumer 消费者
//     * @param tableKey 战利品表键
//     * @param item 要添加的物品
//     * @param chance 概率 (0.0-1.0)
//     * @param minCount 最小数量
//     * @param maxCount 最大数量
//     */
//    private void addItemToChest(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
//                                ResourceKey<LootTable> tableKey, Object item, float chance, int minCount, int maxCount) {
//        LootTable.Builder builder = LootTable.lootTable()
//            .withPool(LootPool.lootPool()
//                .setRolls(UniformGenerator.between(1.0f, 1.0f))
//                .when(LootItemRandomChanceCondition.randomChance(chance))
//                .add(LootItem.lootTableItem((net.minecraft.world.item.Item) item))
//                .apply(SetItemCountFunction.setCount(
//                    UniformGenerator.between(minCount, maxCount)
//                ))
//            );
//
//        consumer.accept(tableKey, builder);
//    }
//}

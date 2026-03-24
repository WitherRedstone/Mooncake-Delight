//package com.chinaex123.mooncake_delight.dataGen.loot;
//
//import com.chinaex123.mooncake_delight.item.ModItems;
//import net.minecraft.core.Holder;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.core.registries.BuiltInRegistries;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.data.loot.BlockLootSubProvider;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.enchantment.Enchantments;
//import net.minecraft.world.level.ItemLike;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.storage.loot.LootPool;
//import net.minecraft.world.level.storage.loot.LootTable;
//import net.minecraft.world.level.storage.loot.entries.LootItem;
//import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
//import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
//import net.minecraft.world.flag.FeatureFlags;
//import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
//import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
//
//import java.util.Set;
//import java.util.concurrent.CompletableFuture;
//import java.util.function.BiConsumer;
//import java.util.function.Consumer;
//
//public class BlocksLootTable {
//
//    private final CompletableFuture<HolderLookup.Provider> registries;
//
//    public BlocksLootTable(CompletableFuture<HolderLookup.Provider> registries) {
//        this.registries = registries;
//    }
//
//    /**
//     * 生成方块战利品表
//     */
//    public void generate(BiConsumer<net.minecraft.resources.ResourceKey<LootTable>, LootTable.Builder> consumer) {
//        HolderLookup.Provider provider = registries.join();
//
//        addBlockDropWithSilkTouchAndFortune(consumer, Blocks.LILY_PAD, ModItems.LOTUS_SEED.get(), 0.025f, 1, 1); // 睡莲 → 莲子
//        addBlockDropWithSilkTouchAndFortune(consumer, Blocks.PODZOL, ModItems.TRUFFLE.get(), 0.025f, 1, 1); // 灰化土 → 松露
//        addBlockDropWithSilkTouchAndFortune(consumer, Blocks.SPRUCE_LEAVES, ModItems.PINECONE.get(), 0.025f, 1, 1); // 云杉树叶 → 松子
//
//    }
//
//    /**
//     * 向指定方块添加掉落物（支持精准采集和时运）
//     * @param consumer 消费者
//     * @param block 方块
//     * @param dropItem 掉落的物品
//     * @param chance 基础概率 (0.0-1.0)
//     * @param minCount 最小数量
//     * @param maxCount 最大数量
//     */
//    private void addBlockDropWithSilkTouchAndFortune(BiConsumer<net.minecraft.resources.ResourceKey<LootTable>, LootTable.Builder> consumer,
//                                                     Block block, ItemLike dropItem, float chance, int minCount, int maxCount) {
//        ResourceLocation tableId = BuiltInRegistries.BLOCK.getKey(block);
//        ResourceKey<LootTable> tableKey = ResourceKey.create(Registries.LOOT_TABLE, tableId);
//
//        HolderLookup.RegistryLookup<net.minecraft.world.item.enchantment.Enchantment> enchantmentLookup =
//                registries.join().lookupOrThrow(Registries.ENCHANTMENT);
//        Holder.Reference<net.minecraft.world.item.enchantment.Enchantment> fortune =
//                enchantmentLookup.getOrThrow(Enchantments.FORTUNE);
//
//        LootTable.Builder builder = LootTable.lootTable()
//                .withPool(LootPool.lootPool()
//                        .setRolls(UniformGenerator.between(1.0f, 1.0f))
//                        .when(LootItemRandomChanceCondition.randomChance(chance))
//                        .add(LootItem.lootTableItem(dropItem))
//                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minCount, maxCount)))
//                        .apply(ApplyBonusCount.addOreBonusCount(fortune)) // 时运加成
//                );
//
//        consumer.accept(tableKey, builder);
//    }
//}

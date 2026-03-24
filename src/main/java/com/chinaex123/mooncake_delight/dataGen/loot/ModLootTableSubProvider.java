//package com.chinaex123.mooncake_delight.dataGen.loot;
//
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.loot.LootTableSubProvider;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.world.level.storage.loot.LootTable;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.function.BiConsumer;
//
//public class ModLootTableSubProvider implements LootTableSubProvider {
//
//    private final CompletableFuture<HolderLookup.Provider> registries;
//    private final ChestsLootTable chestLootTable;
//
//    public ModLootTableSubProvider(CompletableFuture<HolderLookup.Provider> registries) {
//        this.registries = registries;
//        this.chestLootTable = new ChestsLootTable(registries);
//    }
//
//    @Override
//    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
//        chestLootTable.generate(consumer);
//    }
//}

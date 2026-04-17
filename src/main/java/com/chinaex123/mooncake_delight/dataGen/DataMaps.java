package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class DataMaps extends DataMapProvider {
    protected DataMaps(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    @SuppressWarnings({"deprecation", "removal"})
    protected void gather() {
        // 堆肥
        builder(NeoForgeDataMaps.COMPOSTABLES)
                // ======================= 作物 =======================
                .add(ModItems.WHITE_SESAME.get().builtInRegistryHolder(), new Compostable(0.30F), false) // 白芝麻
                .add(ModItems.BLACK_SESAME.get().builtInRegistryHolder(), new Compostable(0.65F), false); // 黑芝麻
    }
}

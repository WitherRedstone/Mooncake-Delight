package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.dataGen.recipe.ModRecipesProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ModRecipesProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new ModItemModelsProvider(packOutput, event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, lookupProvider, CompletableFuture.completedFuture(TagsProvider.TagLookup.empty()), existingFileHelper));
        generator.addProvider(event.includeClient(), new ModFluidTagsProvider(packOutput, lookupProvider, existingFileHelper));
//        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(provider ->
//                new ModLootTableSubProvider(lookupProvider), LootContextParamSets.ALL_PARAMS)), lookupProvider
//        ));
    }
}
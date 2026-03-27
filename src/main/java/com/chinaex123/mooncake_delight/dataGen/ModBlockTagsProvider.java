package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.block.ModBlocks;
import com.chinaex123.mooncake_delight.tags.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MooncakeDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(ModItemTags.CROPS_SPRING_BLOCK).add(ModBlocks.SESAME_CROP.get()); // 春天
        this.tag(ModItemTags.CROPS_SUMMER_BLOCK).add(ModBlocks.SESAME_CROP.get()); // 夏天
        this.tag(ModItemTags.CROPS_DRY_AVERAGE).add(ModBlocks.SESAME_CROP.get()); // 干燥
        this.tag(ModItemTags.CROPS_SPRING_SUMMER).add(ModBlocks.SESAME_CROP.get()); // 干燥
        this.tag(ModItemTags.FTB_SINGLE_CROP_HARVESTING_BLACKLIST).add(ModBlocks.SESAME_CROP.get());
        this.tag(ModItemTags.FTB_EXCLUDED_BLOCKS).add(ModBlocks.SESAME_CROP.get());
    }
}

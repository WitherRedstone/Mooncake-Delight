package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.init.MDBlocks;
import com.chinaex123.mooncake_delight.init.MDItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
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
        this.tag(MDItemTags.CROPS_SPRING_BLOCK).add(MDBlocks.SESAME_CROP.get()); // 春天
        this.tag(MDItemTags.CROPS_SUMMER_BLOCK).add(MDBlocks.SESAME_CROP.get()); // 夏天
        this.tag(MDItemTags.CROPS_DRY_AVERAGE).add(MDBlocks.SESAME_CROP.get()); // 干燥
        this.tag(MDItemTags.CROPS_SPRING_SUMMER).add(MDBlocks.SESAME_CROP.get()); // 干燥

        this.tag(BlockTags.CROPS).add(MDBlocks.SESAME_CROP.get()); // 作物
    }
}

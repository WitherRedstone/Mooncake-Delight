package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModFluidTagsProvider  extends FluidTagsProvider {
    public ModFluidTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MooncakeDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // 蜂蜜
        tag(Tags.Fluids.HONEY)
                .add(ModFluids.INVERT_SUGAR_SYRUP.get()) // 转换糖浆
                .add(ModFluids.MAPLE_SYRUP.get()); // 枫糖浆
    }
}

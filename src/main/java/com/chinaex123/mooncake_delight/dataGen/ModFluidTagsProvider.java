package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.init.MDFluids;
import com.chinaex123.mooncake_delight.init.MDFluidTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
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
        // c:fluid
        this.tag(MDFluidTags.FLUIDS)
                .add(MDFluids.INVERT_SUGAR_SYRUP.get()) // 转换糖浆
                .add(MDFluids.MAPLE_SYRUP.get()); // 枫糖浆

        // c:fluid/maple_syrup
        this.tag(MDFluidTags.FLUID_MAPLE_SYRUP)
                .add(MDFluids.MAPLE_SYRUP.get()); // 枫糖浆

        // c:fluid/invert_sugar_syrup
        this.tag(MDFluidTags.FLUID_INVERT_SUGAR_SYRUP)
                .add(MDFluids.INVERT_SUGAR_SYRUP.get()); // 转换糖浆
    }
}

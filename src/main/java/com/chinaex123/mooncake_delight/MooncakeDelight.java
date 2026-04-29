package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.config.CommonConfig;
import com.chinaex123.mooncake_delight.init.ModBlocks;
import com.chinaex123.mooncake_delight.init.ModFluids;
import com.chinaex123.mooncake_delight.init.ModCreativeTabs;
import com.chinaex123.mooncake_delight.init.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.init.ModItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(MooncakeDelight.MOD_ID)
public class MooncakeDelight {
    public static final String MOD_ID = "mooncake_delight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MooncakeDelight(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModFluids.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);

        ModCreativeTabs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);

        if (ModList.get().isLoaded("croptopia")) {
            CroptopiaItems.register(modEventBus);
        }
    }
}

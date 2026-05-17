package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.config.CommonConfig;
import com.chinaex123.mooncake_delight.init.*;
import com.chinaex123.mooncake_delight.init.ModCompat.Croptopia.CroptopiaItems;
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
        MDItems.register(modEventBus);
        MDBlocks.register(modEventBus);
        MDFluids.FLUID_TYPES.register(modEventBus);
        MDFluids.FLUIDS.register(modEventBus);

        MDCreativeTabs.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);

        if (ModList.get().isLoaded("croptopia")) {
            CroptopiaItems.register(modEventBus);
        }
    }
}

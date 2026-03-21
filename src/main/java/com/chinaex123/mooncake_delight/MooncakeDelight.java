package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.block.ModFluidBlocks;
import com.chinaex123.mooncake_delight.fluid.ModFluidTypes;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import com.chinaex123.mooncake_delight.item.ModItems;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import org.slf4j.Logger;

@Mod(MooncakeDelight.MOD_ID)
public class MooncakeDelight {
    public static final String MOD_ID = "mooncake_delight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MooncakeDelight(IEventBus modEventBus, ModContainer modContainer) {
        // 注册流体相关
        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidBlocks.register(modEventBus);
        ModFluids.setFluidBlocks();

        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);


        if (ModList.get().isLoaded("croptopia")) {
            CroptopiaItems.register(modEventBus);
        }
    }
}

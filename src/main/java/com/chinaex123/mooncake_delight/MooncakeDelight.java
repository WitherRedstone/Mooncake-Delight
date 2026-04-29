package com.chinaex123.mooncake_delight;

import com.chinaex123.mooncake_delight.config.CommonConfig;
import com.chinaex123.mooncake_delight.init.ModBlocks;
import com.chinaex123.mooncake_delight.init.ModCompostables;
import com.chinaex123.mooncake_delight.init.ModCreativeTabs;
import com.chinaex123.mooncake_delight.item.ModCompat.Croptopia.CroptopiaItems;
import com.chinaex123.mooncake_delight.init.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MooncakeDelight.MOD_ID)
public class MooncakeDelight {
    public static final String MOD_ID = "mooncake_delight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MooncakeDelight(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        context.registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        
        if (ModList.get().isLoaded("croptopia")) {
            CroptopiaItems.register(modEventBus);
        }

        modEventBus.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        ModCompostables.setup(event);
    }
}

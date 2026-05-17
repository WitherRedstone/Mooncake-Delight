package com.chinaex123.mooncake_delight.init;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class MDCompostables {
    public static void setup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // 注册堆肥
            ComposterBlock.COMPOSTABLES.put(MDItems.WHITE_SESAME.get(), 0.30F); // 白芝麻
            ComposterBlock.COMPOSTABLES.put(MDItems.BLACK_SESAME.get(), 0.65F); // 黑芝麻
        });
    }
}

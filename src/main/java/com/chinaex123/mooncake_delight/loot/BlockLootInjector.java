package com.chinaex123.mooncake_delight.loot;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class BlockLootInjector {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation tableId = event.getName();

        // 芝麻作物掉落表
        if (tableId.equals(ResourceLocation.withDefaultNamespace("blocks/short_grass"))) {
            // 添加白芝麻掉落池（破坏草时概率掉落）
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1.0f))
                    .when(LootItemRandomChanceCondition.randomChance(0.25f))
                    .add(LootItem.lootTableItem(ModItems.WHITE_SESAME.get()))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                    .name("mooncake_delight:white_sesame_from_grass")
                    .build();
            event.getTable().addPool(bonusPool);
        }
    }
}

package com.chinaex123.mooncake_delight.loot;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.config.CommonConfig;
import com.chinaex123.mooncake_delight.init.MDItems;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

@EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class ChestLootInjector {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation tableId = event.getName();

        // 末地城宝藏箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/end_city_treasure"))) {
            double chance = CommonConfig.END_CITY_BEDROCK_MOONCAKE_CHANCE.get();
            if (chance > 0) {
                LootPool bonusPool = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0f, 1.0f))
                        .when(LootItemRandomChanceCondition.randomChance((float) chance))
                        .add(LootItem.lootTableItem(MDItems.BEDROCK_MOONCAKE.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1)))
                        .name("mooncake_delight:bedrock_mooncake_bonus")
                        .build();
                event.getTable().addPool(bonusPool);
            }
        }

        // 堡垒遗迹宝藏室中的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/bastion_treasure"))) {
            double chance = CommonConfig.BASTION_TREASURE_DEBRIS_MOONCAKE_CHANCE.get();
            if (chance > 0) {
                LootPool bonusPool = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0f, 1.0f))
                        .when(LootItemRandomChanceCondition.randomChance((float) chance))
                        .add(LootItem.lootTableItem(MDItems.DEBRIS_MOONCAKE.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                        .name("mooncake_delight:debris_mooncake_bonus")
                        .build();
                event.getTable().addPool(bonusPool);
            }
        }

        // 沙漠神殿的宝藏室里的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/desert_pyramid"))) {
            double chance = CommonConfig.DESERT_PYRAMID_TNT_MOONCAKE_CHANCE.get();
            if (chance > 0) {
                LootPool bonusPool = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0f, 1.0f))
                        .when(LootItemRandomChanceCondition.randomChance((float) chance))
                        .add(LootItem.lootTableItem(MDItems.TNT_MOONCAKE.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1)))
                        .name("mooncake_delight:tnt_mooncake_bonus")
                        .build();
                event.getTable().addPool(bonusPool);
            }
        }

        // 堡垒遗迹疣猪兽棚中的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/bastion_hoglin_stable"))) {
            double chance = CommonConfig.BASTION_HOGLIN_LAVA_MOONCAKE_CHANCE.get();
            if (chance > 0) {
                LootPool bonusPool = LootPool.lootPool()
                        .setRolls(UniformGenerator.between(1.0f, 1.0f))
                        .when(LootItemRandomChanceCondition.randomChance((float) chance))
                        .add(LootItem.lootTableItem(MDItems.LAVA_MOONCAKE.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1)))
                        .name("mooncake_delight:lava_mooncake_bonus")
                        .build();
                event.getTable().addPool(bonusPool);
            }
        }
    }
}
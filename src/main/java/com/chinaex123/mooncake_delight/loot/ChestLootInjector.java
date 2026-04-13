package com.chinaex123.mooncake_delight.loot;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class ChestLootInjector {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation tableId = event.getName();

        // 末地城宝藏箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/end_city_treasure"))) {
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f)) // 设置投掷次数（抽取几次）
                    .when(LootItemRandomChanceCondition.randomChance(0.01f)) // 概率
                    .add(LootItem.lootTableItem(ModItems.BEDROCK_MOONCAKE.get())) // 基岩月饼
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))) // 数量
                    .name("mooncake_delight:bedrock_mooncake_bonus")
                    .build();
            event.getTable().addPool(bonusPool);
        }

        // 堡垒遗迹宝藏室中的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/bastion_treasure"))) {
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f)) // 设置投掷次数（抽取几次）
                    .when(LootItemRandomChanceCondition.randomChance(0.10f)) // 概率
                    .add(LootItem.lootTableItem(ModItems.DEBRIS_MOONCAKE.get())) // 残骸月饼
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))) // 数量
                    .name("mooncake_delight:debris_mooncake_bonus")
                    .build();
            event.getTable().addPool(bonusPool);
        }

        // 沙漠神殿的宝藏室里的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/desert_pyramid"))) {
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f)) // 设置投掷次数（抽取几次）
                    .when(LootItemRandomChanceCondition.randomChance(0.10f)) // 概率
                    .add(LootItem.lootTableItem(ModItems.TNT_MOONCAKE.get())) // TNT月饼
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))) // 数量
                    .name("mooncake_delight:tnt_mooncake_bonus")
                    .build();
            event.getTable().addPool(bonusPool);
        }

        // 堡垒遗迹疣猪兽棚中的箱子
        if (tableId.equals(ResourceLocation.withDefaultNamespace("chests/bastion_hoglin_stable"))) {
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f)) // 设置投掷次数（抽取几次）
                    .when(LootItemRandomChanceCondition.randomChance(0.10f)) // 概率
                    .add(LootItem.lootTableItem(ModItems.LAVA_MOONCAKE.get())) // 流心月饼
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1))) // 数量
                    .name("mooncake_delight:lava_mooncake_bonus")
                    .build();
            event.getTable().addPool(bonusPool);
        }
    }
}
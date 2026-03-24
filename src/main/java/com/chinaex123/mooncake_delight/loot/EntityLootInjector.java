package com.chinaex123.mooncake_delight.loot;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.advancements.critereon.EntityEquipmentPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;

import java.util.Optional;

@EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class EntityLootInjector {

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        ResourceLocation tableId = event.getName();

        // 击杀末影龙掉落附魔金苹果月饼
        if (tableId.equals(ResourceLocation.withDefaultNamespace("entities/ender_dragon"))) {
            LootPool bonusPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f))
                    .when(LootItemRandomChanceCondition.randomChance(0.25f))
                    .add(LootItem.lootTableItem(ModItems.ENCHANTED_GOLDEN_APPLE_MOONCAKE.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1)))
                    .name("mooncake_delight:ender_dragon_bonus")
                    .build();
            event.getTable().addPool(bonusPool);
        }

        // 猪、牛、羊
        if (tableId.equals(ResourceLocation.withDefaultNamespace("entities/pig")) ||
                tableId.equals(ResourceLocation.withDefaultNamespace("entities/cow")) ||
                tableId.equals(ResourceLocation.withDefaultNamespace("entities/sheep"))) {

            // 普通情况（着火状态）
            LootPool burntTallowCrumbsPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f))
                    .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true))))
                    .when(LootItemRandomChanceCondition.randomChance(0.50f))
                    .add(LootItem.lootTableItem(ModItems.TALLOW_CRUMBS.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))
                    .name("mooncake_delight:burnt_animal_tallow_crumbs")
                    .build();
            event.getTable().addPool(burntTallowCrumbsPool);

            // 手持油浸刀时（着火状态）- 需要检测攻击者
            LootPool oiledKnifeTallowCrumbsPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f))
                    .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true))))
                    .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(new EntityEquipmentPredicate(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(ItemPredicate.Builder.item().of(ModItems.OILED_KNIFE.get()).build()), Optional.empty()))))
                    .when(LootItemRandomChanceCondition.randomChance(0.75f))
                    .add(LootItem.lootTableItem(ModItems.TALLOW_CRUMBS.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3)))
                    .name("mooncake_delight:oiled_knife_burnt_tallow_crumbs")
                    .build();
            event.getTable().addPool(oiledKnifeTallowCrumbsPool);

            LootPool oiledKnifeTallowPool = LootPool.lootPool()
                    .setRolls(UniformGenerator.between(1.0f, 1.0f))
                    .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true))))
                    .when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.ATTACKER, EntityPredicate.Builder.entity().equipment(new EntityEquipmentPredicate(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(ItemPredicate.Builder.item().of(ModItems.OILED_KNIFE.get()).build()), Optional.empty()))))
                    .when(LootItemRandomChanceCondition.randomChance(0.25f))
                    .add(LootItem.lootTableItem(ModItems.TALLOW.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 1)))
                    .name("mooncake_delight:oiled_knife_burnt_tallow")
                    .build();
            event.getTable().addPool(oiledKnifeTallowPool);
        }
    }
}
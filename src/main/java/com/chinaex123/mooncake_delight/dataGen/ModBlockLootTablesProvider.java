package com.chinaex123.mooncake_delight.dataGen;

import com.chinaex123.mooncake_delight.block.Crops.SesameCrop;
import com.chinaex123.mooncake_delight.init.MDItems;
import com.chinaex123.mooncake_delight.init.MDBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        LootItemCondition.Builder builder1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(MDBlocks.SESAME_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SesameCrop.AGE, 4));

        add(MDBlocks.SESAME_CROP.get(),
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .when(builder1)
                                .add(LootItem.lootTableItem(MDItems.WHITE_SESAME.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 3.0f)))
                        )
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0f))
                                .when(builder1)
                                .when(LootItemRandomChanceCondition.randomChance(0.01f))
                                .add(LootItem.lootTableItem(MDItems.BLACK_SESAME.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                        )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MDBlocks.BLOCKS_REGISTER.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

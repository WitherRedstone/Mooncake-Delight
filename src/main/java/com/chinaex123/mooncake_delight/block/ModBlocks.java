package com.chinaex123.mooncake_delight.block;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MooncakeDelight.MOD_ID);

    // ======================= 流体 =======================
    public static final DeferredBlock<LiquidBlock> INVERT_SUGAR_SYRUP_BLOCK; // 转换糖浆
    public static final DeferredBlock<LiquidBlock> MAPLE_SYRUP_BLOCK; // 枫糖浆

    static {
        INVERT_SUGAR_SYRUP_BLOCK = BLOCKS.register("invert_sugar_syrup_block", () ->
                new LiquidBlock(ModFluids.INVERT_SUGAR_SYRUP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
                        .friction(0.6F) // 高摩擦
                        .speedFactor(0.5F) // 减速 50%
                        .jumpFactor(0.5F) // 跳跃
                        .mapColor(MapColor.COLOR_ORANGE) // 橙色
                        .sound(SoundType.HONEY_BLOCK) // 蜂蜜块声音
                ));
        MAPLE_SYRUP_BLOCK = BLOCKS.register("maple_syrup_block", () ->
                new LiquidBlock(ModFluids.MAPLE_SYRUP.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
                        .friction(0.6F) // 高摩擦
                        .speedFactor(0.5F) // 减速 50%
                        .jumpFactor(0.5F) // 跳跃
                        .mapColor(MapColor.COLOR_ORANGE) // 橙色
                        .sound(SoundType.HONEY_BLOCK) // 蜂蜜块声音
                ));
    }

    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

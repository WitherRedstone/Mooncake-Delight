package com.chinaex123.mooncake_delight.init;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.block.Crops.SesameCrop;
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

public class MDBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MooncakeDelight.MOD_ID);

    // ======================= 流体 =======================
    // 转换糖浆
    public static final DeferredBlock<LiquidBlock> INVERT_SUGAR_SYRUP_BLOCK =
            BLOCKS.register("invert_sugar_syrup_block", () -> new LiquidBlock(MDFluids.INVERT_SUGAR_SYRUP.get(), BlockBehaviour.Properties.of()
                    .noLootTable() // 不掉落
                    .liquid() // 液体
                    .replaceable() // 可替换
                    .noCollission() // 无碰撞
                    .strength(100.0F) // 硬度
                    .friction(0.6F) // 摩擦
                    .speedFactor(0.5F) // 移动速度
                    .jumpFactor(0.5F) // 跳跃速度
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.HONEY_BLOCK)
            ));
    // 枫糖浆
    public static final DeferredBlock<LiquidBlock> MAPLE_SYRUP_BLOCK =
            BLOCKS.register("maple_syrup_block", () -> new LiquidBlock(MDFluids.MAPLE_SYRUP.get(), BlockBehaviour.Properties.of()
                    .noLootTable() // 不掉落
                    .liquid() // 液体
                    .replaceable() // 可替换
                    .noCollission() // 无碰撞
                    .strength(100.0F) // 硬度
                    .friction(0.6F) // 摩擦
                    .speedFactor(0.5F) // 移动速度
                    .jumpFactor(0.5F) // 跳跃速度
                    .mapColor(MapColor.COLOR_ORANGE)
                    .sound(SoundType.HONEY_BLOCK)
            ));

    // ======================= 种子 =======================
    // 芝麻作物
    public static final DeferredBlock<SesameCrop> SESAME_CROP =
            BLOCKS.register("sesame_crop", () -> new SesameCrop(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));


    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        MDItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
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

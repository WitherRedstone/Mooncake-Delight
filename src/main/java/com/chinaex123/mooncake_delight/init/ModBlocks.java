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
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS_REGISTER =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MooncakeDelight.MOD_ID);

    // ======================= 流体 =======================
    // 转换糖浆
    public static final RegistryObject<LiquidBlock> INVERT_SUGAR_SYRUP_BLOCK = BLOCKS_REGISTER.register("invert_sugar_syrup", () ->
            new LiquidBlock(() -> (FlowingFluid) ModFluids.INVERT_SUGAR_SYRUP.get(), BlockBehaviour.Properties.of()
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
    public static final RegistryObject<LiquidBlock> MAPLE_SYRUP_BLOCK = BLOCKS_REGISTER.register("maple_syrup", () ->
            new LiquidBlock(() -> (FlowingFluid) ModFluids.MAPLE_SYRUP.get(), BlockBehaviour.Properties.of()
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
    public static final RegistryObject<SesameCrop> SESAME_CROP =
            BLOCKS_REGISTER.register("sesame_crop", () -> new SesameCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    private static <T extends Block> void registerBlockItems(String name, RegistryObject<T> block) {
        ModItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> blocks = BLOCKS_REGISTER.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS_REGISTER.register(eventBus);
    }
}

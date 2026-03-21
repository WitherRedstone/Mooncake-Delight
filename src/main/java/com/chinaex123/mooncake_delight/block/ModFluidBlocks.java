package com.chinaex123.mooncake_delight.block;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluidBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MooncakeDelight.MOD_ID);

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MooncakeDelight.MOD_ID);

    // 转化糖浆流体方块
    public static final DeferredBlock<LiquidBlock> INVERT_SUGAR_SYRUP = BLOCKS.register("invert_sugar_syrup",
            () -> new LiquidBlock(ModFluids.INVERT_SUGAR_SYRUP.get(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_ORANGE)  // 设置地图颜色
                            .replaceable()                     // 可被替换
                            .noCollission()                    // 无碰撞
                            .strength(100.0F)                  // 强度
                            .pushReaction(PushReaction.DESTROY) // 活塞反应
                            .noLootTable()                     // 无掉落物
                            .liquid()                          // 重要：标记为液体
            ));
    // 转化糖浆桶
    public static final DeferredItem<Item> INVERT_SUGAR_SYRUP_BUCKET = ITEMS.register("invert_sugar_syrup_bucket",
            () -> new BucketItem(ModFluids.INVERT_SUGAR_SYRUP.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)
                    .durability(0)));  // 桶没有耐久

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}

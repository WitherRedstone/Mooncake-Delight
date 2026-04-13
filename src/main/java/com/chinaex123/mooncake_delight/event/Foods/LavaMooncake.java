package com.chinaex123.mooncake_delight.event.Foods;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = "mooncake_delight")
public class LavaMooncake {

    private static final String[] BLOCK_BLACKLIST = {
            "minecraft:bedrock",
            "minecraft:barrier",
            "minecraft:command_block",
            "minecraft:chain_command_block",
            "minecraft:repeating_command_block",
            "minecraft:structure_block",
            "minecraft:structure_void",
            "minecraft:jigsaw",
            "minecraft:end_portal",
            "minecraft:end_portal_frame",
            "minecraft:portal",
            "minecraft:nether_portal",
            "minecraft:reinforced_deepslate"
    };

    @SubscribeEvent
    public static void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        LivingEntity entity = event.getEntity();
        ItemStack stack = event.getItem();

        // 检查是否是流心月饼
        if (stack.getItem() != ModItems.LAVA_MOONCAKE.get()) {
            return;
        }

        // 只在服务端执行
        if (entity.level().isClientSide()) {
            return;
        }

        // 在玩家脚下生成岩浆
        createLavaPool(entity);
    }

    /**
     * 以实体为中心创建 3x3 岩浆池
     */
    private static void createLavaPool(LivingEntity entity) {
        Level level = entity.level();
        BlockPos entityPos = entity.blockPosition();
        
        // 将字符串数组转换为资源位置列表
        List<String> blacklist = Arrays.asList(BLOCK_BLACKLIST);

        // 遍历size设定的区域
        int size = 5; // 区域大小：3=3x3, 5=5x5, 7=7x7
        int radius = (size - 1) / 2;

        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                BlockPos pos = entityPos.offset(x, -1, z);

                // 保留中心位置的方块（玩家脚下）
                if (x == 0 && z == 0) {
                    continue;
                }

                // 获取方块的资源位置
                String blockId = net.minecraft.core.registries.BuiltInRegistries.BLOCK.getKey(
                        level.getBlockState(pos).getBlock()
                ).toString();

                // 检查是否在黑名单中
                if (blacklist.contains(blockId)) {
                    continue;
                }

                // 替换为岩浆
                level.setBlockAndUpdate(pos, Blocks.LAVA.defaultBlockState());
            }
        }
    }
}

package com.chinaex123.mooncake_delight.server;

import com.chinaex123.mooncake_delight.MooncakeDelight;
import com.chinaex123.mooncake_delight.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingEntityUseItemEvent;

@EventBusSubscriber(modid = MooncakeDelight.MOD_ID)
public class ChorusFruitMooncake {

    /**
     * 处理紫颂果月饼的随机传送效果
     */
    @SubscribeEvent
    public static void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        if (event.getEntity().level().isClientSide) {
            return;
        }

        ItemStack itemStack = event.getItem();
        Item item = itemStack.getItem();

        // 检查是否是紫颂果月饼
        if (item == ModItems.CHORUS_FRUIT_MOONCAKE.get()) {
            Player player = (Player) event.getEntity();
            Level level = player.level();

            // 执行随机传送
            teleportRandomly((ServerPlayer) player, level);
        }
    }

    /**
     * 将玩家随机传送到附近的位置
     */
    private static void teleportRandomly(ServerPlayer player, Level level) {
        double originX = player.getX();
        double originY = player.getY();
        double originZ = player.getZ();

        // 在 -8 到 +8 范围内随机传送（和紫颂果一致）
        double targetX = originX + (player.getRandom().nextDouble() - 0.5) * 16.0;
        double targetY = originY + (player.getRandom().nextInt(16) - 8);
        double targetZ = originZ + (player.getRandom().nextDouble() - 0.5) * 16.0;

        BlockPos.MutableBlockPos mutablePos = new BlockPos.MutableBlockPos(targetX, targetY, targetZ);

        // 向下寻找可站立的地面
        while (mutablePos.getY() > 0 && level.getBlockState(mutablePos).isAir()) {
            mutablePos.move(0, -1, 0);
        }
        
        if (mutablePos.getY() <= 0) {
            mutablePos.set(targetX, originY, targetZ);
        }

        // 执行传送
        player.teleportTo(targetX, mutablePos.getY() + 1, targetZ);
        
        // 播放传送音效（类似末影人）
        level.playSound(null, originX, originY, originZ, 
            net.minecraft.sounds.SoundEvents.ENDERMAN_TELEPORT, 
            player.getSoundSource(), 
            1.0F, 
            1.0F
        );
    }
}

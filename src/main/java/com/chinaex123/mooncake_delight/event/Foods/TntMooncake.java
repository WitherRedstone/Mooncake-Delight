package com.chinaex123.mooncake_delight.event.Foods;

import com.chinaex123.mooncake_delight.init.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "mooncake_delight")
public class TntMooncake {

    @SubscribeEvent
    public static void onItemUseFinish(LivingEntityUseItemEvent.Finish event) {
        LivingEntity entity = event.getEntity();
        ItemStack stack = event.getItem();

        // 检查是否是 TNT 月饼
        if (stack.getItem() != ModItems.TNT_MOONCAKE.get()) {
            return;
        }

        // 只在服务端执行
        if (entity.level().isClientSide()) {
            return;
        }

        // 在实体位置生成 TNT 实体
        PrimedTnt tnt = new PrimedTnt(entity.level(), entity.getX(), entity.getY() + 0.5, entity.getZ(), entity);

        // 设置引信时间为 0（立刻爆炸）
        tnt.setFuse(0);

        // 生成 TNT 实体
        entity.level().addFreshEntity(tnt);
    }
}

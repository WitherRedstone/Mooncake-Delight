package com.chinaex123.mooncake_delight.init.Tools.Knife;

import com.chinaex123.mooncake_delight.init.Tools.ToolMaterials;
import net.minecraft.ChatFormatting;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class OiledKnife extends ModKnifeItem {

    public OiledKnife() {
        super(ToolMaterials.OILED_KNIFE, new Item.Properties()
                .rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);
        if (result && !target.level().isClientSide() && !target.fireImmune()) {
            target.setRemainingFireTicks(300);
        } else {
            for (int var1 = 0; var1 < 20; ++var1) {
                double px = target.getX() + (double) (target.level().getRandom().nextFloat() * target.getBbWidth() * 2.0F) - (double) target.getBbWidth();
                double py = target.getY() + (double) (target.level().getRandom().nextFloat() * target.getBbHeight());
                double pz = target.getZ() + (double) (target.level().getRandom().nextFloat() * target.getBbWidth() * 2.0F) - (double) target.getBbWidth();
                target.level().addParticle(ParticleTypes.FLAME, px, py, pz, 0.02D, 0.02D, 0.02D);
            }
        }
        return result;
    }

    @Override
    public void appendHoverText(ItemStack stack, Level level, List<Component> list, TooltipFlag flags) {
        super.appendHoverText(stack, level, list, flags);
        list.add(Component.translatable("item.mooncake_delight.oiled_knife.tooltip.1").withStyle(ChatFormatting.AQUA));
        list.add(Component.translatable("item.mooncake_delight.oiled_knife.tooltip.2").withStyle(ChatFormatting.YELLOW));
    }
}

package com.chinaex123.mooncake_delight.item.Tools.Knife;

import com.chinaex123.mooncake_delight.item.Tools.ToolMaterials;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ModKnifeItem extends KnifeItem {

    public ModKnifeItem(ToolMaterials tier, Properties properties) {
        super(tier, properties.attributes(KnifeItem.createAttributes(tier, tier.getAttackDamageBonus(), tier.getAttackSpeed())));
    }

    @Override
    public boolean isPrimaryItemFor(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(Enchantments.FORTUNE) || super.isPrimaryItemFor(stack, enchantment);
    }

    @Override
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(Enchantments.FORTUNE) || super.supportsEnchantment(stack, enchantment);
    }
}

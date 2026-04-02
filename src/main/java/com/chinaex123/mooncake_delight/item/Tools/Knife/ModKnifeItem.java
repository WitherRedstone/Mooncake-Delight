package com.chinaex123.mooncake_delight.item.Tools.Knife;

import com.chinaex123.mooncake_delight.item.Tools.ToolMaterials;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ModKnifeItem extends KnifeItem {

    public ModKnifeItem(ToolMaterials tier, Properties properties) {
        super(tier, tier.getAttackDamageBonus(), tier.getAttackSpeed(), properties);
    }
}

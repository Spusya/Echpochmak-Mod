package ru.echpochmakteam.mods.echpochmak.mod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SuperSwordEchpochmak extends SwordItem {
    public SuperSwordEchpochmak(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 0, -2, new Item.Settings().group(ItemGroup.COMBAT));
    }
}

package ru.echpochmakteam.mods.echpochmak.mod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class AxeEchpochmak extends AxeItem {
    public AxeEchpochmak(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, 0, 0, new Item.Settings().group(ItemGroup.TOOLS));
    }
}

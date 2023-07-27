package com.imjustdoom.lunarpebble.item;

import com.imjustdoom.lunarpebble.LunarPebble;
import net.minecraft.world.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Properties().arch$tab(LunarPebble.PEBBLE_TAB));
    }
}
package com.imjustdoom.lunarpebble.item.custom;

import com.imjustdoom.lunarpebble.LunarPebble;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Pebble extends Item {

    public Pebble() {
        super(new Properties().arch$tab(LunarPebble.PEBBLE_TAB).food(new FoodProperties.Builder().alwaysEat().fast().build()).fireResistant());
    }
}
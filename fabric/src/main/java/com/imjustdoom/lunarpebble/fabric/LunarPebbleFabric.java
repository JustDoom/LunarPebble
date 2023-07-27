package com.imjustdoom.lunarpebble.fabric;

import com.imjustdoom.lunarpebble.LunarPebble;
import net.fabricmc.api.ModInitializer;

public class LunarPebbleFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        LunarPebble.init();
    }
}
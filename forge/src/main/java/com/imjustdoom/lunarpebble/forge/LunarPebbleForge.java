package com.imjustdoom.lunarpebble.forge;

import dev.architectury.platform.forge.EventBuses;
import com.imjustdoom.lunarpebble.LunarPebble;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(LunarPebble.MOD_ID)
public class LunarPebbleForge {
    public LunarPebbleForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(LunarPebble.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            LunarPebble.init();
    }
}
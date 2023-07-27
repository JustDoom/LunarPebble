package com.imjustdoom.lunarpebble;

import com.imjustdoom.lunarpebble.item.ItemInit;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class LunarPebble
{
	public static final String MOD_ID = "lunarpebble";

	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

	public static final RegistrySupplier<CreativeModeTab> PEBBLE_TAB = TABS.register("pebble_tab", // Tab ID
			() -> CreativeTabRegistry.create(
					Component.translatable("category.pebble_tab"), // Tab Name
					() -> new ItemStack(ItemInit.PEBBLE.get()) // Icon
			)
	);

	public static void init() {
		TABS.register();
		ItemInit.init();
	}
}
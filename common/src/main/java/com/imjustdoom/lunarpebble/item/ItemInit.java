package com.imjustdoom.lunarpebble.item;

import com.imjustdoom.lunarpebble.LunarPebble;
import com.imjustdoom.lunarpebble.item.custom.Pebble;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(LunarPebble.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> PEBBLE = ITEMS.register("pebble", Pebble::new);

    public static void init() {
        ITEMS.register();
    }
}
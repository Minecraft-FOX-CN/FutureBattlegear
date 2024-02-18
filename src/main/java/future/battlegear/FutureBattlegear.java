package future.battlegear;

import future.battlegear.registry.ModItemGroup;
import future.battlegear.registry.ModItems;
import future.battlegear.registry.ModKeyBinding;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.server.ServerTickCallback;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FutureBattlegear implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "fb";

    public static final Logger LOGGER = LoggerFactory.getLogger("template-mod");

    public static Identifier makeID(String name) {
        return new Identifier(MOD_ID, name);
    }

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ModItems.registerModItems();
        ModItemGroup.registerModItemGroup();
        ModKeyBinding.registerModKeyBinding();
        LOGGER.info("HA!");
    }
}

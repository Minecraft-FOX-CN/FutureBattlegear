package future.battlegear.registry;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class ModKeyBinding {
    public static final KeyBinding sprint = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.fb.sprint",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_R,
            "category.fb.future_battlegear"
    ));

    public static void registerModKeyBinding() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            PlayerEntity playerEntity = client.player;
            while (sprint.wasPressed() && playerEntity != null && isFutureBattlegearArmor(playerEntity.getInventory())) {
                playerEntity.sendMessage(Text.of("对的！"));
            }
        });
    }

    private static boolean isFutureBattlegearArmor(PlayerInventory inventory) {
        return inventory.armor.get(0).isOf(ModItems.FUTURE_BATTLEGEAR_BOOTS) &&  inventory.armor.get(1).isOf(ModItems.FUTURE_BATTLEGEAR_LEGGINGS) &&  inventory.armor.get(2).isOf(ModItems.FUTURE_BATTLEGEAR_CHESTPLATE) &&  inventory.armor.get(3).isOf(ModItems.FUTURE_BATTLEGEAR_HELMET);
    }
}

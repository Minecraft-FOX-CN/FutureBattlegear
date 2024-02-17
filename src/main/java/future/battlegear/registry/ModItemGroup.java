package future.battlegear.registry;

import future.battlegear.FutureBattlegear;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroup {
    public static final ItemGroup FUTURE_BATTLEGEAR = Registry.register(Registries.ITEM_GROUP,
            FutureBattlegear.makeID("future_battlegear_item_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.fb.future_battlegear_item_group"))
                    .icon(() -> new ItemStack(ModItems.FUTURE_BATTLEGEAR_CHESTPLATE))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.FUTURE_BATTLEGEAR_HELMET);
                        entries.add(ModItems.FUTURE_BATTLEGEAR_CHESTPLATE);
                        entries.add(ModItems.FUTURE_BATTLEGEAR_LEGGINGS);
                        entries.add(ModItems.FUTURE_BATTLEGEAR_BOOTS);
                    }))
                    .build()
            );
    public static void registerModItemGroup() {
        FutureBattlegear.LOGGER.debug("Registering mod group for" + FutureBattlegear.MOD_ID);
    }
}
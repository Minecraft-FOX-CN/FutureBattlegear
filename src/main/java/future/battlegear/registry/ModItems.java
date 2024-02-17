package future.battlegear.registry;

import future.battlegear.FutureBattlegear;
import future.battlegear.common.materials.FutureBattlegearArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item FUTURE_BATTLEGEAR_HELMET = RegistryItem("future_battlegear_helmet", new ArmorItem(FutureBattlegearArmorMaterial.FUTURE_BATTLEGEAR_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item FUTURE_BATTLEGEAR_CHESTPLATE = RegistryItem("future_battlegear_chestplate", new ArmorItem(FutureBattlegearArmorMaterial.FUTURE_BATTLEGEAR_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item FUTURE_BATTLEGEAR_LEGGINGS = RegistryItem("future_battlegear_leggings", new ArmorItem(FutureBattlegearArmorMaterial.FUTURE_BATTLEGEAR_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item FUTURE_BATTLEGEAR_BOOTS = RegistryItem("future_battlegear_boots", new ArmorItem(FutureBattlegearArmorMaterial.FUTURE_BATTLEGEAR_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()));

    private static Item RegistryItem(String name, Item item) {
        return Registry.register(Registries.ITEM, FutureBattlegear.makeID(name), item);
    }

    public static void registerModItems() {
        FutureBattlegear.LOGGER.debug("Registering mod items for" + FutureBattlegear.MOD_ID);
    }
}

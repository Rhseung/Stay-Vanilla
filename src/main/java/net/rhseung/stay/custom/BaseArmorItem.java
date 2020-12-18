package net.rhseung.stay.custom;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

public class BaseArmorItem extends ArmorItem {
    public BaseArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }
    public static RegistryObject<BaseArmorItem> armorBuilder(String name, IArmorMaterial tier, EquipmentSlotType slot, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new BaseArmorItem(tier, slot, new Item.Properties().group(group)));
    }
}

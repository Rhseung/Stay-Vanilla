package net.rhseung.stay.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.custom.*;
import net.rhseung.stay.setup.Group;
import net.rhseung.stay.setup.Registration;

public class ModItems {
    // TODO Items
    public static final RegistryObject<BaseItem> INGOT_COPPER = BaseItem.itemBuilder("metal_ingot_copper", Group.GEAR);
    public static final RegistryObject<BaseItem> INGOT_POLYRITE = BaseItem.itemBuilder("metal_ingot_polyrite", Group.GEAR);

    public static final RegistryObject<BaseItem> RYE_BREAD = Registration.ITEMS.register("food_ryebread", () -> new BaseItem(new Item.Properties().group(Group.GEAR).food(new Food.Builder().hunger(7).saturation(1.5F).build())));

    // TODO Tools
    public static final RegistryObject<SwordWeapon> SWORD_COPPER = SwordWeapon.toolBuilder("gear_sword_copper", ModItemTier.COPPER, 1.6F, Group.GEAR);

    public static final RegistryObject<PickTool> PICK_COPPER = PickTool.toolBuilder("gear_pick_copper", ModItemTier.COPPER, 1.2F, Group.GEAR);
    public static final RegistryObject<AxeTool> AXE_COPPER = AxeTool.toolBuilder("gear_axe_copper", ModItemTier.COPPER, 1.0F, Group.GEAR);
    public static final RegistryObject<ShovelTool> SHOVEL_COPPER = ShovelTool.toolBuilder("gear_shovel_copper", ModItemTier.COPPER, 1.0F, Group.GEAR);
    public static final RegistryObject<HoeTool> HOE_COPPER = HoeTool.toolBuilder("gear_hoe_copper", ModItemTier.COPPER, 4.0F, Group.GEAR);
    public static final RegistryObject<PaxelTool> PAXEL_COPPER = PaxelTool.toolBuilder("gear_paxel_copper", ModItemTier.COPPER, 1.0F, Group.GEAR);

    // TODO Armors
    public static final RegistryObject<BaseArmorItem> HELMET_COPPER = BaseArmorItem.armorBuilder("gear_helmet_copper", ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, Group.GEAR);
    public static final RegistryObject<BaseArmorItem> CHESTPLATE_COPPER = BaseArmorItem.armorBuilder("gear_chestplate_copper", ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, Group.GEAR);
    public static final RegistryObject<BaseArmorItem> LEGGINGS_COPPER = BaseArmorItem.armorBuilder("gear_leggings_copper", ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, Group.GEAR);
    public static final RegistryObject<BaseArmorItem> BOOTS_COPPER = BaseArmorItem.armorBuilder("gear_boots_copper", ModArmorMaterial.COPPER, EquipmentSlotType.FEET, Group.GEAR);

    public static void register() {};
}

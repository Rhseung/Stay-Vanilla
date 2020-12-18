package net.rhseung.stay.custom;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

public class SwordWeapon extends SwordItem {
    public SwordWeapon(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    public static RegistryObject<SwordWeapon> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new SwordWeapon(tier, (int) (tier.getAttackDamage() + 2), attackSpeed - 4, new Item.Properties().group(group)));
    }
}

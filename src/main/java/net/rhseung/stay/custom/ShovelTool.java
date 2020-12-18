package net.rhseung.stay.custom;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

public class ShovelTool extends ShovelItem {
    public ShovelTool(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
    public static RegistryObject<ShovelTool> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new ShovelTool(tier, tier.getAttackDamage() + 0.5F, attackSpeed - 4, new Item.Properties().group(group)));
    }
}

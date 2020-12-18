package net.rhseung.stay.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

public class HoeTool extends HoeItem {
    public HoeTool(IItemTier itemTier, int attackDamage, float attackSpeed, Properties properties) {
        super(itemTier, attackDamage, attackSpeed, properties);
    }
    public static RegistryObject<HoeTool> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new HoeTool(tier, (int) tier.getAttackDamage(), attackSpeed - 4, new Item.Properties().group(group)));
    }
}

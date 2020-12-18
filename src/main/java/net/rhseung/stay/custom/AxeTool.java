package net.rhseung.stay.custom;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

public class AxeTool extends AxeItem {
    public AxeTool(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder.addToolType(ToolType.AXE, tier.getHarvestLevel()));
    }
    public static RegistryObject<AxeTool> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new AxeTool(tier, (float) (tier.getAttackDamage() + 0.5), attackSpeed - 4, new Item.Properties().group(group)));
    }
}

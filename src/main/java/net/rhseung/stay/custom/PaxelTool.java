package net.rhseung.stay.custom;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

import java.util.HashSet;

public class PaxelTool extends ToolItem {
    public PaxelTool(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties properties) {
        super(attackDamageIn, attackSpeedIn, tier, new HashSet<>(), properties.addToolType(ToolType.PICKAXE, tier.getHarvestLevel()).addToolType(ToolType.AXE, tier.getHarvestLevel()).addToolType(ToolType.SHOVEL, tier.getHarvestLevel()));
    }
    public static RegistryObject<PaxelTool> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new PaxelTool(tier, tier.getAttackDamage() + 1, attackSpeed - 4, new Item.Properties().group(group)));
    }
}

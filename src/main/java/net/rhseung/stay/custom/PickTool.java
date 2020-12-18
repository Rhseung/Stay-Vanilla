package net.rhseung.stay.custom;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.Registration;

import java.util.List;

public class PickTool extends PickaxeItem {
    public PickTool(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder.addToolType(ToolType.PICKAXE, tier.getHarvestLevel()));
    }
    public static RegistryObject<PickTool> toolBuilder(String name, IItemTier tier, float attackSpeed, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new PickTool(tier, (int) (tier.getAttackDamage() + 0), attackSpeed - 4, new Item.Properties().group(group)));
    }

    public final static Color DURABILITY_COLOR = Color.fromInt(0xFF47cc47);
    public final static Color TIER_COLOR = Color.fromInt(0xFFD76464);
    public final static Color SPEED_COLOR = Color.fromInt(0xFF78A0CD);

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent(String.format(" Durability: %d / %d", stack.getMaxDamage() - stack.getDamage(), stack.getMaxDamage())).mergeStyle(TextFormatting.GRAY));
        tooltip.add(new StringTextComponent(String.format(" Mining Speed: %.1f", this.getTier().getEfficiency())).mergeStyle(TextFormatting.GRAY));
        tooltip.add(new StringTextComponent(String.format(" Mining Tier: %d", this.getTier().getHarvestLevel())).mergeStyle(TextFormatting.GRAY));
    }
}

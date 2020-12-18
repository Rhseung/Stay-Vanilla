package net.rhseung.stay.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TieredItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

import java.util.ArrayList;
import java.util.List;

public class Tooltip {
    public static void onItemToolTip(ItemTooltipEvent event) {
        final List<ITextComponent> info = new ArrayList<>();
        final ItemStack stack = event.getItemStack();

        if (stack.getItem() instanceof TieredItem) {
            final TieredItem item = ((TieredItem) stack.getItem());
            final IItemTier tier = item.getTier();

            info.add(new TranslationTextComponent("item.harvestlevel", tier.getHarvestLevel()).mergeStyle(TextFormatting.GRAY));
            info.add(new TranslationTextComponent("item.efficiency", tier.getEfficiency()).mergeStyle(TextFormatting.GRAY));
            info.add(new TranslationTextComponent("item.durability", stack.getMaxDamage() - stack.getDamage(), stack.getMaxDamage()).mergeStyle(TextFormatting.GRAY));
        }
        event.getToolTip().addAll(getInsertOffset(event.getFlags().isAdvanced(), event.getToolTip().size(), stack), info);
    }
    private static int getInsertOffset(boolean advanced, int tooltipSize, ItemStack stack) {
        int offset = 0;
        if (advanced) {
            offset++;
            if (stack.hasTag())
                offset++;
        }
        return Math.max(0, tooltipSize - offset);
    }
}

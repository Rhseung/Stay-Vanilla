package net.rhseung.stay.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.rhseung.stay.init.ModItems;

public class Group {
    public static final ItemGroup GEAR = new ItemGroup("gear") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.PICK_COPPER.get());
        }
    };
}

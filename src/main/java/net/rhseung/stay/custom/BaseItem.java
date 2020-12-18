package net.rhseung.stay.custom;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.rhseung.stay.setup.KeyboardUtil;
import net.rhseung.stay.setup.Registration;

import java.util.List;

public class BaseItem extends Item {
    public BaseItem(Properties properties) {
        super(properties);
    }
    public static RegistryObject<BaseItem> itemBuilder(String name, ItemGroup group) {
        return Registration.ITEMS.register(name, () -> new BaseItem(new Item.Properties().group(group)));
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardUtil.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A7b" + "This is Copper Ingot!"));
        } else {
            tooltip.add(new StringTextComponent("Hold " + "\u00A76" + "[Shift]" + "\u00A7r" + " For more info"));
        }
    }
}

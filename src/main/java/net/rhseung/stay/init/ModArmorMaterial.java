package net.rhseung.stay.init;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.rhseung.stay.Stay;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    COPPER(Stay.MOD_ID + ":copper", 10, new int[] { 1, 3, 4, 1 }, 17, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.1F, 0.1F, () -> { return Ingredient.fromItems(ModItems.INGOT_COPPER.get()); });

    private static final int[] DURABILITY_FACTOR = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int durabilityFactor;
    private final int[] defensePoint;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int durabilityFactor, int[] defensePoint, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityFactor = durabilityFactor;
        this.defensePoint = defensePoint;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return DURABILITY_FACTOR[slotIn.getIndex()] * this.durabilityFactor;
    }
    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return defensePoint[slotIn.getIndex()];
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }
    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }
    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

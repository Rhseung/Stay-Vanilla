package net.rhseung.stay.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.rhseung.stay.Stay;
import net.rhseung.stay.init.ModBlocks;
import net.rhseung.stay.init.ModItems;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Stay.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Stay.MOD_ID);

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        ModItems.register();
        ModBlocks.register();
    }
}

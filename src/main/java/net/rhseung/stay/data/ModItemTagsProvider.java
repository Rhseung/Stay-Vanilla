package net.rhseung.stay.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rhseung.stay.Stay;
import net.rhseung.stay.init.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Stay.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        copy(ModTags.Blocks.ORES_COPPER, ModTags.Items.ORES_COPPER);
        copy(ModTags.Blocks.PILES_COPPER, ModTags.Items.PILES_COPPER);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        //getOrCreateBuilder(ModTags.Items.INGOTS_COPPER).add(net.rhseung.stay.init.ModItems.INGOT_COPPER.get());
        //getOrCreateBuilder(ModTags.Items.INGOTS_POLYRITE).add(ModItems.INGOT_POLYRITE.get());
        //getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_COPPER);
        //getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_POLYRITE);
    }
}

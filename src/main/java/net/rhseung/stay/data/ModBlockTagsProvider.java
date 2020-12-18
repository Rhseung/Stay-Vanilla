package net.rhseung.stay.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rhseung.stay.Stay;
import net.rhseung.stay.init.ModBlocks;
import net.rhseung.stay.init.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Stay.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_COPPER).add(ModBlocks.ORE_COPPER.get());
        getOrCreateBuilder(ModTags.Blocks.PILES_COPPER).add(ModBlocks.PILE_COPPER.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COPPER);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.PILES_COPPER);
    }
}

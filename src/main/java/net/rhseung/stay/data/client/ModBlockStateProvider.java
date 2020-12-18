package net.rhseung.stay.data.client;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.rhseung.stay.Stay;
import net.rhseung.stay.init.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Stay.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeBlock(ModBlocks.PILE_COPPER.get());
        cubeBlock(ModBlocks.ORE_COPPER.get());
    }

    public void cubeBlock(Block block) {
        simpleBlock(block, models().cubeAll(block.getRegistryName().getPath(), blockTexture(block)));
    }
    public ResourceLocation blockTexture(Block block) {
        return new ResourceLocation(block.getRegistryName().getNamespace(), ModelProvider.BLOCK_FOLDER + "/" + block.getRegistryName().getPath().replaceAll("_", "/"));
    }
}
